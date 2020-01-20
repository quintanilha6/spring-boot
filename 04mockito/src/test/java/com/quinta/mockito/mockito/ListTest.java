package com.quinta.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ListTest {

	@Test
	void testSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
	}
	
	@Test
	void testSize_twoReturns() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	@Test
	void testGet() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Some str");
		assertEquals("Some str", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	void testGet_genericParam() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn(true);
		assertEquals(true, listMock.get(0));
		assertEquals(true, listMock.get(1));
	}

}
