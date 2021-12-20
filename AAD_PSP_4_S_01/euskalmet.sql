-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-12-2021 a las 21:04:50
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `euskalmet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos`
--

CREATE TABLE `datos` (
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `COmgm3` float NOT NULL,
  `NOgm3` int(11) NOT NULL,
  `NO2` int(11) NOT NULL,
  `NO2ICA` varchar(30) NOT NULL,
  `PM10` float NOT NULL,
  `PM25` float NOT NULL,
  `SO2` int(11) NOT NULL,
  `SO2ICA` varchar(30) NOT NULL,
  `ICAEstacion` varchar(30) NOT NULL,
  `idestacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estaciones`
--

CREATE TABLE `estaciones` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Provincia` varchar(20) NOT NULL,
  `Direcion` varchar(20) NOT NULL,
  `CoordX` float NOT NULL,
  `CoordY` float NOT NULL,
  `Latitud` float NOT NULL,
  `Longitud` float NOT NULL,
  `IdPueblo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `favoritos`
--

CREATE TABLE `favoritos` (
  `Id` int(11) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `IdPueblo` int(11) DEFAULT NULL,
  `IdLugar` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `galeria`
--

CREATE TABLE `galeria` (
  `Id` int(11) NOT NULL,
  `Usuario` varchar(20) NOT NULL,
  `Foto` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lugares`
--

CREATE TABLE `lugares` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(40) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Marks` varchar(20) NOT NULL,
  `Municipio` varchar(20) NOT NULL,
  `Territorio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lugarpueblo`
--

CREATE TABLE `lugarpueblo` (
  `idlugar` int(11) NOT NULL,
  `idpueblo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pueblos`
--

CREATE TABLE `pueblos` (
  `id` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Descripcion` varchar(100) NOT NULL,
  `Marks` varchar(20) NOT NULL,
  `Municipio` varchar(20) NOT NULL,
  `Territorio` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Usuario` varchar(20) NOT NULL,
  `Contrasenia` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos`
--
ALTER TABLE `datos`
  ADD PRIMARY KEY (`Fecha`),
  ADD KEY `idestacion` (`idestacion`);

--
-- Indices de la tabla `estaciones`
--
ALTER TABLE `estaciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `IdPueblo` (`IdPueblo`);

--
-- Indices de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `Usuario` (`Usuario`);

--
-- Indices de la tabla `galeria`
--
ALTER TABLE `galeria`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `Usuario` (`Usuario`);

--
-- Indices de la tabla `lugares`
--
ALTER TABLE `lugares`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Municipio` (`Municipio`),
  ADD KEY `Territorio` (`Territorio`),
  ADD KEY `Nombre` (`Nombre`);

--
-- Indices de la tabla `lugarpueblo`
--
ALTER TABLE `lugarpueblo`
  ADD PRIMARY KEY (`idlugar`,`idpueblo`),
  ADD KEY `idpueblo` (`idpueblo`);

--
-- Indices de la tabla `pueblos`
--
ALTER TABLE `pueblos`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Territorio` (`Territorio`),
  ADD KEY `Territorio_2` (`Territorio`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estaciones`
--
ALTER TABLE `estaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `favoritos`
--
ALTER TABLE `favoritos`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `galeria`
--
ALTER TABLE `galeria`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `lugares`
--
ALTER TABLE `lugares`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `pueblos`
--
ALTER TABLE `pueblos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `galeria`
--
ALTER TABLE `galeria`
  ADD CONSTRAINT `galeria_ibfk_1` FOREIGN KEY (`Usuario`) REFERENCES `usuarios` (`Usuario`);

--
-- Filtros para la tabla `lugarpueblo`
--
ALTER TABLE `lugarpueblo`
  ADD CONSTRAINT `lugarpueblo_ibfk_1` FOREIGN KEY (`idlugar`) REFERENCES `lugares` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `lugarpueblo_ibfk_2` FOREIGN KEY (`idpueblo`) REFERENCES `pueblos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
