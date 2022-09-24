select * from buytbl;

select userid as "사용자 ID", sum(amount) as "총 구매 개수" from buytbl group by userid order by userid desc;

select userid as "사용자 ID", avg(amount) as "평균 구매 개수" from buytbl having avg(amount) >=2 group by userid order by avg(amount) desc;


create table employees as(select employee_id as "id",first_name as "fName",last_name as "lName" from hr.employees);
select * from employees;


select * from (select userName from userTBL order by mdate desc) where rownum <=2;
