package com.belief.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by HGY on 2017-11-25.
 */
@Service
public class HelloService {


    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "xiaobenben")
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

    public String xiaobenben(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
