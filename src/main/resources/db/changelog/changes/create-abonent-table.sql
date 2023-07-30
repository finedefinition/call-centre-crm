--liquibase formatted sql
--changeset <Sergii Bezrukov>:<create-abonent-table>
DROP TABLE IF EXISTS `red_dot_crm.abonent`;

CREATE TABLE IF NOT EXISTS red_dot_crm.abonent (
    id bigint NOT NULL AUTO_INCREMENT,
    first_name varchar(256) NOT NULL,
    middle_name varchar(256) NOT NULL,
    last_name varchar(256) NOT NULL,
    gender varchar(256) NOT NULL,
    email varchar(255),
    phone_number varchar(255),
    CONSTRAINT abonent_pk PRIMARY KEY (id)
);

 --rollback DROP TABLE abonent;