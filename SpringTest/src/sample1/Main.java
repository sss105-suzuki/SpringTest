package sample1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {
	public static void main(String[] args){
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		CallName cn = factory.getBean("callName",CallName.class);
		cn.callName("go my own way!");
	}
}
