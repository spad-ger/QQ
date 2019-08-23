package com.thunisoft.demo.demo.pojo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Column;
import java.math.BigDecimal;
import javax.validation.constraints.Digits;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import com.thunisoft.artery.data.annotation.CodeType;
import javax.validation.constraints.NotBlank;
import javax.persistence.Table;
import javax.persistence.Id;
/**
 * 
 * EgBook
 *
 * @description 
 * @author artery6一键生成
 * @author Administrator
 * @date 2019年08月22日 14:37
 * @version 1.0
 */
@Table(name="{db.t_eg_book}")
@ApiModel("图书")
public class EgBook  implements Serializable {
    private static final long serialVersionUID = 1L;
    

    /** uuid */
    @NotBlank
    @Size(max=32)
    @Id
    @Column(name="c_id")
    private String id;

    /** 图书名称 */
    @NotBlank
    @Column(name="c_name")
    @Size(max=300)
    private String name;

    /** 作者 */
    @Size(max=300)
    @Column(name="c_auth")
    private String auth;

    /** 出版日期 */
    @Column(name="d_publisher")
    private Date publisher;

    /** 单价 */
    @Column(name="f_price")
    @Digits(integer=6,fraction=2)
    private BigDecimal price;




    /** 
     * 获取 c_id
     * @return uuid
     */
    @JSONField(name="id")
    public String getId(){
        return id;
    }

    /** 
     * 设置 c_id
     * @param id uuid
     */
    public void setId(String id){
        this.id=id;
    }

    /** 
     * 获取 c_name
     * @return 图书名称
     */
    @JSONField(name="name")
    public String getName(){
        return name;
    }

    /** 
     * 设置 c_name
     * @param name 图书名称
     */
    public void setName(String name){
        this.name=name;
    }

    /** 
     * 获取 c_auth
     * @return 作者
     */
    @JSONField(name="auth")
    public String getAuth(){
        return auth;
    }

    /** 
     * 设置 c_auth
     * @param auth 作者
     */
    public void setAuth(String auth){
        this.auth=auth;
    }

    /** 
     * 获取 d_publisher
     * @return 出版日期
     */
    @JSONField(name="publisher")
    public Date getPublisher(){
        return publisher;
    }

    /** 
     * 设置 d_publisher
     * @param publisher 出版日期
     */
    public void setPublisher(Date publisher){
        this.publisher=publisher;
    }

    /** 
     * 获取 f_price
     * @return 单价
     */
    @JSONField(name="price")
    public BigDecimal getPrice(){
        return price;
    }

    /** 
     * 设置 f_price
     * @param price 单价
     */
    public void setPrice(BigDecimal price){
        this.price=price;
    }


}
