package com.redis.test.repository;

import com.redis.test.domain.Cache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CacheRepository extends CrudRepository<Cache, String> {
}
