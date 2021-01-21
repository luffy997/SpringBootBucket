集成MyBatis

SpringBoot集成MyBatis做DAO层，使用原生Mybatis操作数据库。

安装MySQL数据库

数据库的安装教程网上非常多，我的版本是5.5

配置数据库的账号和密码。

修改application.yml

修改配置文件，主要是mysql的账号和密码

数据库初始化

创建数据库pos，然后执行SQL文件src/main/resources/sql/t_users.sql，创建t_users表

运行测试用例

执行对用户表增/删/改/查的测试用例：SpringbootMybatisApplicationTests .java

