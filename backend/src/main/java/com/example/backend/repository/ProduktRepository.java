package com.example.backend.repository;

import com.example.backend.entity.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProduktRepository extends JpaRepository <Produkt, Long>{

}
