package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CrlSeries extends UINT16 {
    public CrlSeries(int i3) {
        super(i3);
    }

    public static CrlSeries getInstance(Object obj) {
        if (obj instanceof CrlSeries) {
            return (CrlSeries) obj;
        }
        if (obj != null) {
            return new CrlSeries(ASN1Integer.getInstance(obj).getValue());
        }
        return null;
    }

    public CrlSeries(BigInteger bigInteger) {
        super(bigInteger);
    }
}
