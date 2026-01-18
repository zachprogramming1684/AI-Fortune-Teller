package com.zachprogramming.aifortuneteller.Repository;

import com.zachprogramming.aifortuneteller.Models.Fortune;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FortuneRepository extends JpaRepository<Fortune, Long> {}
