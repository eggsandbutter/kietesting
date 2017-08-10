package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import myorganization.myproject.bom.MyObject;
import webservice.CallKie;

public class TestProcess {

	@Test
	public void test() {
		
		MyObject myObject = new MyObject();
		myObject.setMyID(2);
		
		List<String> classNames = new ArrayList<String>();
		classNames.add(myObject.getClass().getName());
		
		List<Object> objects = new ArrayList<Object>();
		objects.add(myObject);
		
		String sessionName = "kieSessionProcessStateful";
		String processID = "myProject.MyFirstProcess";
		String containerName = "KieContainer";

		HashMap<String, Object> globals = null;
				
		CallKie.executeProcess(containerName, sessionName, classNames, objects, globals, processID, CallKie.REST_JAXB);
	}

}
