package com.cg.neel.igrs.district.repository;

import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.BastarDeedAccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeDeedRepository;

@Repository
public interface BastarDeedRepository extends MappedTypeDeedRepository<BastarDeedAccessBean>{

}
