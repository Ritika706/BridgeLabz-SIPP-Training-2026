SELECT country,
       vaccinated AS people,
       'Vaccinated' AS status
FROM covid_vaccination

UNION

SELECT country,
       (population - vaccinated) AS people,
       'Unvaccinated' AS status
FROM covid_vaccination;