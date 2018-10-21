/*
Navicat MySQL Data Transfer

Source Server         : perfree-pc
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : jfinal_demo

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2018-10-21 13:09:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '25');
INSERT INTO `user` VALUES ('2', '李四', '22');
INSERT INTO `user` VALUES ('3', '王二', '25');
INSERT INTO `user` VALUES ('4', '铁蛋', '23');
INSERT INTO `user` VALUES ('5', '山炮', '28');
