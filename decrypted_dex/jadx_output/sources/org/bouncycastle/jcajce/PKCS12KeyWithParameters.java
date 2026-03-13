package org.bouncycastle.jcajce;

import javax.crypto.interfaces.PBEKey;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS12KeyWithParameters extends PKCS12Key implements PBEKey {
    private final int iterationCount;
    private final byte[] salt;

    public PKCS12KeyWithParameters(char[] cArr, boolean z2, byte[] bArr, int i3) {
        super(cArr, z2);
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i3;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }

    public PKCS12KeyWithParameters(char[] cArr, byte[] bArr, int i3) {
        super(cArr);
        this.salt = Arrays.clone(bArr);
        this.iterationCount = i3;
    }
}
