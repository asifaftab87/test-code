package org.la.student.one.jamal.service.impl;

import org.la.student.one.jamal.service.FakeVehicleI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("jamalKIA")
@Qualifier("kia")
public class KIA implements FakeVehicleI{

	@Override
	public String name() {
		return "KIA";
		
	}

}
