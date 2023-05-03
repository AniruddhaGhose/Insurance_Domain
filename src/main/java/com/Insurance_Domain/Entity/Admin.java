package com.Insurance_Domain.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "policy")
public class Admin {

	@Id
	private int policyId;

	private String policyType;

	private int policyAmt;

	private int policyMaturity;

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public int getPolicyAmt() {
		return policyAmt;
	}

	public void setPolicyAmt(int policyAmt) {
		this.policyAmt = policyAmt;
	}

	public int getPolicyMaturity() {
		return policyMaturity;
	}

	public void setPolicyMaturity(int policyMaturity) {
		this.policyMaturity = policyMaturity;
	}

	public Admin(int policyId, String policyType, int policyAmt, int policyMaturity) {
		super();
		this.policyId = policyId;
		this.policyType = policyType;
		this.policyAmt = policyAmt;
		this.policyMaturity = policyMaturity;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [policyId=" + policyId + ", policyType=" + policyType + ", policyAmt=" + policyAmt
				+ ", policyMaturity=" + policyMaturity + "]";
	}

}
