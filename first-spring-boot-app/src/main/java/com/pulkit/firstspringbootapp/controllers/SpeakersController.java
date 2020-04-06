package com.pulkit.firstspringbootapp.controllers;

import com.pulkit.firstspringbootapp.models.Session;
import com.pulkit.firstspringbootapp.models.Speaker;
import com.pulkit.firstspringbootapp.repositories.SessionRepository;
import com.pulkit.firstspringbootapp.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/v1/speakers")
    public class SpeakersController {

        @Autowired
        private SpeakerRepository speakerRepository;

        @GetMapping
        public List<Speaker> list(){
            return speakerRepository.findAll();
        }

        @GetMapping
        @RequestMapping("{id}")
        public Speaker get(@PathVariable Long id){
            return speakerRepository.getOne(id);
        }

//        @PostMapping
////    @ResponseStatus(HttpStatus.CREATED)
//        public Session create(@RequestBody final Session session){
//            return sessionRepository.saveAndFlush(session);
//        }
    }


