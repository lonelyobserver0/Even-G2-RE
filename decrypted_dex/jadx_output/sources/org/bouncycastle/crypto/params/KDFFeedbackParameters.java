package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class KDFFeedbackParameters implements DerivationParameters {
    private static final int UNUSED_R = -1;
    private final byte[] fixedInputData;
    private final byte[] iv;
    private final byte[] ki;

    /* renamed from: r, reason: collision with root package name */
    private final int f19101r;
    private final boolean useCounter;

    private KDFFeedbackParameters(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3, boolean z2) {
        if (bArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(29219));
        }
        this.ki = Arrays.clone(bArr);
        if (bArr3 == null) {
            this.fixedInputData = new byte[0];
        } else {
            this.fixedInputData = Arrays.clone(bArr3);
        }
        this.f19101r = i3;
        if (bArr2 == null) {
            this.iv = new byte[0];
        } else {
            this.iv = Arrays.clone(bArr2);
        }
        this.useCounter = z2;
    }

    public static KDFFeedbackParameters createWithCounter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i3) {
        if (i3 == 8 || i3 == 16 || i3 == 24 || i3 == 32) {
            return new KDFFeedbackParameters(bArr, bArr2, bArr3, i3, true);
        }
        throw new IllegalArgumentException(StubApp.getString2(29218));
    }

    public static KDFFeedbackParameters createWithoutCounter(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return new KDFFeedbackParameters(bArr, bArr2, bArr3, -1, false);
    }

    public byte[] getFixedInputData() {
        return Arrays.clone(this.fixedInputData);
    }

    public byte[] getIV() {
        return this.iv;
    }

    public byte[] getKI() {
        return this.ki;
    }

    public int getR() {
        return this.f19101r;
    }

    public boolean useCounter() {
        return this.useCounter;
    }
}
