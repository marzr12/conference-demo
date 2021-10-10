package com.spring.boot.marz.conferencedemo.repositories;

import com.spring.boot.marz.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {}
