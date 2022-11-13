use test;

select * from Test1;
select * from Test2;

Select * from Test1
Inner join Test2
ON Test1.idtest1 = Test2.idtest2;

select * from Test1
Left join Test2
On Test1.idtest1 = Test2.idtest2;

select * from Test2
Left join Test1
On Test1.idtest1 = Test2.idtest2;

select * from Test2
Right join Test1
On Test1.idtest1 = Test2.idtest2;

select * from Test2
Cross join Test1;

select * from Test1,Test2;

select idtest1 from Test1
Union 
select idtest2 from Test2;

select idtest1,nametest1 from Test1
Union
select idtest2,nametest2 from Test2;

select * from test1
where idtest1 > any
(select idtest1 from test1 where idtest1>3);