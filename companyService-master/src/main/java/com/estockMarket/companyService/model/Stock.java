package com.estockMarket.companyService.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class Stock {

	private String company_code;
	private String date;
	private String time;
	private String stock_price;
	public Stock() {
		super();
	}
	public Stock(String company_code, String date, String time, String stock_price) {
		super();
		this.company_code = company_code;
		this.date = date;
		this.time = time;
		this.stock_price = stock_price;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStock_price() {
		return stock_price;
	}
	public void setStock_price(String stock_price) {
		this.stock_price = stock_price;
	}
}
