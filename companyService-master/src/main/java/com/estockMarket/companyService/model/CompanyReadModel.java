package com.estockMarket.companyService.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Document(collection = "company")
public class CompanyReadModel {

	@Id
	private String company_code;

	private String company_name;

	private String ceo_name;

	private String turn_over;

	private String website;

	private String enlisted_stock_markets;
	
	private Stock stock;

	public CompanyReadModel() {
		super();
	}

	public CompanyReadModel(String company_code, String company_name, String ceo_name, String turn_over, String website,
			String enlisted_stock_markets, Stock stock) {
		super();
		this.company_code = company_code;
		this.company_name = company_name;
		this.ceo_name = ceo_name;
		this.turn_over = turn_over;
		this.website = website;
		this.enlisted_stock_markets = enlisted_stock_markets;
		this.stock = stock;
	}

	public String getCompany_code() {
		return company_code;
	}

	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCeo_name() {
		return ceo_name;
	}

	public void setCeo_name(String ceo_name) {
		this.ceo_name = ceo_name;
	}

	public String getTurn_over() {
		return turn_over;
	}

	public void setTurn_over(String turn_over) {
		this.turn_over = turn_over;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEnlisted_stock_markets() {
		return enlisted_stock_markets;
	}

	public void setEnlisted_stock_markets(String enlisted_stock_markets) {
		this.enlisted_stock_markets = enlisted_stock_markets;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}
	
}
