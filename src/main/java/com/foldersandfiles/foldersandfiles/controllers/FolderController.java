package com.foldersandfiles.foldersandfiles.controllers;

import com.foldersandfiles.foldersandfiles.models.Folder;
import com.foldersandfiles.foldersandfiles.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    private FolderRepository folderRepository;

    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> createFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }

    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(@RequestBody Folder folder){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getShip(@PathVariable Long id){
        return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
    }
}



