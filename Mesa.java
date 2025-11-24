package com.mycompany.muebleria;

public class Mesa extends Producto {
    public boolean esBaseCama;

    public Mesa(String id, int stock, double ancho, double alto, String material, double precio){
        super(id, stock, ancho, alto, material, precio);
    }

    public boolean esBaseCama(){
        return this.esBaseCama;
    }

    @Override
    public void registroVenta(){
        System.out.println("Registrando venta de mesa...");
    }
}