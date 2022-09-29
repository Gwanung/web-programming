-- not in은 첫 번째 쿼리 결과 중에서 두 번째 쿼리에 해당하는 것을 제외하기 위한 구문, in은 두 번째 쿼리에 해당하는 것만 조회하기 위한 구문!


select username, concat(mobile1, mobile2) as "전화번호" from usertbl
where username not in(select username from usertbl where mobile1 is null);

select username, concat(mobile1, mobile2) as "전화번호" from usertbl
where username in(select username from usertbl where mobile1 is null);



set serveroutput on;
-- 변수에 값을 대입할 때는 := 로 해줘야한다, =는 같다는 비교의 의미!! 
declare var1 number(5);
begin var1 :=100;
if var1 = 100 then
    dbms_output.put_line('100입니다');
else
    dbms_output.put_line('100이 아닙니다');
end if;
end;

declare
    hiredate date;
    curdate date;
    wdays number(5);
begin 
    select hire_date into hiredate
    from hr.employees
    where employee_id = 200;
    curdate := current_date();  --현재 날짜
    wdays := curdate - hiredate; --날짜 차이
    if(wdays/365) >= 5 then
        dbms_output.put_line('입사한지' || wdays || '일이나 지났습니다. 축하합니다!');
    else
        dbms_output.put_line('입사한지' || wdays || '일밖에 안되었네요. 열심히 일하세요.');
    end if;
end;    

--if문 else if -> elsif 로 사용

declare 
    pnumber number(3);
    credit char(1);
begin
    pnumber :=77;
    if pnumber >= 90 then
        credit := 'A';
    elsif pnumber >= 80 then
        credit := 'B';
    elsif pnumber >= 70 then
        credit := 'C';
    elsif pnumber >= 60 then
        credit := 'D';    
    else
        credit := 'F';
    end if;
    dbms_output.put_line('취득점수==>' || pnumber || ', 학점==>' || credit);
end;    

declare
    pnumber number(3);
    credit char(1);
begin 
    pnumber := 77;
    case
        when pnumber >= 90 then
            credit := 'A';
        when pnumber >= 80 then
            credit := 'B';        
        when pnumber >= 70 then
            credit := 'C';
        when pnumber >= 60 then
            credit := 'D';
            else
                pnumber := 'F';
        end case;
        dbms_output.put_line('취득점수==>' || pnumber || ', 학점 ==>' || credit);
end;        


select U.userid, U.username, sum(price*amount) as "총구매액"
from buytbl B
right outer join usertbl U on B.userid = U.userid
group by U.userid, U.username
order by sum(price*amount) desc nulls last;


select U.userid, U.username, sum(price*amount) as "총구매액",
    case
        when (sum(price*amount) >= 1500) then '최우수고객'
        when (sum(price*amount) >= 1000) then '우수고객'
        when (sum(price*amount) >= 1) then '일반고객'
        else '유령고객'
    end as "고객등급"    
from buytbl B
    right outer join usertbl U on B.userid = U.userid
    group by U.userid, U.username
    order by sum(price*amount) desc nulls last;
    
-- whlie 다른 언어 개념과 동일    

set serveroutput on;
declare
    inum number(3);
    hap number(5);
begin 
    inum := 1;
    hap := 0;
    while inum <= 100
    loop
        hap := hap +inum;
        inum := inum + 1;
    end loop;
    dbms_output.put_line(hap);
end;   

--for loop  for 변수 in 시작값 .. 끝값 으로 사용  위의 결괏값과 동일함.

declare 
    inum number(3);
    hap number(5);
begin 
    hap := 0;
    for inum in 1 .. 100
    loop
        hap := hap + inum;
    end loop;
    dbms_output.put_line(hap);
end;    

declare
    inum number(3);
    hap number(5);
begin 
    inum := 1;
    hap := 0;
    while inum <= 100
    loop
        if mod(inum, 7) = 0 then  --7의 배수를 제외 하기 위해서 mod, continue, exit 문을 사용함. 7로 나눈 나머지 값이 0이면 inum을 1증가 (7의 배수!)
            inum := inum + 1;
            continue;
        end if;
        hap := hap + inum;
        if hap > 1000 then
            exit;
        end if;
        inum := inum + 1;
    end loop;
    dbms_output.put_line(hap);
end;    

begin
    dbms_lock.sleep(5);  --코드 실행을 멈춘 후 진행(초 단위)
    dbms_output.put_line('5초간 멈춘후 진행되었음');
end;        

