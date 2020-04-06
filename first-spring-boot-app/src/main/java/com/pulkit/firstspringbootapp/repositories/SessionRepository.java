package com.pulkit.firstspringbootapp.repositories;

import com.pulkit.firstspringbootapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
