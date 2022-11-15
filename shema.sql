create table my_db.CUSTOMERS (
                                 id int auto_increment,
                                 name varchar(25),
                                 surname varchar(25),
                                 age int,
                                 phone_number varchar(11),
                                 primary key(id)
);

insert into my_db.CUSTOMERS (name, surname, age, phone_number) values ('Анна', 'Прохватаева', '27', '12345');
insert into my_db.CUSTOMERS (name, surname, age, phone_number) values ('Максим', 'Прохватаев', '41', '12345');
insert into my_db.CUSTOMERS (name, surname, age, phone_number) values ('Алексей', 'Волков', '33', '12345');
insert into my_db.CUSTOMERS (name, surname, age, phone_number) values ('Алексей', 'Крутой', '53', '12345');
insert into my_db.CUSTOMERS (name, surname, age, phone_number) values ('Ирина', 'Телегина', '28', '12345');



create table my_db.ORDERS (
                              id int auto_increment,
                              date varchar(25),
                              customer_id int,
                              product_name varchar(25),
                              amount int,
                              primary key(id),
                              foreign key (customer_id) references my_db.CUSTOMERS (id)
);

insert into my_db.orders (date, customer_id, product_name, amount) values ('01.01.2020', '1','Кексы','10');
insert into my_db.orders (date, customer_id, product_name, amount) values ('01.01.2020', '5','Тортики','10');
insert into my_db.orders (date, customer_id, product_name, amount) values ('01.01.2020', '4','Печенье','10');
insert into my_db.orders (date, customer_id, product_name, amount) values ('01.01.2020', '5','Мороженое','10');
insert into my_db.orders (date, customer_id, product_name, amount) values ('01.01.2020', '2','Шоколад','15');
insert into my_db.orders (date, customer_id, product_name, amount) values ('01.01.2020', '3','Темный шоколад','15');

drop table my_db.orders;