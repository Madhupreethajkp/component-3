package com.estockMarket.stockService.query.api.queries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class GetStockQuery {
	private String companyCode;

	public GetStockQuery() {
		super();
	}

	public GetStockQuery(String companyCode) {
		super();
		this.companyCode = companyCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
}
