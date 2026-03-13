package org.bouncycastle.operator;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface DigestCalculatorProvider {
    DigestCalculator get(AlgorithmIdentifier algorithmIdentifier) throws OperatorCreationException;
}
