package org.la.student.one.tahir.repository;

import java.util.List;

import org.la.student.one.tahir.model.Balance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository  extends JpaRepository<Balance, Long>{

	public List<Balance> findByName(String name);
}
