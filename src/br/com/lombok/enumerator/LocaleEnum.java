package br.com.lombok.enumerator;

import java.util.Locale;


/**
 * Enumerator responsável em armazenar os idiomas que serão<BR>
 * utilizados na Aplicação.
 * 
 * @since   23-03-2012
 * @author  Marcos Alves Cunha
 * @version 1.0
 */
public enum LocaleEnum {
	
	DEFAULT("locale_default","pt","BR"),
	ENGLISH_USA("locale_english_usa","en","US"),
	SPANISH("locale_spanish","es","ES");
	
	private String name;
	private String language;
	private String country;
	
	private LocaleEnum(String name, String language, String country){
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
	
	public static Locale[] getLocale(){
		Locale[] suportedLocales = new Locale[LocaleEnum.values().length]; 
		int i = 0;
		
		for(LocaleEnum locale : LocaleEnum.values()){
			suportedLocales[i] = new Locale(locale.language, locale.country);
			i++;
		}
		return suportedLocales;
	}

}
