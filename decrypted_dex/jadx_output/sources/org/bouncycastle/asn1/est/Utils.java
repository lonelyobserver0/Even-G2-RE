package org.bouncycastle.asn1.est;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    public static AttrOrOID[] clone(AttrOrOID[] attrOrOIDArr) {
        AttrOrOID[] attrOrOIDArr2 = new AttrOrOID[attrOrOIDArr.length];
        System.arraycopy(attrOrOIDArr, 0, attrOrOIDArr2, 0, attrOrOIDArr.length);
        return attrOrOIDArr2;
    }
}
