package com.example.examenLp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examenLp.dao.Todo;
import com.example.examenLp.daoImpl.OrdenempleadoDaoImpl;
import com.example.examenLp.entity.OrdenA;

@Service
public class OrdenempleadoService implements Todo<OrdenA>{

	@Autowired
	private OrdenempleadoDaoImpl daoImpl;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
				return daoImpl.readAll();
	}

}
