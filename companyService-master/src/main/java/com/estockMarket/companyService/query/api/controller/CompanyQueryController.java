package com.estockMarket.companyService.query.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estockMarket.companyService.model.CompanyReadModel;
import com.estockMarket.companyService.query.api.queries.GetCompaniesQuery;
import com.estockMarket.companyService.query.api.queries.GetCompanyQuery;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

//@CrossOrigin(origins = "*")

@RestController

@RequestMapping("/api/v1.0/market/company/")
@Tag(name = "Company API", description = "API to fetch company")
public class CompanyQueryController {
	private QueryGateway queryGateway;
	
	private static final Logger logger = LoggerFactory.getLogger(CompanyQueryController.class);

	public CompanyQueryController(QueryGateway queryGateway) {
		this.queryGateway = queryGateway;
	}
	
	@GetMapping("info/{companyCode}")
	@Operation(summary = "Fetches the company details")
	public CompanyReadModel getProfileBasedOnCode(@PathVariable String companyCode) throws InterruptedException, ExecutionException {
		
		logger.info("Request to fetch company details with code:" + companyCode);
		
		GetCompanyQuery getCompanyQuery = new GetCompanyQuery();
		getCompanyQuery.setCompanyCode(companyCode);
		
		CompletableFuture<CompanyReadModel> future = queryGateway.query(getCompanyQuery, ResponseTypes.instanceOf(CompanyReadModel.class));
//        List<CompanyReadModel> res_list = new ArrayList();
//        for(int itr=0;itr<future.size();itr++) {
//            boolean resp = res_list.contains(future.get(itr));
//            if(!resp) {
//                res_list.add(future.get(itr));
//            }
//        }

		System.out.println("type future");
		System.out.println(future.getClass().getSimpleName());
		return future.get();
	
	}
	@CrossOrigin(origins = "http://estockmarket-fse.s3-website-us-east-1.amazonaws.com")	
	@GetMapping("getall")
	@Operation(summary = "Fetches all the companies details with latest stock price")
	public List<CompanyReadModel> getAllCompanies() throws InterruptedException, ExecutionException{
		GetCompaniesQuery getCompaniesQuery = new GetCompaniesQuery();
        List<CompanyReadModel> getallcompanylist=queryGateway.query(getCompaniesQuery,ResponseTypes.multipleInstancesOf(CompanyReadModel.class)).get();
        List<CompanyReadModel> res_list = new ArrayList();
        for(int itr=0;itr<getallcompanylist.size();itr++) {
            boolean resp = res_list.contains(getallcompanylist.get(itr));
            if(!resp) {
                res_list.add(getallcompanylist.get(itr));
            }
        }
        return res_list;
//		GetCompaniesQuery getCompaniesQuery = new GetCompaniesQuery();
//		
//		
//		return queryGateway.query(getCompaniesQuery,ResponseTypes.multipleInstancesOf(CompanyReadModel.class)).get();
		
	}
}


