
DROP DATABASE IF EXISTS cul_d_ampolla;
CREATE DATABASE cul_d_ampolla;
USE cul_d_ampolla;

CREATE TABLE address(
    address_id int auto_increment,
    street_name varchar(50) not null,
    street_number varchar(10) not null,
    floor_number varchar(10),
    door_number varchar(10),
    city varchar (10) not null,
    postal_code int not null,
    country varchar(5) not null,
    primary key (address_id)
);

CREATE TABLE supplier(
    supplier_id int auto_increment,
    name VARCHAR(50) NOT NULL,
    telephone_number VARCHAR (15),
    address_id int,
    fax int,
    nif VARCHAR (45),
    primary key (supplier_id),
    foreign key (address_id) references address(address_id)
);

CREATE TABLE brand(
    brand_id int auto_increment,
    supplier_id int not null,
    name varchar(50),
    primary key (brand_id),
    foreign key (supplier_id) references  supplier(supplier_id)
);

CREATE TABLE client(
    client_id int auto_increment,
    name varchar(50) not null,
    address_id int not null,
    cellphone_number varchar(50) not null,
    email varchar(50) not null,
    referred_client_id int,
    register_date date not null,
    primary key (client_id),
    foreign key (address_id) references address(address_id),
    foreign key (referred_client_id) references client(client_id)
);

CREATE TABLE seller(
    seller_id int auto_increment,
    name varchar(50) not null,
    primary key (seller_id)
);

CREATE TABLE glasses(
    glasses_id int auto_increment,
    brand_id int not null ,
    polarization_right double not null ,
    polarization_left double not null,
    frame_material enum('plastic', 'paste', 'metal') not null,
    frame_color varchar(50) not null,
    color_left_lenses varchar(50) not null,
    color_right_lenses varchar(50) not null,
    price double not null,
    primary key (glasses_id),
    foreign key (brand_id) references brand(brand_id)
);

CREATE TABLE sale(
    sales_id int auto_increment,
    client_id int not null,
    seller_id int not null,
    glasses_id int not null,
    date timestamp not null,
    primary key (sales_id),
    foreign key (seller_id) references seller(seller_id),
    foreign key (glasses_id) references glasses(glasses_id),
    foreign key (client_id) references client(client_id)
);
