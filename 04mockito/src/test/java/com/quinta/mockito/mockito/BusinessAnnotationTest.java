package com.quinta.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BusinessAnnotationTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	BusinessImplementation businessImplementation;
	
	@Test
	void test_findGreatestFromAllData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,6,15});
		int res = businessImplementation.findGreatestFromAllData();
		assertEquals(24, res);
	}
	
	@Test
	void test_findGreatestFromAllData_ForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});		
		int res = businessImplementation.findGreatestFromAllData();
		assertEquals(15, res);
	}
	
	@Test
	void test_findGreatestFromAllData_ForNoValues() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});		
		int res = businessImplementation.findGreatestFromAllData();
		assertEquals(Integer.MIN_VALUE, res);
	}
}

