package com.example.demo.repository;

import com.example.demo.entity.DemoEntity;
import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface DemoRepository extends DatastoreRepository<DemoEntity, String> {
}
