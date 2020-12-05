-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2020 a las 19:54:57
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `citas_medicas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `Cit_Numero` int(11) NOT NULL,
  `Cit_Fecha` date NOT NULL,
  `Cit_Hora` varchar(10) NOT NULL,
  `Cit_Paciente` char(10) NOT NULL,
  `Cit_Medico` char(10) NOT NULL,
  `Cit_Consultorio` int(11) NOT NULL,
  `Cit_Estado` enum('Asignada','Cumplida') NOT NULL,
  `Cit_Observaciones` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultorios`
--

CREATE TABLE `consultorios` (
  `Con_Identificador` int(10) NOT NULL,
  `Con_Nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicos`
--

CREATE TABLE `medicos` (
  `Med_Identificador` char(10) NOT NULL,
  `Med_Nombres` varchar(50) DEFAULT NULL,
  `Med_Apellidos` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pacientes`
--

CREATE TABLE `pacientes` (
  `Pac_Identificador` char(10) NOT NULL,
  `Pac_Nombres` varchar(50) DEFAULT NULL,
  `Pac_Apellidos` varchar(50) DEFAULT NULL,
  `Pac_Fechanacimiento` date DEFAULT NULL,
  `Pac_Sexo` enum('F','M') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tratamientos`
--

CREATE TABLE `tratamientos` (
  `Tra_Numero` int(11) NOT NULL,
  `Tra_Fechaasiganada` date DEFAULT NULL,
  `Tra_Descripcion` text DEFAULT NULL,
  `Tra_Fechainicio` date DEFAULT NULL,
  `Tra_Fechafin` date DEFAULT NULL,
  `Tra_Observaciones` text DEFAULT NULL,
  `Tra_Pacientes` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`Cit_Numero`),
  ADD KEY `fk_pacientes` (`Cit_Paciente`),
  ADD KEY `fk_medicos` (`Cit_Medico`),
  ADD KEY `fk_consultorios` (`Cit_Consultorio`);

--
-- Indices de la tabla `consultorios`
--
ALTER TABLE `consultorios`
  ADD PRIMARY KEY (`Con_Identificador`);

--
-- Indices de la tabla `medicos`
--
ALTER TABLE `medicos`
  ADD PRIMARY KEY (`Med_Identificador`);

--
-- Indices de la tabla `pacientes`
--
ALTER TABLE `pacientes`
  ADD PRIMARY KEY (`Pac_Identificador`);

--
-- Indices de la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD PRIMARY KEY (`Tra_Numero`),
  ADD KEY `fk_tratamientos` (`Tra_Pacientes`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `Cit_Numero` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  MODIFY `Tra_Numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `fk_consultorios` FOREIGN KEY (`Cit_Consultorio`) REFERENCES `consultorios` (`Con_Identificador`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_medicos` FOREIGN KEY (`Cit_Medico`) REFERENCES `medicos` (`Med_Identificador`) ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_pacientes` FOREIGN KEY (`Cit_Paciente`) REFERENCES `pacientes` (`Pac_Identificador`) ON UPDATE CASCADE;

--
-- Filtros para la tabla `tratamientos`
--
ALTER TABLE `tratamientos`
  ADD CONSTRAINT `fk_tratamientos` FOREIGN KEY (`Tra_Pacientes`) REFERENCES `pacientes` (`Pac_Identificador`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
