package bstorm.akimt.demoTestNG;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups="spring_context")
public class DemoTestNgApplicationTests extends AbstractTestNGSpringContextTests {

	public void contextLoads() {
	}


	@BeforeGroups(groups = "group de group", alwaysRun = true)
	public void testGroup(){
		System.out.println("avant group de group");
	}

}
