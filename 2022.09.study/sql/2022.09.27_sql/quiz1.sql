select * from hr.employees;
select * from hr.jobs;
select * from hr.job_history;


select JH.employee_id, E.first_name || E.last_name as "name", E.phone_number, J.job_title 
from hr.employees E
inner join hr.job_history JH on E.employee_id = JH.employee_id
inner join hr.jobs J on E.job_id = J.job_id
where JH.employee_id = '114';   --7번문제

select job_id, dense_rank() over (partition by job_id order by salary) as "순위", first_name, salary from hr.employees;  --8번문제

