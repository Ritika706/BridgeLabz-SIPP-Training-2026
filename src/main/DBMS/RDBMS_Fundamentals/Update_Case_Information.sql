SET SQL_SAFE_UPDATES = 1;
Use covid_db;
UPDATE covid_cases
SET confirmed_cases = 10850000
WHERE country = 'India'
AND report_date = '2021-02-01';