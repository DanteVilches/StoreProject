package com.example.demo.controller;

import com.example.demo.model.Categoria;
import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    // @GetMapping Get Traer Cosas
    // @PostMapping POST enviar cosas (crear cosas)  /PRODUCTOS/{ID_PRODUCTO}
    // BODY -> JSON
    // PUT -> EDITAR TOTAL O PARCIAL
    // DELETE -> BORRAR


    @Autowired
    private ProductoRepository productoRepository;


    //importar LIST y PRODUCTO

    @GetMapping("")
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    // entre {} significa parámetros en el cual lo vamos a necesitar pero más específico
    @GetMapping("/{id_producto}")

    public Optional<Producto> getProductoById(@PathVariable(value = "id_producto") int id_producto) {

        return productoRepository.findById(id_producto);

    }

    @PostMapping("")
    public Producto saveProducto(@RequestBody Producto producto){
        return productoRepository.save(producto);
    }

    @DeleteMapping("/{id_producto}")
    public void deleteProducto(@PathVariable(value = "id_producto") int id_producto){productoRepository.deleteById(id_producto);

    }

    @PutMapping("/{id_producto}")
    public Producto updateProducto(@RequestBody Producto producto, @PathVariable(value= "id_producto") int id_producto){

        return productoRepository.save(producto);
    }

    @GetMapping("/")
    public String validarProducto(@Validated Categoria categoria, BindingResult bindingResult){


        if (bindingResult.hasErrors()){
            return "true";
        }
        return "false";
    }

 /* @GetMapping("/byName")
    public ResponseEntity<List<Categoria>> getCategoriaByNombreProducto(@RequestParam String nombreProducto){

        return new ResponseEntity<List<Categoria>>(productoRepositorypository.findByNombreCategoria(nombreProductotatus.OK);
    }
*/
}