package com.example.javaprothreadingnotes.Validated;

import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class TempData {
    @NotNull
    private Integer id;
    private String name;
}
