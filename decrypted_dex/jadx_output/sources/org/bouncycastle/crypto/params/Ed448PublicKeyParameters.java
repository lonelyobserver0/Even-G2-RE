package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Ed448PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 57;
    private final byte[] data;

    public Ed448PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[57];
        this.data = bArr;
        if (57 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException(StubApp.getString2(29216));
        }
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException(StubApp.getString2(29215));
    }

    public void encode(byte[] bArr, int i3) {
        System.arraycopy(this.data, 0, bArr, i3, 57);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public Ed448PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed448PublicKeyParameters(byte[] bArr, int i3) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.data = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, 57);
    }
}
