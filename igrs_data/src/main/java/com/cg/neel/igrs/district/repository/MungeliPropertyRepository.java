package com.cg.neel.igrs.district.repository;

import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.MungeliPropertyAccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypePropertyRepository;

@Repository
public interface MungeliPropertyRepository extends MappedTypePropertyRepository<MungeliPropertyAccessBean>{
}
