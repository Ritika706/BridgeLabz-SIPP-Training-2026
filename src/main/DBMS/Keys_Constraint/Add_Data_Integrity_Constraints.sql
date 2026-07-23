USE covid_db;

-- NOT NULL Constraints

ALTER TABLE covid_cases

MODIFY country VARCHAR(100) NOT NULL,

MODIFY report_date DATE NOT NULL,

MODIFY confirmed_cases INT NOT NULL;

-- CHECK Constraint

ALTER TABLE covid_cases

ADD CONSTRAINT chk_deaths

CHECK (deaths <= confirmed_cases);