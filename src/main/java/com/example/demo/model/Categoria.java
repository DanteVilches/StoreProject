package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_categoria",unique = true, nullable = false)
    private Integer idCategoria;

    @Basic(optional=false)
    @Column(name = "nombre_categoria")
    private String nombreCategoria;


    @Basic(optional = false)
    @Column(name = "descripcion_categoria")
    private String descripcionCategoria;

    @Basic(optional = false)
    @Column(name = "sub_categoria")
    private Integer subCategoria;

    public Integer getIdCategoria(){return idCategoria;}
    public void setIdCategoria(Integer idCategoria){this.idCategoria = idCategoria;}
    public String getNombreCategoria(){return nombreCategoria;}
    public void setNombreCategoria(String nombreCategoria){this.nombreCategoria = nombreCategoria;}
    public String getDescripcionCategoria(){return descripcionCategoria;}
    public void setDescripcionCategoria(String descripcionCategoria){this.descripcionCategoria = descripcionCategoria;}
    public Integer getSubCategoria(){return subCategoria;}
    public void setSubCategoria(Integer subCategoria){this.subCategoria = subCategoria;}

    public Categoria() {
    }

    public Categoria(Integer idCategoria, String nombreCategoria, String descripcionCategoria, Integer subCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        this.subCategoria = subCategoria;
    }
}
