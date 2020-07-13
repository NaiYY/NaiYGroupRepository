package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.sql.Timestamp;

@TableName("mall_commodity")
public class MallCommodity {
    @TableId(type = IdType.AUTO)
    private Integer commodityId;
    private String commodityName;
    private Integer commodityClassId;
    private String commodityManuFacturer;
    private String commodityDepict;
    private Double commodityPrice;
    private Double commodityFcPrice;
    private Integer commodityAmount;
    private Integer commodityLeaveNum;
    private Timestamp commodityRegTime;
    private String commodityImage;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityClassId() {
        return commodityClassId;
    }

    public void setCommodityClassId(Integer commodityClassId) {
        this.commodityClassId = commodityClassId;
    }

    public String getCommodityManuFacturer() {
        return commodityManuFacturer;
    }

    public void setCommodityManuFacturer(String commodityManuFacturer) {
        this.commodityManuFacturer = commodityManuFacturer;
    }

    public String getCommodityDepict() {
        return commodityDepict;
    }

    public void setCommodityDepict(String commodityDepict) {
        this.commodityDepict = commodityDepict;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Double commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Double getCommodityFcPrice() {
        return commodityFcPrice;
    }

    public void setCommodityFcPrice(Double commodityFcPrice) {
        this.commodityFcPrice = commodityFcPrice;
    }

    public Integer getCommodityAmount() {
        return commodityAmount;
    }

    public void setCommodityAmount(Integer commodityAmount) {
        this.commodityAmount = commodityAmount;
    }

    public Integer getCommodityLeaveNum() {
        return commodityLeaveNum;
    }

    public void setCommodityLeaveNum(Integer commodityLeaveNum) {
        this.commodityLeaveNum = commodityLeaveNum;
    }

    public Timestamp getCommodityRegTime() {
        return commodityRegTime;
    }

    public void setCommodityRegTime(Timestamp commodityRegTime) {
        this.commodityRegTime = commodityRegTime;
    }

    public String getCommodityImage() {
        return commodityImage;
    }

    public void setCommodityImage(String commodityImage) {
        this.commodityImage = commodityImage;
    }

}