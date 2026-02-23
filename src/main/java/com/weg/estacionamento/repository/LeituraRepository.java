package com.weg.estacionamento.repository;

import com.weg.estacionamento.model.Leitura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeituraRepository extends JpaRepository<Leitura, Long> {
}
