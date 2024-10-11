package co.edu.uco.ubico.generales.domain.city.rules.impl;

import co.edu.uco.ubico.generales.aplicaton.secondaryports.repository.CityRepository;
import co.edu.uco.ubico.generales.domain.city.exceptions.CityIdDoesNotExistsException;
import co.edu.uco.ubico.generales.domain.city.rules.CityIdDoesNotExistsRule;

import java.util.UUID;

public class CityIdDoesNotExistsRuleImpl implements CityIdDoesNotExistsRule {
    private CityRepository cityRepository;

    public CityIdDoesNotExistsRuleImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public void validate(UUID data) {
        if (!cityRepository.existsById(data)) {
            throw CityIdDoesNotExistsException.create();
        }
    }
}
