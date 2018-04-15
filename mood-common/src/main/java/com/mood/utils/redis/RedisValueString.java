package com.mood.utils.redis;

import redis.clients.jedis.Jedis;

import java.util.*;

/**
 * 内容
 *
 * @author chaiwei
 * @time 2018-04-14 14:48
 */
public class RedisValueString {

    public static Jedis jedis = new Jedis("127.0.0.1", 6379);

    public static boolean set(String key, String value){
        jedis.set(key, value);
        return true;
    }

    public static String get(String key){
        return jedis.get(key);
    }

    public static List<String> getKeyByVague(String key){
        Set<String> keySet = jedis.keys(key+ "*");
        return new ArrayList<>(keySet);
    }

    public static List<String> getValueByVague(String key){
        List<String> keyList = getKeyByVague(key+ "*");
        List<String> valueList = new ArrayList<String>();
        for (String trueKey : keyList){
            valueList.add(jedis.get(trueKey));
        }
        return valueList;
    }

    public static Map<String, String> getKeyValueByVague(String key){
        List<String> keyList = getKeyByVague(key+ "*");
        Map<String, String> valueMap = new HashMap<String, String>();
        for (String trueKey : keyList){
            valueMap.put(trueKey, jedis.get(trueKey));
        }
        return valueMap;
    }

    public static boolean delete(String key){
        jedis.del(key);
        return true;
    }

    public static boolean deleteByVague(String key){
        List<String> keyList = getKeyByVague(key+ "*");
        for (String trueKey : keyList){
            delete(trueKey);
        }
        return true;
    }

}
