package week3.day2.Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");         //1. Launch the URL https://www.ajio.com/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//3. To the left  of the screen under " Gender" click the "Men"
		//driver.findElement(By.id("Men")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		//5. Print the count of the items Found.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String itemCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The count of items are: " +itemCount);
		System.out.println("==============================Brand Name Of Bags==================================");
		List<WebElement> brandName= driver.findElements(By.xpath("//div[@class='brand']"));
		for(int i=0;i<brandName.size();i++) {
		System.out.println(brandName.get(i).getText());
		}
		System.out.println("==============================Name Of Bags==================================");
		List<WebElement> nameOfBags = driver.findElements(By.xpath("//*[@class=\"name\"]"));
		for(int j=0 ; j<nameOfBags.size();j++) {
			System.out.println(nameOfBags.get(j).getText());
	}
	}
}

//Assignment 2
//1. Launch the URL https://www.ajio.com/
//2. In the search box, type as "bags" and press enter
//3. To the left  of the screen under " Gender" click the "Men"
//4. Under "Category" click "Fashion Bags"
//5. Print the count of the items Found. 
//6. Get the list of brand of the products displayed in the page and print the list.
//7. Get the list of names of the bags and print it.