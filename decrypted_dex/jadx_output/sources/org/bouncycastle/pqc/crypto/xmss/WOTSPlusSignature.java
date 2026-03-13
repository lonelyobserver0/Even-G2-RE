package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class WOTSPlusSignature {
    private byte[][] signature;

    public WOTSPlusSignature(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34307));
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            throw new NullPointerException(StubApp.getString2(34329));
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            throw new IllegalArgumentException(StubApp.getString2(34328));
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                throw new IllegalArgumentException(StubApp.getString2(34327));
            }
        }
        this.signature = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.signature);
    }
}
