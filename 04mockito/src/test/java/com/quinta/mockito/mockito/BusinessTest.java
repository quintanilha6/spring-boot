package com.quinta.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BusinessTest {

	@Test
	void test_findGreatestFromAllData() {
		BusinessImplementation businessImplementation = new BusinessImplementation(new DataServiceStub());
		int res = businessImplementation.findGreatestFromAllData();
		assertEquals(24, res);
	}

}


class DataServiceStub implements DataService {
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {24,6,15};
	}
}