package com.example.demo.feignController;

import com.example.demo.feign.SchedualServiceSolr;
import com.example.demo.utils.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/solr")
public class SolrController {

    @Autowired
    private SchedualServiceSolr schedualServiceSolr;


    @RequestMapping(value = "/getById",method= RequestMethod.GET)
    public ReturnResult getById(@RequestParam(value = "id") String id){
        System.out.println(id);
        return schedualServiceSolr.getById(id);
    }

}
