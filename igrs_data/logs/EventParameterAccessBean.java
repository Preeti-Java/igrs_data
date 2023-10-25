/**
 * 
 */
package com.cg.neel.igrs.logs;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Preeti
 *
 */

@Entity
@Table(name= "IGRSEVENTPARAMETER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventParameterAccessBean {
	
	@Id
	@Column(name = "EVENTPARAMETER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eventParameterId;
	
	@OneToMany(mappedBy = "eventParameterAccessBean")
	private List<LogDetailsAccessBean> logDetailsAccessBeans;
	
	@ManyToOne
	@JoinColumn(name = "eventTypeId")
	private EventTypeAccessBean eventTypeAccessBean;
	
	@Column(name = "DATATYPE")
	private String dataType;
	
	

}
