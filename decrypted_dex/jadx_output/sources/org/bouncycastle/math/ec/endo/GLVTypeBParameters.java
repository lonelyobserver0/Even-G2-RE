package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GLVTypeBParameters {
    protected final BigInteger beta;
    protected final BigInteger lambda;
    protected final ScalarSplitParameters splitParams;

    public GLVTypeBParameters(BigInteger bigInteger, BigInteger bigInteger2, ScalarSplitParameters scalarSplitParameters) {
        this.beta = bigInteger;
        this.lambda = bigInteger2;
        this.splitParams = scalarSplitParameters;
    }

    public BigInteger getBeta() {
        return this.beta;
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public ScalarSplitParameters getSplitParams() {
        return this.splitParams;
    }
}
