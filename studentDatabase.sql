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
-- Table structure for table `studentDatabase`
--

CREATE TABLE `studentDatabase` (
  `id` int(10) NOT NULL,
  `student name` text NOT NULL,
  `team name` text NOT NULL,
  `current standard` text NOT NULL,
  `creativity` tinyint(1) NOT NULL,
  `physical recreation` tinyint(1) NOT NULL,
  `service` tinyint(1) NOT NULL,
  `expedition` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `studentDatabase`
--

INSERT INTO `studentDatabase` (`id`, `student name`, `team name`, `current standard`, `creativity`, `physical recreation`, `service`, `expedition`) VALUES
(1, 'Amy', 'Group 2', 'Bronze', 1, 0, 0, 1),
(2, 'Ben', 'Group 4', 'Silver', 0, 0, 1, 0),
(3, 'Charlie', 'Group 1', 'Gold', 1, 1, 1, 0),
(4, 'Daniel', 'Group 5', 'Bronze', 0, 1, 0, 1),
(5, 'Emma', 'Group 1', 'Silver', 1, 1, 0, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentDatabase`
--
ALTER TABLE `studentDatabase`
  ADD UNIQUE KEY `id` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
