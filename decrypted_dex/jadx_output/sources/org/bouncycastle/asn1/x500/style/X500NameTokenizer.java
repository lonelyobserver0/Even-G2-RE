package org.bouncycastle.asn1.x500.style;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X500NameTokenizer {
    private StringBuffer buf;
    private int index;
    private char separator;
    private String value;

    public X500NameTokenizer(String str) {
        this(str, ',');
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i3 = this.index + 1;
        this.buf.setLength(0);
        boolean z2 = false;
        boolean z10 = false;
        while (i3 != this.value.length()) {
            char charAt = this.value.charAt(i3);
            if (charAt == '\"') {
                if (!z2) {
                    z10 = !z10;
                }
            } else if (!z2 && !z10) {
                if (charAt == '\\') {
                    this.buf.append(charAt);
                    z2 = true;
                } else {
                    if (charAt == this.separator) {
                        break;
                    }
                    this.buf.append(charAt);
                }
                i3++;
            }
            this.buf.append(charAt);
            z2 = false;
            i3++;
        }
        this.index = i3;
        return this.buf.toString();
    }

    public X500NameTokenizer(String str, char c10) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.separator = c10;
    }
}
