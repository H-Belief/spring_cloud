package com.belief.feign.feignController;

import com.belief.feign.feign.SchedualServiceJpa;
import com.belief.feign.utils.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
    @Autowired
    private SchedualServiceJpa schedualServiceJpa;

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.GET)
    public ReturnResult getUserInfo(@RequestParam String name){
        System.out.println(name);
        return schedualServiceJpa.getUserInfo(name);
    }
}
