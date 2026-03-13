package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IValue extends ASN1Object {
    private final BigInteger value;

    private IValue(ASN1Integer aSN1Integer) {
        int intValueExact = BigIntegers.intValueExact(aSN1Integer.getValue());
        if (intValueExact < 0 || intValueExact > 65535) {
            throw new IllegalArgumentException(StubApp.getString2(33206));
        }
        this.value = aSN1Integer.getValue();
    }

    public static IValue getInstance(Object obj) {
        if (obj instanceof IValue) {
            return (IValue) obj;
        }
        if (obj != null) {
            return new IValue(ASN1Integer.getInstance(obj));
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
}
