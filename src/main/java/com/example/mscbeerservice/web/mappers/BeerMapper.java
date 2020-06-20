package com.example.mscbeerservice.web.mappers;

import com.example.mscbeerservice.domain.Beer;
import com.example.mscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Luis Gustavo Ullmann on 20/06/2020
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
