package br.com.san.paginatiomvc.entity;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Double value;
	private Integer qntStorage;
	private String code;

	public Product() {

	}

	public Product(Integer id, String name, Double value, Integer qntStorage, String code) {
		this.id = id;
		this.name = name;
		this.value = value;
		this.qntStorage = qntStorage;
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Integer getQntStorage() {
		return qntStorage;
	}

	public void setQntStorage(Integer qntStorage) {
		this.qntStorage = qntStorage;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

}
