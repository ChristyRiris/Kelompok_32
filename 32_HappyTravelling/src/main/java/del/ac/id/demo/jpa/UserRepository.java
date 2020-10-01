package del.ac.id.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public interface UserRepository  extends JpaRepository<User, String> {
	static User findByUsername(String username) {
		
		return null;
	}
}
