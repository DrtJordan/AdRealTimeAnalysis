package cn.cs.scu.domain;

import java.io.Serializable;

/**
 * 用户点击类
 * <p>
 * Created by Wanghan on 2017/3/15.
 * Copyright © Wanghan SCU. All Rights Reserved
 */
public class UserClick implements Serializable {

    private Long userId = 0L;
    private Long adId = 0L;
    private String clickDay = "";
    private Long clickNum = 0L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public String getClickDay() {
        return clickDay;
    }

    public void setClickDay(String clickDay) {
        this.clickDay = clickDay;
    }

    public Long getClickNum() {
        return clickNum;
    }

    public void setClickNum(Long clickNum) {
        this.clickNum = clickNum;
    }
}
