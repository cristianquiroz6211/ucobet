package co.edu.uco.ubico.generales.aplicaton.secondaryports.repository;

import co.edu.uco.ubico.generales.aplicaton.secondaryports.entity.CountryEntity;
import co.edu.uco.ubico.generales.aplicaton.secondaryports.entity.StateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface StateRepository  extends JpaRepository<StateEntity, UUID> {

}
