package com.pulkit.firstspringbootapp.repositories;

import com.pulkit.firstspringbootapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
