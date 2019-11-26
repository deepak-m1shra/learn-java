package com.x.vuinner;

import java.util.Set;

import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNGConcept {

	// Creating a method
	@Test
	public void test_method() {
		System.out.println("This is a test method");
		
		
		// A listener for test running
		ITestListener itest = new ITestListener() {
		};
		
		//Interface to implement to be able to have a chance to retry a failed test.
		IRetryAnalyzer ianalyzer= new IRetryAnalyzer() {
			
			@Override
			public boolean retry(ITestResult result) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		//ItestContext
//		ITestContext cont = new ITestContext()
			
		
		//This class describes the result of a test.
		
		ITestResult it = new ITestResult() {
			
			@Override
			public int compareTo(ITestResult o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void setAttribute(String name, Object value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Object removeAttribute(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Set<String> getAttributeNames() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getAttribute(String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean wasRetried() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void setWasRetried(boolean wasRetried) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setThrowable(Throwable throwable) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTestName(String name) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setStatus(int status) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setParameters(Object[] parameters) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEndMillis(long millis) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isSuccess() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Throwable getThrowable() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTestName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ITestContext getTestContext() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public IClass getTestClass() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getStatus() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public long getStartMillis() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object[] getParameters() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ITestNGMethod getMethod() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getInstanceName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getInstance() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getHost() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object[] getFactoryParameters() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getEndMillis() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
