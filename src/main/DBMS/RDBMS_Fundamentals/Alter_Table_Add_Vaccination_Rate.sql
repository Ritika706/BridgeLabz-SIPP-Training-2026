Use covid_db;
ALTER TABLE covid_cases
ADD vaccination_rate DECIMAL(5,2);
UPDATE covid_cases
SET vaccination_rate = 72.50
WHERE country = 'India';

UPDATE covid_cases
SET vaccination_rate = 65.80
WHERE country = 'USA';

UPDATE covid_cases
SET vaccination_rate = 78.30
WHERE country = 'UK';