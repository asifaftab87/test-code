package org.la.student.one.tahir.repository;

import java.util.List;

import org.la.student.one.tahir.model.Balance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController("tahirBalanceRepository")
public interface BalanceRepository  extends JpaRepository<Balance, Long>{


}
