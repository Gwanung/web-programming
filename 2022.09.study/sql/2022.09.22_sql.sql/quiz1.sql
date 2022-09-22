select mobile1 from userTBL order by mobile1 desc; --6번 문제

select * from (select userName from userTBL order by Mdate desc where rownum <= 2; -- 7번문제

create table employees as(select employee_id as "id",first_name as "fName",last_name as "lName" from hr.employees); -- 8번 문제
select * from employees;  

select * from buyTBL;

select userid as "사용자 ID", sum(amount) as "총 구매 개수" from buyTBL group by userid order by sum(amount); --9번 문제

select idnum, groupname, sum(amount) as "개수" from buyTBL group by rollup (groupname, idnum);  --10번 문제

select * from hr.employees;

select department_id as "부서 번호" from hr.employees order by department_id; -- 11번 문제
제
select department_id, sum(salary) as "평균 급여" from hr.employees group by rollup(department_id); --12번 문