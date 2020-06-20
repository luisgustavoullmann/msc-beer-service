package com.example.mscbeerservice.bootstrap;

import com.example.mscbeerservice.domain.Beer;
import com.example.mscbeerservice.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by Luis Gustavo Ullmann on 19/06/2020
 */
@Component
@RequiredArgsConstructor
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Skol")
                    .beerStyle("Ruim")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(3370100001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Local")
                    .beerStyle("Pior ainda")
                    .quantityToBrew(300)
                    .minOnHand(15)
                    .upc(3370100002L)
                    .price(new BigDecimal("11.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Glacia")
                    .beerStyle("Só cachaceiro")
                    .quantityToBrew(100)
                    .minOnHand(50)
                    .upc(3370100003L)
                    .price(new BigDecimal("8.95"))
                    .build());

        }
        System.out.println("Loaded Beer: " + beerRepository.count());
    }
}
