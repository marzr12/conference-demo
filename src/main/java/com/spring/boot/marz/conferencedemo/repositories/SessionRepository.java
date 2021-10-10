package com.spring.boot.marz.conferencedemo.repositories;

import com.spring.boot.marz.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long>{
}
