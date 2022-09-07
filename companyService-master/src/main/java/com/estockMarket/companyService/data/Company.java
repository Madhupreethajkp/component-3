package com.estockMarket.companyService.data;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.estockMarket.stockService.data.Stock;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name = "companyCode")
	private String companyCode;

	@Column(name =  "companyName")
	private String companyName;

	@Column(name =  "ceoName")
	private String ceoName;

	@Column(name =  "turnOver")
	private String turnOver;

	@Column(name =  "website")
	private String website;

	
	@Column(name = "enlistedStockMarkets", columnDefinition = "text")
	private String enlistedStockMarkets;


	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCeoName() {
		return ceoName;
	}


	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}


	public String getTurnOver() {
		return turnOver;
	}


	public void setTurnOver(String turnOver) {
		this.turnOver = turnOver;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEnlistedStockMarkets() {
		return enlistedStockMarkets;
	}


	public void setEnlistedStockMarkets(String enlistedStockMarkets) {
		this.enlistedStockMarkets = enlistedStockMarkets;
	}


	public Company(String companyCode, String companyName, String ceoName, String turnOver, String website,
			String enlistedStockMarkets) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
		this.website = website;
		this.enlistedStockMarkets = enlistedStockMarkets;
		System.out.println("company data cls");
	}


	public Company() {
		super();
	}

}
