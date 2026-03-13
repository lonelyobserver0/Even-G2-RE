package org.bouncycastle.asn1.x509.qualified;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.DERPrintableString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Iso4217CurrencyCode extends ASN1Object implements ASN1Choice {
    int numeric;
    ASN1Encodable obj;
    final int ALPHABETIC_MAXSIZE = 3;
    final int NUMERIC_MINSIZE = 1;
    final int NUMERIC_MAXSIZE = 999;

    public Iso4217CurrencyCode(int i3) {
        if (i3 > 999 || i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(27862));
        }
        this.obj = new ASN1Integer(i3);
    }

    public static Iso4217CurrencyCode getInstance(Object obj) {
        if (obj == null || (obj instanceof Iso4217CurrencyCode)) {
            return (Iso4217CurrencyCode) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new Iso4217CurrencyCode(ASN1Integer.getInstance(obj).intValueExact());
        }
        if (obj instanceof ASN1PrintableString) {
            return new Iso4217CurrencyCode(ASN1PrintableString.getInstance(obj).getString());
        }
        throw new IllegalArgumentException(StubApp.getString2(26915));
    }

    public String getAlphabetic() {
        return ((ASN1PrintableString) this.obj).getString();
    }

    public int getNumeric() {
        return ((ASN1Integer) this.obj).intValueExact();
    }

    public boolean isAlphabetic() {
        return this.obj instanceof ASN1PrintableString;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.obj.toASN1Primitive();
    }

    public Iso4217CurrencyCode(String str) {
        if (str.length() > 3) {
            throw new IllegalArgumentException(StubApp.getString2(27863));
        }
        this.obj = new DERPrintableString(str);
    }
}
