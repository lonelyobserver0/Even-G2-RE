package org.bouncycastle.cms.jcajce;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface KeyMaterialGenerator {
    byte[] generateKDFMaterial(AlgorithmIdentifier algorithmIdentifier, int i3, byte[] bArr);
}
