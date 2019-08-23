-- auto create by SMD

set client_encoding = UTF8;
set search_path to db_aty;
commit;

-------------------------
-- 图书表
-------------------------

drop table if exists T_Eg_Book;
create table T_Eg_Book
(
    C_ID                  varchar(32)                          NOT NULL,    -- uuid
    C_NAME                varchar(300)                         NOT NULL,    -- 图书名称
    C_AUTH                varchar(300)                         NULL,        -- 作者
    C_PUBLISHER           varchar(300)                         NULL,        -- 出版社
    F_PRICE               numeric(6, 2)                        NULL,        -- 单价
    D_PUBLISHER           timestamp                            NULL,        -- 出版日期
    D_BUY                 timestamp                            NULL,        -- 购买日期
    C_LIBRARYID           varchar(32)                          NOT NULL,    -- 图书室id
    C_ISBN                varchar(300)                         NULL,        -- ISBN
    C_VERSION             varchar(300)                         NULL,        -- 第几版
    I_PHOTO               bytea                                NULL,        -- 图书封面
    T_ABST                text                                 NULL,        -- 摘要
    N_VALID               int             default 1            NULL,        -- 是否有效
    T_INVALIDREASON       text                                 NULL,        -- 删除此图书的原因
    N_TYPE                int                                  NULL,        -- 类别
    I_ATTACH              bytea                                NULL,        -- 附件
    D_BOOKING             timestamp                            NULL,        -- 预订时间
    N_BOOKINGUSERID       numeric(17, 2)                       NULL,        -- 预订人
    N_LENDUSERID          numeric(17, 2)                       NULL,        -- 借出用户
    D_LEND                timestamp                            NULL,        -- 借出人
constraint PK_Eg_Book primary key( C_ID )
);

 commit; 

set client_encoding = UTF8;
set search_path to db_aty;
commit;

-------------------------
-- 学生表
-------------------------

drop table if exists T_STUDENT;
create table T_STUDENT
(
    C_ID                  varchar(32)                          NOT NULL,    -- ID
    C_NAME                varchar(50)                          NOT NULL,    -- 姓名
    N_AGE                 int                                  NULL,        -- 年龄
    D_BIRTHDAY            date                                 NULL,        -- 生日
    C_DESC                varchar(500)                         NULL,        -- 自我描述
constraint PK_STUDENT primary key( C_ID )
);

 commit; 

