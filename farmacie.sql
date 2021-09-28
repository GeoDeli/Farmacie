-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Gazdă: 127.0.0.1
-- Timp de generare: sept. 28, 2021 la 11:27 AM
-- Versiune server: 10.4.18-MariaDB
-- Versiune PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Bază de date: `farmacie`
--

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `categorie`
--

CREATE TABLE `categorie` (
  `Cod_Cat` int(11) NOT NULL,
  `Nume` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `categorie`
--

INSERT INTO `categorie` (`Cod_Cat`, `Nume`) VALUES
(1, 'Analgezice'),
(2, 'Anabolizante'),
(3, 'Vitamine'),
(4, 'Antidepresive'),
(5, 'Antiinflamatorii');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `comanda`
--

CREATE TABLE `comanda` (
  `ID_Comanda` int(11) NOT NULL,
  `Cod_F` varchar(20) NOT NULL,
  `Nume` varchar(40) NOT NULL,
  `Data_Livrare` date NOT NULL,
  `Med_Cant` text NOT NULL,
  `Pret` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `comanda`
--

INSERT INTO `comanda` (`ID_Comanda`, `Cod_F`, `Nume`, `Data_Livrare`, `Med_Cant`, `Pret`) VALUES
(1, '01', 'Cl1', '2021-07-01', '1 10', 20.25),
(2, '01', 'Cli2', '2021-08-01', '2 2', 25.25),
(3, '02', 'Cli2', '2021-07-01', '3 2', 35.25),
(4, '01', 'Cli2', '2021-01-20', '3 2, 1 2', 40.1),
(5, '01', 'Cli2', '2020-07-30', '11 5, 10 4, 7 1, 18 2', 250),
(6, '02', 'Cli2', '2020-08-30', '7 4, 2 3, 1 1, 12 1, 5 1', 100),
(8, '04', 'Cli3', '2021-07-29', '01 100', 225),
(9, '05', 'Cli4', '2021-07-20', '01 100', 30),
(10, '01', 'Cli4', '2021-07-01', '7 4, 2 3, 1 1, 12 1, 5 1', 100),
(11, '02', 'Cli4', '2021-07-01', '7 4, 2 3, 1 1, 12 1, 5 1', 100),
(12, '03', 'Client2', '2021-08-19', '14 2, 13 1, 17 2, 7 1', 120),
(13, '07', 'Client2', '2021-08-17', '14 2, 13 1, 17 2, 7 1', 120),
(14, '06', 'Client2', '2021-08-17', '14 2, 13 1, 17 2, 7 1, 8 1, 15 4', 220),
(15, '06', 'Client2', '2021-07-17', '14 2, 13 1, 17 2, 7 1, 8 1, 15 4', 220),
(16, '04', 'Client2', '2021-07-17', '14 2, 13 1, 17 2, 7 1, 8 1, 15 4', 220),
(17, '04', 'Client2', '2021-07-17', '14 2, 17 2, 7 1, 8 1, 15 4', 170),
(18, '04', 'Client2', '2021-07-17', '14 2, 17 2, 7 1, 15 4', 150),
(19, '07', 'Client2', '2021-09-17', '14 2, 17 2, 7 1, 15 4', 150),
(20, '07', 'Client2', '2021-01-17', '14 2, 17 2, 7 1, 15 4', 150),
(21, '07', 'Client2', '2021-02-17', '14 2, 17 2, 7 1, 15 4', 150),
(22, '05', 'Client2', '2021-02-17', '14 2, 17 2, 7 1, 15 4', 150),
(23, '05', 'Client2', '2021-02-16', '14 2, 17 2, 7 1, 15 4', 150),
(24, '05', 'Client2', '2021-02-06', '14 2, 17 2, 7 1, 15 4', 150);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `farmacie-tab`
--

CREATE TABLE `farmacie-tab` (
  `Cod_F` varchar(20) NOT NULL,
  `Nume` varchar(30) NOT NULL,
  `Adresa` varchar(30) NOT NULL,
  `Oras` varchar(20) NOT NULL,
  `Telefon` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `farmacie-tab`
--

INSERT INTO `farmacie-tab` (`Cod_F`, `Nume`, `Adresa`, `Oras`, `Telefon`) VALUES
('01', 'Vlad', 'Bulevardul Revolutiei nr 2304', 'Timisoara', '0753439678'),
('02', 'Dona Romanilor', 'Strada Romanilor nr 45', 'Timisoara', '0748787987'),
('03', 'Maria', 'Strada Romanilor nr 45', 'Cluj', '0748787987'),
('04', 'Helpnet', 'Bulevardul Romanilor nr 10', 'Cluj', '0748479875'),
('05', 'Helpnet', 'Alea Romanilor nr 10', 'Iasi', '0748479875'),
('06', 'Bucuresti F', 'Alea Romanilor nr 10', 'Bucuresti', '0748479875'),
('07', 'Vlad', 'Alea Eroilor nr 15', 'Bucuresti', '0748479875');

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `medicamente`
--

CREATE TABLE `medicamente` (
  `Cod_Med` int(11) NOT NULL,
  `Nume` varchar(20) NOT NULL,
  `Cod_Cat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `medicamente`
--

INSERT INTO `medicamente` (`Cod_Med`, `Nume`, `Cod_Cat`) VALUES
(1, 'Ampicilina', 1),
(2, 'Nurofen', 1),
(3, 'Hexoplant', 5),
(4, 'Nurofen', 1),
(5, 'Detrical 1000', 3),
(6, 'Detrical 3000', 3),
(7, 'Detrical 2000', 3),
(8, 'Tador', 1),
(9, 'Sleep', 4),
(10, 'Calmodepresin', 4),
(11, 'Relaxophytol', 4),
(12, 'Anabolic Master', 2),
(13, 'Anabolic Protein', 2),
(14, 'Anabol', 2),
(15, 'Stimlord', 2),
(16, 'Sindolor', 5),
(17, 'Ibufen', 5),
(18, 'Panadol Extra', 5),
(19, 'Sindoplast', 5),
(20, 'Voltaren', 5),
(21, 'Ketonal', 5),
(22, 'Ibalgin', 1);

-- --------------------------------------------------------

--
-- Structură tabel pentru tabel `stoc`
--

CREATE TABLE `stoc` (
  `Cod_F` varchar(20) NOT NULL,
  `Cod_Med` varchar(20) NOT NULL,
  `Cantitate` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Eliminarea datelor din tabel `stoc`
--

INSERT INTO `stoc` (`Cod_F`, `Cod_Med`, `Cantitate`) VALUES
('01', '1', 1000),
('1', '2', 500),
('1', '3', 100),
('01', '10', 10),
('01', '3', 10),
('01', '11', 10),
('01', '15', 10),
('01', '15', 10),
('01', '15', 10),
('01', '11', 10),
('02', '1', 200),
('02', '3', 200),
('02', '4', 200),
('02', '5', 100),
('02', '15', 100),
('02', '17', 100),
('03', '17', 100),
('03', '16', 100),
('03', '18', 900),
('04', '18', 900),
('04', '19', 900),
('03', '19', 900),
('05', '19', 900),
('02', '1', 900),
('02', '2', 30),
('03', '2', 130),
('04', '2', 130),
('05', '2', 230),
('05', '3', 230);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
