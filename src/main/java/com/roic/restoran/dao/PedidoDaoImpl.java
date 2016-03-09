package com.roic.restoran.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.roic.restoran.Pedido;

@Repository("pedidoDao")
@Transactional
public class PedidoDaoImpl implements PedidoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Pedido pedido) {
		Session session = sessionFactory.getCurrentSession();
		
		session.persist(pedido);
	}
	
}
