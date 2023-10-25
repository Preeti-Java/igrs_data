package com.cg.neel.igrs.district.repository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.MungeliDeedAccessBean;
import com.cg.neel.igrs.district.help.repository.MappedTypeDeedRepository;

@Repository
public interface MungeliDeedRepository extends MappedTypeDeedRepository<MungeliDeedAccessBean>{

}
