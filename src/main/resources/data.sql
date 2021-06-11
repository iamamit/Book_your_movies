-- User

insert into user(user_id,age,email,name,role) values(1001,25,'amitemail@gmail.com','Amit','Admin');
insert into user(user_id,age,email,name,role) values(1002,25,'ajeetemail@gmail.com','Ajeet','User');
insert into user(user_id,age,email,name,role) values(1003,26,'rakeshemail@gmail.com','Rakesh','User');
insert into user(user_id,age,email,name,role) values(1004,27,'murariemail@gmail.com','Murari','User');
insert into user(user_id,age,email,name,role) values(1005,25,'shivamemail@gmail.com','Shivam','User');
insert into user(user_id,age,email,name,role) values(1006,25,'abhishekemail@gmail.com','Abhishek','User');
insert into user(user_id,age,email,name,role) values(1007,26,'mataemail@gmail.com','Mata','User');
insert into user(user_id,age,email,name,role) values(1008,25,'umaemail@gmail.com','Uma','User');
insert into user(user_id,age,email,name,role) values(1009,25,'aarzooemail@gmail.com','Aarzoo','User');
insert into user(user_id,age,email,name,role) values(1010,23,'rashiemail@gmail.com','Rashi','User');


-- Movie
insert into Movie(movie_id,name,country,rating) values(2001,'Drishyam','India',4.7);
insert into Movie(movie_id,name,country,rating) values(2002,'PK','India',4.1);
insert into Movie(movie_id,name,country,rating) values(2003,'Pink','India',3.7);
insert into Movie(movie_id,name,country,rating) values(2004,'Court','India',4.7);
insert into Movie(movie_id,name,country,rating) values(2005,'Inception','US',4.7);
insert into Movie(movie_id,name,country,rating) values(2006,'Shutter Island','US',4.7);
insert into Movie(movie_id,name,country,rating) values(2007,'Newton','India',4.9);
insert into Movie(movie_id,name,country,rating) values(2008,'Avengers','US',3.9);
insert into Movie(movie_id,name,country,rating) values(2009,'October','India',3.6);
insert into Movie(movie_id,name,country,rating) values(2010,'3Idiots','India',4.8);

-- City

insert into city(city_id,name,state,country,pin) values(3001,'Pune','Maharashtra','India',411057);
insert into city(city_id,name,state,country,pin) values(3002,'Mumbai','Maharashtra','India',400004);
insert into city(city_id,name,state,country,pin) values(3003,'Nashik','Maharashtra','India',420005);
insert into city(city_id,name,state,country,pin) values(3004,'Azamgarh','Uttar Pradesh','India',276001);
insert into city(city_id,name,state,country,pin) values(3005,'Mau','Uttar Pradesh','India',275101);
insert into city(city_id,name,state,country,pin) values(3006,'Ballia','Uttar Pradesh','India',277001);
insert into city(city_id,name,state,country,pin) values(3007,'Agra','Uttar Pradesh','India',223007);
insert into city(city_id,name,state,country,pin) values(3008,'Ahamedabad','Gujarat','India',320008);
insert into city(city_id,name,state,country,pin) values(3009,'Rajkot','Gujarat','India',360001);
insert into city(city_id,name,state,country,pin) values(3010,'Vadodara','Gujarat','India',300018);
insert into city(city_id,name,state,country,pin) values(3011,'Jaipur','Rajasthan','India',302001);
insert into city(city_id,name,state,country,pin) values(3012,'Kota','Rajasthan','India',323021);
insert into city(city_id,name,state,country,pin) values(3013,'Jaisalmer','Rajasthan','India',345001);
insert into city(city_id,name,state,country,pin) values(3014,'Udaipur','Rajasthan','India',313001);

-- Cinema

insert into cinema(cinema_id,name,city_city_id) values(4001,'Spice Cinema',3004);
insert into cinema(cinema_id,name,city_city_id) values(4002,'PVR',3001);
insert into cinema(cinema_id,name,city_city_id) values(4003,'iMAX',3001);
insert into cinema(cinema_id,name,city_city_id) values(4004,'Inox',3001);
insert into cinema(cinema_id,name,city_city_id) values(4005,'Wave',3002);
insert into cinema(cinema_id,name,city_city_id) values(4006,'Rave',3004);
insert into cinema(cinema_id,name,city_city_id) values(4007,'Mirrage',3004);
insert into cinema(cinema_id,name,city_city_id) values(4008,'Bombay Talkies',3002);
insert into cinema(cinema_id,name,city_city_id) values(4009,'Xion',3001);
insert into cinema(cinema_id,name,city_city_id) values(4010,'Murli Cinema',3004);
insert into cinema(cinema_id,name,city_city_id) values(4011,'Gujrat Talkis',3008);
insert into cinema(cinema_id,name,city_city_id) values(4012,'Big Screen',3008);
insert into cinema(cinema_id,name,city_city_id) values(4013,'Rahul 70mm',3001);
insert into cinema(cinema_id,name,city_city_id) values(4014,'Sharda',3004);
insert into cinema(cinema_id,name,city_city_id) values(4015,'Wanderer',3002);