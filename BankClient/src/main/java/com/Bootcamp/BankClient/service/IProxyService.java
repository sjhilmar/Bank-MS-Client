package com.Bootcamp.BankClient.service;

import com.Bootcamp.BankClient.web.model.ProxyModel;

import java.util.List;

public interface IProxyService {

    List<ProxyModel> findAll() throws Exception;

    ProxyModel findById(Long id) throws Exception;

    ProxyModel create(ProxyModel proxyModel) throws Exception;

    void update(Long id, ProxyModel proxyModel) throws Exception;

    void deleteById(Long id) throws Exception;

}
