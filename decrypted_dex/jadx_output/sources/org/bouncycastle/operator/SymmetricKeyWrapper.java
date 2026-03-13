package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class SymmetricKeyWrapper implements KeyWrapper {
    private AlgorithmIdentifier algorithmId;

    public SymmetricKeyWrapper(AlgorithmIdentifier algorithmIdentifier) {
        this.algorithmId = algorithmIdentifier;
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmId;
    }
}
