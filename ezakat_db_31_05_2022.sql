/*
 Navicat Premium Data Transfer

 Source Server         : docker-3306
 Source Server Type    : MariaDB
 Source Server Version : 100803
 Source Host           : localhost:3306
 Source Schema         : ezakat_db

 Target Server Type    : MariaDB
 Target Server Version : 100803
 File Encoding         : 65001

 Date: 31/05/2022 20:24:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for data_zakat_amilzakat
-- ----------------------------
DROP TABLE IF EXISTS `data_zakat_amilzakat`;
CREATE TABLE `data_zakat_amilzakat`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `type_zakat` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `nominal` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mosque` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of data_zakat_amilzakat
-- ----------------------------
INSERT INTO `data_zakat_amilzakat` VALUES (30, 'Bagus Subagja', 'Zakat Fitrah', 'Rp100.000', 'Masjid At-Tosin', '123', '2022-05-04 19:15:53');

-- ----------------------------
-- Table structure for data_zakatfitrah_amilzakat
-- ----------------------------
DROP TABLE IF EXISTS `data_zakatfitrah_amilzakat`;
CREATE TABLE `data_zakatfitrah_amilzakat`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `nominal` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of data_zakatfitrah_amilzakat
-- ----------------------------
INSERT INTO `data_zakatfitrah_amilzakat` VALUES (1, 'Septian Dwi Putra Pradipta', 'Jl. Subang Merdeka', 1000000);
INSERT INTO `data_zakatfitrah_amilzakat` VALUES (2, 'Arfi Dwi Putra Pradipta', 'Rancaekek', 1000000);
INSERT INTO `data_zakatfitrah_amilzakat` VALUES (3, 'Iman Syahputra', 'Cibiru', 1500000);
INSERT INTO `data_zakatfitrah_amilzakat` VALUES (4, 'Fikri Fauzaan', 'Bojongsoang', 500000);
INSERT INTO `data_zakatfitrah_amilzakat` VALUES (5, 'Bagus Firmansyah', 'Antapani', 2000000);

-- ----------------------------
-- Table structure for mosque
-- ----------------------------
DROP TABLE IF EXISTS `mosque`;
CREATE TABLE `mosque`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `region` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `postalcode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `bca_account_number` int(11) NULL DEFAULT NULL,
  `bni_account_number` int(11) NULL DEFAULT NULL,
  `mandiri_account_number` int(11) NULL DEFAULT NULL,
  `contact_person` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `name`(`name`) USING BTREE,
  INDEX `postalcode`(`postalcode`) USING BTREE,
  INDEX `address`(`address`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mosque
-- ----------------------------
INSERT INTO `mosque` VALUES (1, 'Masjid Nurul Huda', 'Jl. Ciliwung No.11', 'Ujung Berung', '62812345678', '40618', 9321896, 4240894, 4818892, 'M.  Faja Sumitra');
INSERT INTO `mosque` VALUES (2, 'Masjid Al-Jabbar', 'Jl. Atas Awan No.91', 'Ujung Berung', '62812345678', '40618', 4818892, 9321896, 9321896, 'Fikri Arif Rahman');
INSERT INTO `mosque` VALUES (3, 'Masjid As-Sakinah', 'Jl. Ujung Berung Wetan No.03', 'Ujung Berung', '62812345678', '40618', 4818892, 9321896, 9321896, 'Farhan Fauzaan');
INSERT INTO `mosque` VALUES (4, 'Masjid Nurul Falah', 'Jl. Cangkuang No.17', 'Rancaekek', '62812345678', '40394', 9321896, 9321896, 4818892, 'Iman Nurohman');
INSERT INTO `mosque` VALUES (5, 'Masjid Al-Hidayah', 'Jl. Dangdeur No.24', 'Rancaekek', '62812345678', '40394', 9321896, 9321896, 4818892, 'Fikri Habib Ramadhan');
INSERT INTO `mosque` VALUES (6, 'Masjid Ar-Rahman', 'Jl. Sawahdadap No.44', 'Rancaekek', '62812345678', '40394', 4818892, 9321896, 9321896, 'Arfi Triawan');
INSERT INTO `mosque` VALUES (7, 'Masjid Al-Hakim', 'Jl. Bromo No.18', 'Pasir Impun', '62812345678', '40195', 4818892, 9321896, 9321896, 'Reyhan Agus Priyatna');
INSERT INTO `mosque` VALUES (8, 'Masjid Al-Lukman', 'Jl. Sukasari No.10', 'Pasir Impun', '62812345678', '40195', 9321896, 9321896, 4818892, 'Septian Dwi Putra');
INSERT INTO `mosque` VALUES (9, 'Masjid Al-Falah', 'Jl. Bumi Indah No.22', 'Pasir Impun', '62812345678', '40195', 9321896, 4818892, 4818892, 'Reihan Manzis Syahputra');
INSERT INTO `mosque` VALUES (10, 'Masjid At-Tosin', 'Jl. Cicendo No.94', 'Antapani', '62812345678', '40291', 9321896, 9321896, 4818892, 'Nabil Furqon');
INSERT INTO `mosque` VALUES (11, 'Masjid Al-Makmur', 'Jl. Aceh No. 66', 'Antapani', '62812345678', '40291', 4818892, 9321896, 9321896, 'Akbar Mahmudin');
INSERT INTO `mosque` VALUES (12, 'Masjid Istiqlal', 'Jl. Merdeka No.37', 'Antapani', '62812345678', '40291', 4818892, 9321896, 9321896, 'M. Annur Fallah');

-- ----------------------------
-- Table structure for queue_fitrah_amilzakat
-- ----------------------------
DROP TABLE IF EXISTS `queue_fitrah_amilzakat`;
CREATE TABLE `queue_fitrah_amilzakat`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `date` datetime NULL DEFAULT NULL,
  `postalcode` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of queue_fitrah_amilzakat
-- ----------------------------
INSERT INTO `queue_fitrah_amilzakat` VALUES (1, 'Bagus Subagja', 'Jl. Bojong Koneng No.17', '2022-05-23 09:03:37', 40394);
INSERT INTO `queue_fitrah_amilzakat` VALUES (2, 'Adrian Syamsu', 'Setia Budi', '2022-04-27 16:57:05', 40394);
INSERT INTO `queue_fitrah_amilzakat` VALUES (3, 'Rony Sudirja', 'Kircon', '2022-04-05 16:47:00', 40394);
INSERT INTO `queue_fitrah_amilzakat` VALUES (4, 'Muhammad Manzis', 'Ujung Berung', '2022-04-28 16:57:05', 40394);
INSERT INTO `queue_fitrah_amilzakat` VALUES (5, 'Reyhan Habib Choi', 'Cibiru', '2022-04-29 16:57:05', 40394);

-- ----------------------------
-- Table structure for users_amilzakat
-- ----------------------------
DROP TABLE IF EXISTS `users_amilzakat`;
CREATE TABLE `users_amilzakat`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `postalcode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `region` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users_amilzakat
-- ----------------------------
INSERT INTO `users_amilzakat` VALUES (1, 'Masjid Nurul Huda', 'Jl. Ciliwung No.11', '40618', 'nurulhuda', '123', 'Ujung Berung');
INSERT INTO `users_amilzakat` VALUES (2, 'Masjid Al-Jabbar', 'Jl. Atas Awan No.91', '40618', 'aljabar', '123', 'Ujung Berung');
INSERT INTO `users_amilzakat` VALUES (3, 'Masjid As-Sakinah', 'Jl. Ujung Berung Wetan No.03', '40618', 'sakinah', '123', 'Ujung Berung');
INSERT INTO `users_amilzakat` VALUES (4, 'Masjid Nurul Falah', 'Jl. Cangkuang No.17', '40394', 'nurulfalah', '123', 'Rancaekek');
INSERT INTO `users_amilzakat` VALUES (5, 'Masjid Al-Hidayah', 'Jl. Dangdeur No.24', '40394', 'hidayah', '123', 'Rancaekek');
INSERT INTO `users_amilzakat` VALUES (6, 'Masjid Ar-Rahman', 'Jl. Sawahdadap No.44', '40394', 'arrahman', '123', 'Rancaekek');
INSERT INTO `users_amilzakat` VALUES (7, 'Masjid Al-Hakim', 'Jl. Bromo No.18', '40195', 'alhakim', '123', 'Pasir Impun');
INSERT INTO `users_amilzakat` VALUES (8, 'Masjid Al-Lukman', 'Jl. Sukasari No.10', '40195', 'lukman', '123', 'Pasir Impun');
INSERT INTO `users_amilzakat` VALUES (9, 'Masjid Al-Falah', 'Jl. Bumi Indah No.22', '40195', 'falah', '123', 'Pasir Impun');
INSERT INTO `users_amilzakat` VALUES (10, 'Masjid At-Tosin', 'Jl. Cicendo No.94', '40291', 'attosin', '123', 'Antapani');
INSERT INTO `users_amilzakat` VALUES (11, 'Masjid Al-Makmur', 'Jl. Aceh No. 66', '40291', 'makmur', '123', 'Antapani');
INSERT INTO `users_amilzakat` VALUES (12, 'Masjid Istiqlal', 'Jl. Merdeka No.37', '40291', 'istiqlal', '123', 'Antapani');
INSERT INTO `users_amilzakat` VALUES (13, 'Masjid Nurul Iman', 'Jl. Cipaganti No.19', '40291', 'nuruliman', '12345', 'Antapani');
INSERT INTO `users_amilzakat` VALUES (14, 'Masjid Al-Furqon', 'Jl. Rancaekek Kidul No.99', '40394', 'furqon', '123', 'Rancaekek');

-- ----------------------------
-- Table structure for users_muzakki
-- ----------------------------
DROP TABLE IF EXISTS `users_muzakki`;
CREATE TABLE `users_muzakki`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `postalcode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `dependents` int(5) NULL DEFAULT NULL,
  `region` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users_muzakki
-- ----------------------------
INSERT INTO `users_muzakki` VALUES (1, 'Alif Ilman Nafian', 'Jl. Pasirwangi No.77 Ujung Berung', '40618', 'alif', '123', 2, 'Ujung Berung');
INSERT INTO `users_muzakki` VALUES (2, 'Bagus Subagja', 'Jl. Bojong Koneng No.17 Rancaekek', '40394', 'bagus', '123', 4, 'Rancaekek');
INSERT INTO `users_muzakki` VALUES (3, 'Nikita Sabila', 'Jl. Pasir Impun No. 84 Pasir Impun', '40195', 'nikita', '12345', 0, 'Pasir Impun');
INSERT INTO `users_muzakki` VALUES (4, 'Riyandi Firman', 'Jl. Antapani Wetan No.69', '40291', 'riyandi', '1234', 3, 'Antapani');
INSERT INTO `users_muzakki` VALUES (6, 'Dummy1', 'Jl. Sumatera No.74', '40394', 'admin2', '1234', 21, 'Rancaekek');

-- ----------------------------
-- Table structure for zakat_history
-- ----------------------------
DROP TABLE IF EXISTS `zakat_history`;
CREATE TABLE `zakat_history`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `type_zakat` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `nominal` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mosque` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `date` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of zakat_history
-- ----------------------------
INSERT INTO `zakat_history` VALUES (1, 'Bagus Subagja', 'Zakat Maal', 'Rp1000.0', 'Masjid Nurul Falah', '62812345678', 'Sukses', '2022-05-31 13:52:07');
INSERT INTO `zakat_history` VALUES (2, 'Riyandi Firman', 'Zakat Maal', 'Rp150000.0', 'Masjid At-Tosin', '62812345678', 'Sukses', '2022-05-31 06:58:01');
INSERT INTO `zakat_history` VALUES (3, 'Riyandi Firman', 'Zakat Maal', 'Rp217500.0', 'Masjid Al-Makmur', '62812345678', 'Sukses', '2022-05-31 06:58:44');
INSERT INTO `zakat_history` VALUES (4, 'Riyandi Firman', 'Zakat Maal', 'Rp1400000.0', 'Masjid Al-Makmur', '62812345678', 'Sukses', '2022-05-31 07:00:08');
INSERT INTO `zakat_history` VALUES (10, 'Bagus Subagja', 'Zakat Maal', 'Rp0.025', 'Masjid Nurul Falah', '62812345678', 'Sukses', '2022-05-31 07:27:04');
INSERT INTO `zakat_history` VALUES (11, 'Bagus Subagja', 'Zakat Fitrah', 'Rp90000', 'Masjid Nurul Falah', '62812345678', 'Sukses', '2022-05-31 07:27:25');
INSERT INTO `zakat_history` VALUES (12, 'Bagus Subagja', 'Zakat Fitrah', 'Rp0.025', 'Masjid Nurul Falah', '62812345678', 'Sukses', '2022-05-31 07:27:46');
INSERT INTO `zakat_history` VALUES (13, 'Alif Ilman Nafian', 'Zakat Maal', 'Rp2500.0', 'Masjid Al-Jabbar', '62812345678', 'Sukses', '2022-05-31 07:29:42');
INSERT INTO `zakat_history` VALUES (15, 'Alif Ilman Nafian', 'Zakat Maal', 'Rp212500.0', 'Masjid Nurul Huda', '62812345678', 'Sukses', '2022-05-31 07:31:49');
INSERT INTO `zakat_history` VALUES (16, 'Alif Ilman Nafian', 'Zakat Fitrah', 'Rp270000', 'Masjid As-Sakinah', '62812345678', 'Sukses', '2022-05-31 07:32:04');
INSERT INTO `zakat_history` VALUES (17, 'Alif Ilman Nafian', 'Zakat Fitrah', 'Rp495000', 'Masjid Al-Jabbar', '62812345678', 'Sukses', '2022-05-31 07:32:20');
INSERT INTO `zakat_history` VALUES (18, 'Bagus Subagja', 'Zakat Maal', 'Rp112500.0', 'Masjid Nurul Falah', '62812345678', 'Sukses', '2022-05-31 08:16:22');
INSERT INTO `zakat_history` VALUES (19, 'Nikita Sabila', 'Zakat Maal', 'Rp3086419.725', 'Masjid Al-Lukman', '62812345678', 'Sukses', '2022-05-31 08:19:04');
INSERT INTO `zakat_history` VALUES (20, 'Riyandi Firman', 'Zakat Fitrah', 'Rp45000', 'Masjid At-Tosin', 'null', 'Sukses', '2022-05-31 08:25:15');
INSERT INTO `zakat_history` VALUES (21, 'Riyandi Firman', 'Zakat Fitrah', 'Rp135000', 'Masjid Istiqlal', 'null', 'Sukses', '2022-05-31 08:27:09');
INSERT INTO `zakat_history` VALUES (22, 'null', 'null', 'null', 'null', 'null', 'Sukses', '2022-05-31 08:28:37');
INSERT INTO `zakat_history` VALUES (23, 'Alif Ilman Nafian', 'Zakat Fitrah', 'Rp45000', 'Masjid Al-Jabbar', 'null', 'Sukses', '2022-05-31 08:33:58');
INSERT INTO `zakat_history` VALUES (24, 'Alif Ilman Nafian', 'Zakat Fitrah', 'Rp90000', 'Masjid As-Sakinah', 'null', 'Sukses', '2022-05-31 08:35:02');
INSERT INTO `zakat_history` VALUES (25, 'Alif Ilman Nafian', 'Zakat Maal', 'Rp0.025', 'Masjid As-Sakinah', '62812345678', 'Sukses', '2022-05-31 08:55:24');
INSERT INTO `zakat_history` VALUES (26, 'Nikita Sabila', 'Zakat Maal', 'Rp0.025', 'Masjid Al-Hakim', '62812345678', 'Sukses', '2022-05-31 09:02:18');
INSERT INTO `zakat_history` VALUES (27, 'Nikita Sabila', 'Zakat Maal', 'Rp0.15000000000000002', 'Masjid Al-Lukman', '62812345678', 'Sukses', '2022-05-31 09:02:45');
INSERT INTO `zakat_history` VALUES (28, 'Nikita Sabila', 'Zakat Fitrah', 'Rp90000', 'Masjid Al-Falah', '62812345678', 'Sukses', '2022-05-31 09:03:05');
INSERT INTO `zakat_history` VALUES (29, 'Nikita Sabila', 'Zakat Fitrah', 'Rp0.4', 'Masjid Al-Hakim', '62812345678', 'Sukses', '2022-05-31 09:03:56');
INSERT INTO `zakat_history` VALUES (30, 'Bagus Subagja', 'Zakat Maal', 'Rp2275.0', 'Masjid Al-Hidayah', '62812345678', 'Sukses', '2022-05-31 09:40:12');
INSERT INTO `zakat_history` VALUES (31, 'Bagus Subagja', 'Zakat Fitrah', 'Rp225000', 'Masjid Ar-Rahman', '62812345678', 'Sukses', '2022-05-31 09:40:26');

SET FOREIGN_KEY_CHECKS = 1;
