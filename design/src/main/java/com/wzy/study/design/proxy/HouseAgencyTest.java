package com.wzy.study.design.proxy;

/**
 * @Author: wangzongyi
 * @Data: 2021/6/27 17:42
 * @Desc:
 */

public class HouseAgencyTest {
    public static void main(String[] args) {
        // 真实角色
        HouseOwer houseOwer = new HouseOwer();
        // 代理角色
        HouseAgency houseAgency = new HouseAgency();

        houseAgency.setRent(houseOwer);

        Rent proxy = (Rent) houseAgency.getProxy();
        proxy.rent();

    }

}
