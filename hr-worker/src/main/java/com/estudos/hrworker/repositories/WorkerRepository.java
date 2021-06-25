package com.estudos.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
