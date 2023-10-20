package com.redis.test.api;

import com.redis.test.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {

    @Autowired
    public RedisService redisService;
    @PostMapping(path = "/save")
    public ResponseEntity<String> saveRedis(@RequestBody RedisDTO redis) {
        redisService.save(redis);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
