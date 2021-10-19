package com.isaalves.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isaalves.dsvendas.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
