package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class KDFDoublePipelineIterationParameters implements DerivationParameters {
    private static final int UNUSED_R = 32;
    private final byte[] fixedInputData;
    private final byte[] ki;

    /* renamed from: r, reason: collision with root package name */
    private final int f19100r;
    private final boolean useCounter;

    private KDFDoublePipelineIterationParameters(byte[] bArr, byte[] bArr2, int i3, boolean z2) {
        if (bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(29219));
        }
        this.ki = Arrays.clone(bArr);
        if (bArr2 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr2);
        }
        if (i3 != 8 && i3 != 16 && i3 != 24 && i3 != 32) {
            throw new IllegalArgumentException(StubApp.getString2(29218));
        }
        this.f19100r = i3;
        this.useCounter = z2;
    }

    public static KDFDoublePipelineIterationParameters createWithCounter(byte[] bArr, byte[] bArr2, int i3) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, i3, true);
    }

    public static KDFDoublePipelineIterationParameters createWithoutCounter(byte[] bArr, byte[] bArr2) {
        return new KDFDoublePipelineIterationParameters(bArr, bArr2, 32, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getKI() {
        return this.ki;
    }

    public int getR() {
        return this.f19100r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
