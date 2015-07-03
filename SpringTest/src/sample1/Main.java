package sample1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args){
		//インスタンス生成準備
		DefaultListableBeanFactory  factory2 = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory2);
		//beans.xml読み込み(クラスパスより上からは読み込めない？)
		reader.loadBeanDefinitions((Resource)new ClassPathResource("./beans.xml"));
		//インスタンス生成
		CallName cN = factory2.getBean("callName", CallName.class);
		//インスタンスメソッド実行
		cN.callName("go my own way!");
	}
}
