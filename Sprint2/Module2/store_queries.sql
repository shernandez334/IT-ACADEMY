use media_market;

-- 1
select nombre
from producto;

-- 2
select nombre, precio
from producto;

-- 3
select *
from producto;

-- 4
select nombre, precio, round((precio * 1.1) , 2)
from producto;

-- 5
select nombre, precio as 'euros', round((precio * 1.1) , 2) as dolares
from producto;

-- 6
select UPPER(nombre) as 'nombre'
from producto;

-- 7
select LOWER(nombre) as 'nombre'
from producto;

-- 8
select nombre as 'nombre', upper(left(nombre, 2)) as 'initials'
from fabricante;

-- 9
select nombre as 'nombre', round(precio)
from producto;

-- 10
select nombre as 'nombre', truncate(precio, 0)
from producto;

-- 11
select codigo
from producto;

-- 12
select distinct codigo
from producto;

-- 13
select nombre
from fabricante
order by nombre;

-- 14
select nombre
from fabricante
order by nombre desc;

-- 15
select nombre, precio
from producto
order by nombre, precio desc;

-- 16
select *
from fabricante
limit 5;

-- 17
select *
from fabricante
limit 2 offset 3;

-- 18
select nombre, precio
from producto
order by precio
limit 1;

-- 19
select nombre, precio
from producto
order by precio desc
limit 1;

-- 20
select nombre
from producto
where codigo = 2;

-- 21
select p.nombre, precio, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo;

-- 22
select p.nombre, precio, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
order by f.nombre;

-- 23
select p.codigo as 'codigo_producto', p.nombre, f.codigo as 'codigo_fabricante', f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo;

-- 24
select p.nombre, precio, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where p.precio = (select min(precio) from producto);

-- 25
select p.nombre, precio, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where p.precio = (select max(precio) from producto);

-- 26
select p.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre = 'Lenovo';

-- 27
select *
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre = 'Crucial' AND precio > 200;

-- 28
select *
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre = 'Asus'
   or f.nombre = 'Hewlett-Packard'
   or f.nombre = 'Seagate';

-- 29
select *
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre in ('Asus', 'Hewlett-Packard', 'Seagate');

-- 30
select p.nombre, precio
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre like '%e';

-- 31
select p.nombre, precio, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre like '%w%';

-- 32
select p.nombre, precio, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where precio >= 180
order by precio desc, p.nombre;

-- 33
select f.codigo, f.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo;

-- 34
select *
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo;

-- 35
select *
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where p.nombre is null;

-- 36
select p.nombre
from producto p
         left join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre = 'Lenovo';

-- 37
select *
from producto p
         left join fabricante f on p.codigo_fabricante = f.codigo
where precio = (select max(precio) from producto);

-- 38
select nombre
from producto
where precio = (select max(precio)
                from producto p
                         join fabricante f on p.codigo_fabricante = f.codigo
                where f.nombre = 'Lenovo');

-- 39
select nombre
from producto
where precio = (select min(precio)
                from producto p
                         join fabricante f on p.codigo_fabricante = f.codigo
                where f.nombre = 'Hewlett-Packard');

-- 40
select *
from producto
where precio >= (select max(precio)
                 from producto p
                          join fabricante f on p.codigo_fabricante = f.codigo
                 where f.nombre = 'Lenovo');

-- 41
select p.nombre
from producto p
         join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre = 'Asus' AND precio >= (select avg(precio)
                                       from producto p
                                                join fabricante f on p.codigo_fabricante = f.codigo
                                       where f.nombre = 'Asus');