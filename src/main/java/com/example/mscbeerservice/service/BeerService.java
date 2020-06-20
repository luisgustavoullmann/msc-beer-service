package com.example.mscbeerservice.service;

import com.example.mscbeerservice.web.model.BeerDto;

import java.util.UUID;

/**
 * Created by Luis Gustavo Ullmann on 20/06/2020
 */
public interface BeerService {
    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
