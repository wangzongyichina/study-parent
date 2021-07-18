package com.wzy.study.design.proxy.dynamic;

import com.wzy.study.design.proxy.Rent;

import java.lang.reflect.Proxy;

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
        HouseDynamicAgency houseDynamicAgency = new HouseDynamicAgency(houseOwer);

        // houseAgency.setRent(houseOwer);

        // Rent proxy = (Rent) houseAgency.getProxy();
        Rent proxy = (Rent) Proxy.newProxyInstance(Rent.class.getClassLoader(), new Class[] {
            Rent.class
        }, houseDynamicAgency);
        System.out.println("(proxy instanceof Rent) = " + (proxy instanceof Rent));
        proxy.rent();

    }

}
