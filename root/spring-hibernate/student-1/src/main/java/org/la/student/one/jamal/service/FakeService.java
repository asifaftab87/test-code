package org.la.student.one.jamal.service;

import org.springframework.stereotype.Service;

@Service("jamalFakeService")
public class FakeService {
	
	public String findByName() {
		return "Jamal";
	}

}
