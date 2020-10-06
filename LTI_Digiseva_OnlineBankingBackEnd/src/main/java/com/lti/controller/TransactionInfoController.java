package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dto.BeneficiaryDTO;
import com.lti.dto.TransactionDTO;
import com.lti.service.TransactionInfoService;

@RestController
@RequestMapping(path = "transaction")
@CrossOrigin
public class TransactionInfoController {
	
	@Autowired
	private TransactionInfoService transactionInfoService;
	
	
	//http://localhost:9091/Digiseva/transaction/addbeneficiary
	@PostMapping(path = "/addbeneficiary")
	public void addBeneficiary(@RequestBody BeneficiaryDTO beneficiaryDTO)
	{
		transactionInfoService.addBeneficiary(beneficiaryDTO);
	}
	
	//http://localhost:9091/Digiseva/transaction/addtransaction
	@PostMapping(path = "/addtransaction")
	public int addTransaction(@RequestBody TransactionDTO transactionDTO)
	{
		return transactionInfoService.addTransaction(transactionDTO);
	}
	
	//http://localhost:9091/Digiseva/transaction/checktransaction
	@PostMapping(path = "/checktransaction")
	public int checkTransaction(@RequestBody TransactionDTO transactionDTO)
	{
		return transactionInfoService.checkTransaction(transactionDTO);
	}
	
	//http://localhost:9091/Digiseva/transaction/addsavedpayment
	@PostMapping(path = "/addsavedpayment")
	public void addSavedPayment(@RequestBody TransactionDTO transactionDTO)
	{
		transactionInfoService.addSavedPayment(transactionDTO);
	}
	
	
	//http://localhost:9091/Digiseva/transaction/getallsavedpayments
	@GetMapping(path = "/getallsavedpayments")
	public List<TransactionDTO> getAllSavedPayments()
	{
		return transactionInfoService.getAllSavedPayments("6800813201");
	}

}
