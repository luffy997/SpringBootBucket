package com.dev.aspect;

import com.dev.service.CheckUserService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @author 路飞
 * @create 2021/1/6
 */
@Aspect
@Component
public class CheckUserAspect {

    @Autowired
    private CheckUserService checkUserService;

    //切入点
   // @Pointcut("@annotation(com.dev.annotation.AdminOnly)")
    @Pointcut("execution(* com.dev.service.*Service0*.*(..))")
    public void checkAdmin(){

    }

//    //前置通知拦截
////    @Before("checkAdmin()")
////    public void before(JoinPoint joinPoint){
//////        checkUserService.check();
////        System.out.println("----------[前置通知]------------"+joinPoint);
////    }

//    //前置通知拦截
//    @AfterThrowing(value = "checkAdmin()",throwing = "e")
//    public void before(Throwable e){
////        checkUserService.check();
//        System.out.println("----------[后置通知]------------"+e.getMessage());
//    }

    //环绕通知
    @Around(value = "checkAdmin()")
    public  Object after(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---------[环绕通知前]-----------");
        Object proceed = joinPoint.proceed();  //执行目标方法
        System.out.println("-----------[环绕通知后]------------------");
        return proceed;
      }

}
