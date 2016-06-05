
CREATE DATABASE `citizens_seeker`;

--
-- Table structure for table `citizens`
--

DROP TABLE IF EXISTS `citizens`;

CREATE TABLE `citizens` (
  `idcitizens` int(11) NOT NULL,
  `date_birth` varchar(255) DEFAULT NULL,
  `direction` longtext,
  `email_address` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `gender` int(11) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idcitizens`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
