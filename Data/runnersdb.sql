use runners;
DROP TABLE IF EXISTS `SwimArt`;
CREATE TABLE `SwimArt` (
  `SwimArtID` int(11) NOT NULL AUTO_INCREMENT,
  `SwimArtName` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SwimArtID`)
) ENGINE=InnoDB AUTO_INCREMENT=0 CHARSET=utf8;


INSERT INTO `SwimArt` (swimartname) VALUES ('Brystsvømning'),('Fri'),('Crawl'),('Rygcrawl'),('Butterfly'),('Medley');

DROP TABLE IF EXISTS `SwimDist`;
CREATE TABLE `SwimDist` (
  `SwimDistID` int(11) NOT NULL AUTO_INCREMENT,
  `SwimDist` int DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`SwimDistID`)
) ENGINE=InnoDB AUTO_INCREMENT=0 CHARSET=utf8;


INSERT INTO `SwimDist` (swimdist) VALUES (50),(100),(150),(200),(25),(500);

DROP TABLE IF EXISTS `members`;
CREATE TABLE `members` (
  `MemberID` int NOT NULL AUTO_INCREMENT,
  `Employeeid` int DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Gender` int DEFAULT NULL,
  `Active` tinyint DEFAULT NULL,
  `Compete` tinyint DEFAULT NULL,
  PRIMARY KEY (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=93 CHARSET=utf8;

DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `EmployeeID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EmployeeID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 CHARSET=utf8;

DROP TABLE IF EXISTS `competition`;
CREATE TABLE `competition` (
  `CompetitionID` int(11) NOT NULL AUTO_INCREMENT,
  `MemberID` int(11) DEFAULT NULL,
  `Date` varchar(255) DEFAULT NULL,
  `Place` varchar(255) DEFAULT NULL,
  `EventTitle` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`CompetitionID`),
  KEY `MemberID` (`MemberID`)
) ENGINE=InnoDB AUTO_INCREMENT=10447 CHARSET=utf8;

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
) ENGINE=InnoDB AUTO_INCREMENT=522 CHARSET=utf8;
