/**
 * 
 */
package com.cg.neel.igrs.district.help;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti
 * @Des book number details
 *
 */

@Entity
@Table(name = "BookNo")
@Getter
@Setter
@NoArgsConstructor
public class BookNoAccessBean {

	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;

	@Column(name = "BookName")
	private String bookName;

	/**
	 * @param sno
	 * @param bookName
	 */
	public BookNoAccessBean(Long sno, String bookName) {
		super();
		this.sno = sno;
		this.bookName = bookName;
	}

}
