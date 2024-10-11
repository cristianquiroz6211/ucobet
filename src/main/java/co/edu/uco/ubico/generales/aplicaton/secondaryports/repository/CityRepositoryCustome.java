package co.edu.uco.ubico.generales.aplicaton.secondaryports.repository;

import co.edu.uco.ubico.generales.aplicaton.secondaryports.entity.CityEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepositoryCustome {
    List<CityEntity> findByFilter(CityEntity cityEntity);
}
