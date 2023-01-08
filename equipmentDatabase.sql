-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Mar 07, 2022 at 05:53 PM
-- Server version: 5.7.34
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `csia`
--

-- --------------------------------------------------------

--
-- Table structure for table `equipmentDatabase`
--

CREATE TABLE `equipmentDatabase` (
  `id` int(11) NOT NULL,
  `name` tinytext NOT NULL,
  `type` text NOT NULL,
  `size` text NOT NULL,
  `location` text NOT NULL,
  `status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `equipmentDatabase`
--

INSERT INTO `equipmentDatabase` (`id`, `name`, `type`, `size`, `location`, `status`) VALUES
(1, 'C19', 'Tent', 'L', '', 'Borrowed by Group 2'),
(2, 'C5', 'Tent', 'L', 'In school', ''),
(3, 'B8', 'Bag', 'M', '', 'Borrowed by Amy'),
(4, 'B22', 'Bag', 'M', '', 'Borrowed by Charlie'),
(5, 'B4', 'Bag', 'L', '', 'Need Replaced');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `equipmentDatabase`
--
ALTER TABLE `equipmentDatabase`
  ADD UNIQUE KEY `id` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
