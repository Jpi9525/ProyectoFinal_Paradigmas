package com.mycompany.muebleria;

public abstract class Producto {
    public String id;
    public int stock;
    public double ancho;
    public double alto;
    public double precio;
    public String material;

    public Producto(String id, int stock, double ancho, double alto, String material, double precio){
        this.id = id;
        this.stock = stock;
        this.ancho = ancho;
        this.alto = alto;
        this.material = material;       
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public abstract void registroVenta();
}