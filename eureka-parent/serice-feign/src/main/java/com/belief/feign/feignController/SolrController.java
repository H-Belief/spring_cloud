package com.belief.feign.feignController;

import com.belief.feign.utils.ReturnResult;
import com.belief.feign.feign.SchedualServiceSolr;
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
