package br.com.fiap.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id_produto;
	public String descricao_produto;
	public int quantidade;
	public float valor;
	
	@ManyToMany(fetch = FetchType.LAZY,
	      cascade = {
	          CascadeType.PERSIST,
	          CascadeType.MERGE
	      },
	      mappedBy = "tb_produtos")
	private Set<Pedido> pedidos = new HashSet<>();
	
	public Produto(long id_produto, String descricao_produto, int quantidade, float valor) {
		super();
		this.id_produto = id_produto;
		this.descricao_produto = descricao_produto;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public Produto() {
		super();
	}

	public long getIdProduto() {
		return id_produto;
	}

	public void setIdProduto(long id_produto) {
		this.id_produto = id_produto;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}