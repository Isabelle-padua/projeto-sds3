package com.isaalves.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaalves.dsvendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
