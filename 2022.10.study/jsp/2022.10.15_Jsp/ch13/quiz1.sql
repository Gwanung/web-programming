create table student(
	num number,
	depart nvarchar2(40),
	name nvarchar2(60),
	address nvarchar2(100),
	phone nvarchar2(40)
);

select * from tabs;

insert into student values('20181000001', '모바일과', '홍길순', '서울시', '010-9002-1234');
insert into student values('20181000002', '모바일과', '홍길동', '경기도', '010-2009-4321');
insert into student values('20182000001', '영어과', '수여인', '인천시', '010-3918-0087');
insert into student values('20182000002', '영어과', '김다운', '서울시', '010-3001-0101');




select * from student where depart = '컴퓨터과';

update student set depart = '컴퓨터과' where depart = '모바일과';
delete from student where depart = '영어과';

select * from student;