select * from userTBL;

select * from userTBL where userName = '김범수';

select userID, userName from userTBL where birthYear >= 1970 and height >=182;

select * from userTBL where birthYear >= 1970 or height >=182;  --where 뒤에 조건문 사용 가능!

select userName ,height from userTBL where height between 180 and 183;

select userName, addr from userTBL where addr = '경남' or addr = '전남' or addr = '경북';

select userName, addr from userTBL where addr in('경남', '경북', '전남');

select userName, height from userTBL where userName like '김%'; -- 김으로 시작하는 userName  ex) 김범수 , 김경호 