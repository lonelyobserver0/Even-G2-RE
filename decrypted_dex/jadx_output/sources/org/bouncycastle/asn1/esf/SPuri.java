package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPuri {
    private ASN1IA5String uri;

    public SPuri(ASN1IA5String aSN1IA5String) {
        this.uri = aSN1IA5String;
    }

    public static SPuri getInstance(Object obj) {
        if (obj instanceof SPuri) {
            return (SPuri) obj;
        }
        if (obj instanceof ASN1IA5String) {
            return new SPuri(ASN1IA5String.getInstance(obj));
        }
        return null;
    }

    public DERIA5String getUri() {
        ASN1IA5String aSN1IA5String = this.uri;
        return (aSN1IA5String == null || (aSN1IA5String instanceof DERIA5String)) ? (DERIA5String) aSN1IA5String : new DERIA5String(this.uri.getString(), false);
    }

    public ASN1IA5String getUriIA5() {
        return this.uri;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.uri.toASN1Primitive();
    }
}
