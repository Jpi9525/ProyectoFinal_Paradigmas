package com.mycompany.muebleria;

import java.util.ArrayList;

public class Set extends Producto{

    private ArrayList<Producto> productos;
    private String nombreSet;

    public Set(int ProductoID, String nombreSet){
        super(ProductoID, 1, 0, 0, "Mixto", 0);
        this.nombreSet = nombreSet;
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    @Override
    public void registroVenta(){
        System.out.println("Registrando venta de un set...");
    }
}