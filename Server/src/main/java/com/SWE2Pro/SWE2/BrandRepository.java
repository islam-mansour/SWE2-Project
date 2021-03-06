package com.SWE2Pro.SWE2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BrandRepository extends CrudRepository<Brand, Long>{

    @Query("select u from Brand u where u.Name = ?1")
    List<Brand> findByName(String Name);

}
