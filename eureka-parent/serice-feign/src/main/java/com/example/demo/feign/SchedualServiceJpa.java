package com.example.demo.feign;

import com.example.demo.utils.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by HGY on 2017-11-25.
 */
@FeignClient(value = "service-jpa")
public interface SchedualServiceJpa {


    @RequestMapping(value = "/getUserInfo",method= RequestMethod.GET)
    ReturnResult getUserInfo(@RequestParam(value = "name") String name);
}
