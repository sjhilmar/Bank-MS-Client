package com.Bootcamp.BankClient.domain;

import javax.persistence.*;

public class Proxy {

    @Id
    private String proxyId;

    private String type;

    private String fullName;

    private String clientId;
}
