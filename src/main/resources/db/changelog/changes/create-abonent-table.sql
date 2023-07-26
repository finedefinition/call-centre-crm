--liquibase formatted sql
--changeset <dlc>:<create-abonent-table>
 CREATE TABLE IF NOT EXISTS red_dot_crm.abonent
 (
 id bigint NOT NULL,
 firstName character varying (256) NOT NULL,
 middleName character varying (256) NOT NULL,
 lastName character varying (256) NOT NULL,
 gender character varying (256) NOT NULL,
 CONSTRAINT abonent_pk PRIMARY KEY (id)
 );

 --rollback DROP TABLE abonent;