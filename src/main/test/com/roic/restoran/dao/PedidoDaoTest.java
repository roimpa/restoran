package com.roic.restoran.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.roic.restoran.Pedido;
import com.roic.restoran.Plato;

public class PedidoDaoTest {
	
	private PedidoDao pedidoDao;
	private AbstractApplicationContext context;

	@Before
	public void setUp() {
		// loads configuration and mappings
		context = new ClassPathXmlApplicationContext("config.xml");
		pedidoDao = (PedidoDao)context.getBean("pedidoDao");
	}

	@After
	public void tearDown() {
		context.close();
	}
	
	@Test
	public void testGuardarPedido() {
		List<Plato> platos = new ArrayList<Plato>();
		
		platos.add(new Plato(3, "Pollo con arroz"));
		Pedido pedido = new Pedido(2, 78, platos);
		
        pedidoDao.save(pedido);

	}

}
