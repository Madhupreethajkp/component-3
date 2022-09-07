package com.estockMarket.stockService.command.api.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class StockDeletedEvent {
	private String uuid;
	private String companyCode;
	public StockDeletedEvent() {
		super();
	}
	public StockDeletedEvent(String uuid, String companyCode) {
		super();
		this.uuid = uuid;
		this.companyCode = companyCode;
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
}
