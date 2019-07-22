package com.example.demo.repo;
import org.springframework.data.repository.CrudRepository;
import com.example.demo.Team;

public interface TeamRepository extends CrudRepository<Team,Long> {
	
}
