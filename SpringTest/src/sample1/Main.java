package sample1;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
	public static void main(String[] args){
		//�C���X�^���X��������
		DefaultListableBeanFactory  factory2 = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory2);
		//beans.xml�ǂݍ���(�N���X�p�X���ォ��͓ǂݍ��߂Ȃ��H)
		reader.loadBeanDefinitions((Resource)new ClassPathResource("./beans.xml"));
		//�C���X�^���X����
		CallName cN = factory2.getBean("callName", CallName.class);
		//�C���X�^���X���\�b�h���s
		cN.callName("go my own way!");
	}
}
