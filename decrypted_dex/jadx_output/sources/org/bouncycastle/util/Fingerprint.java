package org.bouncycastle.util;

import com.stub.StubApp;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Fingerprint {
    private static char[] encodingTable = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] fingerprint;

    public Fingerprint(byte[] bArr) {
        this(bArr, 160);
    }

    public static byte[] calculateFingerprint(byte[] bArr) {
        return calculateFingerprint(bArr, 160);
    }

    public static byte[] calculateFingerprintSHA512_160(byte[] bArr) {
        SHA512tDigest sHA512tDigest = new SHA512tDigest(160);
        sHA512tDigest.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[sHA512tDigest.getDigestSize()];
        sHA512tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Fingerprint) {
            return Arrays.areEqual(((Fingerprint) obj).fingerprint, this.fingerprint);
        }
        return false;
    }

    public byte[] getFingerprint() {
        return Arrays.clone(this.fingerprint);
    }

    public int hashCode() {
        return Arrays.hashCode(this.fingerprint);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 != this.fingerprint.length; i3++) {
            if (i3 > 0) {
                stringBuffer.append(StubApp.getString2(478));
            }
            stringBuffer.append(encodingTable[(this.fingerprint[i3] >>> 4) & 15]);
            stringBuffer.append(encodingTable[this.fingerprint[i3] & 15]);
        }
        return stringBuffer.toString();
    }

    public Fingerprint(byte[] bArr, int i3) {
        this.fingerprint = calculateFingerprint(bArr, i3);
    }

    public static byte[] calculateFingerprint(byte[] bArr, int i3) {
        if (i3 % 8 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(34983));
        }
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i10 = i3 / 8;
        byte[] bArr2 = new byte[i10];
        sHAKEDigest.doFinal(bArr2, 0, i10);
        return bArr2;
    }

    public Fingerprint(byte[] bArr, boolean z2) {
        if (z2) {
            this.fingerprint = calculateFingerprintSHA512_160(bArr);
        } else {
            this.fingerprint = calculateFingerprint(bArr);
        }
    }
}
