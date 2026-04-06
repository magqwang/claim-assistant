package com.maggie.claimassistant.repository;

import com.maggie.claimassistant.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InvoiceRepository extends JpaRepository<Invoice, UUID> {
}