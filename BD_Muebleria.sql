CREATE DATABASE BD_Muebleria;
USE BD_Muebleria;

-- ============================================================
--  TABLA PRINCIPAL
--  Aqui se guardan las Sillas, Mesas y Sets
--  La columna "tipo" indica el tipo de producto que es
-- ============================================================

create table Producto (
    ProductoID int auto_increment,
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
    ProductoID int,
    nombre varchar(50),
    precio double,
    primary key (SetID)
);

-- ============================================================
-- TABLA 3:(Relacion Set - Producto)
-- ============================================================
create table SetDetalle (
    SetID int,
    ProductoID int,
    primary key (SetID, ProductoID),
    foreign key (SetID) references  SetProducto(SetID),
    foreign key  (ProductoID) references Producto(ProductoID)
);
-- ============================================================
-- TABLA 4:Carrito
-- ============================================================

create table Carrito(
	CarritoID int auto_increment,
    ProductoID int,
    SetID int,
    primary key(CarritoID),
    foreign key (ProductoID) references Producto(ProductoID),
    foreign key (SetID) references SetProducto(SetID)
);