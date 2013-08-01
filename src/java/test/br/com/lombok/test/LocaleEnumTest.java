package br.com.lombok.test;

import java.util.Locale;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import br.com.lombok.enumerator.LocaleEnum;

public class LocaleEnumTest {
	

	@Before
	public void initialize() {
		
	}
	
	@Test
	public void shouldThreeLanguages() {
		int count = 3;
		Assert.assertEquals(count,LocaleEnum.getLocales().length);
	}
	
	@Test
	public void shouldDefaultBrazil() {
		String country = "BR";
		Assert.assertEquals(country,LocaleEnum.DEFAULT.getCountry());
	}
	
	@Test
	public void shouldConvertJavaLocale() {
		Locale localeBrazil = new Locale("pt", "BR");
	
		Locale locale = LocaleEnum.getLocale(LocaleEnum.DEFAULT);
		
		Assert.assertEquals(localeBrazil,locale);
	}
	
	@Test
	public void shouldNullJavaLocale() {
		LocaleEnum localeNull = null;
		Locale locale = LocaleEnum.getLocale(localeNull);
		
		Assert.assertNull(locale);
	}
	
	@Test
	public void shouldConvertLombokLocale() {
		Locale localeBrazil = new Locale("pt", "BR");
	
		LocaleEnum locale = LocaleEnum.getLocale(localeBrazil);
		
		Assert.assertEquals(LocaleEnum.DEFAULT,locale);
	}
	
	@Test
	public void shouldNullInvalidLanguageLocale() {
		Locale localeBrazil = new Locale("aa", "BR");
	
		LocaleEnum locale = LocaleEnum.getLocale(localeBrazil);
		
		Assert.assertEquals(null,locale);
	}
	
	
	@Test
	public void shouldNullInvalidCountryLocale() {
		Locale localeBrazil = new Locale("pt", "BRAZIL");
	
		LocaleEnum locale = LocaleEnum.getLocale(localeBrazil);
		
		Assert.assertEquals(null,locale);
	}

	@Test
	public void shouldCountryBrazil() {
		String country = "BR";
		Assert.assertEquals(country, LocaleEnum.DEFAULT.getCountry());
	}
	
	@Test
	public void shouldCountrySpain() {
		String country = "ES";
		Assert.assertEquals(country, LocaleEnum.SPANISH.getCountry());
	}
	
	@Test
	public void shouldCountryEnglishUSA() {
		String country = "US";
		Assert.assertEquals(country, LocaleEnum.ENGLISH_USA.getCountry());
	}
	
	@Test
	public void shouldLanguageBrazil() {
		String country = "pt";
		Assert.assertEquals(country, LocaleEnum.DEFAULT.getLanguage());
	}
	
	@Test
	public void shouldLanguageSpain() {
		String country = "es";
		Assert.assertEquals(country, LocaleEnum.SPANISH.getLanguage());
	}
	
	@Test
	public void shouldLanguageEnglishUSA() {
		String country = "en";
		Assert.assertEquals(country, LocaleEnum.ENGLISH_USA.getLanguage());
	}

	@Test
	public void shouldNameBrazil() {
		String name = "locale_default";
		Assert.assertEquals(name, LocaleEnum.DEFAULT.getName());
	}
	
	@Test
	public void shouldNameSpain() {
		String name = "locale_spanish";
		Assert.assertEquals(name, LocaleEnum.SPANISH.getName());
	}
	
	@Test
	public void shouldNameEnglishUSA() {
		String name = "locale_english_usa";
		Assert.assertEquals(name, LocaleEnum.ENGLISH_USA.getName());
	}

	
}
