package ch07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class NewsManage extends BaseTest {

	@Test
	public void addNews() throws InterruptedException{
		loginSuccess();
		wd.findElement(By.xpath("//h2[contains(.,'������Ϣ����')]")).click();
	 	wd.findElement(By.linkText("��ӵ�Ӱ������Ϣ")).click();
		Thread.sleep(3000);
		wd.findElement(By.name("title")).sendKeys("���ߵ���ȭ");
		wd.findElement(By.name("title2")).sendKeys("���ߵ���ȭ�����黨");
		wd.findElement(By.name("author")).sendKeys("����");
		wd.findElement(By.name("edit")).sendKeys("�ų���");
		wd.findElement(By.name("source")).sendKeys("�����黨Ӱҵ");
        wd.findElement(By.name("picname")).sendKeys("D:\\demo\\baidu.jpg");
		wd.findElement(By.name("summary")).sendKeys("�����ȭ�����ӵİ�����");
		wd.findElement(By.name("explain")).sendKeys("�����ȭ�����ӵİ������������Σ�");

		wd.findElement(By.xpath("//input[@name='status' and  @value='4']")).click();

//		wd.switchTo().frame("xhe0_iframe");
//		wd.findElement(By.tagName("body")).click();
//		wd.findElement(By.tagName("body")).sendKeys("�����ȭ�����ӵİ������������Σ���"
//				+ "�����������ʮ�������������С�������Σ���һ��ԩ�ң�û�뵽��Ϊһ������ĵ������Ů���廥�����Ա���Һ����˻��ӻ�����������ȭ̳�Ĵ����Ҳ�ҿ��˼�ȭ������ܣ�����һ���鷳�����������ڡ������š������������ǣ������Σ���ָ���£�"
//				+ "����������������ߵ���ȭ");
//		wd.switchTo().defaultContent();

		wd.findElement(By.xpath("//input[@name='state' and  @value='3']")).click();

		action.sendKeys(Keys.TAB);
		wd.findElement(By.tagName("iframe")).sendKeys("�����ȭ�����ӵİ������������Σ���"
				+ "�����������ʮ�������������С�������Σ���һ��ԩ�ң�û�뵽��Ϊһ������ĵ������Ů���廥�����Ա���Һ����˻��ӻ�����������ȭ̳�Ĵ����Ҳ�ҿ��˼�ȭ������ܣ�����һ���鷳�����������ڡ������š������������ǣ������Σ���ָ���£�"
				+ "����������������ߵ���ȭ");
		Thread.sleep(5000);
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		
	}
}
