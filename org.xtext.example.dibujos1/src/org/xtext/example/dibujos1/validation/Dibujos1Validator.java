package org.xtext.example.dibujos1.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.example.dibujos1.dibujos1.*;

public class Dibujos1Validator extends AbstractDibujos1Validator {

    @Check
    public void textoNoVacio(Texto t) {
        if (t.getTexto() != null && t.getTexto().trim().isEmpty()) {
            error("S001: El comando T no puede tener texto vacío entre comillas (\"\").",
                Dibujos1Package.Literals.TEXTO__TEXTO);
        }
    }



    @Check
    public void colorValido(Color c) {
        String hex = c.getColor();
        if (hex == null || !hex.matches("#[0-9A-Fa-f]{6}")) {
            error("S003: El color debe estar en formato hexadecimal RGB (#RRGGBB).",
                Dibujos1Package.Literals.COLOR__COLOR);
        }
    }
}
