package com.foldersandfiles.foldersandfiles.repositories;

import com.foldersandfiles.foldersandfiles.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}



