create table mycar(
    unq number primary key,
    car_name char(50) not null,
    car_color char(30),
    car_price number default 0
);

create SEQUENCE unq_seq;

insert into mycar values(unq_seq.nextval, '소나타', '흰색', 3000);
insert into mycar values(unq_seq.nextval, '그랜저', '검정색', 4500);
insert into mycar values(unq_seq.nextval, '아우디', Null, 7000);

select * from mycar where car_price between 2000 and 5000;
select * from mycar where car_color is null;

alter table mycar modify car_name char(100);

update mycar set car_color = 'blue' where car_name = '소나타';
update mycar set car_color = '파란색' where car_color is null;

select * from mycar;