package com.example.javaprothreadingnotes.Validated;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemController {
    @Autowired
    private TempService tempService;
    @GetMapping("/temp")
    public void temp() {
        tempService.save(new TempData(1));
    }
}
