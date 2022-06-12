import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
//        wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

//        wd.close();
        wd.quit();
    }

    @Test
    public void firstTest() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");

        //open form click log button
        WebElement loginTab;
        loginTab.click();

        //fill valid email
        WebElement emailTextBox;
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("valid@mail.com");

        //fill valid pssword
        WebElement passwordTextBox;
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("ValidPassword_123");

        //click log button
        WebElement loginButton;
        loginButton.click();

        //Assert


    }
}

