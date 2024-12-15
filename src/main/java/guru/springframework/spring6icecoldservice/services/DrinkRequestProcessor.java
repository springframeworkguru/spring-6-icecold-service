package guru.springframework.spring6icecoldservice.services;

import guru.springframework.spring6restmvcapi.events.DrinkRequestEvent;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface DrinkRequestProcessor {

    void processDrinkRequest(DrinkRequestEvent event);
}
