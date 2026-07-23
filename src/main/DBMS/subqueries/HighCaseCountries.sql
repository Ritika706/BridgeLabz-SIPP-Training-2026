USE covid_db;

SELECT
    country,
    confirmed_cases
FROM covid_cases
WHERE country IN
(
    SELECT country
    FROM covid_cases
    WHERE confirmed_cases > 1000000
);