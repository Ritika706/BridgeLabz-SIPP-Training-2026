SELECT country, deaths
FROM covid_deaths
WHERE deaths >
(
    SELECT AVG(deaths)
    FROM covid_deaths
);