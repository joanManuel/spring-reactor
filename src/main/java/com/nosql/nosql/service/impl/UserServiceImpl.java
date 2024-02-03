package com.nosql.nosql.service.impl;

import com.nosql.nosql.model.User;
import com.nosql.nosql.repo.IUserRepo;
import com.nosql.nosql.repo.IGenericRepo;
import com.nosql.nosql.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends CRUDImpl<User, String> implements IUserService {

    private final IUserRepo repo;
    @Override
    protected IGenericRepo<User, String> getRepo() {
        return repo;
    }
}
