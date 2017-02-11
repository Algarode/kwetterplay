# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table kweet (
  id                        bigint not null,
  sender_id                 bigint,
  content                   varchar(255),
  posted_from               varchar(255),
  post_date                 timestamp,
  constraint pk_kweet primary key (id))
;

create table user (
  id                        bigint not null,
  name                      varchar(255),
  location                  varchar(255),
  bio                       varchar(255),
  web                       varchar(255),
  constraint pk_user primary key (id))
;

create sequence kweet_seq;

create sequence user_seq;

alter table kweet add constraint fk_kweet_sender_1 foreign key (sender_id) references user (id) on delete restrict on update restrict;
create index ix_kweet_sender_1 on kweet (sender_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists kweet;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists kweet_seq;

drop sequence if exists user_seq;

