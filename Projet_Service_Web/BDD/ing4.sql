-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : Dim 10 mai 2020 à 01:33
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ing4`
--

-- --------------------------------------------------------

--
-- Structure de la table `bit`
--

CREATE TABLE `bit` (
  `num` int(11) NOT NULL,
  `designation` varchar(50) NOT NULL,
  `EURO` float NOT NULL,
  `USD` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bit`
--

INSERT INTO `bit` (`num`, `designation`, `EURO`, `USD`) VALUES
(1, 'Bitcoin', 10200, 10400),
(3, 'Dashcoin', 40400, 34200),
(4, 'Etherium', 89100, 90200),
(5, 'Ripple', 23100, 23200),
(6, 'Dashcoin', 40400, 34200),
(7, 'Etherium', 89100, 90200);

-- --------------------------------------------------------

--
-- Structure de la table `cryotcurrency`
--

CREATE TABLE `cryotcurrency` (
  `num` int(11) NOT NULL,
  `designation` varchar(255) DEFAULT NULL,
  `EURO` double DEFAULT NULL,
  `USD` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `bit`
--
ALTER TABLE `bit`
  ADD PRIMARY KEY (`num`);

--
-- Index pour la table `cryotcurrency`
--
ALTER TABLE `cryotcurrency`
  ADD PRIMARY KEY (`num`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `bit`
--
ALTER TABLE `bit`
  MODIFY `num` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `cryotcurrency`
--
ALTER TABLE `cryotcurrency`
  MODIFY `num` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
