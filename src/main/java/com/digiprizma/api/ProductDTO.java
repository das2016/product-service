package com.digiprizma.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

/**
 * 
 * @author SKAN
 *
 */
@Value
@JsonDeserialize(builder = ProductDTO.ProductDTOBuilder.class)
@Builder
public class ProductDTO {

	/**
	 */
	private String name;
	private String description;
	private String picture;
	private double price;

	/**
	 * 
	 */
	public static final void ProductDTOBuilder() {

	}

}
