package com.foldersandfiles.foldersandfiles.controllers;


import com.foldersandfiles.foldersandfiles.models.File;
import com.foldersandfiles.foldersandfiles.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    private FileRepository fileRepository;

    @PostMapping(value = "/files")
    public ResponseEntity<File> createFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }

    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/files/{id}")
public ResponseEntity getShip(@PathVariable Long id){
    return new ResponseEntity<>(fileRepository.findById(id), HttpStatus.OK);
    }
}