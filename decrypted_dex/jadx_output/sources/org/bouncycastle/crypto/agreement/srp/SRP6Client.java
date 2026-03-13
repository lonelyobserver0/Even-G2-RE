package org.bouncycastle.crypto.agreement.srp;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SRP6Client {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f18753A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f18754B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f18755M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f18756M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f18757N;

    /* renamed from: S, reason: collision with root package name */
    protected BigInteger f18758S;

    /* renamed from: a, reason: collision with root package name */
    protected BigInteger f18759a;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f18760g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f18761u;

    /* renamed from: x, reason: collision with root package name */
    protected BigInteger f18762x;

    private BigInteger calculateS() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f18757N, this.f18760g);
        return this.f18754B.subtract(this.f18760g.modPow(this.f18762x, this.f18757N).multiply(calculateK).mod(this.f18757N)).mod(this.f18757N).modPow(this.f18761u.multiply(this.f18762x).add(this.f18759a), this.f18757N);
    }

    public BigInteger calculateClientEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f18753A;
        if (bigInteger3 == null || (bigInteger = this.f18754B) == null || (bigInteger2 = this.f18758S) == null) {
            throw new CryptoException(StubApp.getString2(28439));
        }
        BigInteger calculateM1 = SRP6Util.calculateM1(this.digest, this.f18757N, bigInteger3, bigInteger, bigInteger2);
        this.f18755M1 = calculateM1;
        return calculateM1;
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f18757N, bigInteger);
        this.f18754B = validatePublicValue;
        this.f18761u = SRP6Util.calculateU(this.digest, this.f18757N, this.f18753A, validatePublicValue);
        BigInteger calculateS = calculateS();
        this.f18758S = calculateS;
        return calculateS;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f18758S;
        if (bigInteger == null || this.f18755M1 == null || this.f18756M2 == null) {
            throw new CryptoException(StubApp.getString2(28440));
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f18757N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateClientCredentials(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f18762x = SRP6Util.calculateX(this.digest, this.f18757N, bArr, bArr2, bArr3);
        BigInteger selectPrivateValue = selectPrivateValue();
        this.f18759a = selectPrivateValue;
        BigInteger modPow = this.f18760g.modPow(selectPrivateValue, this.f18757N);
        this.f18753A = modPow;
        return modPow;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, Digest digest, SecureRandom secureRandom) {
        this.f18757N = bigInteger;
        this.f18760g = bigInteger2;
        this.digest = digest;
        this.random = secureRandom;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f18757N, this.f18760g, this.random);
    }

    public boolean verifyServerEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f18753A;
        if (bigInteger4 == null || (bigInteger2 = this.f18755M1) == null || (bigInteger3 = this.f18758S) == null) {
            throw new CryptoException(StubApp.getString2(28441));
        }
        if (!SRP6Util.calculateM2(this.digest, this.f18757N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f18756M2 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), digest, secureRandom);
    }
}
