package ie.atu.week11example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByEmployeeId(String employeeId);
    Person findByEmail(String email);
    //Additional custom queries can be added here
}
