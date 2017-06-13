/*
Navicat MySQL Data Transfer

Source Server         : 1270.0.1
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : jkgateway

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-06-04 20:02:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rec_news_info
-- ----------------------------
DROP TABLE IF EXISTS `rec_news_info`;
CREATE TABLE `rec_news_info` (
  `serial_id` varchar(64) NOT NULL,
  `news_title` text,
  `news_content` text,
  `auother` varchar(64) DEFAULT NULL,
  `click_num` varchar(10) DEFAULT NULL COMMENT '点击量',
  `create_time` varchar(64) DEFAULT NULL,
  `update_time` varchar(64) DEFAULT NULL,
  `use_flag` varchar(64) DEFAULT '1',
  PRIMARY KEY (`serial_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rec_news_info
-- ----------------------------
INSERT INTO `rec_news_info` VALUES ('111111', '22222', '333333', '4444', '2', '2', '33', '0');

-- ----------------------------
-- Table structure for rec_product
-- ----------------------------
DROP TABLE IF EXISTS `rec_product`;
CREATE TABLE `rec_product` (
  `serial_id` varchar(64) NOT NULL,
  `product_type_no` varchar(64) DEFAULT NULL,
  `product_type_name` varchar(64) DEFAULT NULL,
  `product_type_img` varchar(500) DEFAULT NULL,
  `product_no` varchar(64) DEFAULT NULL,
  `product_name` varchar(64) DEFAULT NULL,
  `product_img` varchar(500) DEFAULT NULL,
  `req_url` varchar(500) DEFAULT NULL,
  `mark_img` varchar(500) DEFAULT NULL,
  `mark_dec` text,
  `use_flag` varchar(64) DEFAULT '1',
  PRIMARY KEY (`serial_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rec_product
-- ----------------------------

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `serial_id` varchar(64) NOT NULL,
  `menu_no` varchar(64) DEFAULT NULL,
  `menu_name` varchar(64) DEFAULT NULL,
  `menu_url` varchar(64) DEFAULT NULL,
  `menu_parent_no` varchar(64) DEFAULT NULL,
  `use_flag` varchar(64) DEFAULT '1',
  `create_time` varchar(64) DEFAULT NULL,
  `UPDATE_TIME` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`serial_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '1', '系统参数配置', '', '', '1', '2017-06-04 15:42:20', '2017-06-04 15:42:20');
INSERT INTO `sys_menu` VALUES ('2', '2', '枚举参数配置', '2222222', '1', '1', '2017-06-04 15:42:20', '2017-06-04 15:42:20');
INSERT INTO `sys_menu` VALUES ('3', '3', '角色权限配置', '3333333', '1', '1', '2017-06-04 15:42:20', '3');

-- ----------------------------
-- Table structure for sys_parms
-- ----------------------------
DROP TABLE IF EXISTS `sys_parms`;
CREATE TABLE `sys_parms` (
  `sys_id` varchar(64) NOT NULL,
  `sys_no` varchar(64) DEFAULT NULL,
  `sys_key` varchar(64) DEFAULT NULL,
  `sys_value` varchar(64) DEFAULT NULL,
  `sys_desc` varchar(2000) DEFAULT NULL,
  `sys_key1` varchar(64) DEFAULT NULL,
  `sys_value1` varchar(64) DEFAULT NULL,
  `sys_desc1` varchar(2000) DEFAULT NULL,
  `sys_parent_no` varchar(64) DEFAULT NULL,
  `sys_sequ` varchar(64) DEFAULT NULL,
  `create_time` varchar(64) DEFAULT NULL,
  `update_time` varchar(64) DEFAULT NULL,
  `use_flag` varchar(64) DEFAULT '1',
  PRIMARY KEY (`sys_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_parms
-- ----------------------------
INSERT INTO `sys_parms` VALUES ('E20170321145034', 'E20170321145034', 'is_delete', '是否删除(是否生效)', '是否删除(是否生效)', '', '', '', '', '', '20170321 14:24:28', '20170321 14:24:28', '0');
INSERT INTO `sys_parms` VALUES ('E20170321145532', 'E20170321145532', '0', '生效(未删除)', '生效(未删除)', '', '', '', 'E20170321145034', '', '20170321 14:24:28', '20170321 14:24:28', '0');
INSERT INTO `sys_parms` VALUES ('E20170321145734', 'E20170321145734', '1', '失效(已删除)', '失效(已删除)', '', '', '', 'E20170321145034', '', '20170321 14:24:28', '20170321 14:24:28', '0');
INSERT INTO `sys_parms` VALUES ('E20170404222906', 'E20170404222906', '123', '123', '123', '', '', '', '', '', '20170404 19:48:38', '20170404 19:48:38', '0');
INSERT INTO `sys_parms` VALUES ('E20170404222917', 'E20170404222917', '123', '123', '123', '', '', '', 'E20170404222906', '', '20170404 19:48:38', '20170404 19:48:38', '0');
INSERT INTO `sys_parms` VALUES ('E20170404222925', 'E20170404222925', '123', '123', '123', '', '', '', 'E20170404222906', '', '20170404 19:48:38', '20170404 19:48:38', '0');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `serialId` varchar(64) NOT NULL,
  `role_no` varchar(64) DEFAULT NULL,
  `role_name` varchar(64) DEFAULT NULL,
  `rights` varchar(2000) DEFAULT NULL,
  `use_flag` varchar(64) DEFAULT NULL,
  `create_time` varchar(64) DEFAULT NULL,
  `update_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`serialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '1', 'ADMIN', '2,', null, null, null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `serialId` varchar(64) NOT NULL,
  `user_no` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `PASSWORD` varchar(64) DEFAULT NULL,
  `role_no` varchar(64) DEFAULT NULL,
  `use_flag` varchar(64) DEFAULT NULL,
  `create_time` varchar(64) DEFAULT NULL,
  `update_time` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`serialId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
