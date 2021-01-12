/*
 Navicat Premium Data Transfer

 Source Server         : localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : shiro

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 12/01/2021 10:56:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_users
-- ----------------------------
DROP TABLE IF EXISTS `t_users`;
CREATE TABLE `t_users`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `salt` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_users
-- ----------------------------
INSERT INTO `t_users` VALUES (1, '路飞', 'be59564e3e648e0f606e17d7bb5b7934', 'noJmwJ7F', '2020-12-31 23:00:02', '2021-01-07 22:59:59');
INSERT INTO `t_users` VALUES (2, 'Alen', '99cdfcdb829c4c505acd92ed77f1b536', '7Vy^!Kjp', '2021-01-28 23:00:05', '2021-01-20 23:00:11');
INSERT INTO `t_users` VALUES (3, '小明', '7cdd798bd3ad0235cfb93f67e24aa485', '@4qpfdQS', '2021-01-27 23:00:08', '2021-01-23 23:00:15');
INSERT INTO `t_users` VALUES (5, 'Luffy', '7cdd798bd3ad0235cfb93f67e24aa485', '3$^*G)df', '2021-01-11 23:27:47', '2021-01-11 23:27:47');

SET FOREIGN_KEY_CHECKS = 1;
