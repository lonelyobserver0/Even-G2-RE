package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OneEightyDegreeInt extends ASN1Object {
    private final BigInteger value;
    private static final BigInteger loweBound = new BigInteger(StubApp.getString2(33214));
    private static final BigInteger upperBound = new BigInteger(StubApp.getString2(33215));
    private static final BigInteger unknown = new BigInteger(StubApp.getString2(33216));

    public OneEightyDegreeInt(long j) {
        this(BigInteger.valueOf(j));
    }

    private static BigInteger assertValue(BigInteger bigInteger) {
        return bigInteger;
    }

    public static OneEightyDegreeInt getInstance(Object obj) {
        if (obj instanceof OneEightyDegreeInt) {
            return (OneEightyDegreeInt) obj;
        }
        if (obj != null) {
            return new OneEightyDegreeInt(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public BigInteger getValue() {
        return this.value;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.value);
    }

    public OneEightyDegreeInt(BigInteger bigInteger) {
        if (!bigInteger.equals(unknown)) {
            if (bigInteger.compareTo(loweBound) < 0) {
                throw new IllegalStateException(StubApp.getString2(33218));
            }
            if (bigInteger.compareTo(upperBound) > 0) {
                throw new IllegalStateException(StubApp.getString2(33217));
            }
        }
        this.value = bigInteger;
    }

    private OneEightyDegreeInt(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
