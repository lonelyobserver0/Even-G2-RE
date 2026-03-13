package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class KDFCounterParameters implements DerivationParameters {
    private byte[] fixedInputDataCounterPrefix;
    private byte[] fixedInputDataCounterSuffix;
    private byte[] ki;

    /* renamed from: r, reason: collision with root package name */
    private int f19099r;

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, int i3) {
        this(bArr, null, bArr2, i3);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getFixedInputDataCounterPrefix() {
        return Arrays.clone(this.fixedInputDataCounterPrefix);
    }

    public byte[] getFixedInputDataCounterSuffix() {
        return Arrays.clone(this.fixedInputDataCounterSuffix);
    }

    public byte[] getKI() {
        return this.ki;
    }

    public int getR() {
        return this.f19099r;
    }

    public KDFCounterParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3) {
        if (bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(29219));
        }
        this.ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputDataCounterPrefix = new byte[0];
        } else {
            this.fixedInputDataCounterPrefix = Arrays.clone(bArr2);
        }
        if (bArr3 == null) {
            this.fixedInputDataCounterSuffix = new byte[0];
        } else {
            this.fixedInputDataCounterSuffix = Arrays.clone(bArr3);
        }
        if (i3 != 8 && i3 != 16 && i3 != 24 && i3 != 32) {
            throw new IllegalArgumentException(StubApp.getString2(29218));
        }
        this.f19099r = i3;
    }
}
