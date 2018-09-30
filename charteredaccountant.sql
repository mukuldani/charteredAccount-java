-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 30, 2018 at 06:24 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `charteredaccountant`
--
CREATE DATABASE IF NOT EXISTS `charteredaccountant` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `charteredaccountant`;

-- --------------------------------------------------------

--
-- Table structure for table `cust_tax_details`
--

DROP TABLE IF EXISTS `cust_tax_details`;
CREATE TABLE `cust_tax_details` (
  `tax_details_id` int(11) NOT NULL,
  `regis_id` int(11) NOT NULL,
  `basic_salary` int(11) NOT NULL,
  `hra` float NOT NULL,
  `da` float NOT NULL,
  `ta` int(11) NOT NULL,
  `gross_salary` int(11) NOT NULL,
  `esic` float NOT NULL,
  `pf` float NOT NULL,
  `service_tax` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cust_tax_details`
--

INSERT INTO `cust_tax_details` (`tax_details_id`, `regis_id`, `basic_salary`, `hra`, `da`, `ta`, `gross_salary`, `esic`, `pf`, `service_tax`) VALUES
(4, 4, 35000, 14000, 0, 1000, 50000, 875, 2375, 1750);

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `regis_id` int(11) NOT NULL,
  `initial` varchar(5) NOT NULL,
  `fullName` varchar(80) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `mobile_number` varchar(12) NOT NULL,
  `email` varchar(80) NOT NULL,
  `residential_type` varchar(20) NOT NULL,
  `employee_type` varchar(20) NOT NULL,
  `residential_address` varchar(100) NOT NULL,
  `office_address` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`regis_id`, `initial`, `fullName`, `gender`, `mobile_number`, `email`, `residential_type`, `employee_type`, `residential_address`, `office_address`) VALUES
(4, 'Mr', 'Sachin', 'Male', '8796354126', 'sachin@gmail.com', 'City', 'Private', 'Badlapur	', 'Airoli');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `username`, `password`) VALUES
(1, 'admin', 'password@123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cust_tax_details`
--
ALTER TABLE `cust_tax_details`
  ADD PRIMARY KEY (`tax_details_id`),
  ADD KEY `regis_id` (`regis_id`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`regis_id`),
  ADD UNIQUE KEY `mobile_number` (`mobile_number`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cust_tax_details`
--
ALTER TABLE `cust_tax_details`
  MODIFY `tax_details_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `regis_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
