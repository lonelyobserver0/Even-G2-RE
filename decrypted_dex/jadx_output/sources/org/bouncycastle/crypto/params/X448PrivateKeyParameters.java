package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class X448PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 56;
    public static final int SECRET_SIZE = 56;
    private final byte[] data;

    public X448PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[56];
        this.data = bArr;
        if (56 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException(StubApp.getString2(29241));
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

    public X448PublicKeyParameters generatePublicKey() {
        byte[] bArr = new byte[56];
        X448.generatePublicKey(this.data, 0, bArr, 0);
        return new X448PublicKeyParameters(bArr, 0);
    }

    public void generateSecret(X448PublicKeyParameters x448PublicKeyParameters, byte[] bArr, int i3) {
        byte[] bArr2 = new byte[56];
        x448PublicKeyParameters.encode(bArr2, 0);
        if (!X448.calculateAgreement(this.data, 0, bArr2, 0, bArr, i3)) {
            throw new IllegalStateException(StubApp.getString2(29243));
        }
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public X448PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.data = bArr;
        X448.generatePrivateKey(secureRandom, bArr);
    }

    public X448PrivateKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public X448PrivateKeyParameters(byte[] bArr, int i3) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.data = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, 56);
    }
}
