package org.bouncycastle.crypto.prng;

import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class FixedSecureRandom extends SecureRandom {
    private byte[] _data;
    private int _index;
    private int _intPad;

    public FixedSecureRandom(boolean z2, byte[] bArr) {
        this(z2, new byte[][]{bArr});
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i3 = this._index;
        this._index = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i3) {
        byte[] bArr = new byte[i3];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        int nextValue = (nextValue() << 24) | (nextValue() << 16);
        int i3 = this._intPad;
        if (i3 == 2) {
            this._intPad = i3 - 1;
        } else {
            nextValue |= nextValue() << 8;
        }
        int i10 = this._intPad;
        if (i10 != 1) {
            return nextValue | nextValue();
        }
        this._intPad = i10 - 1;
        return nextValue;
    }

    @Override // java.util.Random
    public long nextLong() {
        return (nextValue() << 56) | (nextValue() << 48) | (nextValue() << 40) | (nextValue() << 32) | (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    public FixedSecureRandom(boolean z2, byte[][] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i3 = 0; i3 != bArr.length; i3++) {
            try {
                byteArrayOutputStream.write(bArr[i3]);
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(29248));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        if (z2) {
            this._intPad = byteArray.length % 4;
        }
    }

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }
}
