
Use covid_db;
CREATE TABLE covid_state_cases (
    state VARCHAR(100),
    report_date DATE,
    confirmed_cases INT
);
INSERT INTO covid_state_cases VALUES
('Mumbai','2021-01-01',1500),
('Mumbai','2021-01-02',1800),
('Mumbai','2021-01-03',2500),
('Mumbai','2021-01-04',2100),
('Mumbai','2021-01-05',3000);
SELECT
    c1.state,
    c1.report_date,
    c1.confirmed_cases
FROM covid_state_cases c1
WHERE c1.confirmed_cases =
(
    SELECT MAX(c2.confirmed_cases)
    FROM covid_state_cases c2
    WHERE c2.state = c1.state
);