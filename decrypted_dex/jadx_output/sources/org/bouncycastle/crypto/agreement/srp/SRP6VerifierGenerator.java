package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SRP6VerifierGenerator {

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f18773N;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f18774g;

    public BigInteger generateVerifier(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f18774g.modPow(SRP6Util.calculateX(this.digest, this.f18773N, bArr, bArr2, bArr3), this.f18773N);
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest) {
        this.f18773N = bigInteger;
        this.f18774g = bigInteger2;
        this.digest = digest;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest) {
        this.f18773N = sRP6GroupParameters.getN();
        this.f18774g = sRP6GroupParameters.getG();
        this.digest = digest;
    }
}
