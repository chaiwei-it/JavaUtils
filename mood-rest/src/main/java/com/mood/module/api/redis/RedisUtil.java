package com.mood.module.api.redis;

import com.mood.utils.redis.RedisValueHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-04-08 23:30
 */
public class RedisUtil {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public static void main(String[] args) {
//        RedisValueString.set("test1", "1");
//        RedisValueString.set("test2", "2");
//        RedisValueString.set("test3", "3");
//        RedisValueString.set("test4", "4");
//        RedisValueString.set("test5", "5");
        //字符串String
//        System.out.println(RedisValueString.get("test"));
//        System.out.println(RedisValueString.getKeyByVague("test"));
//        System.out.println(RedisValueString.getValueByVague("test"));
//        System.out.println(RedisValueString.getKeyValueByVague("test"));
//        RedisValueString.deleteByVague("test");
//        System.out.println(RedisValueString.get("test"));
//        System.out.println(RedisValueString.getKeyByVague("test"));
//        System.out.println(RedisValueString.getValueByVague("test"));
//        System.out.println(RedisValueString.getKeyValueByVague("test"));
        //哈希
        RedisValueHash.hset("key", "field", "value");
        System.out.println(RedisValueHash.hget("key", "field"));

    }
}
