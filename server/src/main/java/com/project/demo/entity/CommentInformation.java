package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 评论信息：(CommentInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CommentInformation")
public class CommentInformation implements Serializable {

    // CommentInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_information_id")
    private Integer comment_information_id;

    // 订单编号
    @Basic
    private String order_number;
    // 餐品名称
    @Basic
    private String product_name;
    // 商家编号
    @Basic
    private Integer seller_no;
    // 用户编号
    @Basic
    private Integer user_number;
    // 姓名
    @Basic
    private String full_name;
    // 评论时间
    @Basic
    private Timestamp comment_time;
    // 评分值
    @Basic
    private Integer rating_value;
    // 评论详情
    @Basic
    private String comment_details;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
