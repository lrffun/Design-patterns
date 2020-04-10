package ����ģʽ;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	public static Object getBean() {
		
		try {
			//����DOM�ĵ�����
			
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();			
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc =  builder.parse(new File("config.xml"));
			
			//��ȡ�����������ı����
			NodeList nl = doc.getElementsByTagName("factoryName");
			Node classNode = nl.item(0).getFirstChild();
			String cName = classNode.getNodeValue();
			//ͨ����������ʵ�����󲢽��䷵��
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		}catch(Exception e) {
			System.out.println("IO����");
		}
		return null;
	}
}
