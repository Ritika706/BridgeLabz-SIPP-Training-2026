USE covid_db;

SELECT
    v.country,
    v.vaccinated_people,
    'Vaccinated' AS status
FROM covid_vaccines v

UNION

SELECT
    c.country,
    (c.population - v.vaccinated_people),
    'Unvaccinated'
FROM countries c
JOIN covid_vaccines v
ON c.country = v.country;