package com.Bootcamp.BankClient.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("Client")
public class Client {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long clientId;

	    private Long ClientProfileId;

	    @Column(unique=true)
	    private String documentNumber;

	    private String fullName;
}
