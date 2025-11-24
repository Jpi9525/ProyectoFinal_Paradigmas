package com.mycompany.muebleria;

public class Silla extends Producto {
    public boolean esAcolchonado;
    public boolean esPlegable;
    public boolean esSofa;
    public boolean esSillon;

    public Silla(String id, int stock, double ancho, double alto, String material, double precio){
        super(id, stock, ancho, alto, material, precio);
    }

    public boolean esAcolchonado(){ return esAcolchonado; }
    public boolean esPlegable(){ return esPlegable; }
    public boolean esSofa(){ return esSofa; }
    public boolean esSillon(){ return esSillon; }

    @Override
    public void registroVenta(){
        System.out.println("Registrando venta de silla...");
    }
}