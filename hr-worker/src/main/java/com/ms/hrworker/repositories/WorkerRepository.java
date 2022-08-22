package com.ms.hrworker.repositories;

import com.ms.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker,Long> {


    Worker findByName(String name);
}
