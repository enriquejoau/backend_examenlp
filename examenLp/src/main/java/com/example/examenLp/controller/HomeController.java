package com.example.examenLp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examenLp.entity.OrdenA;
import com.example.examenLp.entity.ProductoCategoria;
import com.example.examenLp.service.OrdenAService;
import com.example.examenLp.service.OrdenempleadoService;
import com.example.examenLp.service.ProductoCategoriaService;

@RestController
@RequestMapping("/api/home")
@CrossOrigin({"*"})
public class HomeController {
	
	@Autowired
	private ProductoCategoriaService productoService;
	@Autowired
	private OrdenAService ordenAService;
	@Autowired
	private OrdenempleadoService ordenempleadoService;
	
	@GetMapping("/readProductCategories")
	public List<Map<String, Object>> listarProduct(){
		return productoService.readAll();
	};
	
	@GetMapping("/readOrAño")
	public List<Map<String, Object>> listarAño(){
		return ordenAService.readAll();
	};
	
	@GetMapping("/readOrEmpleado")
	public List<Map<String, Object>> listarempleado(){
		return ordenempleadoService.readAll();
	};
	
	
}
