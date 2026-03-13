package org.bouncycastle.i18n.filter;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SQLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i3;
        String string2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i10 = 0;
        while (i10 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i10);
            if (charAt == '\n') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(11652);
            } else if (charAt == '\r') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(11649);
            } else if (charAt == '\"') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(11658);
            } else if (charAt == '\'') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(11657);
            } else if (charAt == '-') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(22048);
            } else if (charAt == '/') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29596);
            } else if (charAt == ';') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29595);
            } else if (charAt == '=') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29594);
            } else if (charAt != '\\') {
                i10++;
            } else {
                i3 = i10 + 1;
                string2 = StubApp.getString2(11656);
            }
            stringBuffer.replace(i10, i3, string2);
            i10 = i3;
            i10++;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
