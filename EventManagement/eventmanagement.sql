-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2017 at 06:58 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `eventmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `holdevents`
--

CREATE TABLE IF NOT EXISTS `holdevents` (
  `OrderID` int(20) NOT NULL,
  `OrderName` varchar(50) NOT NULL,
  `ClientName` varchar(50) NOT NULL,
  `MobileNo` varchar(50) NOT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `holdevents`
--

INSERT INTO `holdevents` (`OrderID`, `OrderName`, `ClientName`, `MobileNo`) VALUES
(2, 'BirthDay', 'Mahiya', '01521000361'),
(4, 'Annaul Program', 'Elias Khan', '015242000361');

-- --------------------------------------------------------

--
-- Table structure for table `implementationevent`
--

CREATE TABLE IF NOT EXISTS `implementationevent` (
  `ProgramID` varchar(20) NOT NULL,
  `ProgramName` varchar(50) NOT NULL,
  `EmployeesName` varchar(100) NOT NULL,
  `TotalFee` int(10) NOT NULL,
  `AdvancePaid` int(20) NOT NULL,
  `PaidFee` int(10) NOT NULL,
  `DueFee` int(10) NOT NULL,
  `EventAddress` varchar(50) NOT NULL,
  `ProgramFinishedDate` varchar(20) NOT NULL,
  `PaidDate` varchar(20) NOT NULL,
  PRIMARY KEY (`ProgramID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `implementationevent`
--

INSERT INTO `implementationevent` (`ProgramID`, `ProgramName`, `EmployeesName`, `TotalFee`, `AdvancePaid`, `PaidFee`, `DueFee`, `EventAddress`, `ProgramFinishedDate`, `PaidDate`) VALUES
('1', 'Marriage Ceremony ', 'Rasel, Rakib, Robin', 40000, 20000, 2500, 17500, 'Soburnashara, Belkuchi,Sirajgonj', '20-08-2017', '20-08-2017'),
('3', 'Baishaki Program', 'Raton, Raju', 35000, 18500, 2000, 14500, 'Ziduray,Belkuchi,Sirajgonj', '20-08-2017', '20-08-2017');

-- --------------------------------------------------------

--
-- Table structure for table `orderreceiveevent`
--

CREATE TABLE IF NOT EXISTS `orderreceiveevent` (
  `OrderID` int(20) NOT NULL,
  `OrderName` varchar(50) NOT NULL,
  `ClientName` varchar(50) NOT NULL,
  `MobileNo` varchar(50) NOT NULL,
  `Gmail` varchar(50) NOT NULL,
  `EventAddress` varchar(50) NOT NULL,
  `AdvancePaid` int(10) NOT NULL,
  `ReceiveDate` varchar(20) NOT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orderreceiveevent`
--

INSERT INTO `orderreceiveevent` (`OrderID`, `OrderName`, `ClientName`, `MobileNo`, `Gmail`, `EventAddress`, `AdvancePaid`, `ReceiveDate`) VALUES
(1, 'Marriage Ceremony ', 'Milton Khan', '01621000361', 'srmiltonkhan@gmail.com', 'Soburnashara, Belkuchi,Sirajgonj', 20000, '20-05-2017'),
(2, 'BirthDay', 'Mahiya', '01521000361', 'mahiya@gmail.com', 'Tami,Belkuhci,Sirajgonj', 15000, '12-05-2017'),
(3, 'Baishaki Program', 'Tofael Ahmed', '01727637420', 'tofael@gmail.com', 'Ziduray,Belkuchi,Sirajgonj', 18500, '20-08-2017'),
(4, 'Annaul Program', 'Elias Khan', '015242000361', 'elias@gmail.com', 'Tami,Belkuchi,Sirajgonj', 15000, '12-08-2017');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
