/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1-mysql
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : mybatis-plus

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 21/01/2021 19:07:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'Luffy', '202cb962ac59075b964b07152d234b70', 1, '2001-01-01', '2021-01-21 15:46:49', NULL);
INSERT INTO `t_user` VALUES (2, 'A', '202cb962ac59075b964b07152d234b70', 1, '2021-01-21', '2021-01-21 18:35:15', NULL);
INSERT INTO `t_user` VALUES (3, '测试', '202cb962ac59075b964b07152d234b70', 1, '2021-01-21', '2021-01-21 18:35:55', '2021-01-21 19:06:01');
INSERT INTO `t_user` VALUES (4, 'B', '202cb962ac59075b964b07152d234b70', 1, '2021-01-21', '2021-01-21 18:35:55', NULL);
INSERT INTO `t_user` VALUES (5, 'C\r\n', '202cb962ac59075b964b07152d234b70', 1, '2021-01-21', '2021-01-21 18:35:55', NULL);
INSERT INTO `t_user` VALUES (6, 'D\r\n', '202cb962ac59075b964b07152d234b70', 1, '2021-01-21', '2021-01-21 18:35:55', NULL);

SET FOREIGN_KEY_CHECKS = 1;
