package com.belief.controller;

import com.belief.utils.ReturnResult;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/solr")
public class SolrController {

    @Autowired
    private SolrClient solrClient;


    /**
     * 根据id查询单挑记录
     * @param id
     * @return
     * @throws IOException
     * @throws SolrServerException
     */
    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public ReturnResult getById(@RequestParam String id) throws IOException, SolrServerException {
        SolrDocument clientById = solrClient.getById("core_Demo",id);
        System.out.println(clientById);
        return ReturnResult.success(clientById);
    }
}
