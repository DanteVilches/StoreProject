package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto",unique = true,nullable = false)
    private Integer idProducto;

    @Basic(optional = false)
    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Basic(optional = false)
    @Column(name = "descripcion_producto")
    private String descripcionProducto;

    @Basic(optional = false)
    @Column(name = "precio_producto")
    private Integer precioProducto;

    //ayudan a definir que puedes extraer (getter) y lo que puedes enviar (setter)
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    // se genera un constructor vacío y uno lleno para filtrar en caso de errores
    public Producto() {

    }

    public Producto(Integer idProducto, String nombreProducto, String descripcionProducto, Integer precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
    }

}
