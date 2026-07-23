Use covid_db;
SELECT
    country,
    confirmed_cases,
    population,
    ROUND((confirmed_cases * 100.0) / population, 4) AS infection_rate
FROM covid_cases
ORDER BY infection_rate DESC;