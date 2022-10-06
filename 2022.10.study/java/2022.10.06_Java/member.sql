drop table member purge;

create table member(
	id number primary key,
	name varchar2(12) unique not null,
	addr varchar2(50) not null,
	nation varchar2(12) not null,
	email varchar2(30) not null,
	age number null
);

create sequence member_id_seq;

select * from member;

insert into member values(member_id_seq.nextval, '홍길동', '대구시', '대한민국', 'hgd@gmail.com', 24);