Use covid_db;
CREATE TABLE covid_cases_audit (

    audit_id INT AUTO_INCREMENT PRIMARY KEY,

    country VARCHAR(100),

    report_date DATE,

    old_confirmed_cases INT,

    new_confirmed_cases INT,

    old_deaths INT,

    new_deaths INT,

    old_recoveries INT,

    new_recoveries INT,

    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
DELIMITER $$

CREATE TRIGGER trg_covid_cases_audit

BEFORE UPDATE

ON covid_cases

FOR EACH ROW

BEGIN

    INSERT INTO covid_cases_audit(

        country,

        report_date,

        old_confirmed_cases,

        new_confirmed_cases,

        old_deaths,

        new_deaths,

        old_recoveries,

        new_recoveries

    )

    VALUES(

        OLD.country,

        OLD.report_date,

        OLD.confirmed_cases,

        NEW.confirmed_cases,

        OLD.deaths,

        NEW.deaths,

        OLD.recoveries,

        NEW.recoveries

    );

END$$

DELIMITER ;