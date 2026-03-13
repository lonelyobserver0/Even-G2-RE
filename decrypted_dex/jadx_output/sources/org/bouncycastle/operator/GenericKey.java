package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GenericKey {
    private AlgorithmIdentifier algorithmIdentifier;
    private Object representation;

    public GenericKey(Object obj) {
        this.algorithmIdentifier = null;
        this.representation = obj;
    }

    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return this.algorithmIdentifier;
    }

    public Object getRepresentation() {
        return this.representation;
    }

    public GenericKey(AlgorithmIdentifier algorithmIdentifier, Object obj) {
        this.algorithmIdentifier = algorithmIdentifier;
        this.representation = obj;
    }

    public GenericKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.algorithmIdentifier = algorithmIdentifier;
        this.representation = bArr;
    }
}
