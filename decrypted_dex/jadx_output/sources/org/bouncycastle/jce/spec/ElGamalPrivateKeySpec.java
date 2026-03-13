package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalPrivateKeySpec extends ElGamalKeySpec {

    /* renamed from: x, reason: collision with root package name */
    private BigInteger f19166x;

    public ElGamalPrivateKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f19166x = bigInteger;
    }

    public BigInteger getX() {
        return this.f19166x;
    }
}
