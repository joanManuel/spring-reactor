package com.nosql.nosql.service.impl;

import com.nosql.nosql.model.Invoice;
import com.nosql.nosql.repo.IInvoiceRepo;
import com.nosql.nosql.repo.IGenericRepo;
import com.nosql.nosql.service.IInvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl extends CRUDImpl<Invoice, String> implements IInvoiceService {

    private final IInvoiceRepo repo;
    @Override
    protected IGenericRepo<Invoice, String> getRepo() {
        return repo;
    }
}
