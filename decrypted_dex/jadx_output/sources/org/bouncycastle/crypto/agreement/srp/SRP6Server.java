package org.bouncycastle.crypto.agreement.srp;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.SRP6GroupParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SRP6Server {

    /* renamed from: A, reason: collision with root package name */
    protected BigInteger f18763A;

    /* renamed from: B, reason: collision with root package name */
    protected BigInteger f18764B;
    protected BigInteger Key;

    /* renamed from: M1, reason: collision with root package name */
    protected BigInteger f18765M1;

    /* renamed from: M2, reason: collision with root package name */
    protected BigInteger f18766M2;

    /* renamed from: N, reason: collision with root package name */
    protected BigInteger f18767N;

    /* renamed from: S, reason: collision with root package name */
    protected BigInteger f18768S;

    /* renamed from: b, reason: collision with root package name */
    protected BigInteger f18769b;
    protected Digest digest;

    /* renamed from: g, reason: collision with root package name */
    protected BigInteger f18770g;
    protected SecureRandom random;

    /* renamed from: u, reason: collision with root package name */
    protected BigInteger f18771u;

    /* renamed from: v, reason: collision with root package name */
    protected BigInteger f18772v;

    private BigInteger calculateS() {
        return this.f18772v.modPow(this.f18771u, this.f18767N).multiply(this.f18763A).mod(this.f18767N).modPow(this.f18769b, this.f18767N);
    }

    public BigInteger calculateSecret(BigInteger bigInteger) throws CryptoException {
        BigInteger validatePublicValue = SRP6Util.validatePublicValue(this.f18767N, bigInteger);
        this.f18763A = validatePublicValue;
        this.f18771u = SRP6Util.calculateU(this.digest, this.f18767N, validatePublicValue, this.f18764B);
        BigInteger calculateS = calculateS();
        this.f18768S = calculateS;
        return calculateS;
    }

    public BigInteger calculateServerEvidenceMessage() throws CryptoException {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger bigInteger3 = this.f18763A;
        if (bigInteger3 == null || (bigInteger = this.f18765M1) == null || (bigInteger2 = this.f18768S) == null) {
            throw new CryptoException(StubApp.getString2(28442));
        }
        BigInteger calculateM2 = SRP6Util.calculateM2(this.digest, this.f18767N, bigInteger3, bigInteger, bigInteger2);
        this.f18766M2 = calculateM2;
        return calculateM2;
    }

    public BigInteger calculateSessionKey() throws CryptoException {
        BigInteger bigInteger = this.f18768S;
        if (bigInteger == null || this.f18765M1 == null || this.f18766M2 == null) {
            throw new CryptoException(StubApp.getString2(28440));
        }
        BigInteger calculateKey = SRP6Util.calculateKey(this.digest, this.f18767N, bigInteger);
        this.Key = calculateKey;
        return calculateKey;
    }

    public BigInteger generateServerCredentials() {
        BigInteger calculateK = SRP6Util.calculateK(this.digest, this.f18767N, this.f18770g);
        this.f18769b = selectPrivateValue();
        BigInteger mod = calculateK.multiply(this.f18772v).mod(this.f18767N).add(this.f18770g.modPow(this.f18769b, this.f18767N)).mod(this.f18767N);
        this.f18764B = mod;
        return mod;
    }

    public void init(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest, SecureRandom secureRandom) {
        this.f18767N = bigInteger;
        this.f18770g = bigInteger2;
        this.f18772v = bigInteger3;
        this.random = secureRandom;
        this.digest = digest;
    }

    public BigInteger selectPrivateValue() {
        return SRP6Util.generatePrivateValue(this.digest, this.f18767N, this.f18770g, this.random);
    }

    public boolean verifyClientEvidenceMessage(BigInteger bigInteger) throws CryptoException {
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        BigInteger bigInteger4 = this.f18763A;
        if (bigInteger4 == null || (bigInteger2 = this.f18764B) == null || (bigInteger3 = this.f18768S) == null) {
            throw new CryptoException(StubApp.getString2(28443));
        }
        if (!SRP6Util.calculateM1(this.digest, this.f18767N, bigInteger4, bigInteger2, bigInteger3).equals(bigInteger)) {
            return false;
        }
        this.f18765M1 = bigInteger;
        return true;
    }

    public void init(SRP6GroupParameters sRP6GroupParameters, BigInteger bigInteger, Digest digest, SecureRandom secureRandom) {
        init(sRP6GroupParameters.getN(), sRP6GroupParameters.getG(), bigInteger, digest, secureRandom);
    }
}
