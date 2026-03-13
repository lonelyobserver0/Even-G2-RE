package org.bouncycastle.crypto;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface KeyParser {
    AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException;
}
