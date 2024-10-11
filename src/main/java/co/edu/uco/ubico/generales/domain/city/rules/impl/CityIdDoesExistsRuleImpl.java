package co.edu.uco.ubico.generales.domain.city.rules.impl;

import co.edu.uco.ubico.generales.aplicaton.secondaryports.repository.CityRepository;
import co.edu.uco.ubico.generales.domain.city.exceptions.CityIdDoesNotExistsException;
import co.edu.uco.ubico.generales.domain.city.rules.CityIdDoesExistsRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;


public  final class CityIdDoesExistsRuleImpl implements CityIdDoesExistsRule {

    private CityRepository cityRepository;

    public CityIdDoesExistsRuleImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    @Override
    public void validate(UUID data) {
        if (cityRepository.existsById(data)) {
            throw CityIdDoesNotExistsException.create();
        }
    }

    }

