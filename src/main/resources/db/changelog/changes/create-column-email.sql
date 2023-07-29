--liquibase formatted sql
--changeset <Sergii Bezrukov>:<create-column-email>
 ALTER TABLE red_dot_crm.abonent ADD email VARCHAR(255);

 --rollback DROP TABLE abonent;