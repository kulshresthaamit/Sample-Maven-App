package com.amit.workshop;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {

	private final ByteArrayOutputStream outputContent= new ByteArrayOutputStream();
	
	
	@Before
	
	public void setUpstream(){
		System.setOut(new PrintStream(outputContent));
	}
	
	@Test
	public void testAppConstructor() {
		
		try{
			new Application();
		}catch(Exception e){
			fail("Constructor Failed");
		}
		
	}
	
	public void testapplicationMain(){
		Application.main(null);
		try{
			assertEquals("Welcome From Amit" + System.getProperty("line.seprator"), outputContent.toString());
		}catch(Exception e){
			
		}
	}

}
