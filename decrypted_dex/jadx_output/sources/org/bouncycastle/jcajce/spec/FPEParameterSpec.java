package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FPEParameterSpec implements AlgorithmParameterSpec {
    private final RadixConverter radixConverter;
    private final byte[] tweak;
    private final boolean useInverse;

    public FPEParameterSpec(int i3, byte[] bArr) {
        this(i3, bArr, false);
    }

    public int getRadix() {
        return this.radixConverter.getRadix();
    }

    public int getRadixConverter() {
        return this.radixConverter.getRadix();
    }

    public byte[] getTweak() {
        return Arrays.clone(this.tweak);
    }

    public boolean isUsingInverseFunction() {
        return this.useInverse;
    }

    public FPEParameterSpec(int i3, byte[] bArr, boolean z2) {
        this(new RadixConverter(i3), bArr, z2);
    }

    public FPEParameterSpec(RadixConverter radixConverter, byte[] bArr, boolean z2) {
        this.radixConverter = radixConverter;
        this.tweak = Arrays.clone(bArr);
        this.useInverse = z2;
    }
}
