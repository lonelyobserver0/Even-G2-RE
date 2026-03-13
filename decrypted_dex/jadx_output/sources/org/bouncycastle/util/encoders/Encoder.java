package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface Encoder {
    int decode(String str, OutputStream outputStream) throws IOException;

    int decode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException;

    int encode(byte[] bArr, int i3, int i10, OutputStream outputStream) throws IOException;

    int getEncodedLength(int i3);

    int getMaxDecodedLength(int i3);
}
