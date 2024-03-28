insert into character (nickname, level) Values ('Meraxes', 200);
insert into character (nickname, level) Values ('Hehrys', 200);
insert into character (nickname, level) Values ('Merax-elio', 200);
insert into character (nickname, level) Values ('Merax-steam', 200);

insert into caracteristic(label, type, element) Values('Intelligence', 'damage', 'intelligence');
insert into caracteristic(label, type, element) values('Force', 'damage', 'strength');
insert into caracteristic(label, type, element) values('Eau', 'damage', 'water');
insert into caracteristic(label, type, element) values('Air', 'damage', 'air');

insert into character_caracteristic (character_id, caracteristic_id, quantity) values(1, 1, 200);
insert into character_caracteristic (character_id, caracteristic_id, quantity) values(1, 2, 200);
insert into character_caracteristic (character_id, caracteristic_id, quantity) values(1, 3, 200);
insert into character_caracteristic (character_id, caracteristic_id, quantity) values(1, 4, 200);

insert into gear(label) values('Voile d''encre');
insert into gear(label) values('Cape de l''oeuil attentif');

insert into gear_caracteristic(gear_id, caracteristic_id, quantity) values(1, 1, 80);
insert into gear_caracteristic(gear_id, caracteristic_id, quantity) values(1, 2, 80);
insert into gear_caracteristic(gear_id, caracteristic_id, quantity) values(2, 3, 100);