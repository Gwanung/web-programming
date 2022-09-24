select * from usertbl;

select addr, row_number() over(partition by addr order by mdate) as " 지역별 가입일 순위", username, mdate from usertbl;  -- 2번문제

select username, addr as "AD", mdate as "가입일", abs(mdate - (lead(mdate) over (order by mdate))) as "가입일자 차이" from usertbl;  --3번문제

select * from pivotTest;

--insert into pivotTest values('김범수', '겨울', 10);
--insert into pivotTest values('윤종신', '여름', 15);


--select * from pivotTest pivot (sum(amount) for season in ('봄', '여름', '가을', '겨울'));  --한눈에 테이블의 내용을 파악할 수 있는 장점이 있다.
select * from pivotTest pivot(sum(amount) for uname in ('김범수', '윤종신'));  --4번문제

select B.userid, U.username, B.prodname, U.addr as "AD", U.mobile1 || U.mobile2 as "phone" 
from buytbl B inner join usertbl U on B.userid = U.userid 
where B.userid = 'KBS';  --5번문제

select * from hr.employees;
select * from hr.departments;
select * from hr.jobs;
select * from hr.job_history;
select employee_id, first_name, phone_number, job_id as "department_name" from hr.employees where job_id = 'IT_PROG'; --6번문제
 
select H.employee_id, H.first_name || H.last_name as "name", H.phone_number, J.job_title 
from hr.employees H inner join hr.jobs J on H.job_id = J.job_id 
inner join hr.job_history HH on J.job_id = HH.job_id where J.job_id = 'ST_CLERK'; --7번문제


select avg(salary) from hr.employees where job_id like 'IT%'; --8번문제

select H.department_name ,round(avg(E.salary), 2) as "부서별 평균급여" from hr.departments H 
inner join hr.employees E on H.department_id = E.department_id group by H.department_name; --11번문제

select job_id, dense_rank() over (partition by job_id order by salary) as "순위", first_name, salary from hr.employees;  --12번문제

