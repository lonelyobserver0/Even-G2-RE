package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class FPEParameters implements CipherParameters {
    private final KeyParameter key;
    private final RadixConverter radixConverter;
    private final byte[] tweak;
    private final boolean useInverse;

    public FPEParameters(KeyParameter keyParameter, int i3, byte[] bArr) {
        this(keyParameter, i3, bArr, false);
    }

    public KeyParameter getKey() {
        return this.key;
    }

    public int getRadix() {
        return this.radixConverter.getRadix();
    }

    public RadixConverter getRadixConverter() {
        return this.radixConverter;
    }

    public byte[] getTweak() {
        return Arrays.clone(this.tweak);
    }

    public boolean isUsingInverseFunction() {
        return this.useInverse;
    }

    public FPEParameters(KeyParameter keyParameter, int i3, byte[] bArr, boolean z2) {
        this(keyParameter, new RadixConverter(i3), bArr, z2);
    }

    public FPEParameters(KeyParameter keyParameter, RadixConverter radixConverter, byte[] bArr, boolean z2) {
        this.key = keyParameter;
        this.radixConverter = radixConverter;
        this.tweak = Arrays.clone(bArr);
        this.useInverse = z2;
    }
}
