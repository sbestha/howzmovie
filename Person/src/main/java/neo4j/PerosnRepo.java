package neo4j;

import org.springframework.data.neo4j.repository.GraphRepository;

public interface PerosnRepo extends GraphRepository<Person> {
	
	Person findBytest(String testName);
	
}
