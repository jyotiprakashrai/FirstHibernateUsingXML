package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st=new Student();
		st.setId(111);
		st.setName("abc");
		st.setEmail("abc@gmail.com");
		st.setMarks(555);
		
		Configuration cfg=new Configuration();
		cfg.configure("/resources/hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		s.save(st);
		
		s.beginTransaction().commit();
		s.evict(st);
		

	}

}
