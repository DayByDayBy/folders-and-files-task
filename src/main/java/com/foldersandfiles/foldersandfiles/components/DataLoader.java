package com.foldersandfiles.foldersandfiles.components;

import com.foldersandfiles.foldersandfiles.models.File;
import com.foldersandfiles.foldersandfiles.models.Folder;
import com.foldersandfiles.foldersandfiles.models.Person;
import com.foldersandfiles.foldersandfiles.repositories.FileRepository;
import com.foldersandfiles.foldersandfiles.repositories.FolderRepository;
import com.foldersandfiles.foldersandfiles.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;


@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private FileRepository fileRepository;
    @Autowired
    private FolderRepository folderRepository;
    @Autowired
    private PersonRepository personRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person jack = new Person("Jack");
        personRepository.save(jack);

        Person john = new Person("John");
        personRepository.save(john);

        Person h_dog = new Person("Horatio");
        personRepository.save(h_dog);

        Person magrit = new Person("Magrit");
        personRepository.save(magrit);

        Person wilma = new Person("Wilma");
        personRepository.save(wilma);


        Folder aleph = new Folder("first_folder", , jack);
        folderRepository.save(aleph);

        Folder bet = new Folder("first_folder", aleph, john);
        folderRepository.save(bet);

        Folder gimel = new Folder("first_folder", aleph, magrit);
        folderRepository.save(gimel);

        Folder dalet = new Folder("first_folder", aleph, wilma);
        folderRepository.save(dalet);

        File myStuff = new File('things','.doc', 3, aleph);
        fileRepository.save(myStuff);

        File myOtherStuff = new File('other_things','.doc', 3, bet);
        fileRepository.save(myOtherStuff);

        File moreStuff = new File('other_things','.doc', 6, gimel);
        fileRepository.save(moreStuff);

        File yetMoreStuff = new File('yet_more_things','.doc', 15, dalet);
        fileRepository.save(yetMoreStuff);




    }



}