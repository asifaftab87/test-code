package org.ecom.noor.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.Company;
import org.ecom.noor.repository.CompanyRepository;
import org.ecom.util.GetSqlConnection;

public class CompanyService {
	
private Connection con = null;
	
	public CompanyService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<Company> getAllCompany(){
		
		List<Company> companyList = new ArrayList<>();
		
		if(con!=null) {
			companyList = CompanyRepository.getAllCompany(con);
		}
		
		return companyList;
	}
	
	public Company findCompanyById(long id){
		
		Company company = null;
		
		if(con!=null) {
			company = CompanyRepository.findCompanyById(con, id);
		}
		
		return company;
	}
	
	public int deleteCompanyById(long companyId) {
		return CompanyRepository.deleteCompanyById(con, companyId);
	}
	
	public void createCompany(Company company) {
		CompanyRepository.createCompany(con, company);
	}
	
	
	public void updateCompany(Company company) {
		CompanyRepository.updateCompany(con, company);
	}
	
	public List<Company> getCompanyByName(String name){
		return CompanyRepository.getCompanyByName(con, name);
	}
	

}
