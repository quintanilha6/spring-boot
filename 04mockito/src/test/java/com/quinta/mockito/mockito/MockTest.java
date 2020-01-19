package com.quinta.mockito.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MockTest {

	@Test
	void test_findGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,6,15});
		
		BusinessImplementation businessImplementation = new BusinessImplementation(dataServiceMock);
		int res = businessImplementation.findGreatestFromAllData();
		assertEquals(24, res);
	}
	
	@Test
	void test_findGreatestFromAllData_ForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
		
		BusinessImplementation businessImplementation = new BusinessImplementation(dataServiceMock);
		int res = businessImplementation.findGreatestFromAllData();
		assertEquals(15, res);
	}
}
