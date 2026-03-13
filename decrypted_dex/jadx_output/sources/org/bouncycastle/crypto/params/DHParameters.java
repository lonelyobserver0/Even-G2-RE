package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* renamed from: g, reason: collision with root package name */
    private BigInteger f19068g;
    private BigInteger j;

    /* renamed from: l, reason: collision with root package name */
    private int f19069l;

    /* renamed from: m, reason: collision with root package name */
    private int f19070m;

    /* renamed from: p, reason: collision with root package name */
    private BigInteger f19071p;

    /* renamed from: q, reason: collision with root package name */
    private BigInteger f19072q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    private static int getDefaultMParam(int i3) {
        return (i3 != 0 && i3 < DEFAULT_MINIMUM_LENGTH) ? i3 : DEFAULT_MINIMUM_LENGTH;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHParameters)) {
            return false;
        }
        DHParameters dHParameters = (DHParameters) obj;
        if (getQ() != null) {
            if (!getQ().equals(dHParameters.getQ())) {
                return false;
            }
        } else if (dHParameters.getQ() != null) {
            return false;
        }
        return dHParameters.getP().equals(this.f19071p) && dHParameters.getG().equals(this.f19068g);
    }

    public BigInteger getG() {
        return this.f19068g;
    }

    public BigInteger getJ() {
        return this.j;
    }

    public int getL() {
        return this.f19069l;
    }

    public int getM() {
        return this.f19070m;
    }

    public BigInteger getP() {
        return this.f19071p;
    }

    public BigInteger getQ() {
        return this.f19072q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i3) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i3), i3, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i3, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, i3, i10, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i3, int i10, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i10 != 0) {
            if (i10 > bigInteger.bitLength()) {
                throw new IllegalArgumentException(StubApp.getString2(29191));
            }
            if (i10 < i3) {
                throw new IllegalArgumentException(StubApp.getString2(29190));
            }
        }
        if (i3 > bigInteger.bitLength() && !Properties.isOverrideSet(StubApp.getString2(29192))) {
            throw new IllegalArgumentException(StubApp.getString2(29193));
        }
        this.f19068g = bigInteger2;
        this.f19071p = bigInteger;
        this.f19072q = bigInteger3;
        this.f19070m = i3;
        this.f19069l = i10;
        this.j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, DEFAULT_MINIMUM_LENGTH, 0, bigInteger4, dHValidationParameters);
    }
}
