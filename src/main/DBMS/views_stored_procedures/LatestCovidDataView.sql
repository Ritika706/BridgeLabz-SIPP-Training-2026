USE covid_db;

CREATE OR REPLACE VIEW latest_covid_data AS
SELECT
    country,
    report_date,
    confirmed_cases,
    deaths,
    recoveries
FROM covid_cases c
WHERE report_date = (
    SELECT MAX(c2.report_date)
    FROM covid_cases c2
    WHERE c2.country = c.country
);

-- View Data
SELECT * FROM latest_covid_data;