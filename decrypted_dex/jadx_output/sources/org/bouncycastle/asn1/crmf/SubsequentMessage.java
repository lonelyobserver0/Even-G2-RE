package org.bouncycastle.asn1.crmf;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Integer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SubsequentMessage extends ASN1Integer {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    private SubsequentMessage(int i3) {
        super(i3);
    }

    public static SubsequentMessage valueOf(int i3) {
        if (i3 == 0) {
            return encrCert;
        }
        if (i3 == 1) {
            return challengeResp;
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(26946)));
    }
}
