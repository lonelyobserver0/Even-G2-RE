package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CRLNumber extends ASN1Object {
    private BigInteger number;

    public CRLNumber(BigInteger bigInteger) {
        if (BigIntegers.ZERO.compareTo(bigInteger) > 0) {
            throw new IllegalArgumentException(StubApp.getString2(27719));
        }
        this.number = bigInteger;
    }

    public static CRLNumber getInstance(Object obj) {
        if (obj instanceof CRLNumber) {
            return (CRLNumber) obj;
        }
        if (obj != null) {
            return new CRLNumber(ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public BigInteger getCRLNumber() {
        return this.number;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.number);
    }

    public String toString() {
        return StubApp.getString2(27720) + getCRLNumber();
    }
}
