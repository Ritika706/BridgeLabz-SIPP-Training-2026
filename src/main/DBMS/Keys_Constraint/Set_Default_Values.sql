USE covid_db;

-- Default Recoveries

ALTER TABLE covid_cases

ALTER recoveries SET DEFAULT 0;
ALTER TABLE covid_cases

ADD last_updated TIMESTAMP

DEFAULT CURRENT_TIMESTAMP;