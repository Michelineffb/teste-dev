package com.openbanking.consents.model;


import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;



@Document
public class Consents {

	@Id
	private String id;	
	@CPF @NotNull(message = "CPF is mandatory")
	private String loggedUser;
	@CNPJ @NotNull
	private String businessEntity;
	private LocalDate transactionFromDateTime = LocalDate.now(); 
	@DateTimeFormat @NotNull(message = "transactionToDateTime é um campo de preenchimento obrigatório")
	private LocalDate transactionToDateTime;
	
	public String getLoggedUser() {
		return loggedUser;
	}
	public void setLoggedUser(String loggedUser) {
		this.loggedUser = loggedUser;
	}
	
	public LocalDate getTransactionFromDateTime() {
		return transactionFromDateTime;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getTransactionToDateTime() {
		return transactionToDateTime;
	}
	public void setTransactionToDateTime(LocalDate transactionToDateTime) {
		this.transactionToDateTime = transactionToDateTime;
	}
	public String getBusinessEntity() {
		return businessEntity;
	}
	public void setBusinessEntity(String businessEntity) {
		this.businessEntity = businessEntity;
	}
	
}
