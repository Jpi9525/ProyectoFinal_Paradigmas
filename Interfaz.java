package com.mycompany.muebleria;

import java.util.List;

public interface Interfaz {
    void agregarProducto(Producto producto);
    void eliminarProducto(String id);
    Producto buscarProducto(String id);
    List<Producto> listarProductos();
}