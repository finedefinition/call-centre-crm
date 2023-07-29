--liquibase formatted sql
--changeset <Sergii Bezrukov>:<create-column-phone-number>
 ALTER TABLE red_dot_crm.abonent ADD phone_number VARCHAR(255);

 --rollback DROP TABLE abonent;