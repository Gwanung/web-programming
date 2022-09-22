SELECT * FROM memberTBL;

--insert into memberTBL values('Figure', '연아', '경기도 군포시 당정동');

--update memberTBL set memberaddress = '서울 강남구 역삼동' where memberName = '연아';

--delete from membertbl where memberName = '연아';


create table deletedMemberTBL(
    memberID char(8),
    memberNAME nchar(5),
    memberADDRESS nvarchar2(20),
    deletedDate date
    
);


create trigger trg_deletedmemberTBL
    after delete
    on memberTBL
    for each row
    
begin 
    insert into deletedMemberTBL values(:old.memberID, :old.memberNAME, :old.memberADDRESS, sysdate());

end;

delete from memberTBL where memberNAME = '당탕이';

select * from memberTBL;

select * from deletedMemberTBL;