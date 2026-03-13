package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UINT3 extends UintBase {
    private static final BigInteger MAX = BigInteger.valueOf(7);

    public UINT3(int i3) {
        super(i3);
    }

    public static UINT3 getInstance(Object obj) {
        if (obj instanceof UINT3) {
            return (UINT3) obj;
        }
        if (obj != null) {
            return new UINT3(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.oer.its.ieee1609dot2.basetypes.UintBase
    public void assertLimit() {
        if (this.value.signum() < 0) {
            throw new IllegalArgumentException(StubApp.getString2(33227));
        }
        BigInteger bigInteger = this.value;
        BigInteger bigInteger2 = MAX;
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(33226) + bigInteger2.toString(16));
    }

    public UINT3(long j) {
        super(j);
    }

    public UINT3(BigInteger bigInteger) {
        super(bigInteger);
    }

    public UINT3(ASN1Integer aSN1Integer) {
        super(aSN1Integer);
    }
}
