---- User
<<<<<<< HEAD

insert into user(user_id,age,email,name,role,password) values(100001,25,'amitemail@gmail.com','Amit','Admin','12345');
insert into user(user_id,age,email,name,role,password) values(100002,25,'ajeetemail@gmail.com','Ajeet','User','12345');
insert into user(user_id,age,email,name,role,password) values(100003,26,'rakeshemail@gmail.com','Rakesh','User','12345');
insert into user(user_id,age,email,name,role,password) values(100004,27,'murariemail@gmail.com','Murari','User','12345');
insert into user(user_id,age,email,name,role,password) values(100005,25,'shivamemail@gmail.com','Shivam','User','12345');
insert into user(user_id,age,email,name,role,password) values(100006,25,'abhishekemail@gmail.com','Abhishek','User','12345');
insert into user(user_id,age,email,name,role,password) values(100007,26,'mataemail@gmail.com','Mata','User','12345');
insert into user(user_id,age,email,name,role,password) values(100008,25,'umaemail@gmail.com','Uma','User','12345');
insert into user(user_id,age,email,name,role,password) values(100009,25,'aarzooemail@gmail.com','Aarzoo','User','12345');
insert into user(user_id,age,email,name,role,password) values(100010,23,'rashiemail@gmail.com','Rashi','User','12345');

--
---- Movie
insert into Movie(movie_id,name,country,rating) values(200001,'Drishyam','India',4.7);
insert into Movie(movie_id,name,country,rating) values(200002,'PK','India',4.1);
insert into Movie(movie_id,name,country,rating) values(200003,'Pink','India',3.7);
insert into Movie(movie_id,name,country,rating) values(200004,'Court','India',4.7);
insert into Movie(movie_id,name,country,rating) values(200005,'Inception','US',4.7);
insert into Movie(movie_id,name,country,rating) values(200006,'Shutter Island','US',4.7);
insert into Movie(movie_id,name,country,rating) values(200007,'Newton','India',4.9);
insert into Movie(movie_id,name,country,rating) values(200008,'Avengers','US',3.9);
insert into Movie(movie_id,name,country,rating) values(200009,'October','India',3.6);
insert into Movie(movie_id,name,country,rating) values(200010,'3Idiots','India',4.8);
=======
--
insert into user(user_id,age,email,name,role,password) values(100001,25,'amitemail@gmail.com','Amit','Admin','1234');
insert into user(user_id,age,email,name,role,password) values(100002,25,'ajeetemail@gmail.com','Ajeet','User','1234');
insert into user(user_id,age,email,name,role,password) values(100003,26,'rakeshemail@gmail.com','Rakesh','User','1234');
insert into user(user_id,age,email,name,role,password) values(100004,27,'murariemail@gmail.com','Murari','User','1234');
insert into user(user_id,age,email,name,role,password) values(100005,25,'shivamemail@gmail.com','Shivam','User','1234');
insert into user(user_id,age,email,name,role,password) values(100006,25,'abhishekemail@gmail.com','Abhishek','User','1234');
insert into user(user_id,age,email,name,role,password) values(100007,26,'mataemail@gmail.com','Mata','User','1234');
insert into user(user_id,age,email,name,role,password) values(100008,25,'umaemail@gmail.com','Uma','User','1234');
insert into user(user_id,age,email,name,role,password) values(100009,25,'aarzooemail@gmail.com','Aarzoo','User','1234');
insert into user(user_id,age,email,name,role,password) values(100010,23,'rashiemail@gmail.com','Rashi','User','1234');
--
--
---- Movie
insert into movie(movie_id,name,country,rating) values(200001,'Drishyam','India',4.7);
insert into movie(movie_id,name,country,rating) values(200002,'PK','India',4.1);
insert into movie(movie_id,name,country,rating) values(200003,'Pink','India',3.7);
insert into movie(movie_id,name,country,rating) values(200004,'Court','India',4.7);
insert into movie(movie_id,name,country,rating) values(200005,'Inception','US',4.7);
insert into movie(movie_id,name,country,rating) values(200006,'Shutter Island','US',4.7);
insert into movie(movie_id,name,country,rating) values(200007,'Newton','India',4.9);
insert into movie(movie_id,name,country,rating) values(200008,'Avengers','US',3.9);
insert into movie(movie_id,name,country,rating) values(200009,'October','India',3.6);
insert into movie(movie_id,name,country,rating) values(200010,'3Idiots','India',4.8);
>>>>>>> fix/redefine-db

--Address
insert into address(address_id,city,state,country,pin) values(300001,'Azamgarh','Uttar Pradesh','India',276001);
insert into address(address_id,city,state,country,pin) values(300002,'Mau','Uttar Pradesh','India',275101);
<<<<<<< HEAD
insert into address(address_id,city,state,country,pin) values(300003,'Ballia','Uttar Pradesh','India',226001);
insert into address(address_id,city,state,country,pin) values(300004,'Varanasi','Uttar Pradesh','India',256501);

--Cinema
insert into cinema(cinema_id,name,address_address_id) values(400001,'Sharda Talkies',300001);
insert into cinema(cinema_id,name,address_address_id) values(400002,'Vishal Talkies',300001);
insert into cinema(cinema_id,name,address_address_id) values(400003,'Murli Talkies',300001);
insert into cinema(cinema_id,name,address_address_id) values(400004,'Durga Talkies',300001);

--Audi
insert into audi(audi_id,name,cinema_cinema_id) values(500001,'Screen 1',400001);
insert into audi(audi_id,name,cinema_cinema_id) values(500002,'Screen 2',400001);
=======

--Cinema
insert into cinema(cinema_id,name,address_address_id) values(400001,'Murli Talkies',300001);
insert into cinema(cinema_id,name,address_address_id) values(400002,'Sharda Talkies',300001);
insert into cinema(cinema_id,name,address_address_id) values(400003,'Durga Talkies',300001);
insert into cinema(cinema_id,name,address_address_id) values(400004,'Vishal Talkies',300001);

insert into cinema(cinema_id,name,address_address_id) values(400005,'Sangeet Palace',300002);
insert into cinema(cinema_id,name,address_address_id) values(400006,'Krishna Palace',300002);
insert into cinema(cinema_id,name,address_address_id) values(400007,'Tondon Palace',300002);
insert into cinema(cinema_id,name,address_address_id) values(400008,'Shree Palace',300002);

--Audi
insert into audi(audi_id,name,cinema_cinema_id) values(500001,'Screen 1',400001);
insert into audi(audi_id,name,cinema_cinema_id) values(500002,'Screen 2',400001);
insert into audi(audi_id,name,cinema_cinema_id) values(500003,'Screen 3',400001);

insert into audi(audi_id,name,cinema_cinema_id) values(500004,'Audi 1',400002);
insert into audi(audi_id,name,cinema_cinema_id) values(500005,'Audi 2',400002);
insert into audi(audi_id,name,cinema_cinema_id) values(500006,'Audi 3',400002);

insert into audi(audi_id,name,cinema_cinema_id) values(500007,'Platinum',400003);
insert into audi(audi_id,name,cinema_cinema_id) values(500008,'Gold',400003);
insert into audi(audi_id,name,cinema_cinema_id) values(500009,'Silver',400003);

--Slot
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600001,400001,500001,200001, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('09:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600002,400001,500001,200002, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('12:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600003,400001,500001,200003, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('15:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600004,400001,500001,200004, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('18:30:00', 'hh:mm:ss') ) ;

insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600005,400001,500002,200001, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('09:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600006,400001,500002,200002, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('12:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600007,400001,500002,200003, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('15:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600008,400001,500002,200004, parsedatetime('17-09-2012', 'dd-MM-yyyy'), parsedatetime('18:30:00', 'hh:mm:ss') ) ;

insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600009,400001,500001,200001, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('09:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600010,400001,500001,200002, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('12:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600011,400001,500001,200003, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('15:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600012,400001,500001,200004, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('18:30:00', 'hh:mm:ss') ) ;

insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600013,400001,500002,200001, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('09:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600014,400001,500002,200002, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('12:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600015,400001,500002,200003, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('15:30:00', 'hh:mm:ss') ) ;
insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600016,400001,500002,200004, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('18:30:00', 'hh:mm:ss') ) ;

insert into slot(slot_id,cinema_cinema_id,audi_audi_id,movie_movie_id,slot_date,slot_time) values(600017,400001,500002,200004, parsedatetime('18-09-2012', 'dd-MM-yyyy'), parsedatetime('18:30:00', 'hh:mm:ss') ) ;
>>>>>>> fix/redefine-db
