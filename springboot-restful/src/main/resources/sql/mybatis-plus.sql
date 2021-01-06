/*
 Navicat Premium Data Transfer

 Source Server         : localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : mybatis-plus

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 06/01/2021 19:34:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮箱',
  `version` int(10) DEFAULT 1,
  `deleted` int(11) DEFAULT 0 COMMENT '逻辑删除',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 41 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'Luffy22222', 11, '134@qq.com', 9, 0, '2020-10-16 11:33:48', '2021-01-05 14:59:19');
INSERT INTO `user` VALUES (6, '路飞', 3, '389783961@qq.com', 1, 0, '2020-10-07 12:09:11', '2020-10-26 10:46:03');
INSERT INTO `user` VALUES (7, 'Luffy', 18, '389783961@qq.com', 1, 0, '2020-06-17 12:27:44', '2020-10-06 12:27:49');
INSERT INTO `user` VALUES (9, 'Luffy', 22, '389783961@qq.com', 1, 0, '2020-10-16 12:28:00', '2020-10-31 12:28:03');
INSERT INTO `user` VALUES (11, '路飞', 30, '2222@qq.com', 1, 0, '2020-09-30 12:08:59', '2020-10-31 12:09:02');
INSERT INTO `user` VALUES (12, '哈哈11', 10, '2222\n111@qq.com', 1, 0, '2021-01-05 12:15:36', '2021-01-05 12:15:36');
INSERT INTO `user` VALUES (13, '国服最强', 10, '1111@qq.com', 1, 1, '2021-01-05 12:24:00', '2021-01-05 12:24:00');
INSERT INTO `user` VALUES (14, '最强', 10, '1111@qq.com', 1, 1, '2021-01-05 12:24:35', '2021-01-05 12:24:35');
INSERT INTO `user` VALUES (15, '哈哈\n', 10, '2222\n111@qq.com', 1, 0, '2021-01-05 12:28:07', '2021-01-05 12:38:00');
INSERT INTO `user` VALUES (16, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:17', '2021-01-05 14:46:17');
INSERT INTO `user` VALUES (17, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (18, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (19, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (20, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (21, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (22, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (23, '测试', 11, '123@qq.com', 1, 1, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (24, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (25, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (26, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (27, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (28, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (29, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (30, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (31, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (32, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (33, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (34, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (35, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (36, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (37, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (38, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (39, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');
INSERT INTO `user` VALUES (40, '测试', 11, '123@qq.com', 1, 0, '2021-01-05 14:46:36', '2021-01-05 14:46:36');

SET FOREIGN_KEY_CHECKS = 1;
