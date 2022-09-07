package com.estockMarket.stockService.query.api.queries;

import java.util.Date;

import org.springframework.data.domain.Pageable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class GetStocksQuery {

	private String companyCode;
	private String startDate;
	private String endDate;
	private int pageNo;
	private int size;
	public GetStocksQuery() {
		super();
	}
	public GetStocksQuery(String companyCode, String startDate, String endDate, int pageNo, int size) {
		super();
		this.companyCode = companyCode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.pageNo = pageNo;
		this.size = size;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
