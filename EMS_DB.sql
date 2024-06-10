-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2024 at 07:32 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop_assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `createacc`
--

CREATE TABLE `createacc` (
  `fullname` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` int(50) NOT NULL,
  `jobtitle` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `createacc`
--

INSERT INTO `createacc` (`fullname`, `username`, `password`, `jobtitle`) VALUES
('Hafsa Ayurudeen', 'Hafsa', 112, 'Admin'),
('Zeenath Hafsa', 'Zeenath', 123, 'HR Manager'),
('Fazeel Ayurudeen', 'Fazeel', 456, 'HR Assistant');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `DepartmentID` int(30) NOT NULL,
  `DepartmentName` varchar(50) NOT NULL,
  `Designation` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`DepartmentID`, `DepartmentName`, `Designation`) VALUES
(100, 'Administration', 'Administrator'),
(101, 'Human Resource', 'HR Manager,HR Assistant');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `EmployeeID` int(30) NOT NULL,
  `EmployeeName` varchar(50) NOT NULL,
  `Department` varchar(50) NOT NULL,
  `Designation` varchar(50) NOT NULL,
  `EpfNo` int(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `DOB` date NOT NULL,
  `ContactNo` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`EmployeeID`, `EmployeeName`, `Department`, `Designation`, `EpfNo`, `Address`, `DOB`, `ContactNo`) VALUES
(1, 'Hafsa', 'Administration', 'Administrator', 700, 'Thalawathugoda', '2004-01-21', 774758979),
(2, 'Zeenath', 'Human Resource', 'HR Manager', 701, 'Nugegoda', '2000-03-12', 771908060),
(3, 'Fazeel', 'Human Resource', 'HR Assistant', 703, 'Kottawa', '1999-07-08', 779205272);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `createacc`
--
ALTER TABLE `createacc`
  ADD PRIMARY KEY (`password`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`DepartmentID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`EmployeeID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
