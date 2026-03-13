package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECPrivateKeySpec extends ECKeySpec {

    /* renamed from: d, reason: collision with root package name */
    private BigInteger f19162d;

    public ECPrivateKeySpec(BigInteger bigInteger, ECParameterSpec eCParameterSpec) {
        super(eCParameterSpec);
        this.f19162d = bigInteger;
    }

    public BigInteger getD() {
        return this.f19162d;
    }
}
