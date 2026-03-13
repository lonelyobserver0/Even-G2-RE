package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GLVTypeAParameters {

    /* renamed from: i, reason: collision with root package name */
    protected final BigInteger f19274i;
    protected final BigInteger lambda;
    protected final ScalarSplitParameters splitParams;

    public GLVTypeAParameters(BigInteger bigInteger, BigInteger bigInteger2, ScalarSplitParameters scalarSplitParameters) {
        this.f19274i = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = scalarSplitParameters;
    }

    public BigInteger getI() {
        return this.f19274i;
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public ScalarSplitParameters getSplitParams() {
        return this.splitParams;
    }
}
