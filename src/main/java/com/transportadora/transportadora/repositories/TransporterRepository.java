package com.transportadora.transportadora.repositories;

import com.transportadora.transportadora.domain.Transporter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransporterRepository extends JpaRepository<Transporter, Integer> {
}
