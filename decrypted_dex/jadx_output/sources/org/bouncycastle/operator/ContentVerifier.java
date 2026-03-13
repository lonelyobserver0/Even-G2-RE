package org.bouncycastle.operator;

import java.io.OutputStream;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ContentVerifier {
    AlgorithmIdentifier getAlgorithmIdentifier();

    OutputStream getOutputStream();

    boolean verify(byte[] bArr);
}
