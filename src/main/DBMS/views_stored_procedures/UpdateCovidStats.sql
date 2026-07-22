DROP PROCEDURE IF EXISTS UpdateCovidStats;

DELIMITER $$

CREATE PROCEDURE UpdateCovidStats
(
    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_confirmed INT,
    IN p_deaths INT,
    IN p_recovered INT
)

BEGIN

    UPDATE covid_cases

    SET
    confirmed_cases = p_confirmed,
    deaths = p_deaths,
    recovered = p_recovered

    WHERE country = p_country
    AND report_date = p_date;

END $$

DELIMITER ;

-- Execute Procedure

CALL UpdateCovidStats
(
'India',
'2021-06-01',
350000,
4500,
340000
);

-- Verify
SELECT *
FROM covid_cases
WHERE country='India';