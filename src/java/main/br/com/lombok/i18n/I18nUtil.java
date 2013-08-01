package br.com.lombok.i18n;



import java.text.DateFormat;
import java.text.NumberFormat;

import br.com.lombok.enumerator.LocaleEnum;


/**
 * Classe utilitária contendo os métodos para utilitários<BR>
 * para internacionalização do sistema.
 * 
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
	public DateFormat getDateFormatter(LocaleEnum locale) {
		return DateFormat.getDateInstance(DateFormat.DEFAULT, LocaleEnum.getLocale(locale));
	}
	
	/**
	 * Método responsável em formatar uma hora de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public DateFormat getTimeFormatter(LocaleEnum locale) {
		return DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleEnum.getLocale(locale));
	}
	
	

	/**
	 * Método responsável em formatar um número de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public NumberFormat getNumberFormatter(LocaleEnum locale) {
		return NumberFormat.getNumberInstance(LocaleEnum.getLocale(locale));
	}

	/**
	 * Método responsável em formatar um valor monetário de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public NumberFormat getCurrencyFormatter(LocaleEnum locale) {
		return NumberFormat.getCurrencyInstance(LocaleEnum.getLocale(locale));
	}

	/**
	 * Método responsável em formatar um valor percentual de acordo com<BR>
	 * o idioma informado.
	 * 
	 * @param locale
	 *            - idioma que será utilizado na formatação.
	 * @return
	 */
	public NumberFormat getPercentFormatter(LocaleEnum locale) {
		return NumberFormat.getPercentInstance(LocaleEnum.getLocale(locale));
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

