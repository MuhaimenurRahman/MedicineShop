-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 11, 2019 at 07:06 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `medicine_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `abouttosell`
--

CREATE TABLE IF NOT EXISTS `abouttosell` (
`ID` int(10) unsigned NOT NULL,
  `Customer_Name` varchar(45) NOT NULL DEFAULT '',
  `Product_Name` varchar(45) NOT NULL DEFAULT '',
  `Quantity` int(10) unsigned NOT NULL DEFAULT '0',
  `Selling_date` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `Commission` int(10) unsigned NOT NULL DEFAULT '0',
  `Price` double NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `abouttosell`
--

INSERT INTO `abouttosell` (`ID`, `Customer_Name`, `Product_Name`, `Quantity`, `Selling_date`, `Commission`, `Price`) VALUES
(6, 'Sayeed', 'napaextra', 12, '2016-07-30 00:00:00', 10, 2.16),
(7, 'Sayeed', 'Calbo-D', 10, '2016-07-30 00:00:00', 5, 28.5),
(8, 'sayeed', 'Napa', 15, '2016-07-30 00:00:00', 5, 1.187499525),
(9, 'sayeed', 'Calbo-D', 5, '2016-07-30 00:00:00', 5, 14.25),
(10, 'dds', 'Napa', 12, '2016-07-30 00:00:00', 5, 0.94999962),
(11, 'ta', 'Napa', 12, '2016-07-30 00:00:00', 5, 0.94999962),
(12, 'tyy', 'napa extra', 10, '2016-07-30 00:00:00', 2, 0.6533336599999999),
(13, 'trr', 'napa extra', 12, '2016-07-30 00:00:00', 2, 0.7840003919999999),
(14, 'yyy', 'napa extra', 12, '2016-07-30 00:00:00', 2, 0.7840003919999999),
(15, 'tyuiop', 'napa extra', 100, '2016-07-29 00:00:00', 2, 6.5333366),
(16, 'tyuiop', 'Napa', 12, '2016-07-29 00:00:00', 5, 0.94999962),
(17, 'ww', 'napa extra', 12, '2016-07-30 00:00:00', 2, 0.7840003919999999),
(18, 'wwee', 'napa extra', 12, '2016-07-30 00:00:00', 2, 0.7840003919999999),
(19, 'uuu', 'napaextra', 8, '2016-07-30 00:00:00', 10, 1.4400000000000002),
(20, 'iiuuj', 'napaextra', 8, '2016-07-30 00:00:00', 10, 1.4400000000000002),
(21, 'gsg', 'napa extra', 12, '2016-07-30 00:00:00', 2, 0.7840003919999999),
(22, 'yhyh', 'napaextra', 1000, '2016-07-30 00:00:00', 10, 180),
(23, 'yhyh', 'Napa', 125, '2016-07-30 00:00:00', 5, 9.895829375),
(24, 'yu', 'napaextra', 10, '2016-07-30 00:00:00', 10, 1.8),
(25, 'yu', 'napa extra', 15, '2016-07-30 00:00:00', 2, 0.9800004899999999),
(26, 'yyyy', 'napa extra', 10, '2016-07-31 00:00:00', 2, 0.6533336599999999),
(27, 'tanmoy', 'Calbo-D', 10, '2016-07-31 00:00:00', 5, 28.5),
(28, 'jjjdf', 'Napa', 30, '2016-07-31 00:00:00', 5, 2.37499905),
(29, 'hfdg', 'Napa', 30, '2016-07-31 00:00:00', 5, 2.37499905),
(30, 'dsf', 'Napa', 10, '2016-07-31 00:00:00', 5, 0.79166635),
(31, 'dfsg', 'Napa', 10, '2016-07-31 00:00:00', 5, 0.79166635),
(32, 'fdg', 'napaextra', 20, '2016-07-31 00:00:00', 10, 3.6),
(33, 'sdf', 'napaextra', 20, '2016-07-31 00:00:00', 10, 3.6),
(34, 'gfd', 'napaextra', 20, '2016-07-31 00:00:00', 10, 3.6),
(35, 'th', 'napaextra', 20, '2016-07-31 00:00:00', 10, 3.6),
(36, 'dfsg', 'napaextra', 20, '2016-07-31 00:00:00', 10, 3.6),
(37, 'fgfd', 'napaextra', 20, '2016-07-31 00:00:00', 10, 3.6),
(38, 'fdg', 'napaextra', 25, '2016-07-31 00:00:00', 10, 4.5),
(39, 'dsf', 'napaextra', 35, '2016-07-31 00:00:00', 10, 6.3),
(40, 'dsf', 'napaextra', 25, '2016-07-31 00:00:00', 10, 4.5),
(41, 'tanmoy', 'Napa', 650, '2016-09-02 00:00:00', 5, 88.2141975),
(42, 'tanmoy', 'napaextra', 20, '2016-09-02 00:00:00', 10, 3.6),
(43, 'tanmoy', 'Napa', 15, '2016-09-02 00:00:00', 5, 2.3750047500000004),
(44, 'ydf', 'Napa', 10, '2016-09-02 00:00:00', 5, 1.5833365000000001),
(45, 'ydf', 'Calbo-D', 1, '2016-09-02 00:00:00', 5, 0.19),
(46, 'ydf', 'napa extra', 12, '2016-09-02 00:00:00', 2, 0.5880000000000001),
(47, 'ydf', 'Napa', 2, '2016-09-02 00:00:00', 5, 0.31666730000000004),
(48, 'ydf', 'Calbo-D', 2, '2016-09-02 00:00:00', 5, 0.38),
(49, 'h', 'Calbo-D', 25, '2016-09-02 00:00:00', 5, 4.75),
(50, 'h', 'napa extra', 365, '2016-09-02 00:00:00', 2, 17.885),
(51, 'gfg', 'napa extra', 125, '2016-09-03 00:00:00', 2, 6.125),
(52, 't', 'Calbo-D', 15, '2016-09-03 00:00:00', 5, 2.85),
(53, 'y', 'Napa', 100, '2016-09-03 00:00:00', 5, 15.833365000000002),
(54, 'yh', 'napa extra', 152, '2016-09-03 00:00:00', 2, 7.448),
(55, 'thh', 'Calbo-D', 120, '2016-09-03 00:00:00', 5, 22.8),
(56, 'csd', 'Calbo-D', 155, '2016-09-03 00:00:00', 5, 29.45),
(57, 'dfsd', 'napaextra', 100, '2016-09-03 00:00:00', 10, 18),
(58, 'dfsd', 'Calbo-D', 1, '2016-09-03 00:00:00', 5, 0.19),
(59, 'ert', 'napaextra', 152, '2016-09-03 00:00:00', 10, 27.360000000000003),
(60, 'tht', 'napa extra', 125, '2016-09-03 00:00:00', 2, 6.125),
(61, 'gfg', 'napa extra', 125, '2016-09-03 00:00:00', 2, 6.125),
(62, 'tanm', 'Calbo-D', 100, '2016-09-03 00:00:00', 5, 19),
(63, 'tanm', 'Calbo-D', 2, '2016-09-03 00:00:00', 5, 0.38),
(64, 'df', 'napa extra', 200, '2016-09-03 00:00:00', 2, 9.8),
(65, 'dfssss', 'Napa', 100, '2016-09-03 00:00:00', 5, 15.833365000000002),
(66, 'trd', 'napa extra', 520, '2016-09-03 00:00:00', 2, 25.48),
(67, 'thyy', 'napa extra', 129, '2016-09-03 00:00:00', 2, 6.321),
(68, 'tanmoy', 'napa extra', 123, '2016-09-03 00:00:00', 2, 6.027),
(69, 'dsf', 'Calbo-D', 120, '2016-09-03 00:00:00', 5, 22.8),
(70, 'tanmoy', 'Napa', 50, '2016-09-21 00:00:00', 5, 7.916682500000001),
(71, 'Shuvo', 'napa extra', 10, '2016-11-30 00:00:00', 2, 0.49),
(72, 'Shuvo', 'Calbo-D', 5, '2016-11-30 00:00:00', 5, 0.95),
(74, 'fd', 'napadoli', 160, '2016-11-30 00:00:00', 3, 18.624);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
`ID` int(10) unsigned NOT NULL,
  `UserName` varchar(45) NOT NULL DEFAULT '',
  `Password` varchar(45) NOT NULL DEFAULT ''
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`ID`, `UserName`, `Password`) VALUES
(1, 'ST', '12');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
`ID` int(10) unsigned NOT NULL,
  `Customer_name` varchar(45) NOT NULL DEFAULT ''
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID`, `Customer_name`) VALUES
(1, 'Tanmoy'),
(2, 'Tonny'),
(3, 'Sayeed'),
(4, 'Sahida');

-- --------------------------------------------------------

--
-- Table structure for table `duedetails`
--

CREATE TABLE IF NOT EXISTS `duedetails` (
`ID` int(10) unsigned NOT NULL,
  `COMPANY_NAME` varchar(65) NOT NULL DEFAULT '',
  `PURCHASE_DATE` date NOT NULL DEFAULT '0000-00-00',
  `PAID_PRICE` int(10) unsigned NOT NULL DEFAULT '0',
  `DUE_PRICE` int(10) unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `employeedetails`
--

CREATE TABLE IF NOT EXISTS `employeedetails` (
  `EMPLOYEE_ID` int(10) unsigned NOT NULL DEFAULT '0',
  `EMPLOYEE_NAME` varchar(60) NOT NULL DEFAULT '',
  `DESIGNATION` varchar(45) DEFAULT NULL,
  `ADDRESS` varchar(250) DEFAULT NULL,
  `HOME_DISTRICT` varchar(45) DEFAULT NULL,
  `NATIONAL_ID_NO` varchar(60) DEFAULT NULL,
  `PHONE_NO` varchar(45) DEFAULT NULL,
  `JOINING_DATE` date DEFAULT NULL,
  `SALARY` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employeedetails`
--

INSERT INTO `employeedetails` (`EMPLOYEE_ID`, `EMPLOYEE_NAME`, `DESIGNATION`, `ADDRESS`, `HOME_DISTRICT`, `NATIONAL_ID_NO`, `PHONE_NO`, `JOINING_DATE`, `SALARY`) VALUES
(1, 'Shuvo', 'senior', 'fdsgtgh', 'fdsg', '434353', '345345', '2015-08-09', 34),
(2, 'fdsg', 'dsfg', 'fdsg', 'fdsg', '434535', '345345345', '2016-01-01', 34535);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
`ID` int(10) unsigned NOT NULL,
  `USERNAME` varchar(50) NOT NULL DEFAULT '',
  `PASSWORD` varchar(50) NOT NULL DEFAULT ''
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `USERNAME`, `PASSWORD`) VALUES
(1, 'ST', '12');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE IF NOT EXISTS `product` (
  `COMPANY_NAME` varchar(100) NOT NULL DEFAULT '',
  `MEDICINE_NAME` varchar(100) NOT NULL DEFAULT '',
  `PURCHASE_DATE` date NOT NULL DEFAULT '0000-00-00',
  `MFD_DATE` date NOT NULL DEFAULT '0000-00-00',
  `EXP_DATE` date NOT NULL DEFAULT '0000-00-00',
  `NUMBER_OF_PACK` int(10) unsigned NOT NULL DEFAULT '0',
  `PATA` int(10) unsigned NOT NULL DEFAULT '0',
  `TOTAL_TABLET` int(10) unsigned NOT NULL DEFAULT '0',
  `RATE_PER_TABLET` float NOT NULL DEFAULT '0',
  `COMMISSION` int(10) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`COMPANY_NAME`, `MEDICINE_NAME`, `PURCHASE_DATE`, `MFD_DATE`, `EXP_DATE`, `NUMBER_OF_PACK`, `PATA`, `TOTAL_TABLET`, `RATE_PER_TABLET`, `COMMISSION`) VALUES
('A.C.I.	', 'Calbo-D', '2016-07-29', '2016-07-29', '2017-07-29', 5, 10, 704, 0.2, 5),
('A.C.I.	', 'gdfs', '2018-12-24', '2018-12-20', '2018-12-07', 125, 10, 18750, 0.000533333, 5),
('A.C.I.	', 'Napa', '2016-07-29', '2016-07-29', '2018-07-29', 15, 10, 1223, 0.166667, 5),
('ACME	', 'napa extra', '2016-07-29', '2016-07-29', '2017-07-29', 20, 10, 114, 0.05, 2),
('ACME	', 'napadoli', '2016-11-30', '2016-11-30', '2016-12-31', 10, 10, 840, 0.12, 3),
('ARISTOPHARMA	', 'napaextra', '2016-07-29', '2016-07-29', '2017-07-29', 10, 15, 1103, 0.2, 10);

-- --------------------------------------------------------

--
-- Table structure for table `sell`
--

CREATE TABLE IF NOT EXISTS `sell` (
`ID` int(10) unsigned NOT NULL,
  `CUSTOMER_NAME` varchar(60) NOT NULL DEFAULT '',
  `PRODUCT_NAME` varchar(100) NOT NULL DEFAULT '',
  `QUANTITY` int(10) unsigned NOT NULL DEFAULT '0',
  `SELLING_DATE` date NOT NULL DEFAULT '0000-00-00',
  `COMMISSION` int(10) unsigned DEFAULT NULL,
  `PRICE` double NOT NULL DEFAULT '0'
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sell`
--

INSERT INTO `sell` (`ID`, `CUSTOMER_NAME`, `PRODUCT_NAME`, `QUANTITY`, `SELLING_DATE`, `COMMISSION`, `PRICE`) VALUES
(2, 'fd', 'napadoli', 160, '2016-11-30', 3, 18.624);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `abouttosell`
--
ALTER TABLE `abouttosell`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `duedetails`
--
ALTER TABLE `duedetails`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `employeedetails`
--
ALTER TABLE `employeedetails`
 ADD PRIMARY KEY (`EMPLOYEE_ID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
 ADD PRIMARY KEY (`COMPANY_NAME`,`MEDICINE_NAME`);

--
-- Indexes for table `sell`
--
ALTER TABLE `sell`
 ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `abouttosell`
--
ALTER TABLE `abouttosell`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=75;
--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `duedetails`
--
ALTER TABLE `duedetails`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `sell`
--
ALTER TABLE `sell`
MODIFY `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
