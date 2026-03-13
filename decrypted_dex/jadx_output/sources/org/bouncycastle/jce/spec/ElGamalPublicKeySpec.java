package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamalPublicKeySpec extends ElGamalKeySpec {

    /* renamed from: y, reason: collision with root package name */
    private BigInteger f19167y;

    public ElGamalPublicKeySpec(BigInteger bigInteger, ElGamalParameterSpec elGamalParameterSpec) {
        super(elGamalParameterSpec);
        this.f19167y = bigInteger;
    }

    public BigInteger getY() {
        return this.f19167y;
    }
}
