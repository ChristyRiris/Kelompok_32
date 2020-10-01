package del.ac.id.demo.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
public interface RoleRepository  extends JpaRepository<Role, Integer> {
	Role findByRoleid(int roleid);
	List<Role> findAll();
}
