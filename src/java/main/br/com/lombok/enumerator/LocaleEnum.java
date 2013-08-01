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

	public static Locale[] getLocales() {
		Locale[] suportedLocales = new Locale[LocaleEnum.values().length];
		int i = 0;
		for (LocaleEnum locale : LocaleEnum.values()) {
			suportedLocales[i] = new Locale(locale.language, locale.country);
			i++;
		}
		return suportedLocales;
	}

	public static Locale getLocale(LocaleEnum locale) {
		if (locale != null) {
			Locale loc = new Locale(locale.getLanguage(), locale.getCountry());
			return loc;
		}
		return null;
	}

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
