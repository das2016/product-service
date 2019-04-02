package com.digiprizma.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author SKAN
 *
 */
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
