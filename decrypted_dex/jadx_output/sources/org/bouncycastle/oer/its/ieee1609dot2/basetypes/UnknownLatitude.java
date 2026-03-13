package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class UnknownLatitude extends Latitude {
    public static UnknownLatitude INSTANCE = new UnknownLatitude();

    private UnknownLatitude() {
        super(900000001L);
    }

    public static UnknownLatitude getInstance(Object obj) {
        if (obj instanceof UnknownLatitude) {
            return (UnknownLatitude) obj;
        }
        if (obj == null) {
            return null;
        }
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(obj);
        if (aSN1Integer.getValue().intValue() == 900000001) {
            return INSTANCE;
        }
        throw new IllegalArgumentException(StubApp.getString2(33178) + aSN1Integer.getValue() + StubApp.getString2(33232));
    }
}
