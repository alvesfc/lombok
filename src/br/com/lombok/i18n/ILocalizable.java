package br.com.lombok.i18n;

import java.util.Locale;

/**
 * Interface respons�vel em definir os M�todos necess�rios para<BR>
 * manipular um idioma.
 * 
 * @since   10-03-2012
 * @author  Marcos Alves Cunha
 * @version 1.0
 * 
 */
public interface ILocalizable {

	/**
	 * M�todo respons�vel em adicionar um idioma.
	 * 
	 * @param locale
	 *            - idioma que ser� adicionado.
	 */
	public abstract void setLocale(Locale locale);

	/**
	 * M�todo respons�vel em recuperar um idioma.
	 * 
	 * @return Locale objeto com o idioma.
	 */
	public abstract Locale getLocale();
}
