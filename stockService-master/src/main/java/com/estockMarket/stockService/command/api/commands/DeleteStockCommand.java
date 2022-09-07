package com.estockMarket.stockService.command.api.commands;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class DeleteStockCommand {
	@TargetAggregateIdentifier
	private String uuid;
	private String companyCode;
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
	public DeleteStockCommand() {
		super();
	}
	public DeleteStockCommand(String uuid, String companyCode) {
		super();
		this.uuid = uuid;
		this.companyCode = companyCode;
	}
}
