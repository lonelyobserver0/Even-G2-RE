package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.HPSPolynomial;
import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class NTRUHPSParameterSet extends NTRUParameterSet {
    public NTRUHPSParameterSet(int i3, int i10, int i11, int i12, int i13) {
        super(i3, i10, i11, i12, i13);
    }

    @Override // org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet
    public Polynomial createPolynomial() {
        return new HPSPolynomial(this);
    }

    @Override // org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet
    public int sampleFgBytes() {
        return sampleFixedTypeBytes() + sampleIidBytes();
    }

    @Override // org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet
    public int sampleRmBytes() {
        return sampleFixedTypeBytes() + sampleIidBytes();
    }

    public int weight() {
        return (q() / 8) - 2;
    }
}
