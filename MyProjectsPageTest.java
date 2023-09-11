import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class MyProjectsPageTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sujat\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://qamyprojects.ccbp.tech/");

        //First Project

        WebElement firstProjectEl = driver.findElement(By.cssSelector("div[class *= 'my-projects'] > div:first-of-type > :first-child"));
        firstProjectEl.click();

        WebElement titleEl1 = driver.findElement(By.cssSelector("div[class = 'advanced-technologies-card'] > :first-child"));
        WebElement descEl1 = driver.findElement(By.cssSelector("div[class = 'advanced-technologies-card'] > :nth-child(2)"));
        WebElement backBtnEl1 = driver.findElement(By.cssSelector("div[class = 'advanced-technologies-card'] > button:last-of-type"));

        System.out.println(titleEl1.getText());
        System.out.println(descEl1.getText());
        backBtnEl1.click();

        //Second Project

        WebElement secondProjectEl = driver.findElement(By.cssSelector("div[class *= 'my-projects'] > div:first-of-type > :last-child"));
        secondProjectEl.click();

        List<WebElement> diwaliItems = driver.findElements(By.cssSelector("div[class *= 'diwali-card-item'] > :nth-child(2)"));

        List<WebElement> diwaliPrices = driver.findElements(By.cssSelector("div[class *= 'diwali-card-item'] > :last-child"));

        for(int i=0;i<diwaliItems.size();i++){
            System.out.println(diwaliItems.get(i).getText()+" : "+diwaliPrices.get(i).getText());
        }

        WebElement backBtnEl2 = driver.findElement(By.cssSelector("div[class *= 'diwali-bottom'] > :last-child button"));
        backBtnEl2.click();

        //Third Project

        WebElement thirdProjectEl = driver.findElement(By.cssSelector("div[class *= 'my-projects'] > div:last-of-type > :first-child"));
        thirdProjectEl.click();

        WebElement titleEl2 = driver.findElement(By.cssSelector("div[class = 'order-card'] > :first-child"));
        WebElement descEl2 = driver.findElement(By.cssSelector("div[class = 'order-card'] > :nth-child(2)"));
        WebElement backBtnEl3 = driver.findElement(By.cssSelector("div[class = 'order-card'] > button:last-of-type"));

        System.out.println(titleEl2.getText());
        System.out.println(descEl2.getText());

        backBtnEl3.click();

        //Fourth project

        WebElement fourthProjectEl = driver.findElement(By.cssSelector("div[class *= 'my-projects'] > div:last-of-type > :last-child"));
        fourthProjectEl.click();

        WebElement categoryEl = driver.findElement(By.cssSelector("div[class = 'news-card'] > :first-child"));
        WebElement titleEl3 = driver.findElement(By.cssSelector("div[class = 'news-card'] > :nth-child(2)"));
        WebElement descEl3 = driver.findElement(By.cssSelector("div[class = 'news-card'] > :nth-child(3)"));
        WebElement backEl4 = driver.findElement(By.cssSelector("div[class = 'news-card'] > button:last-of-type"));

        System.out.println(categoryEl.getText());
        System.out.println(titleEl3.getText());
        System.out.println(descEl3.getText());

        backEl4.click();

        driver.quit();



    }
}













