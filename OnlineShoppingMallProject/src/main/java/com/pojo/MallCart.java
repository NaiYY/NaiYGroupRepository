package com.pojo;

public class MallCart {

    private MallUser user;
    private MallCommodity commodity;
    private Integer commodityNum;

    public MallUser getUser() {
        return user;
    }

    public void setUser(MallUser user) {
        this.user = user;
    }

    public MallCommodity getCommodity() {
        return commodity;
    }

    public void setCommodity(MallCommodity commodity) {
        this.commodity = commodity;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }
}