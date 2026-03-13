package org.bouncycastle.asn1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OIDTokenizer {
    private int index = 0;
    private String oid;

    public OIDTokenizer(String str) {
        this.oid = str;
    }

    public boolean hasMoreTokens() {
        return this.index != -1;
    }

    public String nextToken() {
        int i3 = this.index;
        if (i3 == -1) {
            return null;
        }
        int indexOf = this.oid.indexOf(46, i3);
        if (indexOf == -1) {
            String substring = this.oid.substring(this.index);
            this.index = -1;
            return substring;
        }
        String substring2 = this.oid.substring(this.index, indexOf);
        this.index = indexOf + 1;
        return substring2;
    }
}
