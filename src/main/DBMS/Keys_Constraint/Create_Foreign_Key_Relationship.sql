USE covid_db;

-- Create reference table

CREATE TABLE countries(

    country VARCHAR(100) PRIMARY KEY,

    population BIGINT
);

-- Insert sample countries

INSERT INTO countries
VALUES
('India',1380004385),
('USA',331000000),
('UK',67800000);

-- Add Foreign Key

ALTER TABLE covid_cases

ADD CONSTRAINT fk_country

FOREIGN KEY(country)

REFERENCES countries(country);