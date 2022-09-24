--set serveroutput on;
--
--declare 
--    myvar1 number(3); 
--    myvar2 number(5,2) :=3.14; 
--    myvar3 nvarchar2(20) := '이승기 키 --> ';
--begin 
--    myvar1 := 5; 
--    dbms_output.put_line(myvar1); 
--    dbms_output.put_line(myvar1+myvar2); 
--select height into myvar1 from usertbl where username = '이승기';
--    dbms_output.put_line(myvar3 || to_char(myvar1));   -- || 는 문자열을 이어서 적게 해줌 , to_char은 숫자형 -> 문자형 바꿔줌!
--end;

select avg(amount) as "평균 구매 개수" from buytbl;
select cast(avg(amount) as number(3)) as "평균 구매 개수" from buytbl;
select price*amount as "구매액" from buytbl;
select cast(price as char(5)) || 'X' || cast(amount as char(4)) || '=' as "단가x수량", price*amount as "구매액" from buytbl;

select cast('2020$12$12' as date) from dual;
select cast('2020/12/12' as date) from dual;
select cast('2020%12%12' as date) from dual;
select cast('2020@12@12' as date) from dual;

select to_char(12345, '$999,999') from dual;
select to_char(12345, '$000,999') from dual;
select to_char(12345, 'L999,999') from dual;
select to_char(sysdate, 'yyyy/mm/dd hh:mm:ss') from dual;

select to_char(10, 'x'), to_char(255,'xx') from dual;
select to_number('a','x'), to_number('ff','xx') from dual;
select to_number('0123'), to_number('1234.456') from dual;  -- to_number -> 10진수 문자를 숫자로 변환하는 용도로 주로 사용함!

select '100' + '200' from dual; --문자와 문자를 정수로 변환하여 연산 됨!!
select concat('100', '200') from dual; --문자를 연결하여줌! 연산x
select 100 || '200' from dual; -- 정수와 문자일 경우에는 정수가 문자로 변환되어 적용됨!
select price from buytbl where price >= '500'; -- 문자열이 정수 500으로 변환하여 적용!

select ascii('a'), chr(65), asciistr('한'), unistr('\d55c') from dual; 
select length('한글'), length('AB'), lengthb('한글'), lengthb('AB') from dual; --length byte -> lengthb

select concat('이것이', 'Oracle이다'), '이것이' || ' ' || 'Oracle이다' from dual;

select instr('이것이 Oracle이다. 이것도 오라클이다', '이것') from dual;
select instr('이것이 Oracle이다. 이것도 오라클이다', '이것', 2) from dual;
select instrb('이것이 Oracle이다. 이것도 오라클이다', '이것', 2) from dual;

select lower('abcdEFGH'), upper('abcdEFGH'), initcap('this is oracle') from dual; --initcap 은 첫 글자를 대문자로 변환

select replace ('이것이 Oracle 이다', '이것이', 'This is') from dual; -- 이것이-> This is 로 변환
select translate('이것이 Oracle 이다', '이것', 'AB') from dual; -- 한 글자씩 바꿔줌 이= A, 것 =B 로 변환!

select substr('대한민국만세', 3, 2) from dual; --(문자열, 시작위치, 길이)
select reverse('Oracle') from dual;

select lpad('이것이', 10, '##'), rpad('이것이', 10, '##') from dual; --left, right (빈곳을 문자열로 채움)
select ltrim('  이것이'), rtrim('이것이$$$', '$') from dual;  -- 제거할 내용을 제거함
select trim('   이것이    '), trim(both 'ㅋ' from 'ㅋㅋㅋ재밌어요.ㅋㅋㅋ') from dual; --양쪽방향 제거

select regexp_count('이것이 오라클이다.', '이') from dual; --해당 문자의 개수를 반환

select abs(-100) from dual;
select ceil(4.7), floor(4.7), round(4.7) from dual; --올림, 내림 , 반올림
select mod(157, 10) from dual; --나머지
select power(2,3), sqrt(9) from dual;  --제곱, 제곱근
select sign(100), sign(0), sign(-100.123) from dual;  -- 양수1 , 0, 음수 -1
select trunc(12345.12345, 2), trunc(12345.12345, -2) from dual; --소수점 기준으로 양수면 왼쪽, 음수면 오른쪽 이동 만큼 구하고 나머지는 버림! 

select add_months('2020-01-01', 5), add_months(sysdate, -5) from dual; --날짜를 더하거나 뺀 결과 값을 구할 때 사용
select to_date('2020-01-01') + 5, sysdate - 5 from dual;

select extract(year from date '2020-12-25'), extract(day from sysdate) from dual;  --날짜 안에서 원하는 값을 반환 할 때 사용함!
select last_day('2020-02-01') from dual; --해당 달이 얼마나 있는지 확인할 때 사용함
select next_day('2020-02-01', '월요일'), next_day(sysdate, '일요일') from dual;  --지정한 날 이후에 해당 요일과 가장 가까운 날을 반환해줌. 
select months_between (sysdate, '1988-09-17') from dual; -- 해당 날자에서 몇개월이 지났는지 반환

select bin_to_num(1,0), bin_to_num(1,1,1,1) from dual;  --2진수(10과 1111)을 10진수로 변환 2,15 !
select numtodsinterval(48, 'HOUR'), numtodsinterval(360000, 'SECOND') from dual; 
select numtoyminterval(37, 'MONTH'), numtoyminterval(1.5, 'YEAR') from dual;

--순위 함수!!!

select row_number() over(order by height desc) "키큰순위", username, addr, height from usertbl;  --row_number() 순위 함수
select row_number() over(order by height desc, username asc) "키큰순위", username, addr, height from usertbl;

select addr, row_number() over(partition by addr order by height desc, username asc) "지역별키큰순위", username, height from usertbl; --지역에 따라 나눠줌 partition by를 사용하면 분류를 보다 자세하게 할 수 있음!

select dense_rank() over(order by height desc) "키큰순위", username, addr, height from usertbl;  --동일한 등수 처리를 할 때 dense_rank()를 사용 
select rank() over(order by height desc) "키큰순위", username, addr, height from usertbl;  --rank()는 동일한 등수를 제외 후 그만큼 숫자를 제외한 후 순위표현 

select ntile(2) over(order by height desc) "반번호", username, addr, height from usertbl; --ntile()은 그룹을 분할하고 싶을 때 사용한다. ex)ntile(2)-> 2개로 분할 
select ntile(4) over(order by height desc) "반번호", username, addr, height from usertbl; --만약 딱 떨어지지 않는경우에는 남는 인원을 동일하게 앞 그룹부터 하나 씩 배정한다. 

--분석 함수!!! (이동 평균, 백분율, 누계 등에 사용)

select username, addr, height as "키", height - (lead(height, 1, 0) over (order by height desc)) as "다음 사람과 키 차이" from usertbl;
--lead()는 다른 내용과의 차이를 알고싶을 때 사용한다.

select addr, username, height as "키", height - (first_value(height) over (partition by addr order by height desc)) as "지역별 최대키와 차이" from usertbl;
--first_value()는 가장 값이 큰 정보와의 차이를 알고싶을 때 사용한다. 여기서는 지역별로 묶어서 큰 키와의 차이를 나타냄!

select addr, username, height as "키", (cume_dist() over (partition by addr order by height desc)) * 100 as "누적인원백분율%" from usertbl;
--cume_dist()는 백분율을 구할 때 사용한다. 

select distinct addr, percentile_cont(0.5) within group (order by height)over (partition by addr) as "지역별 키의 중앙값" from usertbl;
--percentile_cont()는 0~1사이의 백분율 값이 올 수 있는데 0.5는 중앙값에 해당한다. within group은 정렬할 열을 의미

--피벗 (한 열에 포함된 여러 값을 출력하고, 집계까지 수행함) -> 세로행을 가로열로 표현하여 가독성을 높인다!

create table pivotTest ( uname nchar(3), season nchar(2), amount number(3));


insert into pivotTest values ('김범수', '겨울',  10);
insert into pivotTest values ('윤종신', '여름',  15);
insert into pivotTest values ('김범수', '가을',  25);
insert into pivotTest values ('김범수',  '봄',   3);
insert into pivotTest values ('김범수',  '봄',  37);
insert into pivotTest values ('윤종신', '겨울',  40);
insert into pivotTest values ('김범수', '여름',  14);
insert into pivotTest values ('김범수', '겨울',  22);
insert into pivotTest values ('윤종신', '여름',  64);

select * from pivotTest pivot (sum(amount) for season in ('봄', '여름', '가을', '겨울'));  --한눈에 테이블의 내용을 파악할 수 있는 장점이 있다.


--join (조인) 이란 두 개 이상의 테이블이 서로 관계되어 있을 때 서로 묶어서 하나의 결과 집합으로 만들어 내는 것을 의미한다!


--inner join ( 가장 많이 사용되는 조인 )

select * from buytbl inner join usertbl on buytbl.userid = usertbl.userid where buytbl.userid = 'JYP';

-- userid에서 JYP값을 추출하여서 buytbl의 userid에 JYP가 있으면 두 테이블의 행을 결합한다.

select buytbl.userid, usertbl.username, buytbl.prodname, usertbl.addr, usertbl.mobile1 || usertbl.mobile2 as "연락처" from buytbl 
    inner join usertbl on buytbl.userid = usertbl.userid where buytbl.userid = 'JYP';

-- 이렇게 할 경우 매우 길어지는데, 별칭을 통해서 간결하게 작성할 수 있다. from 의 테이블값 뒤에 별칭을 적어주면됨!

select B.userid, U.userid, B.prodname, U.addr, U.mobile1 || U.mobile2 as "연락처" from buytbl B inner join usertbl U on B.userid = U.userid;
