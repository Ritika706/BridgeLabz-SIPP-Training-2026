Use covid_db;
EXPLAIN
SELECT
    c.country,
    c.confirmed_cases,
    d.total_deaths
FROM covid_cases c
INNER JOIN covid_deaths d
ON c.country=d.country
AND c.report_date=d.report_date;
EXPLAIN
SELECT *
FROM covid_cases
WHERE country='India';
EXPLAIN
SELECT *
FROM covid_cases
ORDER BY report_date;
EXPLAIN
SELECT
    country,
    SUM(confirmed_cases)
FROM covid_cases
GROUP BY country;