create table member(
	id number not null,
	passwd varchar2(20) not null,
	name varchar2(30) not null,
	primary key(id)
);


select * from user_objects where object_type ='TABLE';
select * from user_tables;
select * from tabs;

select * from col where tname = 'MEMBER';
select * from cols where table_name = 'MEMBER';

alter table member add phone varchar2(100);
alter table member drop column phone;
alter table member rename column passwd to password; --column의 이름 변경
alter table member modify password varchar2(60); --data_length 변경 
alter table member rename to student;

insert into member values(1, '1234', '홍길동');
insert into member values(2, '1235', '홍길순');
insert into member values(3, '1236', '홍길길');

update student set password ='1234' where name = '홍길동'; 
delete from student;


select name, password from student where id = '2';
select * from member;


