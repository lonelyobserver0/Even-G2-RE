package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GSKKDFParameters implements DerivationParameters {
    private final byte[] nonce;
    private final int startCounter;

    /* renamed from: z, reason: collision with root package name */
    private final byte[] f18750z;

    public GSKKDFParameters(byte[] bArr, int i3) {
        this(bArr, i3, null);
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public int getStartCounter() {
        return this.startCounter;
    }

    public byte[] getZ() {
        return this.f18750z;
    }

    public GSKKDFParameters(byte[] bArr, int i3, byte[] bArr2) {
        this.f18750z = bArr;
        this.startCounter = i3;
        this.nonce = bArr2;
    }
}
