-- auto create by SMD

use db_wq;

-- 图书表

drop table if exists T_Eg_Book;

create table db_wq.T_Eg_Book
(
    C_ID                 varchar(32)                          NOT NULL     comment 'uuid',
    C_NAME               varchar(300)                         NOT NULL     comment '图书名称',
    C_AUTH               varchar(300)                         NULL         comment '作者',
    C_PUBLISHER          varchar(300)                         NULL         comment '出版社',
    F_PRICE              decimal(6, 2)                        NULL         comment '单价',
    D_PUBLISHER          datetime                             NULL         comment '出版日期'
) comment = '图书表' ;


use db_wq;

-- 预定信息表表

drop table if exists T_RESERVE;

create table db_wq.T_RESERVE
(
    C_ID                 varchar(32)                          NOT NULL     comment 'ID',
    C_NAME               varchar(50)                          NOT NULL     comment '预订人姓名',
    C_PID                varchar(32)                          NOT NULL     comment '图书id',
    D_PUBLISHER          datetime                             NULL         comment '预定日期'
) comment = '预定信息表表' ;


