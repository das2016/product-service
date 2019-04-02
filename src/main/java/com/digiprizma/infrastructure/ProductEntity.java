package com.digiprizma.infrastructure;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @author SKAN
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductEntity implements Serializable {
	
	@Id
	private Long id;
	private String name;
	private String description;
	private String picture;
	private double price;
	/**
	 * Static Fields
	 */
	private static final long serialVersionUID = 7783301092525114521L;

}
