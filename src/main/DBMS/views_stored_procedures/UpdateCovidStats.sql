USE covid_db;

DROP PROCEDURE IF EXISTS UpdateCovidStats;

DELIMITER $$

CREATE PROCEDURE UpdateCovidStats(

    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_cases INT,
    IN p_deaths INT,
    IN p_recoveries INT

)
BEGIN

    UPDATE covid_cases
    SET confirmed_cases = p_cases,
        deaths = p_deaths,
        recoveries = p_recoveries
    WHERE country = p_country
      AND report_date = p_date;

END$$

DELIMITER ;