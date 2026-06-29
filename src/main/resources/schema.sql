CREATE TABLE employee (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(100),
                          department VARCHAR(100)
);

INSERT INTO employee(name, department)
VALUES ('Ashok', 'IT');

INSERT INTO employee(name, department)
VALUES ('Kapil', 'Finance');

INSERT INTO employee(name, department)
VALUES ('Shubham', 'Engineering');

INSERT INTO employee(name, department)
VALUES ('Akash', 'Finance');