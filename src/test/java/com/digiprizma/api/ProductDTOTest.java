package com.digiprizma.api;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * 
 * @author SKAN
 *
 */

@RunWith(JUnit4.class)
public class ProductDTOTest {

	ProductDTO productDTO;

	@Before
	public void init() {
		productDTO = ProductDTO.builder().name("nom").description("description").picture("picture").price(100.0)
				.build();
	}

	@Test
	public void testProductBuilder() {
		Assertions.assertThat(productDTO.getName()).isEqualTo("nom");
		Assertions.assertThat(productDTO.getDescription()).isEqualTo("description");
		Assertions.assertThat(productDTO.getPicture()).isEqualTo("picture");
		Assertions.assertThat(productDTO.getPrice()).isEqualTo(100.0);
	}

	@SuppressWarnings("static-access")
	@Test
	public void testProductImmutableInstance() {
		productDTO.builder().name("name");
		Assertions.assertThat(productDTO.getName()).isEqualTo("nom");
	}

}
