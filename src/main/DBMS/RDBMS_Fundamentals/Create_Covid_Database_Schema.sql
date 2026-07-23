SELECT * FROM covid_db.covid_vaccine_statewise;
-- Create covid_cases table
CREATE TABLE covid_cases (
    country VARCHAR(100),
    report_date DATE,
    confirmed_cases INT,
    deaths INT,
    recoveries INT,
    population BIGINT
);

-- Create covid_deaths table
CREATE TABLE covid_deaths (
    country VARCHAR(100),
    report_date DATE,
    total_deaths INT,
    population BIGINT
);

-- Create covid_vaccines table
CREATE TABLE covid_vaccines (
    country VARCHAR(100),
    report_date DATE,
    vaccinated_people INT,
    fully_vaccinated INT,
    total_boosters INT
);


