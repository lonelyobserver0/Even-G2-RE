package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f19077g;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19078p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19079q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f19077g = bigInteger3;
        this.f19078p = bigInteger;
        this.f19079q = bigInteger2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj;
        return dSAParameters.getP().equals(this.f19078p) && dSAParameters.getQ().equals(this.f19079q) && dSAParameters.getG().equals(this.f19077g);
    }

    public BigInteger getG() {
        return this.f19077g;
    }

    public BigInteger getP() {
        return this.f19078p;
    }

    public BigInteger getQ() {
        return this.f19079q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f19077g = bigInteger3;
        this.f19078p = bigInteger;
        this.f19079q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
