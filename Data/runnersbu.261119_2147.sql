-- MySQL dump 10.13  Distrib 8.0.17, for macos10.14 (x86_64)
--
-- Host: localhost    Database: runners
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `competition`
--

DROP TABLE IF EXISTS `competition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `competition` (
  `CompetitionID` int(11) NOT NULL AUTO_INCREMENT,
  `MemberID` int(11) DEFAULT NULL,
  `Date` varchar(255) DEFAULT NULL,
  `Place` varchar(255) DEFAULT NULL,
  `EventTitle` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CompetitionID`),
  KEY `MemberID` (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=10522 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competition`
--

LOCK TABLES `competition` WRITE;
/*!40000 ALTER TABLE `competition` DISABLE KEYS */;
INSERT INTO `competition` VALUES (10447,112,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10448,94,'2019-11-10','Oure','Turnering nr. 2','DK'),(10449,95,'2019-11-10','Oure','Turnering nr. 2','DK'),(10450,96,'2019-11-10','Oure','Turnering nr. 2','DK'),(10451,97,'2019-11-10','Oure','Turnering nr. 2','DK'),(10452,98,'2019-11-10','Oure','Turnering nr. 2','DK'),(10453,99,'2019-11-10','Oure','Turnering nr. 2','DK'),(10454,100,'2019-11-10','Oure','Turnering nr. 2','DK'),(10455,102,'2019-11-10','Oure','Turnering nr. 2','DK'),(10456,109,'2019-11-10','Oure','Turnering nr. 2','DK'),(10457,110,'2019-11-10','Oure','Turnering nr. 2','DK'),(10458,111,'2019-11-10','Oure','Turnering nr. 2','DK'),(10459,112,'2019-11-10','Oure','Turnering nr. 2','DK'),(10460,113,'2019-11-10','Oure','Turnering nr. 2','DK'),(10461,114,'2019-11-10','Oure','Turnering nr. 2','DK'),(10462,115,'2019-11-10','Oure','Turnering nr. 2','DK'),(10463,116,'2019-11-10','Oure','Turnering nr. 2','DK'),(10464,117,'2019-11-10','Oure','Turnering nr. 2','DK'),(10465,118,'2019-11-10','Oure','Turnering nr. 2','DK'),(10466,119,'2019-11-10','Oure','Turnering nr. 2','DK'),(10467,94,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10468,95,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10469,96,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10470,97,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10471,98,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10472,99,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10473,100,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10474,102,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10475,109,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10476,110,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10477,111,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10478,112,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10479,113,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10480,114,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10481,115,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10482,116,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10483,117,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10484,118,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10485,119,'2019-03-03','Ikast','DGI Landmesterskab 2019','DK'),(10486,94,'2019-04-22','Hjemme','Træning','DK'),(10487,95,'2019-04-22','Hjemme','Træning','DK'),(10488,96,'2019-04-22','Hjemme','Træning','DK'),(10489,97,'2019-04-22','Hjemme','Træning','DK'),(10490,98,'2019-04-22','Hjemme','Træning','DK'),(10491,99,'2019-04-22','Hjemme','Træning','DK'),(10492,100,'2019-04-22','Hjemme','Træning','DK'),(10493,102,'2019-04-22','Hjemme','Træning','DK'),(10494,109,'2019-04-22','Hjemme','Træning','DK'),(10495,110,'2019-04-22','Hjemme','Træning','DK'),(10496,111,'2019-04-22','Hjemme','Træning','DK'),(10497,112,'2019-04-22','Hjemme','Træning','DK'),(10498,113,'2019-04-22','Hjemme','Træning','DK'),(10499,114,'2019-04-22','Hjemme','Træning','DK'),(10500,115,'2019-04-22','Hjemme','Træning','DK'),(10501,116,'2019-04-22','Hjemme','Træning','DK'),(10502,117,'2019-04-22','Hjemme','Træning','DK'),(10503,118,'2019-04-22','Hjemme','Træning','DK'),(10504,119,'2019-04-22','Hjemme','Træning','DK'),(10505,94,'2019-04-14','Hjemme','Træning','DK'),(10506,95,'2019-04-14','Hjemme','Træning','DK'),(10507,96,'2019-04-14','Hjemme','Træning','DK'),(10508,97,'2019-04-14','Hjemme','Træning','DK'),(10509,98,'2019-04-14','Hjemme','Træning','DK'),(10510,99,'2019-04-14','Hjemme','Træning','DK'),(10511,100,'2019-04-14','Hjemme','Træning','DK'),(10512,102,'2019-04-14','Hjemme','Træning','DK'),(10513,109,'2019-04-14','Hjemme','Træning','DK'),(10514,110,'2019-04-14','Hjemme','Træning','DK'),(10515,111,'2019-04-14','Hjemme','Træning','DK'),(10516,112,'2019-04-14','Hjemme','Træning','DK'),(10517,113,'2019-04-14','Hjemme','Træning','DK'),(10518,114,'2019-04-14','Hjemme','Træning','DK'),(10519,115,'2019-04-14','Hjemme','Træning','DK'),(10520,116,'2019-04-14','Hjemme','Træning','DK'),(10521,117,'2019-04-14','Hjemme','Træning','DK');
/*!40000 ALTER TABLE `competition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `competition_details`
--

DROP TABLE IF EXISTS `competition_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `competition_details` (
  `CompetitionDetailID` int(11) NOT NULL AUTO_INCREMENT,
  `CompetitionID` int(11) DEFAULT NULL,
  `SwimArtID` int(11) DEFAULT NULL,
  `SwimDistID` int(11) DEFAULT NULL,
  `Result` int(11) DEFAULT NULL,
  `genderid` int(11) DEFAULT NULL,
  `ResultString` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CompetitionDetailID`),
  KEY `CompetitionID` (`CompetitionID`),
  KEY `SwimArtID` (`SwimArtID`),
  KEY `SwimDistID` (`SwimDistID`)
) ENGINE=InnoDB AUTO_INCREMENT=687 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competition_details`
--

LOCK TABLES `competition_details` WRITE;
/*!40000 ALTER TABLE `competition_details` DISABLE KEYS */;
INSERT INTO `competition_details` VALUES (522,10448,1,4,NULL,1,'2:27.08'),(523,10449,1,4,NULL,1,'2:28.59'),(524,10450,1,4,NULL,1,'2:30.33'),(525,10451,1,4,NULL,1,'2:35.05'),(526,10452,1,4,NULL,1,'2:37.24'),(527,10453,1,4,NULL,1,'2:38.60'),(528,10454,1,4,NULL,1,'2:41.22'),(529,10455,1,4,NULL,1,'2:41.26'),(530,10456,1,4,NULL,1,'2:41.88'),(531,10457,1,4,NULL,1,'2:42.88'),(532,10458,1,4,NULL,1,'2:43.73'),(533,10459,1,4,NULL,1,'2:46.81'),(534,10460,1,4,NULL,1,'2:53.59'),(535,10461,1,4,NULL,1,'2:57.30'),(536,10462,1,4,NULL,1,'2:59.05'),(537,10463,1,4,NULL,1,'3:01.02'),(538,10464,1,4,NULL,1,'3:04.02'),(539,10465,1,4,NULL,1,'3:15.86'),(540,10466,1,4,NULL,1,'3:26.89'),(541,10448,1,3,NULL,1,'1:48.15'),(542,10449,1,3,NULL,1,'1:50.94'),(543,10450,1,3,NULL,1,'1:51.82'),(544,10451,1,3,NULL,1,'1:54.52'),(545,10452,1,3,NULL,1,'1:55.86'),(546,10453,1,3,NULL,1,'1:55.57'),(547,10454,1,3,NULL,1,'1:59.52'),(548,10455,1,3,NULL,1,'1:59.10'),(549,10456,1,3,NULL,1,'1:59.17'),(550,10457,1,3,NULL,1,'2:02.98'),(551,10458,1,3,NULL,1,'2:01.70'),(552,10459,1,3,NULL,1,'2:04.08'),(553,10460,1,3,NULL,1,'2:07.89'),(554,10461,1,3,NULL,1,'2:10.94'),(555,10462,1,3,NULL,1,'2:10.51'),(556,10463,1,3,NULL,1,'2:16.45'),(557,10464,1,3,NULL,1,'2:16.49'),(558,10465,1,3,NULL,1,'2:28.69'),(559,10466,1,3,NULL,1,'2:33.82'),(560,10448,1,2,NULL,1,'1:08.81'),(561,10449,1,2,NULL,1,'1:11.27'),(562,10450,1,2,NULL,1,'1:12.47'),(563,10451,1,2,NULL,1,'1:13.88'),(564,10452,1,2,NULL,1,'1:14.30'),(565,10453,1,2,NULL,1,'1:12.94'),(566,10454,1,2,NULL,1,'1:16.55'),(567,10455,1,2,NULL,1,'1:16.32'),(568,10456,1,2,NULL,1,'1:15.66'),(569,10457,1,2,NULL,1,'1:20.10'),(570,10458,1,2,NULL,1,'1:18.43'),(571,10459,1,2,NULL,1,'1:19.47'),(572,10460,1,2,NULL,1,'1:21.45'),(573,10461,1,2,NULL,1,'1:23.80'),(574,10462,1,2,NULL,1,'1:21.28'),(575,10463,1,2,NULL,1,'1:27.67'),(576,10464,1,2,NULL,1,'1:27.61'),(577,10465,1,2,NULL,1,'1:36.91'),(578,10466,1,2,NULL,1,'1:38.26'),(579,10448,1,1,NULL,1,'32.04'),(580,10449,1,1,NULL,1,'33.45'),(581,10450,1,1,NULL,1,'34.69'),(582,10451,1,1,NULL,1,'35.19'),(583,10452,1,1,NULL,1,'35.43'),(584,10453,1,1,NULL,1,'33.41'),(585,10454,1,1,NULL,1,'36.25'),(586,10455,1,1,NULL,1,'35.38'),(587,10456,1,1,NULL,1,'35.35'),(588,10457,1,1,NULL,1,'37.48'),(589,10458,1,1,NULL,1,'37.41'),(590,10459,1,1,NULL,1,'36.77'),(591,10460,1,1,NULL,1,'37.94'),(592,10461,1,1,NULL,1,'39.59'),(593,10462,1,1,NULL,1,'37.63'),(594,10463,1,1,NULL,1,'41.35'),(595,10464,1,1,NULL,1,'40.45'),(596,10465,1,1,NULL,1,'44.62'),(597,10466,1,1,NULL,1,'45.29'),(598,10467,1,3,NULL,1,' 1:45.95'),(599,10468,1,3,NULL,1,' 1:48.31'),(600,10469,1,3,NULL,1,' 1:51.60'),(601,10470,1,3,NULL,1,' 1:53.04'),(602,10471,1,3,NULL,1,' 1:50.54'),(603,10472,1,3,NULL,1,' 1:53.58'),(604,10473,1,3,NULL,1,' 1:55.43'),(605,10474,1,3,NULL,1,' 1:53.04'),(606,10475,1,3,NULL,1,' 1:55.99'),(607,10476,1,3,NULL,1,' 1:55.50'),(608,10477,1,3,NULL,1,' 1:57.77'),(609,10478,1,3,NULL,1,' 1:54.76'),(610,10479,1,3,NULL,1,' 1:58.07'),(611,10480,1,3,NULL,1,' 1:58.47'),(612,10481,1,3,NULL,1,' 2:01.43'),(613,10482,1,3,NULL,1,' 2:01.81'),(614,10483,1,3,NULL,1,' 2:04.43'),(615,10484,1,3,NULL,1,' 2:12.61'),(616,10485,1,3,NULL,1,' 2:19.42'),(617,10467,1,4,NULL,1,' 2:24.08'),(618,10468,1,4,NULL,1,' 2:24.58'),(619,10469,1,4,NULL,1,' 2:29.32'),(620,10470,1,4,NULL,1,' 2:30.33'),(621,10471,1,4,NULL,1,' 2:30.47'),(622,10472,1,4,NULL,1,' 2:32.54'),(623,10473,1,4,NULL,1,' 2:33.70'),(624,10474,1,4,NULL,1,' 2:34.19'),(625,10475,1,4,NULL,1,' 2:34.66'),(626,10476,1,4,NULL,1,' 2:37.70'),(627,10477,1,4,NULL,1,' 2:37.99'),(628,10478,1,4,NULL,1,' 2:38.36'),(629,10479,1,4,NULL,1,' 2:38.53'),(630,10480,1,4,NULL,1,' 2:39.18'),(631,10481,1,4,NULL,1,' 2:41.62'),(632,10482,1,4,NULL,1,' 2:43.47'),(633,10483,1,4,NULL,1,' 2:45.66'),(634,10484,1,4,NULL,1,' 3:00.50'),(635,10485,1,4,NULL,1,' 3:03.51'),(636,10486,1,4,NULL,1,' 2:41.37'),(637,10487,1,4,NULL,1,' 2:43.10'),(638,10488,1,4,NULL,1,' 2:43.90'),(639,10489,1,4,NULL,1,' 2:49.04'),(640,10490,1,4,NULL,1,' 2:55.18'),(641,10491,1,4,NULL,1,' 2:55.55'),(642,10492,1,4,NULL,1,' 2:55.61'),(643,10493,1,4,NULL,1,' 2:56.21'),(644,10494,1,4,NULL,1,' 2:57.38'),(645,10495,1,4,NULL,1,' 3:02.57'),(646,10496,1,4,NULL,1,' 3:03.64'),(647,10497,1,4,NULL,1,' 3:10.39'),(648,10498,1,4,NULL,1,' 3:13.16'),(649,10499,1,4,NULL,1,' 3:15.32'),(650,10500,1,4,NULL,1,' 3:24.05'),(651,10501,1,4,NULL,1,' 3:34.13'),(652,10502,1,4,NULL,1,' 3:38.07'),(653,10486,1,3,NULL,1,' 2:02.46'),(654,10487,1,3,NULL,1,' 2:03.76'),(655,10488,1,3,NULL,1,' 2:03.20'),(656,10489,1,3,NULL,1,' 2:04.96'),(657,10490,1,3,NULL,1,' 2:09.71'),(658,10491,1,3,NULL,1,' 2:11.72'),(659,10492,1,3,NULL,1,' 2:10.76'),(660,10493,1,3,NULL,1,' 2:12.12'),(661,10494,1,3,NULL,1,' 2:11.01'),(662,10495,1,3,NULL,1,' 2:15.95'),(663,10496,1,3,NULL,1,' 2:15.98'),(664,10497,1,3,NULL,1,' 2:26.21'),(665,10498,1,3,NULL,1,' 2:25.26'),(666,10499,1,3,NULL,1,' 2:25.35'),(667,10500,1,3,NULL,1,''),(668,10501,1,3,NULL,1,' 2:38.28'),(669,10502,1,3,NULL,1,' 2:42.02'),(670,10486,1,2,NULL,1,' 1:20.93'),(671,10487,1,2,NULL,1,' 1:19.96'),(672,10488,1,2,NULL,1,' 1:19.33'),(673,10489,1,2,NULL,1,' 1:19.63'),(674,10490,1,2,NULL,1,' 1:22.70'),(675,10491,1,2,NULL,1,' 1:24.74'),(676,10492,1,2,NULL,1,' 1:23.03'),(677,10493,1,2,NULL,1,' 1:23.67'),(678,10494,1,2,NULL,1,' 1:22.90'),(679,10495,1,2,NULL,1,' 1:27.52'),(680,10496,1,2,NULL,1,' 1:26.85'),(681,10497,1,2,NULL,1,' 1:34.55'),(682,10498,1,2,NULL,1,' 1:32.72'),(683,10499,1,2,NULL,1,' 1:32.13'),(684,10500,1,2,NULL,1,' 1:36.71'),(685,10501,1,2,NULL,1,' 1:40.38'),(686,10502,1,2,NULL,1,' 1:42.55');
/*!40000 ALTER TABLE `competition_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employees` (
  `EmployeeID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gender`
--

DROP TABLE IF EXISTS `gender`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gender` (
  `GenderID` int(11) NOT NULL AUTO_INCREMENT,
  `GenderType` int(11) DEFAULT NULL,
  `GenderTypeDescription` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`GenderID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gender`
--

LOCK TABLES `gender` WRITE;
/*!40000 ALTER TABLE `gender` DISABLE KEYS */;
INSERT INTO `gender` VALUES (1,0,'Women'),(2,1,'Men');
/*!40000 ALTER TABLE `gender` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `MemberID` int(11) NOT NULL AUTO_INCREMENT,
  `Employeeid` int(11) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Year` int(11) DEFAULT NULL,
  `Gender` int(11) DEFAULT NULL,
  `Active` tinyint(4) DEFAULT NULL,
  `Compete` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=294 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (93,NULL,'Fenja Romanski',2005,0,1,1),(94,NULL,'Ellen Jensen',2005,0,1,1),(95,NULL,'Ophelia Kronborg Jensen',2005,0,1,1),(96,NULL,'Katrine Stoltenhoff',2006,0,1,1),(97,NULL,'Ida Overgaard Thomassen',2005,0,1,1),(98,NULL,'Ida Rønnow',2006,0,1,1),(99,NULL,'Katrine Bøeg Thormann',2006,0,1,1),(100,NULL,'Sisse Berg Olesen',2005,0,1,1),(101,NULL,'Weronika L. Bjørn',2005,0,1,1),(102,NULL,'Sophie Møller Madsen',2005,0,1,1),(103,NULL,'Ida Kold Dalsgaard',2005,0,1,1),(104,NULL,'Pernille Petersen',2006,0,1,1),(105,NULL,'Laura Håkonsson',2006,0,1,1),(106,NULL,'Karoline Hellesøe',2006,0,1,1),(107,NULL,'Mathilde Hjort Lodstrup',2005,0,1,1),(108,NULL,'Anne Kølby Christensen',2005,0,1,1),(109,NULL,'Anna Mai Andersen',2006,0,1,1),(110,NULL,'Annemone Rasmussen',2006,0,1,1),(111,NULL,'Clara Hejndorff Bøgsted',2006,0,1,1),(112,NULL,'Sofie Keller',2005,0,1,1),(113,NULL,'Emma Bergene Hansen',2005,0,1,1),(114,NULL,'Dicte Westphal',2005,0,1,1),(115,NULL,'Dicte Nørvang Bisgaard',2006,0,1,1),(116,NULL,'Karoline Høgh',2006,0,1,1),(117,NULL,'Olivia Tilsted',2006,0,1,1),(118,NULL,'Stine Lund Holgersen',2006,0,1,1),(119,NULL,'Lærke Kirkedal Laursen',2005,0,1,1),(120,NULL,'Vilma Marie Walsted',2006,0,1,1),(121,NULL,'Freya Knop Kristensen',2005,0,1,1),(122,NULL,'Naja Kristiane Sørensen',2006,0,1,1),(123,NULL,'Yasmin Thrane Kristensen',2006,0,1,1),(124,NULL,'Camila Hansen',2006,0,1,1),(125,NULL,'Emilie Hummelshøj',2006,0,1,1),(126,NULL,'Trine Dam',2001,0,1,1),(127,NULL,'Sara Falch',2002,0,1,1),(128,NULL,'Natasja N. Løland',2000,0,1,1),(129,NULL,'Nynne Nørlem',2002,0,1,1),(130,NULL,'Maya Nautrup Pedersen',1999,0,1,1),(131,NULL,'Emmely Andersen',2001,0,1,1),(132,NULL,'Freya Kobber Nielsen',2001,0,1,1),(133,NULL,'Signe Dam',1999,0,1,1),(134,NULL,'Iben Kjær Bengtson',2002,0,1,1),(135,NULL,'Amanda Grønbæk Jensen',2001,0,1,1),(136,NULL,'Lucca Mikkelsen',2002,0,1,1),(137,NULL,'Cecilia Bækager Meldgaard',2002,0,1,1),(138,NULL,'Katrine Jensen',2001,0,1,1),(139,NULL,'Alberte Jensen',1999,0,1,1),(140,NULL,'Kamille Termansen',2002,0,1,1),(141,NULL,'Freja Gram',2001,0,1,1),(142,NULL,'Emma Christensen',2002,0,1,1),(143,NULL,'Ea Thomsen',2001,0,1,1),(144,NULL,'Mariana James',2002,0,1,1),(145,NULL,'Mathilde Wisborg Fog',2003,0,1,1),(146,NULL,'Line Heise',2003,0,1,1),(147,NULL,'Mathilde Møller',2004,0,1,1),(148,NULL,'Anna Christine Pedersen',2003,0,1,1),(149,NULL,'Camilla Tommerup Sørensen',2003,0,1,1),(150,NULL,'Cheyenne Erdmann',2004,0,1,1),(151,NULL,'Mathilde Werge Skall',2003,0,1,1),(152,NULL,'Nynne Jakobsen',2004,0,1,1),(153,NULL,'Benedikte Bøllingtoft',2003,0,1,1),(154,NULL,'Liva Ginnerup',2004,0,1,1),(155,NULL,'Karen K. H. Hagensen',2004,0,1,1),(156,NULL,'Nicoline Hansen',2004,0,1,1),(157,NULL,'Victoria Broch',2004,0,1,1),(158,NULL,'Thea Brøndum',2004,0,1,1),(159,NULL,'Laura Ostersen',2004,0,1,1),(160,NULL,'Sandra Aarslev',2004,0,1,1),(161,NULL,'Laura Østerby Clausen',2004,0,1,1),(162,NULL,'Karoline Skaarup Nielsen',2003,0,1,1),(163,NULL,'Sofie Holm Rasmussen',2004,0,1,1),(164,NULL,'Frederikke Johansen',2003,0,1,1),(165,NULL,'Mille Heise',2004,0,1,1),(166,NULL,'Cecilie Billesø',2003,0,1,1),(167,NULL,' Malthe Le Fevre',1987,1,0,0),(168,NULL,' Lucas Skjødt Broe',2001,1,0,0),(169,NULL,' Mads Poulsen',1967,1,0,0),(170,NULL,' Ebbe Als Olsen',2002,1,0,0),(171,NULL,' Frederik Jensen',1977,1,0,0),(172,NULL,'Kasper Jensen',2005,1,1,0),(173,NULL,'Mathias Nybro Laursen',2005,1,1,0),(174,NULL,'Jonas Gaur',2005,1,1,0),(175,NULL,'Bastian Stausholm Larsen',2005,1,1,0),(176,NULL,'William Romer Jørgensen',2005,1,1,0),(177,NULL,'Mads Kristensen',2005,1,1,0),(178,NULL,'Mark Rüdinger',2006,1,1,0),(179,NULL,'Philip Emborg Andreasen',2005,1,1,0),(180,NULL,'Mads Rager Larsen',2005,1,1,0),(181,NULL,'Emil Winther',2006,1,1,0),(182,NULL,'Lukas Nissen',2006,1,1,0),(183,NULL,'Andreas Skovgaard Hald',2006,1,1,0),(184,NULL,'Alexander Mogensen',2005,1,1,0),(185,NULL,'Elias Alminde Pedersen',2006,1,1,0),(186,NULL,'Kristian Nielsen',2005,1,1,0),(187,NULL,'Magnus Løkke',2005,1,1,0),(188,NULL,'Johannes Lund',2006,1,1,0),(189,NULL,'Andreas Laursen',2006,1,1,0),(190,NULL,'Henrik Hansen',2005,1,1,0),(191,NULL,'Sebastian Skov',2005,1,1,0),(192,NULL,'Silas Birkkjær',2006,1,1,0),(193,NULL,'Vilmer Damgaard',2006,1,1,0),(194,NULL,'Kristian Ølgaard',2005,1,1,0),(195,NULL,'Kristian Bøllingtoft',2006,1,1,0),(196,NULL,'Malthe Skau Rasmussen',2006,1,1,0),(197,NULL,'Martin Mark Hansen',2005,1,1,0),(198,NULL,'Jannick Franow',2006,1,1,0),(199,NULL,'Daniel Kristensen',2006,1,1,0),(200,NULL,'Christopher Kristiansen',2000,1,1,0),(201,NULL,'Frederik Kongstad Hansen',2001,1,1,0),(202,NULL,'Alexander Roe',1997,1,1,0),(203,NULL,'Niklas T. Kristiansen',2000,1,1,0),(204,NULL,'Frederik Juhl Leiszner',1999,1,1,0),(205,NULL,'Esben Røjkjær Rasmussen',2001,1,1,0),(206,NULL,'Scott Stegenborg',2000,1,1,0),(207,NULL,'Niklas Børsmose Simony',2001,1,1,0),(208,NULL,'Joachim Hedegaard Nielsen',2002,1,1,0),(209,NULL,'Kristoffer Thomsen',2000,1,1,0),(210,NULL,'Rasmus D. Jensen',1998,1,1,0),(211,NULL,'Rasmus Irmschler',2002,1,1,0),(212,NULL,'Simon Tuelstrup Bechmann',2001,1,1,0),(213,NULL,'Mads Berentzen',2002,1,1,0),(214,NULL,'Andreas Skak Thomsen',2001,1,1,0),(215,NULL,'Jonas Sørensen',1995,1,1,0),(216,NULL,'Jesper Thyssen',1995,1,1,0),(217,NULL,'David Tuan V. Valbjørn',2002,1,1,0),(218,NULL,'Christoffer Nedergaard',1995,1,1,0),(219,NULL,'Frederik Klüver',1998,1,1,0),(220,NULL,'Sebastian Emil Thomsen',2002,1,1,0),(221,NULL,'Kasper Jensen',2005,1,1,1),(222,NULL,'Mathias Nybro Laursen',2005,1,1,1),(223,NULL,'Jonas Gaur',2005,1,1,1),(224,NULL,'Bastian Stausholm Larsen',2005,1,1,1),(225,NULL,'William Romer Jørgensen',2005,1,1,1),(226,NULL,'Mads Kristensen',2005,1,1,1),(227,NULL,'Mark Rüdinger',2006,1,1,1),(228,NULL,'Philip Emborg Andreasen',2005,1,1,1),(229,NULL,'Mads Rager Larsen',2005,1,1,1),(230,NULL,'Emil Winther',2006,1,1,1),(231,NULL,'Lukas Nissen',2006,1,1,1),(232,NULL,'Andreas Skovgaard Hald',2006,1,1,1),(233,NULL,'Alexander Mogensen',2005,1,1,1),(234,NULL,'Elias Alminde Pedersen',2006,1,1,1),(235,NULL,'Kristian Nielsen',2005,1,1,1),(236,NULL,'Magnus Løkke',2005,1,1,1),(237,NULL,'Johannes Lund',2006,1,1,1),(238,NULL,'Andreas Laursen',2006,1,1,1),(239,NULL,'Henrik Hansen',2005,1,1,1),(240,NULL,'Sebastian Skov',2005,1,1,1),(241,NULL,'Silas Birkkjær',2006,1,1,1),(242,NULL,'Vilmer Damgaard',2006,1,1,1),(243,NULL,'Kristian Ølgaard',2005,1,1,1),(244,NULL,'Kristian Bøllingtoft',2006,1,1,1),(245,NULL,'Malthe Skau Rasmussen',2006,1,1,1),(246,NULL,'Martin Mark Hansen',2005,1,1,1),(247,NULL,'Jannick Franow',2006,1,1,1),(248,NULL,'Daniel Kristensen',2006,1,1,1),(249,NULL,'Christopher Kristiansen',2000,1,1,1),(250,NULL,'Frederik Kongstad Hansen',2001,1,1,1),(251,NULL,'Alexander Roe',1997,1,1,1),(252,NULL,'Niklas T. Kristiansen',2000,1,1,1),(253,NULL,'Frederik Juhl Leiszner',1999,1,1,1),(254,NULL,'Esben Røjkjær Rasmussen',2001,1,1,1),(255,NULL,'Scott Stegenborg',2000,1,1,1),(256,NULL,'Niklas Børsmose Simony',2001,1,1,1),(257,NULL,'Joachim Hedegaard Nielsen',2002,1,1,1),(258,NULL,'Kristoffer Thomsen',2000,1,1,1),(259,NULL,'Rasmus D. Jensen',1998,1,1,1),(260,NULL,'Rasmus Irmschler',2002,1,1,1),(261,NULL,'Simon Tuelstrup Bechmann',2001,1,1,1),(262,NULL,'Mads Berentzen',2002,1,1,1),(263,NULL,'Andreas Skak Thomsen',2001,1,1,1),(264,NULL,'Jonas Sørensen',1995,1,1,1),(265,NULL,'Jesper Thyssen',1995,1,1,1),(266,NULL,'David Tuan V. Valbjørn',2002,1,1,1),(267,NULL,'Christoffer Nedergaard',1995,1,1,1),(268,NULL,'Frederik Klüver',1998,1,1,1),(269,NULL,'Sebastian Emil Thomsen',2002,1,1,1),(270,NULL,'Ghita Kobbelgaard',1995,0,1,1),(271,NULL,'Sille Ibsen',2001,0,1,1),(272,NULL,'Janni Martinussen',2001,0,1,1),(273,NULL,'Nynne Nørlem',2002,0,1,1),(274,NULL,'Julie Fink',2001,0,1,1),(275,NULL,'Olivia Steenstrup',2000,0,1,1),(276,NULL,'Maya Nautrup Pedersen',1999,0,1,1),(277,NULL,'Julie B. Andersen',2002,0,1,1),(278,NULL,'Julie Martinussen',1997,0,1,1),(279,NULL,'Sara Falch',2002,0,1,1),(280,NULL,'Trine Rasmussen',1999,0,1,1),(281,NULL,'Signe Dam',1999,0,1,1),(282,NULL,'Victoria Broch',2004,0,0,0),(283,NULL,'Sara Høi Graversen',2003,0,0,0),(284,NULL,'Cecilie Daugaard',2003,0,0,0),(285,NULL,'Sofie Marie Damsø',2004,0,0,0),(286,NULL,'Sarah Salling Larsen',2003,1,1,0),(287,NULL,'Lærke Kirstine Johnsen',2003,1,1,0),(288,NULL,'Line Heise',2003,1,1,0),(289,NULL,'Mathilde Møller',2004,1,1,0),(290,NULL,'Thea Brøndum',2004,1,1,0),(291,NULL,'Sofie Skovgaard Sørensen',2004,1,1,0),(292,NULL,'Caroline Christensen',2004,1,1,0),(293,NULL,'Nete Kirial',2003,1,1,0);
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SwimArt`
--

DROP TABLE IF EXISTS `SwimArt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SwimArt` (
  `SwimArtID` int(11) NOT NULL AUTO_INCREMENT,
  `SwimArtName` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SwimArtID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SwimArt`
--

LOCK TABLES `SwimArt` WRITE;
/*!40000 ALTER TABLE `SwimArt` DISABLE KEYS */;
INSERT INTO `SwimArt` VALUES (1,'Brystsvømning',NULL),(2,'Fri',NULL),(3,'Crawl',NULL),(4,'Rygcrawl',NULL),(5,'Butterfly',NULL),(6,'Medley',NULL);
/*!40000 ALTER TABLE `SwimArt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SwimDist`
--

DROP TABLE IF EXISTS `SwimDist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `SwimDist` (
  `SwimDistID` int(11) NOT NULL AUTO_INCREMENT,
  `SwimDist` int(11) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SwimDistID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SwimDist`
--

LOCK TABLES `SwimDist` WRITE;
/*!40000 ALTER TABLE `SwimDist` DISABLE KEYS */;
INSERT INTO `SwimDist` VALUES (1,50,NULL),(2,100,NULL),(3,150,NULL),(4,200,NULL),(5,25,NULL),(6,500,NULL);
/*!40000 ALTER TABLE `SwimDist` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-26 21:39:13
