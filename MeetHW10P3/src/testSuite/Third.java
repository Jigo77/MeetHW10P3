package testSuite;

import browserFactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Third extends BaseTest {

    String baseUrl = "http://the-internet.herokuapp.com/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void test1() throws InterruptedException {


        WebElement emailfeild = driver.findElement(By.name("username"));
        emailfeild.sendKeys("tomsmith");

        WebElement passwordfeild = driver.findElement(By.name("password"));
        passwordfeild.sendKeys("SuperSecretPasswor");

        WebElement loginbutton = driver.findElement(By.xpath("//button"));
        loginbutton.click();

       /* WebElement welcomeMessage=driver.findElement(By.xpath("//div[@class='flash error']"));

        String actualMessage = welcomeMessage.getText();
        String expectedMessage = "Your password is invalid!";
        Assert.assertEquals("Verifying Invalid Password", expectedMessage,actualMessage);

        System.out.println(actualMessage);*/

    }


    @After
    public void tearDown() {

        //closeBrowser();
    }
}
