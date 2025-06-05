package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 我的好友：(MyFriend)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MyFriend")
public class MyFriend implements Serializable {

    // MyFriend编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "my_friend_id")
    private Integer my_friend_id;

    // 用户编号
    @Basic
    private Integer user_number;
    // 好友编号
    @Basic
    private Integer friend_no;
    // 好友名称
    @Basic
    private String friend_name;
    // 好友类型
    @Basic
    private String friend_type;
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
