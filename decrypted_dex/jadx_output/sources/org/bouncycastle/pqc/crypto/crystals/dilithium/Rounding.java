package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Rounding {
    public static int[] decompose(int i3, int i10) {
        int i11;
        int i12 = (i3 + CertificateBody.profileType) >> 7;
        if (i10 == 261888) {
            i11 = (((i12 * 1025) + PKIFailureInfo.badSenderNonce) >> 22) & 15;
        } else {
            if (i10 != 95232) {
                throw new RuntimeException(StubApp.getString2(33988));
            }
            int i13 = ((i12 * 11275) + 8388608) >> 24;
            i11 = i13 ^ (((43 - i13) >> 31) & i13);
        }
        int i14 = i3 - ((i11 * 2) * i10);
        return new int[]{i14 - (((4190208 - i14) >> 31) & DilithiumEngine.DilithiumQ), i11};
    }

    public static int makeHint(int i3, int i10, DilithiumEngine dilithiumEngine) {
        int i11;
        int dilithiumGamma2 = dilithiumEngine.getDilithiumGamma2();
        if (i3 <= dilithiumGamma2 || i3 > (i11 = DilithiumEngine.DilithiumQ - dilithiumGamma2)) {
            return 0;
        }
        return (i3 == i11 && i10 == 0) ? 0 : 1;
    }

    public static int[] power2Round(int i3) {
        int i10 = (i3 + 4095) >> 13;
        return new int[]{i10, i3 - (i10 << 13)};
    }

    public static int useHint(int i3, int i10, int i11) {
        int[] decompose = decompose(i3, i11);
        int i12 = decompose[0];
        int i13 = decompose[1];
        if (i10 == 0) {
            return i13;
        }
        if (i11 == 261888) {
            return (i12 > 0 ? i13 + 1 : i13 - 1) & 15;
        }
        if (i11 != 95232) {
            throw new RuntimeException(StubApp.getString2(33988));
        }
        if (i12 > 0) {
            if (i13 == 43) {
                return 0;
            }
            return i13 + 1;
        }
        if (i13 == 0) {
            return 43;
        }
        return i13 - 1;
    }
}
