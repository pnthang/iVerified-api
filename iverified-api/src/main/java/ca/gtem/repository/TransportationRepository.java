package ca.gtem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ca.gtem.model.Transportation;

public interface TransportationRepository extends JpaRepository<Transportation,Long> {

}

