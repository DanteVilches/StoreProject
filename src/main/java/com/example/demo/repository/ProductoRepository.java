package com.example.demo.repository;

import com.example.demo.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//el repositorio de jpa va a usar el producto, como clave primaria tiene un integer

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
