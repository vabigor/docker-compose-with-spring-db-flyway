CREATE TABLE employee (
    id int8 NOT NULL GENERATED BY DEFAULT AS IDENTITY,
    first_name varchar(255) NULL,
    last_name varchar(255) NULL,
    middle_name varchar(255) NULL,
    CONSTRAINT employee_pkey PRIMARY KEY (id)
);
