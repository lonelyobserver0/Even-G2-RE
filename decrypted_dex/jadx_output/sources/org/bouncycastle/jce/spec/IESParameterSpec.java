package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESParameterSpec implements AlgorithmParameterSpec {
    private int cipherKeySize;
    private byte[] derivation;
    private byte[] encoding;
    private int macKeySize;
    private byte[] nonce;
    private boolean usePointCompression;

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i3) {
        this(bArr, bArr2, i3, -1, null, false);
    }

    public int getCipherKeySize() {
        return this.cipherKeySize;
    }

    public byte[] getDerivationV() {
        return Arrays.clone(this.derivation);
    }

    public byte[] getEncodingV() {
        return Arrays.clone(this.encoding);
    }

    public int getMacKeySize() {
        return this.macKeySize;
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public boolean getPointCompression() {
        return this.usePointCompression;
    }

    public void setPointCompression(boolean z2) {
        this.usePointCompression = z2;
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i3, int i10, byte[] bArr3) {
        this(bArr, bArr2, i3, i10, bArr3, false);
    }

    public IESParameterSpec(byte[] bArr, byte[] bArr2, int i3, int i10, byte[] bArr3, boolean z2) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.derivation = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.derivation = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.encoding = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.encoding = null;
        }
        this.macKeySize = i3;
        this.cipherKeySize = i10;
        this.nonce = Arrays.clone(bArr3);
        this.usePointCompression = z2;
    }
}
