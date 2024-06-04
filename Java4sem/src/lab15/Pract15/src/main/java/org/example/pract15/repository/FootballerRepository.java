package org.example.pract15.repository;

import jakarta.persistence.criteria.Order;
import org.example.pract15.model.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballer, Integer> {
}
