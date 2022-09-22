select * from userTBL where height > 177;

select * from userTBL where height > (select height from userTBL where userName = '김경호');  --중첩 쿼리문 (위와 결과 값 같음)

select userName, height from userTBL
    where height >= any(select height from userTBL where addr ='경남'); --크기 값이 2개 이상일 경우는 any 사용 (or 조건과 같은 의미)


select userName, mDate from userTBL order by mDate;  -- default 값이 오름차순
select userName, mDate from userTBL order by mDate desc;  -- 내림차순은 desc를 추가하면 적용
select userName, height from userTBL order by height desc, userName asc;  -- 여러 내용에 대해 적용도 가능하다.

select addr from userTBL order by addr; 
select distinct addr from userTBL; -- distinct를 사용하면 중복된 값을 제외하고 출력해준다!

create table buyTBL2 as (select * from buyTBL); -- buyTBL 테이블을 buyTBL2 로 복사한다!
select * from buyTBL2;

create table buyTBL3 as (select userID, prodName from buyTBL); -- 일부 열만 복사도 가능함! 그러나 pk나 fk 등의 제약 조건은 복사가 되지 않는다!
select * from buyTBL3;  

select userid ,amount from buyTBl order by userID;  
select userid , sum(amount) from buyTBl group by userID;  --중복되는 내용의 개수를 합칠 때 사용함.
select userid as "사용자 아이디", sum(price*amount) as "총 구매액" from buyTBL group by userID; -- as를 사용하면 별칭으로 이름을 변경 가능하다
select avg(amount) as "평균 구매 개수" from buyTBL;  --평균 avg()
select cast(avg(amount) as number(5,3)) as "평균 구매 개수" from buyTBL;   --cast를 사용하면 소수점을 조절할 수 있다.
select userID, cast(avg(amount) as number(5,3)) as "평균 구매 개수" from buyTBL group by userID;  --사용자 별 물건 구매 평균을 알려줌
select userName, max(height), min(height) from userTBL group by userName; 
select userName, height from userTBL where height = (select max(height) from userTBL) or height = (select min(height) from userTBL); --가장크거나 작은 회원과 키

select count(*) from userTBL; -- 전체 사용자
select count(mobile1) as "휴대폰이 있는 사용자" from userTBL; -- 휴대폰이 있는 사용자

select userID as "사용자", sum(price*amount) as "총 구매액" from buyTBL having sum(price*amount) > 1000 group by userID; --having은 where과 비슷한데 집계용도로 사용(순서중요함)
select userID as "사용자", sum(price*amount) as "총 구매액" from buyTBL group by userID having sum(price*amount) > 1000 order by sum(price*amount); 

select idNum, groupName, sum(price*amount) as "비용" from buyTBL group by rollup(groupName, idNum);  -- rollup 중간 합계를 하고 싶을 때 사용함.
select groupName, sum(price*amount) as "비용", grouping_id(groupName) as "추가행 여부" from buyTBl group by rollup(groupName); -- grouping id데이터 합계를 알 수 있음.

create table cubeTBL(prodName nchar(3), color nchar(2), amount int);

insert into cubeTBL values('컴퓨터', '검정', 11);
insert into cubeTBL values('컴퓨터', '파랑', 22);
insert into cubeTBL values('모니터', '검정', 33);
insert into cubeTBL values('모니터', '파랑', 44);
select prodName, color, sum(amount) as "수량합계" from cubeTBL group by cube(color, prodName) order by prodName, color;

create table testTBL1 (id number(4), userName nchar(3), age number(2));
insert into testTBl1 values (1, '홍길동', 25);
insert into testTBL1(id, userName) values (2, '설현');
insert into testTBL1(userName, age, id) values ('지민', 26, 3); --많이 쓰이지는 않는 방법

create table testTBL2(id number(4), userName nchar(3), age number(2), nation nchar(4) default '대한민국');
drop SEQUENCE idseq;
create sequence idseq start with 1 INCREMENT by 1;
insert into testTBL2 values (idseq.nextval, '유나', 25, default);
insert into testTBL2 values (idseq.nextval, '혜정', 24, '영국');
select * from testTBL2;

insert into testTBL2 values (11, '쯔위', 18, '대만'); --순서대로 하기싫으면 시퀀스의 원하는 값을 입력하면 그대로 들어감
alter sequence idseq increment by 10;  --증가값 다시 설정 (2까지 입력되어있으니까 2+10 으로 12가 다음값으로 적용됨!)
insert into testTBL2 values (idseq.nextval, '미나', 21, '일본');
alter sequence idseq increment by 1; --증가값 1로 변경 (이후는 13부터 들어가게 됨)
select * from testTBL2;

select idseq.currval from dual; -- 시퀀스의 현재 값을 확인 시켜줌!
select * from user_sequences; -- 사용하고 있는 시퀀스 출력

create table testTBL3 (id number(3));
create sequence cycleseq start with 100 increment by 100 minvalue 100 maxvalue 300 cycle nocache;  --100~300 반복, 캐시사용 x!
insert into testTBL3 values (cycleseq.nextval);
insert into testTBL3 values (cycleseq.nextval);
insert into testTBL3 values (cycleseq.nextval);
insert into testTBL3 values (cycleseq.nextval);
select * from testTBL3;  --최대값을 넘어가면 다시 100으로 돌아감!! 

create table testTBL4 (empID number(6), FirstName varchar2(20), LastName varchar2(25), Phone varchar2(20));
insert into testTBL4 select employee_id, first_name, last_name, phone_number from hr.employees;  -- 다른 테이블의 데이터를 가져와서 대량 입력을 할 수도 있다!

create table testTBL5 as (select employee_id, first_name, last_name, phone_number from hr.employees); --테이블 정의도 생략이 가능하다.
select count(*) from testTBL5;

select * from testTBL4 where firstName= 'David';
update testTBL4 set phone = '없음' where firstname = 'David';

delete from testTBL4 where firstname = 'Peter';
select from testTBL4 where firstname = 'Peter';
rollback;


create table bigTBL1 as select level as bigID, round(dbms_random.value(1, 500000),0) as numDate from dual connect by level <= 500000;
delete from bigTBL1; --13초
drop table bigTBL2; --0.5초
truncate table bigTBL3; --0.19초 truncate와 delete는 비슷한 효과를 가짐 (테이블 구조를 남기고 싶으면 truncate를 사용하면 된다!!)
