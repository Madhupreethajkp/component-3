package com.estockMarket.stockService.command.api.events;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@Builder
public class StockCreatedEvent {

	private String uuid;
	private String companyCode;
	private String stockPrice;
	public StockCreatedEvent() {
		super();
	}
	public StockCreatedEvent(String uuid, String companyCode, String stockPrice) {
		super();
		this.uuid = uuid;
		this.companyCode = companyCode;
		this.stockPrice = stockPrice;
		System.out.println("stock created event cls");
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
