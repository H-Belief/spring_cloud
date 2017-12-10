package com.example.demo.feign.hystrix;

import com.example.demo.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by HGY on 2017-11-25.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
