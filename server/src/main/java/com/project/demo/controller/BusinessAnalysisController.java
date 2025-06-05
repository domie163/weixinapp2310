package com.project.demo.controller;

import com.project.demo.entity.BusinessAnalysis;
import com.project.demo.service.BusinessAnalysisService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;


/**
 * 营业分析：(BusinessAnalysis)表控制层
 *
 */
@RestController
@RequestMapping("/business_analysis")
public class BusinessAnalysisController extends BaseController<BusinessAnalysis, BusinessAnalysisService> {

    /**
     * 营业分析对象
     */
    @Autowired
    public BusinessAnalysisController(BusinessAnalysisService service) {
        setService(service);
    }


    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
