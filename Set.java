package com.mycompany.muebleria;
import java.util.ArrayList;

public class Set extends Producto {

    private ArrayList<Producto> productos;

    public Set(String id, String nombreSet) {
        super(id, 1, 0, 0, "Mixto", 0); // puedes ajustar
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        productos.add(p);
        this.precio += p.precio;
    }

    @Override
    public void registroVenta() {}
}
