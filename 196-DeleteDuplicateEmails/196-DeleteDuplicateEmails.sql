-- Last updated: 7/9/2026, 9:50:05 AM
delete from person
where id not in(
select id from (select min(id) as id from person
group by email) as a);