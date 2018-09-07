package com.example.demo.feign;

import com.example.demo.utils.ReturnResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "service-solr")
public interface SchedualServiceSolr {


    @RequestMapping(value = "/solr/getById",method= RequestMethod.GET)
    ReturnResult getById(@RequestParam(value = "id") String id);

}
