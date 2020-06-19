package com.example.mscbeerservice.repositories;

import com.example.mscbeerservice.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Created by Luis Gustavo Ullmann on 19/06/2020
 */
public interface BeerRepository extends JpaRepository<Beer, UUID> {
    //Click on JapRepository/PagingAndSorting, after Download Source (blue menu above)
}
