package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="Features\\tagdemo.Feature",tags= {"@End2End","@SmokeTest,@SanityTest"})

public class Test_Runner {

}
