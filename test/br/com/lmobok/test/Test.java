package br.com.lmobok.test;

import java.util.Locale;

import br.com.lombok.enumerator.LocaleEnum;
import br.com.lombok.i18n.I18nUtil;

public class Test {
	
	public static void main(String args[]){
		
		Locale[] suportedLocales = LocaleEnum.getLocale();
		
		for(Locale l : suportedLocales){
			System.out.println(l.getDisplayLanguage());
		}
		
		Locale locale = new Locale("PT-BR");
		System.out.println(I18nUtil.getInstance().getCurrencyFormatter(locale).format(20.50D));
	}

}
