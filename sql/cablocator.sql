
show databases;
drop database cablocator;
create database cablocator;

use cablocator;
drop table cabuser;
drop table userinfo;
show tables;
create table cabuser (id int , username varchar(50) , password varchar(50) , isActive bool not null default true);

create table userinfo (id int unsigned not null AUTO_INCREMENT,
                    email varchar(50) not null, phone varchar(50) not null ,
                    rig_date datetime  not null default CURRENT_TIMESTAMP, 
                    primary key(id) , role int default 1);

create table role (id int unsigned not null AUTO_INCREMENT , descitption varchar(50) , primary key(id));

create table cab_details (id int not null auto_increment , regsitraion_num varchar(50) not null , primary key(id));

create table cab_driver (id int not null auto_increment , driverId int , cabId int , primary key(id));

create table ride_status (id int not null auto_increment, description varchar(50), primary key(id));

create table ride_info (id int not null auto_increment , txn_id varchar(50) not null , rider_id  int , 
                        driver_id int, source varchar(50) , destination varchar(50), schedule_time datetime ,
                        start_time  datetime , end_time datetime ,status int , primary key(id));

show tables;

insert into userinfo (email , phone, rig_date)
            values ('test_4' , '9884085858', '2017-05-27'),
                    ('test_5' , '988025777','2017-05-27'),
                    ('test_6' , '988026777','2017-05-27');




insert into cabuser (id , username , password) select id , email , phone from userinfo  ;

insert into cabuser (id , username , password) 
        select userinfo.id id , userinfo.email email , userinfo.phone   phone from userinfo 
            left join cabuser on cabuser.username = userinfo.email where cabuser.id is null;

insert into userinfo (id , email , phone)
        select cabuser.id id , cabuser.username username, cabuser.password password  from userinfo 
            right join cabuser on cabuser.username = userinfo.email where  userinfo.email is NULL;

insert into ride_status (description) values ('STARTED'),
                                             ('INPROGRESS'),
                                             ('COMPLETED'); 
                                                                                        
insert into ride_status (description) values('NOT STARTED');

select * from ride_status;

select * from userinfo;

select * from cabuser;


