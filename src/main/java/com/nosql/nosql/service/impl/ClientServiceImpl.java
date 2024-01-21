package com.nosql.nosql.service.impl;

import com.nosql.nosql.model.Client;
import com.nosql.nosql.repo.IClientRepo;
import com.nosql.nosql.repo.IGenericRepo;
import com.nosql.nosql.service.IClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl extends CRUDImpl<Client, String> implements IClientService {

    private final IClientRepo repo;
    @Override
    protected IGenericRepo<Client, String> getRepo() {
        return repo;
    }
}
