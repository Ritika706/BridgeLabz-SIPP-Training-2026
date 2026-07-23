USE covid_db;

SELECT
    country,
    total_deaths
FROM covid_deaths
WHERE total_deaths >
(
    SELECT AVG(total_deaths)
    FROM covid_deaths
);