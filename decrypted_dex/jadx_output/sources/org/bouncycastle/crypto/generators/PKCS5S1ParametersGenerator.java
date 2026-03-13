package org.bouncycastle.crypto.generators;

import Xa.h;
import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS5S1ParametersGenerator extends PBEParametersGenerator {
    private Digest digest;

    public PKCS5S1ParametersGenerator(Digest digest) {
        this.digest = digest;
    }

    private byte[] generateDerivedKey() {
        int digestSize = this.digest.getDigestSize();
        byte[] bArr = new byte[digestSize];
        Digest digest = this.digest;
        byte[] bArr2 = this.password;
        digest.update(bArr2, 0, bArr2.length);
        Digest digest2 = this.digest;
        byte[] bArr3 = this.salt;
        digest2.update(bArr3, 0, bArr3.length);
        this.digest.doFinal(bArr, 0);
        for (int i3 = 1; i3 < this.iterationCount; i3++) {
            this.digest.update(bArr, 0, digestSize);
            this.digest.doFinal(bArr, 0);
        }
        return bArr;
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedMacParameters(int i3) {
        return generateDerivedParameters(i3);
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i3) {
        int i10 = i3 / 8;
        if (i10 <= this.digest.getDigestSize()) {
            return new KeyParameter(generateDerivedKey(), 0, i10);
        }
        throw new IllegalArgumentException(h.g(i10, StubApp.getString2(28980), StubApp.getString2(28981)));
    }

    @Override // org.bouncycastle.crypto.PBEParametersGenerator
    public CipherParameters generateDerivedParameters(int i3, int i10) {
        int i11 = i3 / 8;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        if (i13 > this.digest.getDigestSize()) {
            throw new IllegalArgumentException(h.g(i13, StubApp.getString2(28980), StubApp.getString2(28981)));
        }
        byte[] generateDerivedKey = generateDerivedKey();
        return new ParametersWithIV(new KeyParameter(generateDerivedKey, 0, i11), generateDerivedKey, i11, i12);
    }
}
