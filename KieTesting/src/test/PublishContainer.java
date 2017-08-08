package test;

import org.junit.Test;
import webservice.CallKie;

public class PublishContainer {

	
	@Test
	public void test() {
		
		String containerName = "KieContainer";
		String artifact = "myProject";
		String group = "myOrganization";
		String version = "1.0.0";
		
		CallKie.publishContainer(containerName, artifact, group, version);
	}
}
