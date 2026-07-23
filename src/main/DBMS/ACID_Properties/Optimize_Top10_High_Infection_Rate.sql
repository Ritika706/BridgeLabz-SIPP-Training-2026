Use covid_db;
ALTER TABLE covid_cases
ADD COLUMN infection_rate DECIMAL(10,4);
UPDATE covid_cases
SET infection_rate = (confirmed_cases * 100.0) / population;
CREATE INDEX idx_infection_rate
ON covid_cases(infection_rate, country);
SELECT
    country,
    infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;