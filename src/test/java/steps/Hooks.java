package steps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks {
	@Before
public void beforeMethod(Scenario scene) {
		System.out.println(scene.getName());
		System.out.println(scene.getId());
	}
	@After
	public void afterMethod(Scenario sc) {
		System.out.println(sc.getStatus());
	}
	
}
