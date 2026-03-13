package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NinetyDegreeInt extends ASN1Object {
    private final BigInteger value;
    private static final BigInteger loweBound = new BigInteger(StubApp.getString2(33209));
    private static final BigInteger upperBound = new BigInteger(StubApp.getString2(33210));
    private static final BigInteger unknown = new BigInteger(StubApp.getString2(33211));

    public NinetyDegreeInt(long j) {
        this(BigInteger.valueOf(j));
    }

    public static NinetyDegreeInt getInstance(Object obj) {
        if (obj instanceof NinetyDegreeInt) {
            return (NinetyDegreeInt) obj;
        }
        if (obj != null) {
            return new NinetyDegreeInt(ASN1Integer.getInstance(obj));
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

    public NinetyDegreeInt(BigInteger bigInteger) {
        if (!bigInteger.equals(unknown)) {
            if (bigInteger.compareTo(loweBound) < 0) {
                throw new IllegalStateException(StubApp.getString2(33213));
            }
            if (bigInteger.compareTo(upperBound) > 0) {
                throw new IllegalStateException(StubApp.getString2(33212));
            }
        }
        this.value = bigInteger;
    }

    private NinetyDegreeInt(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
