package TestCases;

import Base.Base;
import Locators.Booking;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.print.Book;
import java.util.concurrent.TimeUnit;

public class ExecBooking extends Base
{
    Booking b;
//    WebDriverWait wait = new WebDriverWait(driver, 30);

    @Test
    public void bookHotel() throws InterruptedException
    {
        b = new Booking(this.driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);
//        b.SelectHotel("Switzerland");
        b.clickHotelsTab();
        b.clickSearchField("Switzerland");
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"typeahead_results\"]/a[1]")));
//       driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Waited for location to appear");

        b.selectLocation();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        System.out.println("Location has been selected");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[4]")));
        System.out.println("Waited to locate date");
        b.selectStartDate();
        System.out.println("Start date has been selected!");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Fri May 27 2022']")));
        b.selectEndDate();
        System.out.println("End date has been selected!");

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Fri May 27 2022']")));
        b.addNumberofChildren();
        b.selectAge();
        b.Update();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("scroll(0, 550);");

        b.selectClass();
        String Hotel_Name = b.selectHotel();

        System.out.println("Hotel name is: " + Hotel_Name);



    }

}
