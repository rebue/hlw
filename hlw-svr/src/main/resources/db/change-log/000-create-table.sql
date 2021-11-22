/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/6/27 18:33:44                           */
/*==============================================================*/


drop table if exists HLW_STUDENT;

/*==============================================================*/
/* Table: HLW_STUDENT                                           */
/*==============================================================*/
create table HLW_STUDENT
(
   ID                   bigint unsigned not null  comment '学生ID',
   STUDENT_CODE         varchar(20) not null  comment '学号',
   NAME                 varchar(100) not null  comment '姓名',
   PHONE1               varchar(20) not null  comment '电话号码1',
   PHONE2               varchar(20) not null  comment '电话号码2',
   ID_CARD              char(18) not null  comment '身份证号码',
   AGE                  tinyint unsigned  comment '年龄',
   BIRTHDAY             date  comment '生日',
   SEX                  tinyint unsigned  comment '性别',
   HEIGHT               numeric(3,2) unsigned  comment '身高',
   WEIGHT               numeric(5,2) unsigned  comment '体重',
   IS_CPC               bool  comment '是否党员',
   REG_DATETIME         datetime  comment '注册时间',
   COMMUNICATE_TIME     time  comment '每天沟通时间',
   primary key (ID),
   unique key AK_STUDENT_CODE (STUDENT_CODE)
);

alter table HLW_STUDENT comment '学生信息';

