package org.bouncycastle.i18n.filter;

import com.stub.StubApp;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HTMLFilter implements Filter {
    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilter(String str) {
        int i3;
        String string2;
        StringBuffer stringBuffer = new StringBuffer(str);
        int i10 = 0;
        while (i10 < stringBuffer.length()) {
            char charAt = stringBuffer.charAt(i10);
            if (charAt == '\"') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29593);
            } else if (charAt == '#') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29592);
            } else if (charAt == '+') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29591);
            } else if (charAt == '-') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29590);
            } else if (charAt == '>') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29589);
            } else if (charAt == ';') {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29588);
            } else if (charAt != '<') {
                switch (charAt) {
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        i3 = i10 + 1;
                        string2 = StubApp.getString2(29586);
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        i3 = i10 + 1;
                        string2 = StubApp.getString2(29585);
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        i3 = i10 + 1;
                        string2 = StubApp.getString2(29584);
                        break;
                    case '(':
                        i3 = i10 + 1;
                        string2 = StubApp.getString2(29583);
                        break;
                    case EACTags.INTERCHANGE_PROFILE /* 41 */:
                        i3 = i10 + 1;
                        string2 = StubApp.getString2(29582);
                        break;
                    default:
                        i10 -= 3;
                        continue;
                }
            } else {
                i3 = i10 + 1;
                string2 = StubApp.getString2(29587);
            }
            stringBuffer.replace(i10, i3, string2);
            i10 += 4;
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.i18n.filter.Filter
    public String doFilterUrl(String str) {
        return doFilter(str);
    }
}
