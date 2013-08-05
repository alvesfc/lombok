package br.com.lombok.i18n;



import java.text.DateFormat;
import java.text.NumberFormat;

import br.com.lombok.enumerator.LocaleEnum;


/**
 * Classe utilit�ria contendo os m�todos para utilit�rios<BR>
 * para internacionaliza��o do sistema.
 * 
 * @author  Marcos Alves Cunha
 * @version 1.0
 */
public final class I18nUtil {

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
     *            - idioma que ser� utilizado na Formata��o.
     * @return objeto {@link DateFormat} com o Locale passado como par�metro.
     */
    public DateFormat getDateFormatter(LocaleEnum locale) {
        return DateFormat.getDateInstance(DateFormat.DEFAULT, LocaleEnum.getLocale(locale));
    }
    
    /**
     * M�todo respons�vel em formatar uma hora de acordo com<BR>
     * o idioma informado.
     * 
     * @param locale
     *            - idioma que ser� utilizado na Formata��o.
     * @return objeto {@link DateFormat} com o Locale passado como par�metro.
     */
    public DateFormat getTimeFormatter(LocaleEnum locale) {
        return DateFormat.getTimeInstance(DateFormat.MEDIUM, LocaleEnum.getLocale(locale));
    }
    
    

    /**
     * M�todo respons�vel em formatar um número de acordo com<BR>
     * o idioma informado.
     * 
     * @param locale
     *            - idioma que ser� utilizado na Formata��o.
     * @return objeto {@link NumberFormat} com o Locale passado como par�metro.
     */
    public NumberFormat getNumberFormatter(LocaleEnum locale) {
        return NumberFormat.getNumberInstance(LocaleEnum.getLocale(locale));
    }

    /**
     * M�todo respons�vel em formatar um valor monetário de acordo com<BR>
     * o idioma informado.
     * 
     * @param locale
     *            - idioma que ser� utilizado na Formata��o.
     * @return objeto {@link NumberFormat} com o Locale passado como par�metro.
     */
    public NumberFormat getCurrencyFormatter(LocaleEnum locale) {
        return NumberFormat.getCurrencyInstance(LocaleEnum.getLocale(locale));
    }

    /**
     * M�todo respons�vel em formatar um valor percentual de acordo com<BR>
     * o idioma informado.
     * 
     * @param locale
     *            - idioma que ser� utilizado na Formata��o.
     * @return objeto {@link NumberFormat} com o Locale passado como par�metro.
     */
    public NumberFormat getPercentFormatter(LocaleEnum locale) {
        return NumberFormat.getPercentInstance(LocaleEnum.getLocale(locale));
    }

    /**
     * M�todo respons�vel em retornar uma inst�ncia da classe.
     * 
     * @return objeto {@link I18nUtil}.
     */
    public static I18nUtil getInstance() {
        return INSTANCE;
    }

}

