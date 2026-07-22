DROP VIEW IF EXISTS LatestCovidDataView;

CREATE VIEW LatestCovidDataView AS
SELECT
    c.country,
    c.report_date,
    c.confirmed_cases,
    c.deaths,
    c.recovered
FROM covid_cases c
WHERE c.report_date =
(
    SELECT MAX(c2.report_date)
    FROM covid_cases c2
    WHERE c2.country = c.country
);

-- View Data
SELECT * FROM LatestCovidDataView;