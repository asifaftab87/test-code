package org.la.student.one.tahir.repository;

import java.util.List;

import org.la.student.one.tahir.model.Brands;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandsRepository  extends JpaRepository<Brands, Long>{

	public List<Brands> findByBrandName(String name);
}
