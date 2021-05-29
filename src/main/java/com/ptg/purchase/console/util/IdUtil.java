package com.ptg.purchase.console.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class IdUtil {
    /**
     * 获取流水号
     * name:前缀
     * length:总长度
     * formart:时间格式
     * 补长的长度为uuid截取
     * @return
     */
    public static String getReqByStr(String name,Integer length,String formart){
        name = name.trim().toUpperCase();
        SimpleDateFormat sdf = new SimpleDateFormat(formart);
        String datetime = sdf.format(new Date());
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        String substring = uuid.substring(0, length - (name + datetime).length());
        return name+datetime+substring;
    }
    /**
     * 获取uuid
     * */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}
