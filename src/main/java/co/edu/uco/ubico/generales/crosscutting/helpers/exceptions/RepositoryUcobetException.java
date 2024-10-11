package co.edu.uco.ubico.generales.crosscutting.helpers.exceptions;

import co.edu.uco.ubico.generales.crosscutting.helpers.exceptions.enums.Layer;

public class RepositoryUcobetException extends UcobetException {

    public RepositoryUcobetException(final String Usermessage,final String technicalMessage, final Exception rootException) {
        super(Usermessage, technicalMessage, rootException, Layer.REPOSITORY);
    }

    public static RuleUcobetExeption create(final String Usermessage,final String technicalMessage, final Exception rootException) {
        return new RuleUcobetExeption(Usermessage, technicalMessage, rootException);
    }

    public static RuleUcobetExeption create(final String Usermessage,final String technicalMessage) {
        return new RuleUcobetExeption(Usermessage, technicalMessage,  new Exception());

    }
    public static RuleUcobetExeption create(final String Usermessage) {
        return new RuleUcobetExeption(Usermessage, Usermessage, new Exception());

    }

}
