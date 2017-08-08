package test;

import org.junit.Test;

import webservice.CallKie;

public class DeleteContainer {

	@Test
	public void test() {
		
		String containerName = "KieContainer";
		
		CallKie.deleteContainer(containerName);
	}

}
