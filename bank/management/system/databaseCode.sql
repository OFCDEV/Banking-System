create database bankSystem;
use bankSystem;
create table signup(form_no varchar(30),name varchar(30),father_name varchar(30),DOB varchar(30),gender varchar(30),email varchar(60),marital_status varchar(30),address varchar(60),city varchar(30),state varchar(30),pincode varchar(30));
select * from signup;

create table signuptwo(form_no varchar(30),religion varchar(30),catagory varchar(30),income varchar(30),education varchar(30),occupation varchar(60),pan varchar(30),adharNo varchar(60),seniorCitizen varchar(30),existing_account varchar(30));
select * from signuptwo;

create table signupthree(form_no varchar(30),account_type varchar(40),card_number varchar(30),pin varchar(30),facility varchar(200));
select * from signupthree;

create table login(form_no varchar(30),card_number varchar(50),pin varchar(30));
select * from login;