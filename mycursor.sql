cursor c is
select id, name from customersakil where length(name)= 5 for update;
va customersakil.id%type;
vb customersakil.name%type;
begin
open c
loop
fetch c into va, vb;
exit when c%notfound;
update customersakil set a=va+va where current of c;
end loop
close c
end 
/
