package org.bouncycastle.i18n;

import com.stub.StubApp;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ErrorBundle extends MessageBundle {
    public static final String DETAIL_ENTRY = StubApp.getString2(13035);
    public static final String SUMMARY_ENTRY = StubApp.getString2(13048);

    public ErrorBundle(String str, String str2) throws NullPointerException {
        super(str, str2);
    }

    public String getDetail(Locale locale) throws MissingEntryException {
        return getEntry(StubApp.getString2(13035), locale, TimeZone.getDefault());
    }

    public String getSummary(Locale locale) throws MissingEntryException {
        return getEntry(StubApp.getString2(13048), locale, TimeZone.getDefault());
    }

    public ErrorBundle(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public String getDetail(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return getEntry(StubApp.getString2(13035), locale, timeZone);
    }

    public String getSummary(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return getEntry(StubApp.getString2(13048), locale, timeZone);
    }

    public ErrorBundle(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public ErrorBundle(String str, String str2, Object[] objArr) throws NullPointerException {
        super(str, str2, objArr);
    }
}
