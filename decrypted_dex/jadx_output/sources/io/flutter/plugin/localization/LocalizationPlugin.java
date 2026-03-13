package io.flutter.plugin.localization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import com.stub.StubApp;
import gb.C0983l;
import gb.InterfaceC0982k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class LocalizationPlugin {
    private final Context context;
    private final C0983l localizationChannel;

    @SuppressLint({"AppBundleLocaleChanges", "DiscouragedApi"})
    final InterfaceC0982k localizationMessageHandler;

    public LocalizationPlugin(Context context, C0983l c0983l) {
        InterfaceC0982k interfaceC0982k = new InterfaceC0982k() { // from class: io.flutter.plugin.localization.LocalizationPlugin.1
            @Override // gb.InterfaceC0982k
            public String getStringResource(String str, String str2) {
                Context context2 = LocalizationPlugin.this.context;
                if (str2 != null) {
                    Locale localeFromString = LocalizationPlugin.localeFromString(str2);
                    Configuration configuration = new Configuration(LocalizationPlugin.this.context.getResources().getConfiguration());
                    configuration.setLocale(localeFromString);
                    context2 = LocalizationPlugin.this.context.createConfigurationContext(configuration);
                }
                int identifier = context2.getResources().getIdentifier(str, StubApp.getString2(983), LocalizationPlugin.this.context.getPackageName());
                if (identifier != 0) {
                    return context2.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.localizationMessageHandler = interfaceC0982k;
        this.context = context;
        this.localizationChannel = c0983l;
        c0983l.f14362b = interfaceC0982k;
    }

    public static Locale localeFromString(String str) {
        String str2;
        String[] split = str.replace('_', '-').split(StubApp.getString2(999), -1);
        String str3 = split[0];
        String str4 = "";
        int i3 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i3 = 2;
        }
        if (split.length > i3 && split[i3].length() >= 2 && split[i3].length() <= 3) {
            str4 = split[i3];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale resolveNativeLocale(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = this.context.getResources().getConfiguration().getLocales();
        int size = locales.size();
        for (int i3 = 0; i3 < size; i3++) {
            Locale locale = locales.get(i3);
            String language = locale.getLanguage();
            boolean isEmpty = locale.getScript().isEmpty();
            String string2 = StubApp.getString2(999);
            if (!isEmpty) {
                StringBuilder n10 = AbstractC1482f.n(language, string2);
                n10.append(locale.getScript());
                language = n10.toString();
            }
            if (!locale.getCountry().isEmpty()) {
                StringBuilder n11 = AbstractC1482f.n(language, string2);
                n11.append(locale.getCountry());
                language = n11.toString();
            }
            arrayList.add(new Locale.LanguageRange(language));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
            arrayList.add(new Locale.LanguageRange(locale.getLanguage() + StubApp.getString2(18722)));
        }
        Locale lookup = Locale.lookup(arrayList, list);
        return lookup != null ? lookup : list.get(0);
    }

    public void sendLocalesToFlutter(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(locales.get(i3));
        }
        C0983l c0983l = this.localizationChannel;
        c0983l.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        c0983l.f14361a.invokeMethod(StubApp.getString2(18723), arrayList2);
    }
}
