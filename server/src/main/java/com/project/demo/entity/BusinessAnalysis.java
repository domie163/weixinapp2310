package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 营业分析：(BusinessAnalysis)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "BusinessAnalysis")
public class BusinessAnalysis implements Serializable {

    // BusinessAnalysis编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_analysis_id")
    private Integer business_analysis_id;

    // 标题
    @Basic
    private String title;
    // 商家编号
    @Basic
    private Integer seller_no;
    // 店铺名称
    @Basic
    private String store_name;
    // 统计时间
    @Basic
    private String statistical_time;
    // 收入总额
    @Basic
    private Integer total_revenue;
    // 备注
    @Basic
    private String remarks;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
