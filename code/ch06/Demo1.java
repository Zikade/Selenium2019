package ch06;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo1 {
	@BeforeClass
	public void bc() {
		System.out.println("demo1-@BeforeClass");
	}
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("test1");
	}
	//ʵ�ֳɹ���¼��
	@Test(description="ʵ�ֳɹ���¼��")
	public void test2() {
		System.out.println("Demo1-test2");
		Reporter.log("��һ�����Է���");
	}

}
