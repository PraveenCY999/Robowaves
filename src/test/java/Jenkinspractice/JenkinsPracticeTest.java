package Jenkinspractice;

import org.testng.annotations.Test;

public class JenkinsPracticeTest {
	@Test
	public void jenkinsPracticeTest()
	{
		System.out.println("hi Jenkin");
		String data = System.getProperty("rcb");
		System.out.println(data);
	}

}
