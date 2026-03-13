package org.bouncycastle.cms;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface CMSSignatureEncryptionAlgorithmFinder {
    AlgorithmIdentifier findEncryptionAlgorithm(AlgorithmIdentifier algorithmIdentifier);
}
