package org.bouncycastle.jcajce.spec;

import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AEADParameterSpec extends IvParameterSpec {
    private final byte[] associatedData;
    private final int macSizeInBits;

    public AEADParameterSpec(byte[] bArr, int i3) {
        this(bArr, i3, null);
    }

    public byte[] getAssociatedData() {
        return Arrays.clone(this.associatedData);
    }

    public int getMacSizeInBits() {
        return this.macSizeInBits;
    }

    public byte[] getNonce() {
        return getIV();
    }

    public AEADParameterSpec(byte[] bArr, int i3, byte[] bArr2) {
        super(bArr);
        this.macSizeInBits = i3;
        this.associatedData = Arrays.clone(bArr2);
    }
}
