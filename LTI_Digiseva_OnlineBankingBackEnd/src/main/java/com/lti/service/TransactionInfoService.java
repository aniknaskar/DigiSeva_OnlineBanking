package com.lti.service;

import java.util.List;

import com.lti.dto.BeneficiaryDTO;
import com.lti.dto.TransactionDTO;

public interface TransactionInfoService {
	
	public void addBeneficiary(BeneficiaryDTO beneficiaryDTO);
	public int addTransaction(TransactionDTO transactionDTO);
	public int checkTransaction(TransactionDTO transactionDTO);
	public void addSavedPayment(TransactionDTO transactionDTO);
	public List<TransactionDTO> getAllSavedPayments(String accountNumber);
	

}
