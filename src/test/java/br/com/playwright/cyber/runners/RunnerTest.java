package br.com.playwright.cyber.runners;

import org.junit.runner.RunWith;

import br.com.playwright.cyber.core.Browsers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "br.com.playwright.cyber",
		tags = { 
					"@tag1"
				},
		plugin = { 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target/json/report.json", 
				},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false, 
		strict = true
		)
public class RunnerTest {
	
	public static boolean HEADLESS = true;
	public static Browsers BROWSER = Browsers.FIREFOX;
}
