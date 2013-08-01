package br.com.lombok.i18n;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe utilitária contendo os métodos para utilitários<BR>
 * para internacionalização do sistema.
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
	 * Método responsável em formatar uma data de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public DateFormat getDateFormatter(Locale locale) {
		return DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
	}

	/**
	 * Método responsável em formatar um número de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public NumberFormat getNumberFormatter(Locale locale) {
		return NumberFormat.getNumberInstance(locale);
	}

	/**
	 * Método responsável em formatar um valor monetário de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public NumberFormat getCurrencyFormatter(Locale locale) {
		return NumberFormat.getCurrencyInstance(locale);
	}

	/**
	 * Método responsável em formatar um valor percentual de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public NumberFormat getPercentFormatter(Locale locale) {
		return NumberFormat.getPercentInstance(locale);
	}

	/**
	 * Método responsável em retornar uma instância da classe.
	 * 
	 * @return
	 */
	public static I18nUtil getInstance() {
		return INSTANCE;
	}

}
