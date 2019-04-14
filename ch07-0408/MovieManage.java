package ch07;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MovieManage extends BaseTest{


	@Test
	public void addMovie() throws InterruptedException{
		loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'ӰƬ����')]")).click();
	 
		Thread.sleep(3000);

	
	    wd.findElement(By.xpath("//a[@title='���ӰƬ']/span")).click();
	    Thread.sleep(3000);
		wd.findElement(By.name("filmname")).sendKeys("121212");
		wd.findElement(By.name("petname")).sendKeys("zhanlang");
		wd.findElement(By.name("director")).sendKeys("�⾩");
		wd.findElement(By.name("editor")).sendKeys("�⾩");
		wd.findElement(By.name("nation")).sendKeys("�й�");
		wd.findElement(By.name("language")).sendKeys("����");
		wd.findElement(By.name("showtime")).sendKeys("2017-11-01");
		
		wd.findElement(By.name("minutes")).sendKeys("120");
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\baidu.jpg");
		Thread.sleep(3000);
		
		wd.switchTo().frame(0);
		wd.findElement(By.tagName("body")).click();
		wd.findElement(By.tagName("body")).sendKeys("��Ӱ����");
		wd.switchTo().defaultContent();
		wd.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
	}
	
	@Test
	public void addActor() throws InterruptedException{
		loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'ӰƬ����')]")).click();
		wd.findElement(By.xpath("//*[@id='sidebar']/div[2]/div[6]/ul/li[2]/div/div[1]")).click();
		wd.findElement(By.xpath("//a[@title='�����Ա��Ϣ']")).click();
	    
		wd.findElement(By.name("cname")).sendKeys("��ٳ");
		wd.findElement(By.name("ename")).sendKeys("jessie");
		wd.findElement(By.linkText("- - ��ѡ�� - -")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("˫����")).click();
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@value='1' and @name='sex']")).click();
		wd.findElement(By.name("birthday")).sendKeys("1993-04-14");
		wd.findElement(By.name("bornaddress")).sendKeys("����");		
		wd.findElement(By.name("professtion")).sendKeys("��Ա");		
		wd.findElement(By.name("picname")).sendKeys("D:\\demo\\baidu.jpg");
		wd.findElement(By.tagName("button")).click();
		
		Thread.sleep(1000);
		assertTrue(wd.getPageSource().contains("�ɹ�"));
	
	}


//	@Test
	public void deleteMovie() throws InterruptedException {
		this.loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'ӰƬ����')]")).click();
		Thread.sleep(3000);
	    wd.findElement(By.xpath("//a[@title='���ӰƬ��Ϣ']")).click();
	  
	    List<WebElement> tables = wd.findElements(By.tagName("table"));
		WebElement table = tables.get(1);//����ֵ��0��ʼ
		table.findElement(By.tagName("td")).click();
		wd.findElement(By.xpath("//span[contains(.,'ɾ��')]")).click();
		wd.findElement(By.xpath("//span[contains(.,'ȷ��')]")).click();
		
		
		Thread.sleep(5000);
	}
//	@Test
	public void deleteReview() throws InterruptedException {
		this.loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'FolderӰ������')]")).click();
		Thread.sleep(3000);
		wd.findElement(By.linkText("���������Ϣ")).click();
		Thread.sleep(3000);
		for (int i = 1; i < 75; i++) {
			List<WebElement> tables = wd.findElements(By.tagName("table"));
			WebElement table = tables.get(2);
			table.findElement(By.tagName("div")).click();
			wd.findElement(By.xpath("//span[contains(.,'ɾ��')]")).click();
			wd.findElement(By.xpath("//span[contains(.,'ȷ��')]")).click();
			Thread.sleep(3000);
		}

	}
}
