package com.cg.neel.igrs.district.repository;

import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.DhamtariDeedAccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeDeedRepository;

@Repository
public interface DhamtariDeedRepository extends MappedTypeDeedRepository<DhamtariDeedAccessBean>{

}
