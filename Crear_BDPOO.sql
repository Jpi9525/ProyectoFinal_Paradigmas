create DATABASE BD_POO;
USE BD_POO;

DELIMITER $$
create PROCEDURE SP_CREA_BD_POO ()
BEGIN

Create table Categoria(
	CategoriaID int auto_increment,
	primary key (CategoriaID),
    NombreCategoria varchar(50),
    DescripcionC varchar(200)
);

Create table Mueble(
	MuebleID int auto_increment,
	primary key (MuebleID),
    R_Categoria int,
    NombreMueble varchar(50),
    MaterialMueble varchar(50),
    PrecioMueble int,
    Num_Disponible int,
    foreign key (R_Categoria) references Categoria(CategoriaID)
);

Create table SetM(
	SetID int auto_increment,
    primary key(SetID),
    NombreSet varchar(50),
    PrecioSet int
);

Create table Set_Producto(
	R_Mueble int,
    R_Set int,
    foreign key (R_Mueble) references Mueble(MuebleID),
    foreign key (R_Set)  references SetM(SetID)
);

END $$
DELIMITER ;
Call SP_CREA_BD_POO ();