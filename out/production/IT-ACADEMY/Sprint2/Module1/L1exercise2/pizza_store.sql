CREATE TABLE `pizza`(
    `pizza_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `product_id` INT NOT NULL,
    `pizza_category_id` INT NOT NULL
);
CREATE TABLE `product`(
    `product_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    `image` BLOB NOT NULL,
    `price` DOUBLE NOT NULL
);
CREATE TABLE `order`(
    `order_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `order_date` DATETIME NOT NULL,
    `is_delivery` BOOLEAN NOT NULL,
    `total_price` INT NOT NULL,
    `store_id` INT NOT NULL,
    `delivery_id` INT NOT NULL,
    `client_id` INT NOT NULL,
    `store_employee_id` INT NOT NULL
);
CREATE TABLE `client`(
    `cliente_id` INT NOT NULL,
    `name` VARCHAR(255) NOT NULL,
    `surnames` VARCHAR(255) NOT NULL,
    `mobile_phone` VARCHAR(255) NOT NULL,
    `adddress_id` INT NOT NULL,
    PRIMARY KEY(`cliente_id`)
);
CREATE TABLE `store`(
    `store_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `address_id` INT NOT NULL
);
CREATE TABLE `pizza_category`(
    `pizza_category_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` INT NOT NULL
);
CREATE TABLE `store_employee`(
    `store_employee_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `store_id` INT NOT NULL,
    `employee_id` INT NOT NULL
);
CREATE TABLE `order_item`(
    `order_item_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `product_id` BIGINT NOT NULL,
    `order_id` BIGINT NOT NULL
);
CREATE TABLE `city`(
    `city_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `city_name` VARCHAR(255) NOT NULL,
    `locality` VARCHAR(255) NOT NULL,
    `province` VARCHAR(255) NOT NULL
);
CREATE TABLE `delivery`(
    `delivery_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `order_id` BIGINT NOT NULL,
    `address_id` INT NOT NULL,
    `delivery_time` DATETIME NOT NULL
);
CREATE TABLE `employee`(
    `employee_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(255) NOT NULL,
    `surnames` VARCHAR(255) NOT NULL,
    `nif` VARCHAR(255) NOT NULL,
    `mobile_phone` INT NOT NULL,
    `role (cook, delivery)` ENUM('') NOT NULL
);
CREATE TABLE `address`(
    `address_id` INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `address_name` VARCHAR(255) NOT NULL,
    `address_number` VARCHAR(255) NOT NULL,
    `postal_code` INT NOT NULL,
    `city_id` INT NOT NULL
);
ALTER TABLE
    `store_employee` ADD CONSTRAINT `store_employee_store_id_foreign` FOREIGN KEY(`store_id`) REFERENCES `store`(`store_id`);
ALTER TABLE
    `store` ADD CONSTRAINT `store_address_id_foreign` FOREIGN KEY(`address_id`) REFERENCES `address`(`address_id`);
ALTER TABLE
    `order_item` ADD CONSTRAINT `order_item_product_id_foreign` FOREIGN KEY(`product_id`) REFERENCES `product`(`product_id`);
ALTER TABLE
    `pizza` ADD CONSTRAINT `pizza_pizza_category_id_foreign` FOREIGN KEY(`pizza_category_id`) REFERENCES `pizza_category`(`pizza_category_id`);
ALTER TABLE
    `pizza` ADD CONSTRAINT `pizza_product_id_foreign` FOREIGN KEY(`product_id`) REFERENCES `product`(`product_id`);
ALTER TABLE
    `delivery` ADD CONSTRAINT `delivery_order_id_foreign` FOREIGN KEY(`order_id`) REFERENCES `order`(`order_id`);
ALTER TABLE
    `order` ADD CONSTRAINT `order_store_employee_id_foreign` FOREIGN KEY(`store_employee_id`) REFERENCES `store_employee`(`store_employee_id`);
ALTER TABLE
    `store_employee` ADD CONSTRAINT `store_employee_employee_id_foreign` FOREIGN KEY(`employee_id`) REFERENCES `employee`(`employee_id`);
ALTER TABLE
    `delivery` ADD CONSTRAINT `delivery_address_id_foreign` FOREIGN KEY(`address_id`) REFERENCES `address`(`address_id`);
ALTER TABLE
    `order` ADD CONSTRAINT `order_client_id_foreign` FOREIGN KEY(`client_id`) REFERENCES `client`(`cliente_id`);
ALTER TABLE
    `order_item` ADD CONSTRAINT `order_item_order_id_foreign` FOREIGN KEY(`order_id`) REFERENCES `order`(`order_id`);
ALTER TABLE
    `client` ADD CONSTRAINT `client_adddress_id_foreign` FOREIGN KEY(`adddress_id`) REFERENCES `address`(`address_id`);
ALTER TABLE
    `address` ADD CONSTRAINT `address_city_id_foreign` FOREIGN KEY(`city_id`) REFERENCES `city`(`city_id`);
ALTER TABLE
    `order` ADD CONSTRAINT `order_store_id_foreign` FOREIGN KEY(`store_id`) REFERENCES `store`(`store_id`);