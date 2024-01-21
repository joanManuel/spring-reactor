package com.nosql.nosql.repo;

import com.nosql.nosql.model.Dish;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IDishRepo extends IGenericRepo<Dish, String> {

}
