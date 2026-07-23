Use covid_db;


CREATE TABLE covid_deaths (
    country VARCHAR(100) NOT NULL,
    report_date DATE NOT NULL,
    total_deaths INT,
    population BIGINT,
    PRIMARY KEY(country, report_date)
);
INSERT INTO covid_deaths
(country, report_date, total_deaths, population)
VALUES
('India','2021-01-01',149000,1380004385),
('India','2021-02-01',154000,1380004385),

('USA','2021-01-01',346000,331000000),
('USA','2021-02-01',440000,331000000),

('UK','2021-01-01',74000,67800000),
('UK','2021-02-01',110000,67800000);
SELECT
    c.country,
    co.population,
    c.report_date,
    c.confirmed_cases
FROM covid_cases c
INNER JOIN countries co
ON c.country = co.country
WHERE c.report_date = '2021-02-01'
ORDER BY c.confirmed_cases DESC
LIMIT 1;