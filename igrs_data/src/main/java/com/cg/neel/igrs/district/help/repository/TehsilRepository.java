/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.TehsilAccessBean;

/**
 * @author User
 *
 */
@Repository
public interface TehsilRepository extends JpaRepository<TehsilAccessBean, Long>{

	/**
	 * @param sno
	 * @return TehsilAccessBEan
	 */
	TehsilAccessBean getBySno(long sno);

}
