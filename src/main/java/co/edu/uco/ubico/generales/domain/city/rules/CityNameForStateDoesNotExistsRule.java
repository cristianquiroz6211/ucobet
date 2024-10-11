package co.edu.uco.ubico.generales.domain.city.rules;

import co.edu.uco.ubico.generales.domain.DomainRule;
import org.springframework.stereotype.Service;

@Service
public interface CityNameForStateDoesNotExistsRule extends DomainRule<String> {

}
