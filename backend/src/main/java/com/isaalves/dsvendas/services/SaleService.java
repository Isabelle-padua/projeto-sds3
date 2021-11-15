package com.isaalves.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isaalves.dsvendas.dto.SaleDTO;
import com.isaalves.dsvendas.dto.SaleSucessDTO;
import com.isaalves.dsvendas.dto.SaleSumDTO;
import com.isaalves.dsvendas.entities.Sale;
import com.isaalves.dsvendas.repositories.SaleRepository;
import com.isaalves.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result =  repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}
}
