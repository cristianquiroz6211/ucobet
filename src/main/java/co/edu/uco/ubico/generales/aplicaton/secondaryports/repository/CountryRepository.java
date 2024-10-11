package co.edu.uco.ubico.generales.aplicaton.secondaryports.repository;

import co.edu.uco.ubico.generales.aplicaton.secondaryports.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CountryRepository  extends JpaRepository<CountryEntity, UUID> {
}
