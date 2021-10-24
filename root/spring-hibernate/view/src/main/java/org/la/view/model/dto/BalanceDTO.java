package org.la.view.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class BalanceDTO implements Serializable{

	private Long id;
	private BigDecimal amount;
	private Boolean active;
	private String status;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Balance [id=" + id + ", amount=" + amount + ", active=" + active + "]";
	}
	
}
