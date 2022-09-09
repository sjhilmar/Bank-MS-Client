package com.Bootcamp.BankClient.domain;

import javax.persistence.Id;

public class ClientProfile {

    @Id
    private String clientProfileId;

    private String Description;

    private String clientId;

}
