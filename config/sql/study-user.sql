# wangzongyi 2021-12-12 创建数据库
CREATE DATABASE `study-user` CHARACTER SET 'utf8mb4' COLLATE 'utf8mb4_general_ci';

CREATE TABLE `study-user`.`account`
(
    `id`           bigint(20)          NOT NULL,
    `name`         varchar(20)         NULL,
    `display_name` varchar(50)         NULL,
    `phone`        varchar(20)         NULL,
    `id_no`        varchar(18)         NULL,
    `age`          tinyint(3)          NULL,
    `sex`          char(2)             NULL,
    `address`      varchar(50)         NULL,
    `create_time`  datetime(0)         NULL,
    `modify_time`  datetime(0)         NULL ON UPDATE CURRENT_TIMESTAMP(0),
    `deleted`      tinyint(1) ZEROFILL NULL,
    PRIMARY KEY (`id`)
);