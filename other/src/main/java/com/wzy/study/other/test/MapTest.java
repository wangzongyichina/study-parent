package com.wzy.study.other.test;

import lombok.Data;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {


    @Test
    public void test1(){


        MapObj mapObj = getMap();
        Map map1 = mapObj.getMap();
        map1.put("vvvv","ddddd");

    }

    private MapObj getMap(){
        Map<Object, Object> map = new HashMap<>();
        map.put("aaa",1111);

        MapObj mapObj = new MapObj();
        mapObj.setMap( map);
        return mapObj;
    }




}

@Data
class MapObj{
    private Map map;
}
