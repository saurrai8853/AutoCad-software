package demo_Com.com_Demo;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource obj=new ClassPathResource("applicationContext.xml");
		BeanFactory bean=new XmlBeanFactory(obj);
		
		Person person=(Person)bean.getBean("person");
		person.person_details();
	}

}
