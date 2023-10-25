package com.cg.neel.igrs.district.help;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;


@Entity
@Table(name = "Party2Type")
@NoArgsConstructor
public class PartyType2AccessBean {
	
	@Id
	@Column(name = "Sno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sno;
	
	@Column(name = "hindi")
	private String hindi;
	
	@Column(name = "english")
	private String english;
	
	
	
	
	public Long getSno() {
		return sno;
	}

	public void setSno(Long sno) {
		this.sno = sno;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	/**
	 * @param sno
	 * @param hindi
	 * @param english
	 */
	public PartyType2AccessBean(Long sno, String hindi, String english) {
		super();
		this.sno = sno;
		this.hindi = hindi;
		this.english = english;
	}


}
