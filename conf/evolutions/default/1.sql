# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table event (
  id                        integer not null,
  name                      varchar(255),
  date                      varchar(255),
  description               varchar(255),
  type                      varchar(255),
  location                  varchar(255),
  entrance                  varchar(255),
  constraint pk_event primary key (id))
;

create table groupe (
  name                      varchar(255) not null,
  password                  varchar(255),
  constraint pk_groupe primary key (name))
;

create sequence event_seq;

create sequence groupe_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists event;

drop table if exists groupe;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists event_seq;

drop sequence if exists groupe_seq;

