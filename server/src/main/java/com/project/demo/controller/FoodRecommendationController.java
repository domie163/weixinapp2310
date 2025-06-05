package com.project.demo.controller;

import com.project.demo.entity.FoodRecommendation;
import com.project.demo.service.FoodRecommendationService;
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
 * 餐品推荐：(FoodRecommendation)表控制层
 *
 */
@RestController
@RequestMapping("/food_recommendation")
public class FoodRecommendationController extends BaseController<FoodRecommendation, FoodRecommendationService> {

    /**
     * 餐品推荐对象
     */
    @Autowired
    public FoodRecommendationController(FoodRecommendationService service) {
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
