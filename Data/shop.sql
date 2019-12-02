-- MySQL dump 10.13  Distrib 8.0.17, for macos10.14 (x86_64)
--
-- Host: localhost    Database: shop
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
-- Table structure for table `categories`
--

use runners;
DROP TABLE IF EXISTS `SwimArt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `discipliner` (
  `SwimArtID` int(11) NOT NULL AUTO_INCREMENT,
  `SwimArtName` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SwimArtID`)
) ENGINE=InnoDB AUTO_INCREMENT DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `SwimArt` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `SwimArt` VALUES ('Brystsvømning'),('Fri')('Crawl'),('Rygcrawl'),('Butterfly'),('Medley');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `SwimDist`;
CREATE TABLE `SwimDist` (
  `SwimDistID` int(11) NOT NULL AUTO_INCREMENT,
  `SwimDist` int DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SwimArtID`)
) ENGINE=InnoDB AUTO_INCREMENT DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


LOCK TABLES `SwimDist` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `SwimDist` VALUES (50),(100)(150),(200),(25),(500);
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `members`
--
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
//- id,navn,årgang,aktiv/passiv,konkurr/motionist
CREATE TABLE `members` (
  `MemberID` int NOT NULL AUTO_INCREMENT,
  `Employeeid` int DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Active` tinyint DEFAULT NULL,
  `Compete` tinyint DEFAULT NULL,
  PRIMARY KEY (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--


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
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `competition_details`;
CREATE TABLE `competition_details` (
  `CompetitionDetailID` int(11) NOT NULL AUTO_INCREMENT,
  `CompetitionID` int(11) DEFAULT NULL,
  `SwimArtID` int(11) DEFAULT NULL,
  `SwimDistID` int(11) DEFAULT NULL,
  `Result` int DEFAULT NULL,
  PRIMARY KEY (`CompetitionDetailID`),
  KEY `CompetitionID` (`CompetitionID`),
  KEY `SwimArtID` (`SwimArtID`),
  KEY `SwimDistID` (`SwimDistID`)
) ENGINE=InnoDB AUTO_INCREMENT=522 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `competition`;
CREATE TABLE `competion` (
  `CompetitionID` int(11) NOT NULL AUTO_INCREMENT,
  `MemberID` int(11) DEFAULT NULL,
  `Date` varchar(255) DEFAULT NULL,
  `Place` varchar(255) DEFAULT NULL,
  `EventTitle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ComepetitionID`),
  KEY `MemberID` (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=10447 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


UNLOCK TABLES;
