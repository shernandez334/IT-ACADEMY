DROP DATABASE IF EXISTS telepizza;
CREATE DATABASE telepizza;
USE telepizza;

CREATE TABLE city(
    city_id int primary key auto_increment,
    city_name varchar(50) not null
);

CREATE TABLE locality(
    locality_id int primary key auto_increment,
    locality_name varchar(50) not null
);

CREATE TABLE province(
    province_id int primary key auto_increment,
    province_name varchar(50) not null
);

CREATE TABLE address(
    address_id int primary key auto_increment,
    address_name varchar(50) not null ,
    address_number varchar(10) not null,
    postal_code int not null,
    city_id int,
    locality_id int,
    province_id int,
    foreign key (city_id) references city(city_id),
    foreign key (locality_id) references locality(locality_id),
    foreign key (province_id) references province(province_id)
);

CREATE TABLE client(
    client_id int primary key auto_increment,
    name varchar(50) not null,
    surnames varchar(50) not null,
    mobile_phone varchar(50) not null,
    address_id int,
    foreign key (address_id) references address(address_id)
);

CREATE TABLE delivery(
    delivery_id int primary key auto_increment,
    address_id int,
    delivery_time datetime not null
);

CREATE TABLE employee(
    employee_id int primary key auto_increment,
    name varchar(50) not null,
    surnames varchar(50) not null,
    nif varchar(12) not null,
    mobile_phone varchar(50) not null,
    role enum('cook', 'delivery') not null,
    delivery_id int,
    foreign key (delivery_id) references delivery(delivery_id)
);

CREATE TABLE store(
    store_id int primary key auto_increment,
    address_id int,
    employee_id int,
    foreign key (address_id) references address(address_id),
    foreign key (employee_id) references employee(employee_id)
);

CREATE TABLE `order`(
    order_id int primary key auto_increment,
    order_date datetime not null,
    is_delivery bool not null,
    total_price int not null,
    store_id int,
    client_id int,
    employee_id int,
    foreign key (store_id) references store(store_id),
    foreign key (client_id) references client(client_id),
    foreign key (employee_id) references employee(employee_id)
);

CREATE TABLE product(
    product_id int primary key auto_increment,
    name varchar(50) not null,
    description varchar(50) not null,
    image blob not null,
    price double not null
);

CREATE TABLE order_item(
    order_item_id int primary key auto_increment,
    product_id int,
    order_id int,
    foreign key (product_id) references product(product_id),
    foreign key (order_id) references `order`(order_id)
);

CREATE TABLE pizza_category(
    pizza_category_id int primary key auto_increment,
    name varchar(50)
);

CREATE TABLE pizza(
    pizza_id int primary key auto_increment,
    product_id int,
    pizza_category_id int,
    foreign key (product_id) references product(product_id),
    foreign key (pizza_category_id) references pizza_category (pizza_category_id)
);