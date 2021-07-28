package com.xworkz.functional.dao;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.functional.dto.RogiDTO;
import com.xworkz.functional.search.RogiSearch;

public interface RogiDAO {
	boolean save(RogiDTO dto);
	Optional <RogiDTO> findOne(RogiSearch search);
	Optional<Integer> totalSize();
	Optional<RogiDTO> findByMaxAge();
	Optional<RogiDTO> findByMinAge();
	Collection<RogiDTO> findAll();
	Collection<RogiDTO> findAll(RogiSearch search);
}
