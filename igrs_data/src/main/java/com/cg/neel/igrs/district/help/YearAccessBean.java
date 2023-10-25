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
 * @Des Year
 *
 */

@Entity
@Table(name = "Year")
@Getter
@Setter
@NoArgsConstructor
public class YearAccessBean {

	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;

	@Column(name = "Year")
	private String year;

	/**
	 * @param sno
	 * @param year
	 */
	public YearAccessBean(Long sno, String year) {
		super();
		this.sno = sno;
		this.year = year;
	}

}
