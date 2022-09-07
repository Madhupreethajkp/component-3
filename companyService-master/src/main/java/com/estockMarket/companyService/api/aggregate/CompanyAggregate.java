package com.estockMarket.companyService.api.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.estockMarket.companyService.command.api.commands.CompanyCreateCommand;
import com.estockMarket.companyService.command.api.commands.DeleteCompanyCommand;
import com.estockMarket.companyService.events.CompanyCreatedEvent;
import com.estockMarket.companyService.events.CompanyDeletedEvent;

@Aggregate
public class CompanyAggregate {
	
	@AggregateIdentifier
	private String uuid;
	private String companyCode;
	private String companyName;
	private String ceoName;
	private String turnOver; 
	private String website;
	private String enlistedStockMarkets;
	
	
	public CompanyAggregate() {
//		super();
	}

//	public CompanyAggregate(String uuid, String companyCode, String companyName, String ceoName, String turnOver,
//			String website, String enlistedStockMarkets) {
//		super();
//		this.uuid = uuid;
//		this.companyCode = companyCode;
//		this.companyName = companyName;
//		this.ceoName = ceoName;
//		this.turnOver = turnOver;
//		this.website = website;
//		this.enlistedStockMarkets = enlistedStockMarkets;
//	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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


//	public CompanyAggregate() {
//		
//	}
//	
	@CommandHandler
	public CompanyAggregate(CompanyCreateCommand cmd) {
		
		CompanyCreatedEvent event = CompanyCreatedEvent.builder()
										.ceoName(cmd.getCeoName())
										.companyCode(cmd.getCompanyCode())
										.companyName(cmd.getCompanyName())
										.enlistedStockMarkets(cmd.getEnlistedStockMarkets())
										.turnOver(cmd.getTurnOver())
										.website(cmd.getWebsite())
										.uuid(cmd.getUuid())
										.build();
		System.out.println("event");
		System.out.println(event);
		
		AggregateLifecycle.apply(event);
	}

	
	@CommandHandler
	public CompanyAggregate(DeleteCompanyCommand cmd) {
		CompanyDeletedEvent event = CompanyDeletedEvent.builder()
										.uuid(cmd.getUuid())
										.companyCode(cmd.getCompanyCode())
										.build();
		AggregateLifecycle.apply(event);
		
	}
	
	@EventSourcingHandler
	public void on(CompanyCreatedEvent event) {
		this.ceoName = event.getCeoName();
		this.setCompanyCode(event.getCompanyCode());
		this.setCompanyName(event.getCompanyName());
		this.enlistedStockMarkets = event.getEnlistedStockMarkets();
		this.turnOver = event.getTurnOver();
		this.website = event.getWebsite();
		this.uuid = event.getUuid();
		System.out.println("event sourcing handler");
		System.out.println(event);
	}
	
	@EventSourcingHandler
	public void on(CompanyDeletedEvent event) {
		this.setCompanyCode(event.getCompanyCode());
		this.uuid = event.getUuid();
	}

	
}
