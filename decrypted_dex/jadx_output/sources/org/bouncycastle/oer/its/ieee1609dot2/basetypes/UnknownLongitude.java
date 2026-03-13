package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UnknownLongitude extends Longitude {
    public static final UnknownLongitude INSTANCE = new UnknownLongitude();

    public UnknownLongitude() {
        super(1800000001L);
    }

    public static UnknownLongitude getInstance(Object obj) {
        if (obj instanceof UnknownLongitude) {
            return (UnknownLongitude) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(obj);
        if (aSN1Integer.getValue().intValue() == 1800000001) {
            return INSTANCE;
        }
        throw new IllegalArgumentException(StubApp.getString2(33178) + aSN1Integer.getValue() + StubApp.getString2(33233));
    }
}
