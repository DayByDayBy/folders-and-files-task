package com.foldersandfiles.foldersandfiles.repositories;

import com.foldersandfiles.foldersandfiles.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
