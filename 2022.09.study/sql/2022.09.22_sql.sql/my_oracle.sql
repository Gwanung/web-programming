select * from sys.dba_tables where owner = 'HR';
select * from sys.dba_tab_columns where owner = 'HR' and table_name = 'DEPARTMENTS';
select department_name from hr.departments;

create user sqlDB IDENTIFIED by 1234  
    default tablespace users
    temporary tablespace temp;
    

grant connect, resource, dba to sqlDB;    