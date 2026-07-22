DROP TABLE IF EXISTS covid_cases_audit;

CREATE TABLE covid_cases_audit
(
    audit_id INT AUTO_INCREMENT PRIMARY KEY,

    country VARCHAR(100),

    report_date DATE,

    old_confirmed INT,

    new_confirmed INT,

    old_deaths INT,

    new_deaths INT,

    old_recovered INT,

    new_recovered INT,

    changed_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DROP TRIGGER IF EXISTS CovidAuditTrigger;

DELIMITER $$

CREATE TRIGGER CovidAuditTrigger

BEFORE UPDATE

ON covid_cases

FOR EACH ROW

BEGIN

INSERT INTO covid_cases_audit
(
country,
report_date,
old_confirmed,
new_confirmed,
old_deaths,
new_deaths,
old_recovered,
new_recovered
)

VALUES
(
OLD.country,
OLD.report_date,
OLD.confirmed_cases,
NEW.confirmed_cases,
OLD.deaths,
NEW.deaths,
OLD.recovered,
NEW.recovered
);

END $$

DELIMITER ;

-- Test Trigger

UPDATE covid_cases
SET confirmed_cases = confirmed_cases + 100
WHERE country='India';

-- View Audit Records

SELECT * FROM covid_cases_audit;