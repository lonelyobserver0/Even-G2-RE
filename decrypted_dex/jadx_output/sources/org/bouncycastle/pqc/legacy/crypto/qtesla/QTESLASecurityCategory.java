package org.bouncycastle.pqc.legacy.crypto.qtesla;

import com.stub.StubApp;
import i2.u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class QTESLASecurityCategory {
    public static final int PROVABLY_SECURE_I = 5;
    public static final int PROVABLY_SECURE_III = 6;

    private QTESLASecurityCategory() {
    }

    public static String getName(int i3) {
        if (i3 == 5) {
            return StubApp.getString2(34790);
        }
        if (i3 == 6) {
            return StubApp.getString2(34789);
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(34237)));
    }

    public static int getPrivateSize(int i3) {
        if (i3 == 5) {
            return 5224;
        }
        if (i3 == 6) {
            return 12392;
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(34237)));
    }

    public static int getPublicSize(int i3) {
        if (i3 == 5) {
            return 14880;
        }
        if (i3 == 6) {
            return 38432;
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(34237)));
    }

    public static int getSignatureSize(int i3) {
        if (i3 == 5) {
            return 2592;
        }
        if (i3 == 6) {
            return 5664;
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(34237)));
    }

    public static void validate(int i3) {
        if (i3 != 5 && i3 != 6) {
            throw new IllegalArgumentException(u.p(i3, StubApp.getString2(34237)));
        }
    }
}
