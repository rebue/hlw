/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2018/11/30 14:17:03                          */
/*==============================================================*/


drop table if exists HLW_STUDENT;

/*==============================================================*/
/* Table: HLW_STUDENT                                           */
/*==============================================================*/
create table HLW_STUDENT
(
   ID                   bigint not null comment '学生ID',
   STUDENT_CODE         varchar(20) not null comment '学号',
   NAME                 varchar(100) not null comment '姓名',
   PHONE1               varchar(20) not null comment '电话号码1',
   PHONE2               varchar(20) not null comment '电话号码2',
   ID_CARD              char(18) not null comment '身份证号码',
   AGE                  tinyint comment '年龄',
   BIRTHDAY             date comment '生日',
   SEX                  tinyint comment '性别',
   HEIGHT               numeric(3,2) comment '身高',
   WEIGHT               numeric(5,2) comment '体重',
   IS_CPC               bool comment '是否党员',
   REG_TIME             datetime comment '注册时间',
   primary key (ID)
);

alter table HLW_STUDENT comment '学生信息';

