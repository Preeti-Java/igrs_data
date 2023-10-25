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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti
 * @Des Party type details
 *
 */

@Entity
@Table(name = "PartyType")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartyTypeAccessBean {

	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name = "hindi")
	private String hindi;
	
	@Column(name = "english")
	private String english;
}
