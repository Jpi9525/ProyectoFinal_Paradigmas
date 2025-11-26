CREATE DATABASE BD_Muebleria;
USE BD_Muebleria;

-- ============================================================
--  TABLA PRINCIPAL
--  Aqui se guardan las Sillas, Mesas y Sets
--  La columna "tipo" indica el tipo de producto que es
-- ============================================================

create table Producto (
    ProductoID varchar(20) ,
    stock int,
    ancho double,
    alto double,
    material varchar(50),
    precio double,
    tipo varchar(20),  -- 'Silla', 'Mesa', 'Set'
    primary key(ProductoID)
);

-- ============================================================
-- TABLA 2: SET (Informacion general del set)
-- ============================================================

create table SetProducto (
    SetID int auto_increment,
    nombre varchar(50),
    precio double,
    primary key (SetID)
);

-- ============================================================
-- TABLA 3:(Relacion Set - Producto)
-- ============================================================

create table Relacion(
	RelacionID int auto_increment,
    ProductoID,
    SetID int,
    primary key(RelacionID),
    foreign key (ProductoID) references Producto(ProductoID),
    foreign key (SetID) references SetProducto(SetID)
);