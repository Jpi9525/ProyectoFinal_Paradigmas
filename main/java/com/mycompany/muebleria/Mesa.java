package com.mycompany.muebleria;

public class Mesa extends Producto {

    private boolean esBaseCama;

    public Mesa(int ProductoID, int stock, double ancho, double alto, String material, double precio){
        super(ProductoID, stock, ancho, alto, material, precio);
        this.esBaseCama = false;
    }

    public boolean isBaseCama() { 
        return esBaseCama; 
    }
    public void setBaseCama(boolean baseCama){ 
        this.esBaseCama = baseCama; 
    }

    @Override
    public void registroVenta(){
        System.out.println("Registrando venta de mesa...");
    }
}