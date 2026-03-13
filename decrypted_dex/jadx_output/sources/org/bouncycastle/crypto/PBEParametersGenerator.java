package org.bouncycastle.crypto;

import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class PBEParametersGenerator {
    protected int iterationCount;
    protected byte[] password;
    protected byte[] salt;

    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(cArr.length + 1) * 2];
        for (int i3 = 0; i3 != cArr.length; i3++) {
            int i10 = i3 * 2;
            char c10 = cArr[i3];
            bArr[i10] = (byte) (c10 >>> '\b');
            bArr[i10 + 1] = (byte) c10;
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 != length; i3++) {
            bArr[i3] = (byte) cArr[i3];
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char[] cArr) {
        return cArr != null ? Strings.toUTF8ByteArray(cArr) : new byte[0];
    }

    public abstract CipherParameters generateDerivedMacParameters(int i3);

    public abstract CipherParameters generateDerivedParameters(int i3);

    public abstract CipherParameters generateDerivedParameters(int i3, int i10);

    public int getIterationCount() {
        return this.iterationCount;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public void init(byte[] bArr, byte[] bArr2, int i3) {
        this.password = bArr;
        this.salt = bArr2;
        this.iterationCount = i3;
    }
}
