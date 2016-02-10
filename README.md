Owner panph.
Repository zyme.

``` sql
drop table rty;

create table rty (
	id int primary key,
	v timestamp
);

insert into rty values (1, systimestamp);

insert into rty select id + (select max(id) from rty), systimestamp from rty;
```
