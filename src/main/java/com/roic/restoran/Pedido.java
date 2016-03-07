package com.roic.restoran;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@Column(name="id_pedido")
	private int id;
	@Column(name="cod_mesa")
	private int codMesa;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="pedido_plato",
			joinColumns=@JoinColumn(name="id_pedido"),
			inverseJoinColumns=@JoinColumn(name="id_plato")
			)
	private List<Plato> platos;
	
	public Pedido(int id, int codMesa, List<Plato> platos) {
		this.id = id;
		this.codMesa = codMesa;
		this.platos = platos;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodMesa() {
		return codMesa;
	}
	public void setCodMesa(int codMesa) {
		this.codMesa = codMesa;
	}
	public List<Plato> getPlatos() {
		return platos;
	}
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}
	
}
