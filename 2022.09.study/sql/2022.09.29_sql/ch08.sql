drop table buytbl;
drop table usertbl cascade constraints; --외래키 제약 조건 무시
drop sequence idseq;


-- not null은 반드시 값을 넣어야 하고, null은 비어도 괜찮다는 의미!
create table usertbl
(   userid char(8) ,
    username nvarchar2(10) ,
    birthyear number(4) ,
    addr nchar(2) ,
    mobile1 char(3) ,
    mobile2 char(8) ,
    height number(3) ,
    mdate date);
    
    --alter table usertbl modify birthyear default -1; 이런식으로도 default 값을 추가 할 수 있다. (alter table 사용)

insert into usertbl values('LHL', '이혜리', default, default, '011', '1234567', default, '2019.12.12');
insert into usertbl(userid, username) values ('Kay', '김아영');
insert into usertbl values('WB', '원빈', 1982, '대전', '011', '1234567', 176, '2019.12.12');
select * from usertbl;  -- default로 지정한 값들이 정상적으로 들어감.

create table buytbl
(   idnum number(8) ,
    userid char(8) ,
    prodname nchar(6) ,
    groupname nchar(4) ,
    price number(8) ,
    amount number(3) );  --테이블의 userid 열과 외래 키 관계를 맺으라는 의미
--alter table buytbl add constraints FK_susertbl_buytbl foreign key(userid) references usertbl(userid)    
    
create sequence idseq;

insert into usertbl values('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
insert into usertbl values('KBS', '김범수', NULL, '경남', '011', '2222222', 173, '2012-4-4');
insert into usertbl values('KKH', '김경호', 1871, '전남', '019', '3333333', 177, '2007-7-7');
insert into usertbl values('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');

insert into buytbl values(idseq.nextval, 'KBS', '운동화', NULL, 30, 2);
insert into buytbl values(idseq.nextval, 'KBS', '노트북', '전자', 1000, 1);
insert into buytbl values(idseq.nextval, 'JYP', '모니터', '전자', 200, 1);
insert into buytbl values(idseq.nextval, 'BBK', '모니터', '전자', 200, 5);

select * from user_constraints
     where table_name='BUYTBL'  -- p가 기본키  , R은 외래키, C는 Not null or check
        and constraint_type = 'P';    
        

alter table usertbl 
add constraint PK_usertbl_userid primary key (userid);