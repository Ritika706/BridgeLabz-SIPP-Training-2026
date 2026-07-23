SET SQL_SAFE_UPDATES = 0;

USE covid_db;

DELETE FROM covid_cases
WHERE country = 'IN';

ALTER TABLE covid_cases
ADD COLUMN id INT AUTO_INCREMENT PRIMARY KEY FIRST;
DELETE c1
FROM covid_cases c1
JOIN covid_cases c2
ON c1.country = c2.country
AND c1.report_date = c2.report_date
WHERE c1.id > c2.id;