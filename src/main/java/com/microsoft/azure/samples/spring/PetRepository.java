/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.samples.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PetRepository {

	private static final BeanPropertyRowMapper<Pet> ROW_MAPPER = new BeanPropertyRowMapper<>(Pet.class);

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	public Iterable<Pet> findAll() {
		return jdbcTemplate.query("select * from citizen", ROW_MAPPER);
	}

}
