package org.bouncycastle.crypto.params;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Ed25519PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private Ed25519PublicKeyParameters cachedPublicKey;
    private final byte[] data;

    public Ed25519PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        if (32 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException(StubApp.getString2(29209));
        }
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException(StubApp.getString2(29210));
    }

    public void encode(byte[] bArr, int i3) {
        System.arraycopy(this.data, 0, bArr, i3, 32);
    }

    public Ed25519PublicKeyParameters generatePublicKey() {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        synchronized (this.data) {
            try {
                if (this.cachedPublicKey == null) {
                    byte[] bArr = new byte[32];
                    Ed25519.generatePublicKey(this.data, 0, bArr, 0);
                    this.cachedPublicKey = new Ed25519PublicKeyParameters(bArr, 0);
                }
                ed25519PublicKeyParameters = this.cachedPublicKey;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ed25519PublicKeyParameters;
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public void sign(int i3, Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, int i12) {
        sign(i3, bArr, bArr2, i10, i11, bArr3, i12);
    }

    public Ed25519PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        Ed25519.generatePrivateKey(secureRandom, bArr);
    }

    public void sign(int i3, byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, int i12) {
        byte[] bArr4 = new byte[32];
        generatePublicKey().encode(bArr4, 0);
        if (i3 == 0) {
            if (bArr != null) {
                throw new IllegalArgumentException(StubApp.getString2(3493));
            }
            Ed25519.sign(this.data, 0, bArr4, 0, bArr2, i10, i11, bArr3, i12);
        } else if (i3 == 1) {
            Ed25519.sign(this.data, 0, bArr4, 0, bArr, bArr2, i10, i11, bArr3, i12);
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException(StubApp.getString2(29212));
            }
            if (64 != i11) {
                throw new IllegalArgumentException(StubApp.getString2(29211));
            }
            Ed25519.signPrehash(this.data, 0, bArr4, 0, bArr, bArr2, i10, bArr3, i12);
        }
    }

    public Ed25519PrivateKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed25519PrivateKeyParameters(byte[] bArr, int i3) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, 32);
    }
}
