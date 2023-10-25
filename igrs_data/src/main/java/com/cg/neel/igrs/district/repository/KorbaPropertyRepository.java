package com.cg.neel.igrs.district.repository;

import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.KorbaPropertyAccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypePropertyRepository;

@Repository
public interface KorbaPropertyRepository extends MappedTypePropertyRepository<KorbaPropertyAccessBean>{

}
