package com.example.javaprothreadingnotes.Validated;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
@Service
@Validated
public class TempServiceImpl implements TempService{
    @Override
    public void save(@Validated TempData tempData) {
        System.out.println(tempData);
    }
}
