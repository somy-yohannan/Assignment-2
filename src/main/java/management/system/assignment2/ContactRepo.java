package management.system.assignment2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ContactRepo extends JpaRepository<Contacts,Integer> {
}
