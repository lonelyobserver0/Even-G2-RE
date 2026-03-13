package org.bouncycastle.i18n;

import com.stub.StubApp;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Locale;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MissingEntryException extends RuntimeException {
    private String debugMsg;
    protected final String key;
    protected final ClassLoader loader;
    protected final Locale locale;
    protected final String resource;

    public MissingEntryException(String str, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }

    public ClassLoader getClassLoader() {
        return this.loader;
    }

    public String getDebugMsg() {
        if (this.debugMsg == null) {
            this.debugMsg = StubApp.getString2(29579) + this.key + StubApp.getString2(29571) + this.resource + StubApp.getString2(29580) + this.locale + StubApp.getString2(1);
            ClassLoader classLoader = this.loader;
            if (classLoader instanceof URLClassLoader) {
                URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
                this.debugMsg = AbstractC1482f.k(new StringBuilder(), this.debugMsg, StubApp.getString2(29581));
                for (int i3 = 0; i3 != uRLs.length; i3++) {
                    this.debugMsg += uRLs[i3] + StubApp.getString2(397);
                }
            }
        }
        return this.debugMsg;
    }

    public String getKey() {
        return this.key;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public String getResource() {
        return this.resource;
    }

    public MissingEntryException(String str, Throwable th, String str2, String str3, Locale locale, ClassLoader classLoader) {
        super(str, th);
        this.resource = str2;
        this.key = str3;
        this.locale = locale;
        this.loader = classLoader;
    }
}
