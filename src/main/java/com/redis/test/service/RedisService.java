package com.redis.test.service;

import com.redis.test.api.RedisDTO;
import com.redis.test.domain.Cache;
import com.redis.test.repository.CacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RedisService {

    @Autowired
    CacheRepository cacheRepository;
    public void save(RedisDTO redis) {

        Cache cache = new Cache();

        cache.setId(String.valueOf(UUID.randomUUID()));
        cache.setKey(redis.getKey());
        cache.setValue(redis.getValue());
        cache.setExpiration(10L);

        cacheRepository.save(cache);
    }
}
