package org.bouncycastle.asn1.cmp;

import E1.a;
import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIConfirmContent extends ASN1Object {
    private final ASN1Null val;

    public PKIConfirmContent() {
        this.val = DERNull.INSTANCE;
    }

    public static PKIConfirmContent getInstance(Object obj) {
        if (obj == null || (obj instanceof PKIConfirmContent)) {
            return (PKIConfirmContent) obj;
        }
        if (obj instanceof ASN1Null) {
            return new PKIConfirmContent((ASN1Null) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26879)));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.val;
    }

    private PKIConfirmContent(ASN1Null aSN1Null) {
        this.val = aSN1Null;
    }
}
