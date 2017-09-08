CREATE DATABASE IF NOT EXISTS `sabor` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `sabor`;


CREATE TABLE `gustos` (
  `gus_id` int(11) NOT NULL,
  `gus_nombre` varchar(250) NOT NULL,
  `gus_sin_tac` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO `gustos` (`gus_id`, `gus_nombre`, `gus_sin_tac`) VALUES
(1, 'Palta', 0),
(2, 'Granizado', 1),
(3, 'Chocolate Blanco', 0),
(4, 'Almendrado', 1),
(5, 'Marroc', 1),
(6, 'Choco Torta', 0);

ALTER TABLE `gustos`
  ADD PRIMARY KEY (`gus_id`);

ALTER TABLE `gustos`
  MODIFY `gus_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
