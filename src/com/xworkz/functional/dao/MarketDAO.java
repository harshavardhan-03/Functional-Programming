package com.xworkz.functional.dao;

import java.util.Collection;

import com.xworkz.functional.dto.MarketDTO;
import com.xworkz.functional.search.MarketSearch;

public interface MarketDAO {

	boolean save(MarketDTO dto);
	
	MarketDTO find(MarketSearch search);
	
	Collection<MarketDTO> findAll(MarketSearch search);

}