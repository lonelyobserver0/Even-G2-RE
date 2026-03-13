package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class X448PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;
    private final byte[] data;

    public X448PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[56];
        this.data = bArr;
        if (56 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException(StubApp.getString2(29244));
        }
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException(StubApp.getString2(29242));
    }

    public void encode(byte[] bArr, int i3) {
        System.arraycopy(this.data, 0, bArr, i3, 56);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public X448PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public X448PublicKeyParameters(byte[] bArr, int i3) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.data = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, 56);
    }
}
