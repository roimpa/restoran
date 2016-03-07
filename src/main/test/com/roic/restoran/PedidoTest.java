package com.roic.restoran;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PedidoTest {
	
	private Session session;

	@Before
	public void setUp() {
		// loads configuration and mappings
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        applySettings(configuration.getProperties());
        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
 
        // obtains the session
        session = sessionFactory.openSession();

	}

	@After
	public void tearDown() {
		session.close();
	}
	
	@Test
	public void testGuardarPedido() {
		List<Plato> platos = new ArrayList<Plato>();
		
		platos.add(new Plato(2, "Milanesas"));
		Pedido pedido = new Pedido(1, 34, platos);
		
        session.beginTransaction();
        session.save(pedido);
        session.getTransaction().commit();

	}

}
