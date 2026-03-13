package org.bouncycastle.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ScryptKeySpec implements KeySpec {
    private final int blockSize;
    private final int costParameter;
    private final int keySize;
    private final int parallelizationParameter;
    private final char[] password;
    private final byte[] salt;

    public ScryptKeySpec(char[] cArr, byte[] bArr, int i3, int i10, int i11, int i12) {
        this.password = cArr;
        this.salt = Arrays.clone(bArr);
        this.costParameter = i3;
        this.blockSize = i10;
        this.parallelizationParameter = i11;
        this.keySize = i12;
    }

    public int getBlockSize() {
        return this.blockSize;
    }

    public int getCostParameter() {
        return this.costParameter;
    }

    public int getKeyLength() {
        return this.keySize;
    }

    public int getParallelizationParameter() {
        return this.parallelizationParameter;
    }

    public char[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return Arrays.clone(this.salt);
    }
}
