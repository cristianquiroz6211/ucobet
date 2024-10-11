package co.edu.uco.ubico.generales.domain.city.rules;

import co.edu.uco.ubico.generales.domain.DomainRule;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface CityIdDoesExistsRule extends DomainRule<UUID> {

}
