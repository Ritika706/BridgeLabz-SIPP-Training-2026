Use covid_db;
CREATE TABLE continents (
    country VARCHAR(100) PRIMARY KEY,
    continent VARCHAR(100)
);
INSERT INTO continents VALUES
('India','Asia'),
('USA','North America'),
('UK','Europe');
SELECT
    ct.continent,
    SUM(cd.total_deaths) AS total_deaths
FROM covid_deaths cd
INNER JOIN continents ct
ON cd.country = ct.country
GROUP BY ct.continent
ORDER BY total_deaths DESC;