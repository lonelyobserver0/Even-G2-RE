package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KDF2BytesGenerator extends BaseKDFBytesGenerator {
    public KDF2BytesGenerator(Digest digest) {
        super(1, digest);
    }
}
