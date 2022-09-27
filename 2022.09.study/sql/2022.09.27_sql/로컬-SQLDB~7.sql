select distinct U.userid, U.username , U.addr
    from usertbl U
    inner join buytbl B
    on B.userid = U.userid;
    
    
-- 3개 이상의 table join

create table stdtbl(

    stdname nchar(5) not null primary key,
    addr nchar(2) not null);

create table clubtbl(
    
    clubname nchar(5) not null primary key,
    roomno nchar(4) not null);
    
drop sequence stdclubseq;
create sequence stdclubseq;

create table stdclubtbl(

    idnum number(5) not null primary key,
    stdname nchar(5) not null,
    clubname nchar(5) not null,
foreign key(stdname) references stdtbl(stdname),
foreign key(clubname) references clubtbl(clubname));

insert into stdtbl values('김범수', '경남');
insert into stdtbl values('성시경', '서울');
insert into stdtbl values('조용필', '경기');
insert into stdtbl values('은지원', '경북');
insert into stdtbl values('바비킴', '서울');

insert into clubtbl values('수영', '101호');
insert into clubtbl values('바둑', '102호');
insert into clubtbl values('축구', '103호');
insert into clubtbl values('봉사', '104호');

insert into stdclubtbl values(stdclubseq.nextval,'김범수', '바둑');
insert into stdclubtbl values(stdclubseq.nextval,'김범수', '축구');
insert into stdclubtbl values(stdclubseq.nextval,'조용필', '축구');
insert into stdclubtbl values(stdclubseq.nextval,'은지원', '축구');
insert into stdclubtbl values(stdclubseq.nextval,'은지원', '봉사');
insert into stdclubtbl values(stdclubseq.nextval,'바비킴', '봉사');

drop table stdclubtbl;

select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;

select S.stdname, S.addr, C.clubname, C.roomno 
from stdtbl S
inner join stdclubtbl SC on S.stdname = SC.stdname
inner join clubtbl C on SC.clubname = C.clubname
order by S.stdname;

select C.clubname, C.roomno, S.stdname, S.addr
from stdtbl S
inner join stdclubtbl SC on SC.stdname = S.stdname
inner join clubtbl C on SC.clubname = C.clubname
order by C.clubname;

--outer join은 조인의 조건에 만족되지 않는 행 까지도 포함 시키는 것
--left outer join은 왼쪽 테이블(usertbl)은 모두 출력되어야 한다 라고 생각하면 좋음  left join으로도 가능 (outer생략 가능)

select U.userid, U.username, B.prodname, U.addr, U.mobile1 || U.mobile2 as "연락처" from usertbl U
left outer join buytbl B on U.userid = B.userid
order by U.userid;

--위의 table형태와 같은 내용 -> right 사용하려면 table 위치만 바꿔주면 됨 from, join부분 

select U.userid, U.username, B.prodname, U.addr, U.mobile1 || U.mobile2 as "연락처" from buytbl B
right outer join usertbl U on U.userid = B.userid
order by U.userid;


--prodname 이 null인 경우의 회원 명단 출력 table
select U.userId, U.username, B.prodname, U.addr, U.mobile1 || U.mobile2 as "연락처" from usertbl U
left join buytbl B on U.userid = B.userid
where B.prodname is null 
order by U.userid;


--동아리에 가입되지 않은 학생도 포함하여 출력  inner join -> left outer join으로 변경 (4 성시경이 추가 된 것을 볼 수 있음)
select S.stdname, S.addr, C.clubname, C.roomno
from stdtbl S
left outer join stdclubtbl SC on S.stdname = SC.stdname
left outer join clubtbl C on SC.clubname = C.clubname
order by S.stdname;

--동아리를 기준으로 가입학생이 하나도 없는 동아리도 출력 (수영 추가)
select C.clubname, C.roomno, S.stdname, S.addr from stdtbl S
left outer join stdclubtbl SC on SC.stdname = S.stdname
right outer join clubtbl C on SC.clubname =  C.clubname
order by C.clubname;


select C.clubname, C.roomno, S.stdname, S.addr from stdtbl S
left outer join stdclubtbl SC on SC.stdname = S.stdname
right outer join clubtbl C on SC.clubname =  C.clubname

union
select C.clubname, C.roomno, S.stdname, S.addr from stdtbl S
left outer join stdclubtbl SC on SC.stdname = S.stdname
right outer join clubtbl C on SC.clubname =  C.clubname;


--Cross join (상호 조인) 한쪽 테이블의 모든 행과 다른쪽 테이블의 모든 행을 조인시키는 기능
--self join(자체 조인) 자기자신과 조인하기때문에 1개의 테이블만 필요함. inner join을 사용함. | 같은 데이터가 존재하지만 의미는 다르게 존재할 때 사용함. 


create table emptbl(emp nchar(3), manager nchar(3), emptel varchar2(8));

insert into emptbl values ('나사장', null, '0000');
insert into emptbl values ('김재무', '나사장', '2222');
insert into emptbl values ('김부장', '김재무', '2222-1');
insert into emptbl values ('이부장', '김재무', '2222-2');
insert into emptbl values ('우대리', '이부장', '2222-2-1');
insert into emptbl values ('지사원', '이부장', '2222-2-2');
insert into emptbl values ('이영업', '나사장', '1111');
insert into emptbl values ('한과장', '이영업', '1111-1');
insert into emptbl values ('최정보', '나사장', '3333');
insert into emptbl values ('윤차장', '최정보', '3333-1');
insert into emptbl values ('이주임', '윤차장', '3333-1-1');

select * from emptbl;

select A.emp as "부하직원", B.emp as "직속상관", B.emptel as "전화번호" from emptbl A
inner join emptbl B on A.manager = B.emp
where A.emp = '우대리';


--union all을 사용하면 중복된 열 까지 모두 출력이 됨 (union 만 사용하면 중복된 열은 제거!)
select stdname ,addr from stdtbl
union all
select clubname, roomno from clubtbl;

--not in 두 번째 쿼리에 해당하는 것을 제외하기 위한 구문이다. 여기서는 전화번호가 없는 사람을 제거 하였다. (mobile1 is null)
select username, concat(mobile1, mobile2) as "전화번호" from usertbl
where username not in (select username from usertbl where mobile1 is null);

