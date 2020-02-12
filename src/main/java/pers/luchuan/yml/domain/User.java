package pers.luchuan.yml.domain;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private String name;
    private Integer age;
    private List<String> address;
}
