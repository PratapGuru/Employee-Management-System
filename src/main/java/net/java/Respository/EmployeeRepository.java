package net.java.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
