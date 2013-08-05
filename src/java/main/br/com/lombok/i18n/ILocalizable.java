package br.com.lombok.i18n;

import br.com.lombok.enumerator.LocaleEnum;

/**
 * Interface que define os m�todos necess�rios para obter o idioma de uma mensagem.
 * 
 * @author Marcos Alves
 * @version 1.0
 *
 */
public interface ILocalizable {

    /**
     * M�todo respos�vel em obter o objeto {@link LocaleEnum} com os dados do idioma.
     * @return Objeto {@link LocaleEnum} com os dados do idioma.
     */
    LocaleEnum getLocale();

}
