package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import myorganization.myproject.bom.MyObject;
import webservice.CallKie;

public class TestStateless {
	
	private static final String sessionName = "kieSessionStateless";
	private static final String containerName = "KieContainer";
	private static MyObject getMyObject() {

		MyObject myObject = new MyObject();
		
		myObject.setMyID(0);
		myObject.setMyDescription("description");
		
		return myObject;
	}

	@Test
	public void testJaxB() {
		MyObject myObject = getMyObject();
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(myObject.getClass().getName());
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(myObject);
		
		HashMap<String, Object> globals = new HashMap<String, Object>();
		globals.put("globalList", new java.util.ArrayList<>());
		
		CallKie.executeStateless(containerName, sessionName, classNames, objects, globals, CallKie.REST_JAXB);
	}


	@Test
	public void testJson() {
		MyObject myObject = getMyObject();
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(myObject.getClass().getName());
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(myObject);
		
		HashMap<String, Object> globals = new HashMap<String, Object>();
		globals.put("globalList", new java.util.ArrayList<>());
		
		CallKie.executeStateless(containerName, sessionName, classNames, objects, globals, CallKie.REST_JSON);
	}

	@Test
	public void testXStream() {
		MyObject myObject = getMyObject();
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(myObject.getClass().getName());
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(myObject);
		
		HashMap<String, Object> globals = new HashMap<String, Object>();
		globals.put("globalList", new java.util.ArrayList<>());
		
		CallKie.executeStateless(containerName, sessionName, classNames, objects, globals, CallKie.REST_XSTREAM);
	}

}
