package co.edu.uco.ubico.generales.crosscutting.helpers.exceptions;

import co.edu.uco.ubico.generales.crosscutting.helpers.ObjectHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.TextHelper;
import co.edu.uco.ubico.generales.crosscutting.helpers.exceptions.enums.Layer;

public class UcobetException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String Usermessage;
    private Layer layer;

    public UcobetException(final String Usermessage,final String technicalMessage, Exception rootException, final Layer layer) {
        super(ObjectHelper.getDefault(technicalMessage, TextHelper.applyTrim(Usermessage)),ObjectHelper.getDefault(rootException, new Exception()));
        setUsermessage(Usermessage);
        setLayer(layer);
    }

    public String getUsermessage() {
        return Usermessage;
    }

    public void setUsermessage(final String usermessage) {
        this.Usermessage = TextHelper.applyTrim(usermessage);
    }

    public Layer getLayer() {
        return layer;
    }

    private void setLayer(final Layer layer) {
        this.layer = ObjectHelper.getDefault(layer, Layer.GENERAL);
    }
}
