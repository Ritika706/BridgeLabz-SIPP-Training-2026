USE covid_db;

DELIMITER $$

CREATE FUNCTION CalculateMortalityRate(
    p_country VARCHAR(100),
    p_date DATE
)
RETURNS DECIMAL(10,2)

DETERMINISTIC

BEGIN

    DECLARE mortality_rate DECIMAL(10,2);

    SELECT
        (deaths * 100.0) / confirmed_cases
    INTO mortality_rate
    FROM covid_cases
    WHERE country = p_country
      AND report_date = p_date;

    RETURN mortality_rate;

END$$

DELIMITER ;