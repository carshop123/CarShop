package com.dt.common.utils;

import com.alibaba.fastjson.JSON;
import com.dt.common.config.RedissonConfig;
import com.dt.common.emun.Keys;
import com.td.pojo.pojos.UserLevel;
import com.td.pojo.pojos.UserLog;
import com.td.pojo.pojos.UserOrder;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 类的说明
 *
 * @author Administrator - Luotuan
 * @version v1.0
 * @date 2019/11/8 0008
 * @since v1.0
 */
@Component
public class RedisUtil {
    /*
    {
  "appointmentCode": "0da123d213",
  "appointmentTime": "2019-11-08 11:42",
  "arrivalTime": "2019-11-08 11:42",
  "carLicence": "豫A36C48D",
  "carOwnerName": "某某",
  "contactType": "15481486",
  "createTime": "2019-11-08 11:42:34",
  "id": 0,
  "shopName": "庆丰街洗车店",
  "type": "洗车"
}
     */

    private static RedissonClient client;

    static {
        client = new RedissonConfig().redisson();
    }

    public static void hset(String key, String field, String value) {
        client.getMap(key).put(field, value);
    }

    /**
     * 获取 hash map redis 中根据 key 获取values 并转化成对应的 实体类集合
     *
     * @param key key
     * @param obj 对象
     * @param <T> 泛型
     * @return ignore
     */
    public static <T> List<T> hListAll(String key, Class<T> obj) {
        Collection<Object> objects = client.getMap(key).readAllValues();
        ArrayList<T> ts = new ArrayList<>(objects.size() + 1);
        if (objects.size() > 0) {
            for (Object object : objects) {
                String jsonObject = String.valueOf(object);
                T t = JSON.parseObject(jsonObject, obj);
                ts.add(t);
            }
            return ts;
        }
        return ts;
    }

    /**
     * 保存所有的数据到redis
     *
     * @param objList ignore
     * @param <T>     ignore
     */
    public static <T> void hSetAllForObj(List<T> objList) {
        if (objList == null) {
            System.out.println("redis没有收到数值");
            return;
        }

        for (T obj : objList) {
            if (obj instanceof UserLevel) {
                // 放进 redis
                client.getMap(Keys.APPOINTMENT.getMsg()).put(((UserLevel) obj).getId() + "", JSON.toJSONString(obj));
                // 设置超时时间
                client.getMap(Keys.APPOINTMENT.getMsg()).expire(24, TimeUnit.HOURS);
            } else if (obj instanceof UserOrder) {
                client.getMap(Keys.ORDER.getMsg()).put(((UserOrder) obj).getId()+"", JSON.toJSONString(obj));
                client.getMap(Keys.APPOINTMENT.getMsg()).expire(24, TimeUnit.HOURS);
            } else if (obj instanceof UserLog) {
                client.getMap(Keys.EVALUATE.getMsg()).put(((UserLog) obj).getId() + "", JSON.toJSONString(obj));
                client.getMap(Keys.APPOINTMENT.getMsg()).expire(24, TimeUnit.HOURS);
            }
        }
    }
}
