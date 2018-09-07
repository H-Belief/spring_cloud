package com.belief.feign.feign.hystrix;

import com.belief.feign.feign.SchedualServiceHi;
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
