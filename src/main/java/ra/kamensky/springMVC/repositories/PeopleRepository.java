package ra.kamensky.springMVC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.kamensky.springMVC.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
