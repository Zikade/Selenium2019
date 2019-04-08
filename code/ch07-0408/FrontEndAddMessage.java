package ch07;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrontEndAddMessage extends BaseTest {
	String url="http://localhost:8032/MyMovie/";
	@Test
	public void test1() throws InterruptedException{
		wd.get(url);
		wd.findElement(By.linkText("��¼")).click();
		WebElement username =new WebDriverWait(wd,3).
				until(ExpectedConditions.elementToBeClickable(By.name("username")));
		username.sendKeys("tom01");
		wd.findElement(By.name("password")).sendKeys("123456");
		wd.findElement(By.xpath("//input[@value='���ϵ�¼']")).click();
		wd.get(url+"index.php/Detail/index/id/39");
		Thread.sleep(3000);
		for(int i=0;i<10;i++){
		wd.findElement(By.id("js_message_textarea")).sendKeys("�����Ӱֵ��һ��,����");
		wd.findElement(By.id("message_button")).click();
		}
		assertTrue(wd.getPageSource().contains(""));
		

		
	}
	
	

}
