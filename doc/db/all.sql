drop table if exists `test`;
create table `test` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment 'name of user',
                        `password` varchar(50) comment 'pwd of user',
                        primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='devlopment environment purpose';

drop table if exists `demo`;
create table `demo` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment 'name of user',
                        `password` varchar(50) comment 'pwd of user',
                        primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='devlopment environment purpose';

