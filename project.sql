-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2023 at 11:37 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--
CREATE DATABASE IF NOT EXISTS `project` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `project`;

-- --------------------------------------------------------

--
-- Table structure for table `customerdetail`
--

CREATE TABLE `customerdetail` (
  `Customernum` int(11) NOT NULL,
  `CustomerName` varchar(50) NOT NULL,
  `CustomerEmail` varchar(50) NOT NULL,
  `CustomerPhoneNo` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerdetail`
--

INSERT INTO `customerdetail` (`Customernum`, `CustomerName`, `CustomerEmail`, `CustomerPhoneNo`) VALUES
(1, 'Maria', 'maria@gmail.com', '12345666'),
(2, 'Abdus Salam', 'abdussalam@gmail.com', '0312222222'),
(3, 'Marium', 'marium@gmail.com', '12222333');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `CustomerNo` int(11) NOT NULL,
  `ServicesYouSelected` varchar(50) NOT NULL,
  `ServiceSatisfaction` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`CustomerNo`, `ServicesYouSelected`, `ServiceSatisfaction`) VALUES
(1, 'Digital Marketing', 'I satisfied with your provided service'),
(2, 'Graphic Designing', 'Im pleased with your work'),
(3, 'Website Development', 'Marvellous'),
(1, 'Digital Marketing', 'Good Experience'),
(3, 'Digital Marketing', ''),
(1, 'ok', 'ok'),
(1, 'ok', 'ok'),
(2, 'Website development', 'Very Good, Thanks');

-- --------------------------------------------------------

--
-- Table structure for table `provision_of_service`
--

CREATE TABLE `provision_of_service` (
  `CustomerNO` int(11) NOT NULL,
  `ServicesYouRequired` varchar(50) NOT NULL,
  `ProvisionDetails` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `provision_of_service`
--

INSERT INTO `provision_of_service` (`CustomerNO`, `ServicesYouRequired`, `ProvisionDetails`) VALUES
(1, 'Digital Marketing', 'Done in 3 days'),
(2, 'Graphic Designing', 'Done in 7 days\r\n'),
(3, 'Website Development', 'DOne in 15 days'),
(2, 'ijshj', 'jjjjj'),
(3, 'Digital Marketing', 'okopkio'),
(3, 'Digital Marketing', 'okopkio'),
(2, 'Website development', 'We will do your work  with in 3 weeks and we will charge $80000 for your website'),
(2, 'Website development', 'We will do your work  with in 3 weeks and we will charge $80000 for your website');

-- --------------------------------------------------------

--
-- Table structure for table `request_a_services`
--

CREATE TABLE `request_a_services` (
  `Customer` int(11) NOT NULL,
  `ServicesYouNeed` varchar(50) NOT NULL,
  `ServiceRequirementDescription` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `request_a_services`
--

INSERT INTO `request_a_services` (`Customer`, `ServicesYouNeed`, `ServiceRequirementDescription`) VALUES
(1, 'Digital Marketing', 'COmpany'),
(2, 'Graphic Designing', 'For comapny'),
(3, 'Website Development', 'Website required'),
(1, 'Digital Marketing', 'for business'),
(3, 'Digital Marketing', ''),
(3, 'Digital Marketing', ''),
(3, 'Digital Marketing', 'ok'),
(3, 'Digital Marketing', 'ok'),
(2, 'Website development', 'Abdyssahass'),
(2, 'Website development', 'Abdyssahass');

-- --------------------------------------------------------

--
-- Table structure for table `servicescatalog`
--

CREATE TABLE `servicescatalog` (
  `Servicenum` int(11) NOT NULL,
  `ServiceName` varchar(50) NOT NULL,
  `ServiceDescription` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `servicescatalog`
--

INSERT INTO `servicescatalog` (`Servicenum`, `ServiceName`, `ServiceDescription`) VALUES
(1, 'Website Development', 'Wordpress and HTMl'),
(2, 'Graphic Designing', 'All types of designing'),
(3, 'Digital Marketing', 'We also do this');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customerdetail`
--
ALTER TABLE `customerdetail`
  ADD PRIMARY KEY (`Customernum`);

--
-- Indexes for table `request_a_services`
--
ALTER TABLE `request_a_services`
  ADD KEY `FK_Customer_TO_CustomerDetail` (`Customer`),
  ADD KEY `FK_ServicesYouNeed_TO_ServicesCatalog` (`ServicesYouNeed`);

--
-- Indexes for table `servicescatalog`
--
ALTER TABLE `servicescatalog`
  ADD PRIMARY KEY (`Servicenum`),
  ADD UNIQUE KEY `ServiceName` (`ServiceName`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customerdetail`
--
ALTER TABLE `customerdetail`
  MODIFY `Customernum` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `servicescatalog`
--
ALTER TABLE `servicescatalog`
  MODIFY `Servicenum` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `request_a_services`
--
ALTER TABLE `request_a_services`
  ADD CONSTRAINT `FK_Customer_TO_CustomerDetail` FOREIGN KEY (`Customer`) REFERENCES `customerdetail` (`Customernum`),
  ADD CONSTRAINT `FK_ServicesYouNeed_TO_ServicesCatalog` FOREIGN KEY (`ServicesYouNeed`) REFERENCES `servicescatalog` (`ServiceName`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
