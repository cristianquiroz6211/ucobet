package co.edu.uco.ubico.generales.domain.city.rules.impl;

import co.edu.uco.ubico.generales.aplicaton.secondaryports.repository.CityRepository;
import co.edu.uco.ubico.generales.domain.city.rules.CityNameForStateDoesNotExistsRule;

public class CityNameForStateDoesExistsImpl  implements CityNameForStateDoesNotExistsRule {
    private CityRepository cityRepository;

    @Override
    public void validate(String data) {
    }

}
