package com.xworkz.functional.dao;

import java.util.Collection;

import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.search.HabbaSearch;

public interface HabbaDAO {
	
	boolean ulisu(HabbaDTO dto);
	
	HabbaDTO ondunaHuduku(HabbaSearch search);
	
	Collection <HabbaDTO> yellavanuHuduku(HabbaSearch search);
}
