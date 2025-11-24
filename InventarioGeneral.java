package com.mycompany.muebleria;

import java.util.*;
import java.util.stream.Collectors;

public class InventarioGeneral implements Interfaz {

    public Map<String, Producto> productos = new HashMap<>();

    @Override
    public void agregarProducto(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void eliminarProducto(String id) {
        productos.remove(id);
    }

    @Override
    public Producto buscarProducto(String id) {
        return productos.get(id);
    }

    @Override
    public List<Producto> listarProductos() {
        return new ArrayList<>(productos.values());
    }

    // -------------------------
    // Métodos específicos por tipo
    // -------------------------
    public List<Silla> listarSillas() {
        return productos.values().stream()
                .filter(p -> p instanceof Silla)
                .map(p -> (Silla) p)
                .collect(Collectors.toList());
    }

    public List<Mesa> listarMesas() {
        return productos.values().stream()
                .filter(p -> p instanceof Mesa)
                .map(p -> (Mesa) p)
                .collect(Collectors.toList());
    }

    public List<Set> listarSets() {
        return productos.values().stream()
                .filter(p -> p instanceof Set)
                .map(p -> (Set) p)
                .collect(Collectors.toList());
    }
}
