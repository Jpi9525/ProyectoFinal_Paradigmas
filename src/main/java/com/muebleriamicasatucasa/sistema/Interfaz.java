package com.muebleriamicasatucasa.sistema;

import java.util.List;

public interface Interfaz {
    void agregarProducto(Producto producto);
    void eliminarProducto(int ProductoID);
    Producto buscarProducto(int ProductoID);
    List<Producto> listarProductos();
}