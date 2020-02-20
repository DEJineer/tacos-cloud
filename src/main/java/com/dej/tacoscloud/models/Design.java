package com.dej.tacoscloud.models;


import lombok.Data;

import java.util.List;

@Data
public class Design {
    private String name;
    private List<String> ingredients;
}
