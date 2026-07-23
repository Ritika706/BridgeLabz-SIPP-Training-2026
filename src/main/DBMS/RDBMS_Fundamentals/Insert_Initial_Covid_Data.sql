Use covid_db;
CREATE TABLE covid_cases (
    country VARCHAR(100),
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    population BIGINT
);
INSERT INTO covid_cases
(country, report_date, confirmed_cases, deaths, recoveries, population)
VALUES
('India','2021-01-01',10300000,149000,9900000,1380004385),

('India','2021-02-01',10700000,154000,10300000,1380004385),

('USA','2021-01-01',20000000,346000,11800000,331000000),

('USA','2021-02-01',26000000,440000,16500000,331000000),

('UK','2021-01-01',2500000,74000,1800000,67800000),

('UK','2021-02-01',3900000,110000,2500000,67800000);
Select * FROM covid_cases;
SELECT DATABASE();
SHOW TABLES;