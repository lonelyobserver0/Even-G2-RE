package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OpenSSLPBEParametersGenerator extends PBEParametersGenerator {
    private final Digest digest;

    public OpenSSLPBEParametersGenerator() {
        this(DigestFactory.createMD5());
    }

    private byte[] generateDerivedKey(int i3) {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = new byte[i3];
        int i10 = 0;
        while (true) {
            Digest digest = this.digest;
            byte[] bArr3 = this.password;
            digest.update(bArr3, 0, bArr3.length);
            Digest digest2 = this.digest;
            byte[] bArr4 = this.salt;
            digest2.update(bArr4, 0, bArr4.length);
            this.digest.doFinal(bArr, 0);
            int i11 = i3 > digestSize ? digestSize : i3;
            System.arraycopy(bArr, 0, bArr2, i10, i11);
            i10 += i11;
            i3 -= i11;
            if (i3 == 0) {
                return bArr2;
            }
            this.digest.reset();
            this.digest.update(bArr, 0, digestSize);
        }
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i3) {
        return generateDerivedParameters(i3);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i3) {
        int i10 = i3 / 8;
        return new KeyParameter(generateDerivedKey(i10), 0, i10);
    }

    public void init(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    public OpenSSLPBEParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i3, int i10) {
        int i11 = i3 / 8;
        int i12 = i10 / 8;
        byte[] generateDerivedKey = generateDerivedKey(i11 + i12);
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i11), generateDerivedKey, i11, i12);
    }
}
