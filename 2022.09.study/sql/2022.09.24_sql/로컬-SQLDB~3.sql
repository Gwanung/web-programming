select mobile1 from userTBL order by mobile1 desc; --6번 문제

select * from (select userName from userTBL where rownum <= 2 order by Mdate desc); -- 7번문제

create table employees as(select employee_id as "id",first_name as "fName",last_name as "lName" from hr.employees); -- 8번 문제
select * from employees;  

select * from buyTBL;

select userid as "사용자 ID", sum(amount) as "총 구매 개수" from buyTBL group by userid order by sum(amount); --9번 문제

select idnum, groupname, sum(amount) as "개수" from buyTBL group by rollup (groupname, idnum);  --10번 문제

select * from hr.employees;

select distinct department_id as "부서 번호" from hr.employees order by department_id; -- 11번 문제

select department_id as "부서 번호", round(avg(salary)) as "평균 급여" from hr.employees group by department_id order by department_id; --12번 문제

select job_id, round(avg(salary)) as "평균 급여", count(job_id) as "직업별직원수" from hr.employees group by job_id order by job_id;

select employee_id, first_name, salary from hr.employees where (select avg(salary) from hr.employees) < salary order by salary;

select employee_id, first_name, salary from hr.employees where salary = (select max(salary) from hr.employees) or salary = (select min(salary) from hr.employees);

create table testEmployees as(select employee_id, department_id, first_name, salary from hr.employees where department_id = 100);
update testEmployees set salary = salary *1.2 where salary < 8000;
select * from testEmployees;