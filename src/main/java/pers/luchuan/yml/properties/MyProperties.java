package pers.luchuan.yml.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import pers.luchuan.yml.domain.User;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("properties")
@Data
public class MyProperties {
    private int testInt;
    private String testStr;
    private int[] testArrInt;
    private String[] testArrStr;
    private List<Integer> testListInteger;
    private List<String> testListStr;
    private Map<String,Object> map;
    private User user;
}
