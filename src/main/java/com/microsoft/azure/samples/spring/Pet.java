/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Pet {

	@Id
	private Long citizenId;

	private String forenames;

	private String surname;

	private String homeAddress;

	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	private String placeOfBirth;

	private String sex;

	public Pet() {

	}

	public Pet(Long citizenId, String forenames, String surname, String homeAddress, Date dateOfBirth,
			String placeOfBirth, String sex) {
		this.citizenId = citizenId;
		this.forenames = forenames;
		this.surname = surname;
		this.homeAddress = homeAddress;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Citizen{" + "id=" + citizenId + ", name='" + forenames + surname + '\'' + ", home address='"
				+ homeAddress + '\'' + ", date of birth='" + dateOfBirth + '\'' + '}';
	}
}
