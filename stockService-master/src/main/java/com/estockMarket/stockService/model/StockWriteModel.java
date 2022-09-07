package com.estockMarket.stockService.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data

@Builder

public class StockWriteModel {

	private int id;
	private String companyCode;
	private LocalDateTime startDateTime;
	private LocalDateTime endDateTime;
	private String stockPrice;
	public StockWriteModel() {
		super();
	}
	public StockWriteModel(int id, String companyCode, LocalDateTime startDateTime, LocalDateTime endDateTime,
			String stockPrice) {
		super();
		this.id = id;
		this.companyCode = companyCode;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.stockPrice = stockPrice;
		System.out.println("stock write model");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public LocalDateTime getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(LocalDateTime startDateTime) {
		this.startDateTime = startDateTime;
	}
	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}
}
