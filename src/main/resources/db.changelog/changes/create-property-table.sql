CREATE TABLE if not exists `rentals`
(
    `id`                 bigint NOT NULL,
    `title`        VARCHAR(255)   NOT NULL,
    `price`        int   NOT NULL,
    `payout` int not null ,
    `car_id`             bigint NOT NULL,
    `user_id`            bigint NOT NULL,
    PRIMARY KEY (`id`),
    KEY `user_fk_idx` (`user_id`),
    KEY `car_fk_idx` (`car_id`),
    CONSTRAINT `car_fk` FOREIGN KEY (`car_id`) REFERENCES `cars` (`id`),
    CONSTRAINT `user_fk` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;


private Long id;
private String title;
private int price;
private int payout;
private int house;
private boolean hotel;
private int payoutPerHouse;
private boolean isMortgaged;
@ManyToOne
    private Monopoly monopoly;
@ManyToOne
    private Player player;
