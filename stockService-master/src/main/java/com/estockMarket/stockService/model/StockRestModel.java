package com.estockMarket.stockService.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StockRestModel {

	private String companyCode;
	private String stockPrice;
	public StockRestModel() {
		super();
	}
	public StockRestModel(String companyCode, String stockPrice) {
		super();
		this.companyCode = companyCode;
		this.stockPrice = stockPrice;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}

}
