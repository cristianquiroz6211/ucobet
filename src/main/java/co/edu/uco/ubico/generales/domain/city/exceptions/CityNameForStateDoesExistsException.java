package co.edu.uco.ubico.generales.domain.city.exceptions;

import co.edu.uco.ubico.generales.crosscutting.helpers.exceptions.RuleUcobetExeption;

public class CityNameForStateDoesExistsException extends RuleUcobetExeption {
    private static final long serialVersionUTD = 1L;

    public CityNameForStateDoesExistsException(final String Usermessage) {
        super(Usermessage, Usermessage, new Exception());
    }

    public static final CityNameForStateDoesExistsException create() {
        var userMessage = "La ciudad con el nombre " + "no se encuentra en la base de datos";
        return new CityNameForStateDoesExistsException(userMessage);
    }
}
