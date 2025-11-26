package com.mycompany.muebleria;

public abstract class Producto {

    private int ProductoID;
    private int stock;
    private double ancho;
    private double alto;
    private double precio;
    private String material;

    public Producto(int ProductoID, int stock, double ancho, double alto, String material, double precio){
        this.ProductoID = ProductoID;
        this.stock = stock;
        this.ancho = ancho;
        this.alto = alto;
        this.material = material;
        this.precio = precio;
    }
    
    public int getId() { 
        return ProductoID; 
    }
    public double getPrecio() { return precio; }

    public abstract void registroVenta();
}