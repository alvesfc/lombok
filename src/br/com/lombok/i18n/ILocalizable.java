package br.com.lombok.i18n;

import java.util.Locale;

/**
 * Interface responsável em definir os Métodos necessários para<BR>
 * manipular um idioma.
 * 
 * @since   10-03-2012
 * @author  Marcos Alves Cunha
 * @version 1.0
 * 
 */
public interface ILocalizable {

	/**
	 * Método responsável em adicionar um idioma.
	 * 
	 * @param locale
	 *            - idioma que será adicionado.
	 */
	public abstract void setLocale(Locale locale);

	/**
	 * Método responsável em recuperar um idioma.
	 * 
	 * @return Locale objeto com o idioma.
	 */
	public abstract Locale getLocale();
}
