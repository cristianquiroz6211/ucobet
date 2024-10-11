package co.edu.uco.ubico.generales.domain.city.exceptions;

import co.edu.uco.ubico.generales.crosscutting.helpers.exceptions.RuleUcobetExeption;

public final class CityIdDoesNotExistsException extends RuleUcobetExeption {
    private static final long serialVersionUTD = 1L;
    private CityIdDoesNotExistsException(final String Usermessage) {
        super(Usermessage, Usermessage, new Exception());
    }

    public static final CityIdDoesNotExistsException create() {
        var userMessage = "La ciudad con el id " + "no se encuentra en la base de datos";
        return new CityIdDoesNotExistsException(userMessage);

    }
}

