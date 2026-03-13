package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class WOTSPlusPrivateKeyParameters {
    private final byte[][] privateKey;

    public WOTSPlusPrivateKeyParameters(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34322));
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            throw new NullPointerException(StubApp.getString2(34321));
        }
        int length = bArr.length;
        int len = wOTSPlusParameters.getLen();
        String string2 = StubApp.getString2(34320);
        if (length != len) {
            throw new IllegalArgumentException(string2);
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                throw new IllegalArgumentException(string2);
            }
        }
        this.privateKey = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.privateKey);
    }
}
