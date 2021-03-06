package org.la.student.one.tahir.repository;

import java.util.List;


import org.la.student.one.tahir.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController("tahirAddressRepository")
public interface AddressRepository extends JpaRepository<Address, Long>{

	public List<Address> findByCity(String name);
}
