package com.mycompany.muebleria;

import java.util.ArrayList;
import java.util.List;

public class InventarioGeneral implements Interfaz {

    private ArrayList<Producto> productos = new ArrayList<>();

    @Override
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    @Override
    public void eliminarProducto(int ProductoID){
        productos.removeIf(p -> p.getId() == ProductoID);
    }

    @Override
    public Producto buscarProducto(int ProductoID){
        for (Producto p : productos)
            if (p.getId() == ProductoID) return p;
        return null;
    }

    @Override
    public List<Producto> listarProductos(){
        return productos;
    }
}