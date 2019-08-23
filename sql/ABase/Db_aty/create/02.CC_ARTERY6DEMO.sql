-- auto create by SMD

set client_encoding = UTF8;
set search_path to db_aty;
commit;

comment on table  T_Eg_Book                                  is '图书表';
comment on column T_Eg_Book.C_ID                             is 'uuid';
comment on column T_Eg_Book.C_NAME                             is '图书名称';
comment on column T_Eg_Book.C_AUTH                             is '作者';
comment on column T_Eg_Book.C_PUBLISHER                             is '出版社';
comment on column T_Eg_Book.F_PRICE                             is '单价';
comment on column T_Eg_Book.D_PUBLISHER                             is '出版日期';
comment on column T_Eg_Book.D_BUY                             is '购买日期';
comment on column T_Eg_Book.C_LIBRARYID                             is '图书室id';
comment on column T_Eg_Book.C_ISBN                             is 'ISBN';
comment on column T_Eg_Book.C_VERSION                             is '第几版';
comment on column T_Eg_Book.I_PHOTO                             is '图书封面';
comment on column T_Eg_Book.T_ABST                             is '摘要';
comment on column T_Eg_Book.N_VALID                             is '是否有效';
comment on column T_Eg_Book.T_INVALIDREASON                             is '删除此图书的原因';
comment on column T_Eg_Book.N_TYPE                             is '类别';
comment on column T_Eg_Book.I_ATTACH                             is '附件';
comment on column T_Eg_Book.D_BOOKING                             is '预订时间';
comment on column T_Eg_Book.N_BOOKINGUSERID                             is '预订人';
comment on column T_Eg_Book.N_LENDUSERID                             is '借出用户';
comment on column T_Eg_Book.D_LEND                             is '借出人';

set client_encoding = UTF8;
set search_path to db_aty;
commit;

comment on table  T_STUDENT                                  is '学生表';
comment on column T_STUDENT.C_ID                             is 'ID';
comment on column T_STUDENT.C_NAME                             is '姓名';
comment on column T_STUDENT.N_AGE                             is '年龄';
comment on column T_STUDENT.D_BIRTHDAY                             is '生日';
comment on column T_STUDENT.C_DESC                             is '自我描述';

