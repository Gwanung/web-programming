create or replace view v_usertbl
as
    select U.userid, U.username, B.prodname, U.addr, U.mobile1 || U.mobile2 as mobile
        from usertbl U
            inner join buyTBL B
            on U.userId = B.userid;
            
select "USER ID", "USER NAME" from v_usertbl;            

select * from user_views;  --뷰 확인
drop view v_usertbl; -- 뷰 삭제

create or replace view v_usertbl
as
    select userid, username, addr from usertbl
    with read only;   
    
update v_usertbl set addr = '부산' where userid = 'JKW';

insert into v_usertbl (userid, username, addr) values('KBM', '김병만', '충북');


create or replace view v_sum
as 
    select userid, sum(price*amount) as "Total"
        from buytbl group by userid;
    
select * from v_sum;        

create or replace view v_height177
as
    select * from usertbl where height >= 177
    with check option;

select * from v_height177;    

delete from v_height177 where height < 177;

insert into v_height177 values('KBM', '김병만', 1977, '경기', '010', '5555555', 158, '2019-01-01');
insert into v_height177 values('WDT', '서장훈', 2006, '서울', '010', '3333333', 155, '2019-3-3');

select * from usertbl;

select * from v_usertbl;

--두 개 이상의 테이블이 조인된 뷰는 업데이트가 불가능하다.
insert into v_usertbl values('PKL', '박경리', '운동화', '경기', '00000000000'); 

drop table usertbl cascade constraints;
--참조하는 테이블이 없기 때문에 조회할 수 없다고 나옴.
select * from v_usertbl;

