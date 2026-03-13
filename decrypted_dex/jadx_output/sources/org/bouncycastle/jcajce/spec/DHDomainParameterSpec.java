package org.bouncycastle.jcajce.spec;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHDomainParameterSpec extends DHParameterSpec {
    private final BigInteger j;

    /* renamed from: m, reason: collision with root package name */
    private final int f19143m;

    /* renamed from: q, reason: collision with root package name */
    private final BigInteger f19144q;
    private DHValidationParameters validationParameters;

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, null, 0);
    }

    public DHParameters getDomainParameters() {
        return new DHParameters(getP(), getG(), this.f19144q, this.f19143m, getL(), this.j, this.validationParameters);
    }

    public BigInteger getJ() {
        return this.j;
    }

    public int getM() {
        return this.f19143m;
    }

    public BigInteger getQ() {
        return this.f19144q;
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i3) {
        this(bigInteger, bigInteger2, bigInteger3, null, i3);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i3) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i3);
    }

    public DHDomainParameterSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i3, int i10) {
        super(bigInteger, bigInteger3, i10);
        this.f19144q = bigInteger2;
        this.j = bigInteger4;
        this.f19143m = i3;
    }

    public DHDomainParameterSpec(DHParameters dHParameters) {
        this(dHParameters.getP(), dHParameters.getQ(), dHParameters.getG(), dHParameters.getJ(), dHParameters.getM(), dHParameters.getL());
        this.validationParameters = dHParameters.getValidationParameters();
    }
}
