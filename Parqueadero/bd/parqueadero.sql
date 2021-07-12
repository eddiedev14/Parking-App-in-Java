-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-06-2021 a las 23:04:33
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `parqueadero`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `id` int(11) NOT NULL,
  `nombre_cliente` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `apellido_cliente` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `cedula_cliente` int(10) NOT NULL,
  `placa` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_entrada` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_salida` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `horas_transcurridas` int(11) NOT NULL,
  `minutos_transcurridos` int(11) NOT NULL,
  `segundos_transcurridos` int(11) NOT NULL,
  `precio_total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`id`, `nombre_cliente`, `apellido_cliente`, `cedula_cliente`, `placa`, `fecha_entrada`, `fecha_salida`, `horas_transcurridas`, `minutos_transcurridos`, `segundos_transcurridos`, `precio_total`) VALUES
(1, 'Jose', 'Ramirez', 1234535636, 'KCJ-124', '2021-06-26 20:06:25', '2021-06-27 11:11:21', 15, 4, 56, 153200),
(2, 'Santiago', 'Rodriguez', 123432454, 'KCJ-124', '2021-06-27 12:16:40', '2021-06-27 12:17:42', 0, 1, 2, 200),
(3, 'Jose', 'Garcia', 1235564325, 'KLC-135', '2021-06-27 12:19:28', '2021-06-27 12:19:38', 0, 0, 10, 500),
(4, 'Pablo', 'Martinez', 1235565321, 'KLJ-195', '2021-06-27 13:41:55', '2021-06-27 13:42:06', 0, 0, 11, 550),
(5, 'Karol', 'Rodriguez', 1353667573, 'ÑLD-353', '2021-06-27 13:44:58', '2021-06-27 13:45:03', 0, 0, 5, 250);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `apellido` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `cedula` int(10) NOT NULL,
  `sexo` varchar(15) COLLATE utf8_spanish2_ci NOT NULL,
  `contraseña` varchar(100) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `nombre`, `apellido`, `cedula`, `sexo`, `contraseña`) VALUES
(1, 'Eddie', 'Delgado', 1234567890, 'Masculino', 'prueba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `id` int(11) NOT NULL,
  `nombre_asesor` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `cedula_asesor` int(10) NOT NULL,
  `nombre_cliente` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `apellido_cliente` varchar(100) COLLATE utf8_spanish2_ci NOT NULL,
  `cedula_cliente` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `placa` varchar(7) COLLATE utf8_spanish2_ci NOT NULL,
  `fechayhora` varchar(100) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`id`, `nombre_asesor`, `cedula_asesor`, `nombre_cliente`, `apellido_cliente`, `cedula_cliente`, `placa`, `fechayhora`) VALUES
(8, 'Eddie', 1234567890, 'Amparo', 'Campo', '1234567821', 'KLÑ-124', '2021-06-27 14:43:48'),
(10, 'Eddie', 1234567890, 'Natalia', 'Martinez', '1254542821', 'POL-123', '2021-06-27 14:43:48');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
