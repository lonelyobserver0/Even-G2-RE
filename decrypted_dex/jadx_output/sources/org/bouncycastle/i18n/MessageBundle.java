package org.bouncycastle.i18n;

import com.stub.StubApp;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MessageBundle extends TextBundle {
    public static final String TITLE_ENTRY = StubApp.getString2(616);

    public MessageBundle(String str, String str2) throws NullPointerException {
        super(str, str2);
    }

    public String getTitle(Locale locale) throws MissingEntryException {
        return getEntry(StubApp.getString2(616), locale, TimeZone.getDefault());
    }

    public MessageBundle(String str, String str2, String str3) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3);
    }

    public String getTitle(Locale locale, TimeZone timeZone) throws MissingEntryException {
        return getEntry(StubApp.getString2(616), locale, timeZone);
    }

    public MessageBundle(String str, String str2, String str3, Object[] objArr) throws NullPointerException, UnsupportedEncodingException {
        super(str, str2, str3, objArr);
    }

    public MessageBundle(String str, String str2, Object[] objArr) throws NullPointerException {
        super(str, str2, objArr);
    }
}
