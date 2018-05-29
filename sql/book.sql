/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50639
Source Host           : localhost:3306
Source Database       : book

Target Server Type    : MYSQL
Target Server Version : 50639
File Encoding         : 65001

Date: 2018-05-26 14:49:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bid` int(4) NOT NULL,
  `bname` char(20) NOT NULL,
  `bdesc` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'beijing', 'hello beijing');
INSERT INTO `book` VALUES ('2', 'xian', 'hello xian');
INSERT INTO `book` VALUES ('3', 'xiamen', 'hello xiamen');
INSERT INTO `book` VALUES ('4', 'aiqing', 'hello aiqing');
