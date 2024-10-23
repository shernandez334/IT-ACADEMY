USE uab;

-- 1.1
SELECT  apellido1, apellido2, nombre FROM persona
Where tipo = 'alumno'
ORDER BY apellido1, apellido2, nombre;

-- 1.2
SELECT apellido1, apellido2, nombre from persona
where tipo = 'alumno' AND telefono IS NULL;

-- 1.3
SELECT apellido1, apellido2, nombre from persona
where tipo = 'alumno' AND YEAR(fecha_nacimiento) = 1999;

-- 1.4
SELECT apellido1, apellido2, nombre, telefono, nif from persona
where tipo = 'profesor' AND telefono IS NULL
  AND nif like '%K';

-- 1.5
SELECT nombre from asignatura
where cuatrimestre = 1 AND curso = 3
  AND id_grado = 7;

-- 1.6
SELECT apellido1, apellido2, p.nombre, d.nombre as "departamento"
from profesor pr
    join persona p on pr.id_profesor  = p.id
    join departamento d on pr.id_departamento = d.id
ORDER BY apellido1, apellido2, nombre;

-- 1.7
SELECT p.nombre as "asignatura", a.nombre, curso.anyo_inicio, curso.anyo_fin
from alumno_se_matricula_asignatura matr
    join persona p on matr.id_alumno = p.id
    join asignatura a on a.id = matr.id_asignatura
    join curso_escolar curso on curso.id = matr.id_curso_escolar
where p.tipo = 'alumno' AND nif = '26902806M';

-- 1.8
SELECT a.nombre
from grado gr
    join asignatura a on gr.id = a.id_grado
where gr.nombre = 'Grado en Ingeniería Informática (Plan 2015)';

-- 1.9
SELECT DISTINCT p.apellido2, p.apellido1, p.nombre
    from alumno_se_matricula_asignatura a
        join curso_escolar c on a.id_curso_escolar = c.id
        join persona p on a.id_alumno = p.id
where c.anyo_inicio = 2018;

-- 2.1 LEFT JOIN & RIGHT JOIN
SELECT DISTINCT d.nombre as 'departamento', p.apellido1, p.apellido2, p.nombre
from profesor pr
         join departamento d on pr.id_departamento = d.id
         left join persona p on pr.id_profesor = p.id
where p.tipo = 'profesor'
order by d.nombre, apellido1, apellido2, p.nombre;

-- 2.2
SELECT DISTINCT d.nombre as 'departamento', p.apellido1, p.apellido2, p.nombre
from profesor pr
         join departamento d on pr.id_departamento = d.id
         left join persona p on pr.id_profesor = p.id
where p.tipo = 'profesor' AND d.nombre IS NULL
order by d.nombre, apellido1, apellido2, p.nombre;

-- 2.3
SELECT DISTINCT d.nombre
from departamento d
         left join profesor pr on d.id = pr.id_departamento
where pr.id_departamento IS NULL;

-- 2.4
select distinct p.nombre
from persona p
         left join asignatura a on p.id = a.id_profesor
where p.tipo = 'profesor' AND a.id_profesor IS NULL;

-- 2.5
SELECT a.nombre
from asignatura a
         left join profesor pr on a.id_profesor = pr.id_profesor
where pr.id_profesor IS NULL;

-- 2.6
select distinct d.nombre
from departamento d
         left join profesor pr on d.id = pr.id_departamento
         left join asignatura a on pr.id_profesor = a.id_profesor
where a.curso IS NULL;

-- 3.1 Resume
select count(*)
from persona p
where p.tipo = 'alumno';

-- 3.2
select count(*)
from persona p
where p.tipo = 'alumno' AND year(p.fecha_nacimiento) = 1999;

-- 3.3
select d.nombre, count(pr.id_profesor) as "num_professors"
from departamento d
    join profesor pr on d.id = pr.id_departamento
group by d.nombre
order by d.nombre desc;

-- 3.4
select d.nombre, count(pr.id_profesor) as "num_professors"
from departamento d
         left join profesor pr on d.id = pr.id_departamento
group by d.nombre;

-- 3.5
select g.nombre, count(a.id_grado)
from grado g
         left join asignatura a on g.id = a.id_grado
group by g.nombre;

-- 3.6
select g.nombre, count(a.id_grado) > 40
from grado g
         left join asignatura a on g.id = a.id_grado
group by g.nombre;

-- 3.7
select g.nombre, a.tipo, count(a.creditos)
from grado g
         join asignatura a on g.id = a.id_grado
group by g.nombre, a.tipo;

-- 3.8
select c.anyo_inicio, count(matr.id_alumno)
from alumno_se_matricula_asignatura matr
         join curso_escolar c on matr.id_curso_escolar = c.id
group by c.anyo_inicio;

-- 3.9
select p.id, p.nombre, p.apellido1, apellido2, count(a.id_profesor) as 'num_asignaturas'
from persona p
         left join asignatura a on p.id = a.id_profesor
where p.tipo = 'profesor'
group by p.id, p.nombre, p.apellido1, apellido2
order by count(a.id_profesor) desc;

-- 3.10
select *
from persona
where fecha_nacimiento = (select max(fecha_nacimiento) from persona);

-- 3.11
select distinct *
from persona p
         join profesor pr on p.id = pr.id_profesor
         join departamento d on pr.id_departamento = d.id
         left join asignatura a on pr.id_profesor = a.id_profesor;