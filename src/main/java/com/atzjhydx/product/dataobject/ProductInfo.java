package com.atzjhydx.product.dataobject;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@DynamicUpdate
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 7878919695847505832L;
    @Id
    //商品ID，主键
    private String productId;

    //商品名
    private String productName;

    //商品价格
    private BigDecimal productPrice;

    //商品库存
    private Integer productStock;

    //商品描述
    private String productDescription;

    //商品小图
    private String productIcon;

    //商品状态 0在架1下架，默认状态为在架
    private Integer productStatus;

    //类目编号
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
