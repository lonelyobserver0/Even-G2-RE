package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IESKEMParameterSpec implements AlgorithmParameterSpec {
    private final byte[] recipientInfo;
    private final boolean usePointCompression;

    public IESKEMParameterSpec(byte[] bArr) {
        this(bArr, false);
    }

    public byte[] getRecipientInfo() {
        return Arrays.clone(this.recipientInfo);
    }

    public boolean hasUsePointCompression() {
        return this.usePointCompression;
    }

    public IESKEMParameterSpec(byte[] bArr, boolean z2) {
        this.recipientInfo = Arrays.clone(bArr);
        this.usePointCompression = z2;
    }
}
