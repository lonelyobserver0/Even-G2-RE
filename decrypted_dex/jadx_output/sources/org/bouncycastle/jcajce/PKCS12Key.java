package org.bouncycastle.jcajce;

import com.stub.StubApp;
import org.bouncycastle.crypto.PBEParametersGenerator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS12Key implements PBKDFKey {
    private final char[] password;
    private final boolean useWrongZeroLengthConversion;

    public PKCS12Key(char[] cArr) {
        this(cArr, false);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return StubApp.getString2(28343);
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return (this.useWrongZeroLengthConversion && this.password.length == 0) ? new byte[2] : PBEParametersGenerator.PKCS12PasswordToBytes(this.password);
    }

    @Override // java.security.Key
    public String getFormat() {
        return StubApp.getString2(28343);
    }

    public char[] getPassword() {
        return this.password;
    }

    public PKCS12Key(char[] cArr, boolean z2) {
        cArr = cArr == null ? new char[0] : cArr;
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        this.useWrongZeroLengthConversion = z2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }
}
