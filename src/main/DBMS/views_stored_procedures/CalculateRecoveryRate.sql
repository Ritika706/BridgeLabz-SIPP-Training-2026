USE covid_db;

DROP FUNCTION IF EXISTS CalculateRecoveryRate;

DELIMITER $$

CREATE FUNCTION CalculateRecoveryRate(
    p_country VARCHAR(100),
    p_date DATE
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    DECLARE recovery_rate DECIMAL(10,2);

    SELECT (recoveries * 100.0) / confirmed_cases
    INTO recovery_rate
    FROM covid_cases
    WHERE country = p_country
      AND report_date = p_date;

    RETURN recovery_rate;
END$$

DELIMITER ;