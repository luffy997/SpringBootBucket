<<<<<<< HEAD
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

 Date: 21/01/2021 13:46:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `good_name` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品名称',
  `brand_id` int(11) NOT NULL COMMENT '产品名称',
  `market_price` decimal(9, 2) NOT NULL DEFAULT 0.00 COMMENT '市场价格',
  `shop_price` decimal(9, 2) NOT NULL DEFAULT 0.00 COMMENT '本店售价',
  `promote_price` decimal(9, 2) NOT NULL DEFAULT 0.00 COMMENT '促销价格',
  `goods_brief` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品简介',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `version` bigint(10) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_putaway` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否上架',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
=======
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

 Date: 21/01/2021 13:46:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `good_name` char(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品名称',
  `brand_id` int(11) NOT NULL COMMENT '产品名称',
  `market_price` decimal(9, 2) NOT NULL DEFAULT 0.00 COMMENT '市场价格',
  `shop_price` decimal(9, 2) NOT NULL DEFAULT 0.00 COMMENT '本店售价',
  `promote_price` decimal(9, 2) NOT NULL DEFAULT 0.00 COMMENT '促销价格',
  `goods_brief` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '商品简介',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除',
  `version` bigint(10) NOT NULL DEFAULT 1 COMMENT '乐观锁',
  `is_putaway` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否上架',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
>>>>>>> a587113e1e2ddd393f1aca9f62ae9e128b6c953e
