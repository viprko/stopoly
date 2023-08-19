CREATE TABLE IF NOT EXISTS `players`
(
    `id`         bigint       NOT NULL AUTO_INCREMENT,
    `username`   VARCHAR(255) NOT NULL,
    `password`   VARCHAR(255) DEFAULT NULL,
    `position`   int          DEFAULT 0,
    `deposit`    int          DEFAULT 1500,
    `is_in_jail` tinyint      DEFAULT 0,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
