package org.bouncycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.X25519PublicKeyParameters;
import org.bouncycastle.crypto.params.X448PublicKeyParameters;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XIESPublicKeyParser implements KeyParser {
    private final boolean isX25519;

    public XIESPublicKeyParser(boolean z2) {
        this.isX25519 = z2;
    }

    @Override // org.bouncycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        int i3 = this.isX25519 ? 32 : 56;
        byte[] bArr = new byte[i3];
        Streams.readFully(inputStream, bArr, 0, i3);
        return this.isX25519 ? new X25519PublicKeyParameters(bArr, 0) : new X448PublicKeyParameters(bArr, 0);
    }
}
