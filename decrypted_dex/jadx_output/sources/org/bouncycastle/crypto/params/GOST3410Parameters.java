package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410Parameters implements CipherParameters {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f19092a;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19093p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19094q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f19093p = bigInteger;
        this.f19094q = bigInteger2;
        this.f19092a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj;
        return gOST3410Parameters.getP().equals(this.f19093p) && gOST3410Parameters.getQ().equals(this.f19094q) && gOST3410Parameters.getA().equals(this.f19092a);
    }

    public BigInteger getA() {
        return this.f19092a;
    }

    public BigInteger getP() {
        return this.f19093p;
    }

    public BigInteger getQ() {
        return this.f19094q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f19093p.hashCode() ^ this.f19094q.hashCode()) ^ this.f19092a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f19092a = bigInteger3;
        this.f19093p = bigInteger;
        this.f19094q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
