-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 01:35 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `data_pegawai`
--

-- --------------------------------------------------------

--
-- Table structure for table `addgaji`
--

CREATE TABLE `addgaji` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `gaji` int(11) NOT NULL,
  `hari_kerja` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `addgaji`
--

INSERT INTO `addgaji` (`id`, `nama`, `jabatan`, `gaji`, `hari_kerja`, `total`) VALUES
(44152, 'Aisyah', 'Admin', 5000000, 30, 4800000);

-- --------------------------------------------------------

--
-- Table structure for table `addpegawai`
--

CREATE TABLE `addpegawai` (
  `nop` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(40) NOT NULL,
  `nohp` int(11) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `addpegawai`
--

INSERT INTO `addpegawai` (`nop`, `nama`, `alamat`, `jenis_kelamin`, `nohp`, `email`) VALUES
(121212, 'sinta', 'banjarbaru', 'Wanita', 9862662, 'jsahdh'),
(335414, 'Abran', 'Mandi Angin', 'Pria', 773882, 'abran@gmail.com'),
(442612, 'Aisyah', 'Mandi Angin', 'Wanita', 827891721, 'aisyah@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addgaji`
--
ALTER TABLE `addgaji`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `addpegawai`
--
ALTER TABLE `addpegawai`
  ADD PRIMARY KEY (`nop`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
