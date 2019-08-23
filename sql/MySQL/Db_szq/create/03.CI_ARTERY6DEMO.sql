-- auto create by SMD

use db_wq;

call pr_Drop_index_if_exists('T_Eg_Book','I_PK_T_Eg_Book');

create  index I_PK_T_Eg_Book on T_Eg_Book (C_ID);


use db_wq;

call pr_Drop_index_if_exists('T_RESERVE','I_PK_T_RESERVE');

create  index I_PK_T_RESERVE on T_RESERVE (C_ID);


