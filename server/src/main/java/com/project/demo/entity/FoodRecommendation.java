package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 餐品推荐：(FoodRecommendation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FoodRecommendation")
public class FoodRecommendation implements Serializable {

    // FoodRecommendation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_recommendation_id")
    private Integer food_recommendation_id;

    // 餐品名称
    @Basic
    private String product_name;
    // 图片
    @Basic
    private String picture;
    // 类型
    @Basic
    private String type;
    // 口味
    @Basic
    private String flavor;
    // 原材料
    @Basic
    private String raw_material;
    // 商家编号
    @Basic
    private Integer seller_no;
    // 店铺名称
    @Basic
    private String store_name;
    // 详情介绍
    @Basic
    private String detailed_introduction;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
