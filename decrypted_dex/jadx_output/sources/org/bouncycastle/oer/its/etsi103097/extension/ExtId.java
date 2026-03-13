package org.bouncycastle.oer.its.etsi103097.extension;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ExtId extends ASN1Object {
    private static final BigInteger MAX = BigInteger.valueOf(255);
    private final BigInteger extId;

    public ExtId(long j) {
        this(BigInteger.valueOf(j));
    }

    public static ExtId getInstance(Object obj) {
        if (obj instanceof ExtId) {
            return (ExtId) obj;
        }
        if (obj != null) {
            return new ExtId(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public BigInteger getExtId() {
        return this.extId;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new ASN1Integer(this.extId);
    }

    public ExtId(BigInteger bigInteger) {
        if (bigInteger.signum() >= 0 && bigInteger.compareTo(MAX) <= 0) {
            this.extId = bigInteger;
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(33178) + bigInteger + StubApp.getString2(33179));
    }

    private ExtId(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }

    public ExtId(byte[] bArr) {
        this(new BigInteger(bArr));
    }
}
