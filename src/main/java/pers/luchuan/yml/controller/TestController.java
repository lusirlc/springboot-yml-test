package pers.luchuan.yml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.luchuan.yml.properties.MyProperties;

import java.util.List;

@RestController
@PropertySource(value = {"classpath:custom.yml","classpath:custom.properties"},encoding = "utf-8")//加载自定义文件
public class TestController {
    @Autowired
    MyProperties properties;

    @Value("${properties.testInt}")//会先到application.yml中找，然后再到自定义文件找，application.yml文件中的优先级高
    private int testInt;
    /**
     * 自定义文件中默认全是字符串型，所以只能转成数字，字符串，数组和List
     */
    @Value("${num}")
    private int num;
    @Value("${str}")
    private String str;
    @Value("${arr}")
    int[] arr;
    @Value("${listStr}")
    private List<String> listStr;


    @GetMapping("test")
    public String getProperties() {
        System.out.println(properties);
        return properties.toString();
    }

    @GetMapping("test1")
    public void test1() {
        System.out.println(testInt+","+num+","+str);
        for (int i : arr) {
            System.out.println(i);
        }
        for (String s : listStr) {
            System.out.println(s);
        }
    }
}
