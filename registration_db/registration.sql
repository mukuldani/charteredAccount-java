-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 31, 2018 at 06:58 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `charteredaccountant`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--
-- Creation: Jul 31, 2018 at 06:37 PM
-- Last update: Jul 31, 2018 at 06:55 PM
--

DROP TABLE IF EXISTS `registration`;
CREATE TABLE `registration` (
  `regis_id` int(11) NOT NULL,
  `initial` varchar(5) NOT NULL,
  `fullName` varchar(80) NOT NULL,
  `status` varchar(20) NOT NULL,
  `owner` varchar(20) NOT NULL,
  `mobile_number` double NOT NULL,
  `landline_number` double NOT NULL,
  `email` varchar(80) NOT NULL,
  `address` varchar(100) NOT NULL,
  `basic_salary` double NOT NULL,
  `gross_salary` double NOT NULL,
  `service_tax` float NOT NULL,
  `esic` float NOT NULL,
  `provident_fund` double NOT NULL,
  `vat` varchar(20) NOT NULL,
  `gstin` varchar(20) NOT NULL,
  `pan` varchar(15) NOT NULL,
  `cin` varchar(20) NOT NULL,
  `pt` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Truncate table before insert `registration`
--

TRUNCATE TABLE `registration`;
--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`regis_id`, `initial`, `fullName`, `status`, `owner`, `mobile_number`, `landline_number`, `email`, `address`, `basic_salary`, `gross_salary`, `service_tax`, `esic`, `provident_fund`, `vat`, `gstin`, `pan`, `cin`, `pt`) VALUES
(1, 'Mr', 'gfe', 'Proprioty ', 'Individual ', 7986541325, 268888, 'mukul@exsete.com', 'jkdjyxfhchdcfhc', 27000, 27500, 0, 4.75, 128250, 'jhcmgjvn', '08QQYYD5015K1ZB', 'AAHCR5014K', 'dkfhbgkdfv', 'PT EC');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`regis_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `regis_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
