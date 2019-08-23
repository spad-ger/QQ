package com.thunisoft.demo.demo.pojo;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import io.swagger.annotations.ApiModel;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import com.alibaba.fastjson.annotation.JSONField;
import javax.persistence.Id;
import java.util.Date;
/**
 * 
 * Reserve
 *
 * @description 
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:38
 * @version 1.0
 */
@Table(name="{db.t_reserve}")
@ApiModel("预定信息表")
public class Reserve  implements Serializable {
    private static final long serialVersionUID = 1L;
    
    /** ID */
    @ApiModelProperty("ID")
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 预订人姓名 */
    @ApiModelProperty("预订人姓名")
    @NotBlank
    @Size(max=50)
    @Column(name="c_name")
    private String name;

    /** 图书id */
    @ApiModelProperty("图书id")
    @NotBlank
    @Size(max=32)
    @Column(name="c_pid")
    private String pid;

    /** 预定日期 */
    @ApiModelProperty("预定日期")
    @Column(name="d_publisher")
    private Date publisher;


    /**
     * 获取 c_id
     *
     * @return ID
     */
    @JSONField(name = "id") 
    public String getId() {
        return id;
    }

    /**
     * 设置 c_id
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * 获取 c_name
     *
     * @return 预订人姓名
     */
    @JSONField(name = "name") 
    public String getName() {
        return name;
    }

    /**
     * 设置 c_name
     *
     * @param name 预订人姓名
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取 c_pid
     *
     * @return 图书id
     */
    @JSONField(name = "pid") 
    public String getPid() {
        return pid;
    }

    /**
     * 设置 c_pid
     *
     * @param pid 图书id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
    /**
     * 获取 d_publisher
     *
     * @return 预定日期
     */
    @JSONField(name = "publisher") 
    public Date getPublisher() {
        return publisher;
    }

    /**
     * 设置 d_publisher
     *
     * @param publisher 预定日期
     */
    public void setPublisher(Date publisher) {
        this.publisher = publisher;
    }

}
