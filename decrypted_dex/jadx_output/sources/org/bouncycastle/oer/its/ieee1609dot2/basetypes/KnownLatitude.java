package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KnownLatitude extends NinetyDegreeInt {
    public KnownLatitude(long j) {
        super(j);
    }

    public static KnownLatitude getInstance(Object obj) {
        if (obj instanceof KnownLatitude) {
            return (KnownLatitude) obj;
        }
        if (obj != null) {
            return new KnownLatitude(ASN1Integer.getInstance(obj));
        }
        return null;
    }

    public KnownLatitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    private KnownLatitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
