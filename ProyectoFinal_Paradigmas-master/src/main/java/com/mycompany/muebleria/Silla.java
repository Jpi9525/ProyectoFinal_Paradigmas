package com.mycompany.muebleria;

public class Silla extends Producto {

    private boolean esAcolchonada;

    public Silla(int ProductoID, int stock, double ancho, double alto, String material, double precio){
        super(ProductoID, stock, ancho, alto, material, precio);
        this.esAcolchonada = false;
    }

    public boolean isAcolchonada() { 
        return esAcolchonada; 
    }
    public void setAcolchonada(boolean a) { 
        esAcolchonada = a; 
    }

    @Override
    public void registroVenta(){
        System.out.println("Registrando venta de silla...");
    }
}
