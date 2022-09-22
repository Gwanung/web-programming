select EMPLOYEE_ID, FIRST_NAME, SALARY from HR.employees where salary between 5000 and 7000;

select MANAGER_ID, EMPLOYEE_ID, FIRST_NAME, SALARY from HR.employees where manager_id in(121, 123);