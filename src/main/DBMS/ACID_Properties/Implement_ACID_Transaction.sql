USE covid_db;

START TRANSACTION;

INSERT INTO covid_vaccines
(country,report_date,vaccinated_people,fully_vaccinated,total_boosters)
VALUES
('India','2021-06-01',250000000,120000000,15000000);

INSERT INTO covid_vaccines
(country,report_date,vaccinated_people,fully_vaccinated,total_boosters)
VALUES
('USA','2021-06-01',180000000,95000000,12000000);

COMMIT;
START TRANSACTION;

INSERT INTO covid_vaccines
(country,report_date,vaccinated_people,fully_vaccinated,total_boosters)
VALUES
('UK','2021-06-01',50000000,30000000,5000000);

ROLLBACK;