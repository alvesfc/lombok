package br.com.lombok.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe utilit�ria contendo os m�todos para utilit�rios<BR>
 * para internacionaliza��o do sistema.
 * 
 * @since   10-03-2012
 * @author  Marcos Alves Cunha
 * @version 1.0
 */
public class I18nUtil {

	private static final I18nUtil INSTANCE = new I18nUtil();

	/**
	 * Construtor privado - evita que a classe seja instanciada.
	 */
	private I18nUtil() {
		super();
	}

	/**
	 * M�todo respons�vel em formatar uma data de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que ser� utilizado na formata��o.
	 * @return
	 */
	public DateFormat getDateFormatter(Locale locale) {
		return DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
	}

	/**
	 * M�todo respons�vel em formatar um n�mero de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que ser� utilizado na formata��o.
	 * @return
	 */
	public NumberFormat getNumberFormatter(Locale locale) {
		return NumberFormat.getNumberInstance(locale);
	}

	/**
	 * M�todo respons�vel em formatar um valor monet�rio de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que ser� utilizado na formata��o.
	 * @return
	 */
	public NumberFormat getCurrencyFormatter(Locale locale) {
		return NumberFormat.getCurrencyInstance(locale);
	}

	/**
	 * M�todo respons�vel em formatar um valor percentual de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que ser� utilizado na formata��o.
	 * @return
	 */
	public NumberFormat getPercentFormatter(Locale locale) {
		return NumberFormat.getPercentInstance(locale);
	}

	/**
	 * M�todo respons�vel em retornar uma inst�ncia da classe.
	 * 
	 * @return
	 */
	public static I18nUtil getInstance() {
		return INSTANCE;
	}

}
