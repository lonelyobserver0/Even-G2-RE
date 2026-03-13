package org.bouncycastle.tsp;

import com.stub.StubApp;
import i2.u;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.tsp.Accuracy;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GenTimeAccuracy {
    private Accuracy accuracy;

    public GenTimeAccuracy(Accuracy accuracy) {
        this.accuracy = accuracy;
    }

    private String format(int i3) {
        String string2;
        if (i3 < 10) {
            string2 = StubApp.getString2(1720);
        } else {
            if (i3 >= 100) {
                return Integer.toString(i3);
            }
            string2 = StubApp.getString2(824);
        }
        return u.p(i3, string2);
    }

    private int getTimeComponent(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            return aSN1Integer.intValueExact();
        }
        return 0;
    }

    public int getMicros() {
        return getTimeComponent(this.accuracy.getMicros());
    }

    public int getMillis() {
        return getTimeComponent(this.accuracy.getMillis());
    }

    public int getSeconds() {
        return getTimeComponent(this.accuracy.getSeconds());
    }

    public String toString() {
        return getSeconds() + StubApp.getString2(1) + format(getMillis()) + format(getMicros());
    }
}
