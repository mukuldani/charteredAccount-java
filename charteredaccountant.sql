-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 11, 2018 at 04:46 AM
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
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `regis_id` int(11) NOT NULL,
  `initial` varchar(5) NOT NULL,
  `fullName` varchar(80) NOT NULL,
  `mobile_number` double NOT NULL,
  `landline_number` double NOT NULL,
  `email` varchar(80) NOT NULL,
  `address` varchar(100) NOT NULL,
  `basic_salary` double NOT NULL,
  `gross_salary` double NOT NULL,
  `service_tax` float NOT NULL,
  `esic` float NOT NULL,
  `provident_fund` double NOT NULL,
  `pan` varchar(15) NOT NULL,
  `aadhar` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`regis_id`, `initial`, `fullName`, `mobile_number`, `landline_number`, `email`, `address`, `basic_salary`, `gross_salary`, `service_tax`, `esic`, `provident_fund`, `pan`, `aadhar`) VALUES
(1, 'Mr', 'gfe', 7986541325, 268888, 'mukul@exsete.com', 'jkdjyxfhchdcfhc', 27000, 27500, 0, 4.75, 128250, 'AAHCR5014K', ''),
(2, 'Mr', 'Sachin', 7896321458, 265477, 'sachin@gmail.com', 'Badlapur', 28000, 290000, 14, 4.75, 133000, 'AAHCR5014K', ''),
(3, 'Mrs', 'anurag', 7893214562, 2645364789, 'anu@gmail.com', 'Airoli	', 40000, 480000, 24720, 4.75, 190000, 'AWDRF1234Q', '123456787654');

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
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`regis_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `regis_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
