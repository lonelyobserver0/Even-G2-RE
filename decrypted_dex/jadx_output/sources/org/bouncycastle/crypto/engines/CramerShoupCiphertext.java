package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CramerShoupCiphertext {

    /* renamed from: e, reason: collision with root package name */
    BigInteger f18930e;

    /* renamed from: u1, reason: collision with root package name */
    BigInteger f18931u1;
    BigInteger u2;

    /* renamed from: v, reason: collision with root package name */
    BigInteger f18932v;

    public CramerShoupCiphertext() {
    }

    public BigInteger getE() {
        return this.f18930e;
    }

    public BigInteger getU1() {
        return this.f18931u1;
    }

    public BigInteger getU2() {
        return this.u2;
    }

    public BigInteger getV() {
        return this.f18932v;
    }

    public void setE(BigInteger bigInteger) {
        this.f18930e = bigInteger;
    }

    public void setU1(BigInteger bigInteger) {
        this.f18931u1 = bigInteger;
    }

    public void setU2(BigInteger bigInteger) {
        this.u2 = bigInteger;
    }

    public void setV(BigInteger bigInteger) {
        this.f18932v = bigInteger;
    }

    public byte[] toByteArray() {
        byte[] byteArray = this.f18931u1.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.u2.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.f18930e.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.f18932v.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[length + length2 + length3 + length4 + 16];
        Pack.intToBigEndian(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        Pack.intToBigEndian(length2, bArr, 4 + length);
        int i3 = length + 8;
        System.arraycopy(byteArray2, 0, bArr, i3, length2);
        int i10 = i3 + length2;
        Pack.intToBigEndian(length3, bArr, i10);
        int i11 = i10 + 4;
        System.arraycopy(byteArray3, 0, bArr, i11, length3);
        int i12 = i11 + length3;
        Pack.intToBigEndian(length4, bArr, i12);
        System.arraycopy(byteArray4, 0, bArr, i12 + 4, length4);
        return bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(StubApp.getString2(28580) + this.f18931u1.toString());
        stringBuffer.append(StubApp.getString2(28581) + this.u2.toString());
        stringBuffer.append(StubApp.getString2(28582) + this.f18930e.toString());
        stringBuffer.append(StubApp.getString2(28583) + this.f18932v.toString());
        return stringBuffer.toString();
    }

    public CramerShoupCiphertext(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f18931u1 = bigInteger;
        this.u2 = bigInteger2;
        this.f18930e = bigInteger3;
        this.f18932v = bigInteger4;
    }

    public CramerShoupCiphertext(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 0);
        int i3 = 4 + bigEndianToInt;
        this.f18931u1 = new BigInteger(Arrays.copyOfRange(bArr, 4, i3));
        int i10 = bigEndianToInt + 8;
        int bigEndianToInt2 = Pack.bigEndianToInt(bArr, i3) + i10;
        this.u2 = new BigInteger(Arrays.copyOfRange(bArr, i10, bigEndianToInt2));
        int bigEndianToInt3 = Pack.bigEndianToInt(bArr, bigEndianToInt2);
        int i11 = bigEndianToInt2 + 4;
        int i12 = bigEndianToInt3 + i11;
        this.f18930e = new BigInteger(Arrays.copyOfRange(bArr, i11, i12));
        int bigEndianToInt4 = Pack.bigEndianToInt(bArr, i12);
        int i13 = i12 + 4;
        this.f18932v = new BigInteger(Arrays.copyOfRange(bArr, i13, bigEndianToInt4 + i13));
    }
}
