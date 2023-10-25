/**
 * 
 */
package com.cg.neel.igrs.district.help.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.neel.igrs.district.help.BookNoAccessBean;

/**
 * @author User
 *
 */
@Repository
public interface BookNoRepository extends JpaRepository<BookNoAccessBean, Long>{

}
