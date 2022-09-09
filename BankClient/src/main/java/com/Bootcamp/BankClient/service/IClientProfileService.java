package com.Bootcamp.BankClient.service;

import com.Bootcamp.BankClient.domain.ClientProfile;

import java.util.List;

public interface IClientProfileService {

    List<ClientProfile> findAll() throws Exception;

    ClientProfile findById(Long id) throws Exception;

    ClientProfile create(ClientProfile clientProfileModel) throws Exception;

    void update(Long id, ClientProfile clientProfileModel) throws Exception;

    void deleteById(Long id) throws Exception;

}
