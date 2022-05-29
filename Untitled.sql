create database student10;
create user valentyn with password '1';
grant all on database student10 to valentyn;

CREATE TABLE "gpu" ("id" serial PRIMARY KEY,"name" varchar(50),"price" int,"width" float);
