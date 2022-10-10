package com.example.movieratingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
@Slf4j
public class MovieCatalogueResource {


    @GetMapping("/{userId}")
    public List<CatalogueItem> getCatalogue(@PathVariable("userId") String name) {
         log.info(Collections.singletonList(new CatalogueItem("vij","test0","1")).toString());
         return Collections.singletonList(new CatalogueItem("vij","test0","1"));
    }

}
