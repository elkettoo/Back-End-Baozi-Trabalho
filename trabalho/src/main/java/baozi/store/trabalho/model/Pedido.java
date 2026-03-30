package baozi.store.trabalho.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cliente_id", nullable=false)
	private Long clienteId;
	
	@Column(name="produto_id", nullable=false)
	private Long produtoId;
	
	@Column(name="quantidade", nullable=false)
	private Integer quantidade;
	
	public Pedido(Long id, Long clienteId, Long produtoId, Integer quantidade) {
		this.id = id;
		this.clienteId = clienteId;
		this.produtoId = produtoId;
		this.quantidade = quantidade;
	}
	
	public Pedido() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getClienteId() {
		return clienteId;
	}

	public void setClienteId(Long clienteId) {
		this.clienteId = clienteId;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clienteId, id, produtoId, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(clienteId, other.clienteId) && Objects.equals(id, other.id)
				&& Objects.equals(produtoId, other.produtoId) && Objects.equals(quantidade, other.quantidade);
	}
	
	
}
