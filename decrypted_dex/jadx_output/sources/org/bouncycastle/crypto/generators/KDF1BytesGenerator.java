package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KDF1BytesGenerator extends BaseKDFBytesGenerator {
    public KDF1BytesGenerator(Digest digest) {
        super(0, digest);
    }
}
