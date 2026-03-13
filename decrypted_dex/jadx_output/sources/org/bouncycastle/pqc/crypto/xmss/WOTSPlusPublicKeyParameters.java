package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class WOTSPlusPublicKeyParameters {
    private final byte[][] publicKey;

    public WOTSPlusPublicKeyParameters(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34326));
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            throw new NullPointerException(StubApp.getString2(34325));
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            throw new IllegalArgumentException(StubApp.getString2(34324));
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                throw new IllegalArgumentException(StubApp.getString2(34323));
            }
        }
        this.publicKey = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.publicKey);
    }
}
