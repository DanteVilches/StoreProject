package com.example.demo.controller;


import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/categoria")

public class CategoriaController {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("")
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }


    @GetMapping("/{id_categoria}")
    public Optional<Categoria> getCategoriaById(@PathVariable(value = "id_categoria") int id_categoria) {


        return categoriaRepository.findById(id_categoria);

    }

    @PostMapping("/save/")
    public Categoria saveCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/delete/{id_categoria}")
    public void deleteCategoria(@PathVariable(value = "id_categoria") int id_categoria) {
        categoriaRepository.deleteById(id_categoria);
    }
 //Postman usar JSON en vez de texto.
    @PutMapping("/update/{id_categoria}")
    public Categoria updateCategoria(@RequestBody Categoria categoria, @PathVariable(value = "id_categoria") int id_categoria) {

        Categoria categoria1 = new Categoria();

        categoria1 = categoriaRepository.getOne(id_categoria);

        categoria1.setNombreCategoria(categoria.getNombreCategoria());
        categoria1.setDescripcionCategoria(categoria.getDescripcionCategoria());
        categoria1.setSubCategoria(categoria.getSubCategoria());

        return categoriaRepository.save(categoria1);
    }


//el by siempre se usa sin _ y con uppercases (NombreCategoria) y la variable con la segunda uppercase (nombreCategoria)
  @GetMapping("/byName")
       public ResponseEntity<List<Categoria>> getCategoriaByNombreCategoria(@RequestParam String nombreCategoria){

      return new ResponseEntity<List<Categoria>>(categoriaRepository.findByNombreCategoria(nombreCategoria),HttpStatus.OK);
       }





}


