package org.la.student.one.jamal.service.impl;

import org.la.student.one.jamal.service.FakeVehicleI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("jamalBMW")
@Qualifier("bmw")
public class BMW implements FakeVehicleI{

	@Override
	public String name() {
		return "BMW";
		
	}

}
