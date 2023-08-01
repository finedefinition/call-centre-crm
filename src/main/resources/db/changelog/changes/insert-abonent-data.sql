--liquibase formatted sql
--changeset <Sergii Bezrukov>:<insert-abonent-data>
INSERT INTO red_dot_crm.abonent (id, first_name, middle_name, last_name, gender, email, phone_number)
VALUES
(1, 'John', 'Michael', 'Smith', 'Male', 'john.smith@example.com', '+1234567890'),
(2, 'Mary', 'Elizabeth', 'Johnson', 'Female', 'mary.johnson@example.com', '+9876543210'),
(3, 'Robert', 'William', 'Davis', 'Male', 'robert.davis@example.com', '+4567891230'),
(4, 'Jennifer', 'Michelle', 'Miller', 'Female', 'jennifer.miller@example.com', '+6543219870'),
(5, 'Michael', 'David', 'Wilson', 'Male', 'michael.wilson@example.com', '+7890123450'),
(6, 'Linda', 'Susan', 'Anderson', 'Female', 'linda.anderson@example.com', '+2345678901'),
(7, 'William', 'Joseph', 'Taylor', 'Male', 'william.taylor@example.com', '+9081726354'),
(8, 'Emily', 'Samantha', 'Thomas', 'Female', 'emily.thomas@example.com', '+6758493021'),
(9, 'Charles', 'Christopher', 'Robinson', 'Male', 'charles.robinson@example.com', '+2198657340'),
(10, 'Sarah', 'Sophia', 'Lee', 'Female', 'sarah.lee@example.com', '+8203847659'),
(11, 'Matthew', 'Andrew', 'Hernandez', 'Male', 'matthew.hernandez@example.com', '+3041586792'),
(12, 'Jessica', 'Olivia', 'Martinez', 'Female', 'jessica.martinez@example.com', '+6479012345'),
(13, 'Daniel', 'Anthony', 'Lopez', 'Male', 'daniel.lopez@example.com', '+9054861237'),
(14, 'Ashley', 'Emily', 'Hill', 'Female', 'ashley.hill@example.com', '+4279081635'),
(15, 'Christopher', 'Jacob', 'Clark', 'Male', 'christopher.clark@example.com', '+5203948761'),
(16, 'Brittany', 'Abigail', 'Adams', 'Female', 'brittany.adams@example.com', '+9268457092'),
(17, 'James', 'Nathan', 'Wright', 'Male', 'james.wright@example.com', '+6381902745'),
(18, 'Amanda', 'Zoe', 'Reyes', 'Female', 'amanda.reyes@example.com', '+1987263450'),
(19, 'David', 'Elijah', 'Turner', 'Male', 'david.turner@example.com', '+2039475681'),
(20, 'Megan', 'Grace', 'Parker', 'Female', 'megan.parker@example.com', '+7258103946'),
(21, 'Ryan', 'Benjamin', 'Collins', 'Male', 'ryan.collins@example.com', '+9837402156'),
(22, 'Lauren', 'Avery', 'Edwards', 'Female', 'lauren.edwards@example.com', '+4178092536'),
(23, 'John', 'Evelyn', 'Stewart', 'Male', 'john.stewart@example.com', '+6931482705'),
(24, 'Elizabeth', 'Madison', 'Morgan', 'Female', 'elizabeth.morgan@example.com', '+2609381754'),
(25, 'Michael', 'Scarlett', 'Bell', 'Male', 'michael.bell@example.com', '+5678093142'),
(26, 'Victoria', 'Grace', 'Murphy', 'Female', 'victoria.murphy@example.com', '+8914305627'),
(27, 'Alexander', 'Brooklyn', 'Cook', 'Male', 'alexander.cook@example.com', '+4627380519'),
(28, 'Samantha', 'Lily', 'Rivera', 'Female', 'samantha.rivera@example.com', '+3102574896'),
(29, 'William', 'Zoey', 'Harris', 'Male', 'william.harris@example.com', '+6173490825'),
(30, 'Taylor', 'Eleanor', 'Cooper', 'Female', 'taylor.cooper@example.com', '+8241567390'),
(31, 'James', 'Aria', 'Peterson', 'Male', 'james.peterson@example.com', '+9304756182'),
(32, 'Emma', 'Addison', 'Gray', 'Female', 'emma.gray@example.com', '+5478129304'),
(33, 'Matthew', 'Avery', 'Price', 'Male', 'matthew.price@example.com', '+1864930572'),
(34, 'Olivia', 'Hannah', 'Bennett', 'Female', 'olivia.bennett@example.com', '+4032819576'),
(35, 'Daniel', 'Lillian', 'Wood', 'Male', 'daniel.wood@example.com', '+5620947381');

 --rollback DROP TABLE abonent;