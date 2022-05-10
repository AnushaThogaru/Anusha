package MavenExample;

import org.testng.annotations.Test;

public class ReadingDataFromCommandLineTest {
	@Test(groups="smoke")
public void readingdatafromtest()
{
	
	System.out.println("executing pollscm3");
	String URL=System.getProperty("url");
	String UN=System.getProperty("username");
	String PWD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(UN);
	System.out.println(PWD);
}

@Test(groups="regression")
public void regressionTest()
{
	System.out.println("This is regression test");
}
}
