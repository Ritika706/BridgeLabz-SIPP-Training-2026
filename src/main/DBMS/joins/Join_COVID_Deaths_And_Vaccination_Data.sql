Use covid_db;
SELECT
    d.country,
    d.report_date,
    d.total_deaths,
    v.vaccinated_people,
    v.fully_vaccinated,
    v.total_boosters
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country = v.country
AND d.report_date = v.report_date;