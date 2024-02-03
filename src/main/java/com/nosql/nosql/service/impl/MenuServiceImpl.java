package com.nosql.nosql.service.impl;

import com.nosql.nosql.model.Menu;
import com.nosql.nosql.repo.IGenericRepo;
import com.nosql.nosql.repo.IMenuRepo;
import com.nosql.nosql.service.IMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl extends CRUDImpl<Menu, String> implements IMenuService {

    private final IMenuRepo repo;
    @Override
    protected IGenericRepo<Menu, String> getRepo() {
        return repo;
    }
}
