package org.bouncycastle.pqc.legacy.crypto.gmss;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSPublicKeyParameters extends GMSSKeyParameters {
    private byte[] gmssPublicKey;

    public GMSSPublicKeyParameters(byte[] bArr, GMSSParameters gMSSParameters) {
        super(false, gMSSParameters);
        this.gmssPublicKey = bArr;
    }

    public byte[] getPublicKey() {
        return this.gmssPublicKey;
    }
}
