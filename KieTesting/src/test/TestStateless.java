package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import myorganization.myproject.bom.MyObject;
import webservice.CallKie;

public class TestStateless {
	
	private static final String sessionName = "kieSessionStateless";
	private static final String containerName = "kieContainer";
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
		
		CallKie.callWSJaxB(containerName, classNames, objects, sessionName);
	}


	@Test
	public void testJson() {
		MyObject myObject = getMyObject();
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(myObject.getClass().getName());
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(myObject);
		
		CallKie.callWSJSon(containerName, classNames, objects, sessionName);
	}

	@Test
	public void testXStream() {
		MyObject myObject = getMyObject();
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(myObject.getClass().getName());
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(myObject);
		
		CallKie.callWSXStream(containerName, classNames, objects, sessionName);
	}

}
