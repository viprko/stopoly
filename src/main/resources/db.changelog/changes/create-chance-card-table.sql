CREATE TABLE IF NOT EXISTS `chance_cards`
(
    `id`          bigint       NOT NULL,
    `title`       VARCHAR(255) NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    `outcome`     int     DEFAULT '0',
    `income`      int     DEFAULT '0',
    `underArrest` tinyint DEFAULT '0',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

