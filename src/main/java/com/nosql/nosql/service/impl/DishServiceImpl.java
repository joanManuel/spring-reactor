package com.nosql.nosql.service.impl;

import com.nosql.nosql.model.Dish;
import com.nosql.nosql.repo.IDishRepo;
import com.nosql.nosql.repo.IGenericRepo;
import com.nosql.nosql.service.IDishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DishServiceImpl extends CRUDImpl<Dish, String> implements IDishService {
    /*@Autowired*/
    private final IDishRepo repo;

    @Override
    protected IGenericRepo<Dish, String> getRepo() {
        return repo;
    }
    /*
    @Override
    public Mono<Dish> save(Dish dish) {
        return repo.save(dish);
    }

    @Override
    public Mono<Dish> update(String id, Dish dish) {
        return repo.findById(id).flatMap(e -> repo.save(dish));
    }

    @Override
    public Flux<Dish> findAll() {
        return repo.findAll();
    }

    @Override
    public Mono<Dish> findById(String id) {
        return repo.findById(id);
    }

    @Override
    public Mono<Boolean> delete(String id) {

        return repo.findById(id)
                        .hasElement()
                        .flatMap(result -> {
                            if(result) {
                                return repo.deleteById(id).thenReturn(true);
                            } else {
                                return Mono.just(false);
                            }
                        });
    }
     */
}
