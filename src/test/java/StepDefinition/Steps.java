package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

    WebDriver driver;


    @Given("I Open the chrome and launch the application")
    public void iOpenTheChromeAndLaunchTheApplication() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");
        System.out.println("This step open the chrome browser and launch the application");
    }

    @When("I enter the username and password")
    public void iEnterTheUsernameAndPassword() {
        driver.findElement(By.id("first-name")).sendKeys("Dapshad");
        driver.findElement(By.id("last-name")).sendKeys("Olaposky");
        System.out.println("This step enters the username and Password on the login page");
    }

    @Then("reset the credential")
    public void resetTheCredential() {
        driver.findElement(By.linkText("Submit")).click();
        System.out.println(("This step click on the reset button"));
    }
}
