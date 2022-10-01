set serveroutput on;

declare
    v_salary number(8,2);
    v_avgSalary number(8,2);
begin
    select round(avg(salary),2) into v_avgSalary from hr.employees;
    select salary into v_salary from hr.employees where employee_id = 100;
    
    if v_salary > v_avgSalary then
        dbms_output.put_line('당신의 월급은 평균월급인' || v_avgSalary || '보다 높네요');
    else 
        dbms_output.put_line('당신의 월급은 평균월급인' || v_avgSalary || '보다 낮네요');
    end if;
end;  