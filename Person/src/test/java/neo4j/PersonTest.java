package neo4j;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class PersonTest {
	
	@Autowired
	PerosnRepo perosnRepo;
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void save(){
		Person person = new Person();
		person.setDoB(new Date());
		person.setName("SOMEONE3");
		person.setTest("Testing3");
		person.setMobile(9999988);
		person.setAge(29);
		
		
		perosnRepo.save(person);
	}
	
	//@Test
	public void getData(){
		//Person person = new Person();
		//person.setTest("Testing");
		
		Person person = perosnRepo.findBytest("Testing2");
		
		//System.out.println(person.getName()+ " "+ person.getId());
	}
	
	@After
	public void tearDown(){
		
	}

}
