CREATE TABLE IF NOT EXISTS `monopolies`
(
    `id`        bigint NOT NULL,
    `title`     VARCHAR(255) DEFAULT NULL,
    `player_id` bigint       DEFAULT NULL,
    PRIMARY KEY (`id`),
    CONSTRAINT `player_fk` FOREIGN KEY (`player_id`) REFERENCES `players` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
