/**
 * 
 */
package br.com.lombok.enumerator;

import java.util.Locale;

/**
 * Enumerator responsável em armazenar os idiomas que serão<BR>
 * utilizados na Aplicação.
 * 
 * @author Marcos Alves Cunha
 * @version 1.0
 */
public enum LocaleEnum {

    DEFAULT("locale_default", "pt", "BR"), 
    ENGLISH_USA("locale_english_usa","en", "US"), 
    SPANISH("locale_spanish", "es", "ES");

    private String name;
    private String language;
    private String country;

    private LocaleEnum(String name, String language, String country) {
        this.name = name;
        this.language = language;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    /**
     * Método responsável em retornar todos os idiomas suportados.
     * 
     * @return Array de objetos do tipo {@link Locale} .
     * 
     */
    public static Locale[] getLocales() {
        Locale[] suportedLocales = new Locale[LocaleEnum.values().length];
        int i = 0;
        for (LocaleEnum locale : LocaleEnum.values()) {
            suportedLocales[i] = new Locale(locale.language, locale.country);
            i++;
        }
        return suportedLocales;
    }

    /**
     * Método responsável em converter um tipo {@link LocaleEnum} para {@link Locale} 
     * de acordo com o parâmetro passado.
     * @param locale objeto do tipo {@link LocaleEnum}
     * @return objeto {@link Locale} 
     */
    public static Locale getLocale(LocaleEnum locale) {
        Locale loc = null;
        if (locale != null) {
            loc = new Locale(locale.getLanguage(), locale.getCountry());
        }
        return loc;
    }

    /**
     * Método responsável em converter um tipo {@link Locale} para {@link LocaleEnum} 
     * de acordo com o parâmetro passado.
     * @param locale objeto do tipo {@link Locale}
     * @return objeto {@link LocaleEnum} 
     */
    public static LocaleEnum getLocale(Locale locale) {
        for (LocaleEnum l : LocaleEnum.values()) {
            if (l.getCountry().equals(locale.getCountry())
                    && l.getLanguage().equals(locale.getLanguage())) {
                return l;
            }
        }
        return null;
    }

}
