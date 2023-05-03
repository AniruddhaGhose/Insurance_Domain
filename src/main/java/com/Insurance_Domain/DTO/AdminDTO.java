package com.Insurance_Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminDTO {
	
	
	private int policy_Id;

	private String policy_Type;

	private int policy_Amt;

	private int policy_Maturity;

	public int getPolicy_Id() {
		return policy_Id;
	}

	public void setPolicy_Id(int policy_Id) {
		this.policy_Id = policy_Id;
	}

	public String getPolicy_Type() {
		return policy_Type;
	}

	public void setPolicy_Type(String policy_Type) {
		this.policy_Type = policy_Type;
	}

	public int getPolicy_Amt() {
		return policy_Amt;
	}

	public void setPolicy_Amt(int policy_Amt) {
		this.policy_Amt = policy_Amt;
	}

	public int getPolicy_Maturity() {
		return policy_Maturity;
	}

	public void setPolicy_Maturity(int policy_Maturity) {
		this.policy_Maturity = policy_Maturity;
	}

	public AdminDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminDTO(int policy_Id, String policy_Type, int policy_Amt, int policy_Maturity) {
		super();
		this.policy_Id = policy_Id;
		this.policy_Type = policy_Type;
		this.policy_Amt = policy_Amt;
		this.policy_Maturity = policy_Maturity;
	}

	@Override
	public String toString() {
		return "AdminDTO [policy_Id=" + policy_Id + ", policy_Type=" + policy_Type + ", policy_Amt=" + policy_Amt
				+ ", policy_Maturity=" + policy_Maturity + "]";
	}
	
	
}
