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

-- 2.1
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