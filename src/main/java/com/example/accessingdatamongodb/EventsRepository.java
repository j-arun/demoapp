package com.example.accessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventsRepository extends MongoRepository<Events, String> {

}
