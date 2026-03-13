package org.bouncycastle.crypto.digests;

import com.stub.StubApp;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Memoable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class MD2Digest implements ExtendedDigest, Memoable {
    private static final int DIGEST_LENGTH = 16;

    /* renamed from: S, reason: collision with root package name */
    private static final byte[] f18811S = {41, 46, 67, -55, -94, -40, 124, 1, Base64.padSymbol, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, PSSSigner.TRAILER_IMPLICIT, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, Tnaf.POW_2_WIDTH, -119, 11, 34, 95, 33, ByteCompanionObject.MIN_VALUE, ByteCompanionObject.MAX_VALUE, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};

    /* renamed from: C, reason: collision with root package name */
    private byte[] f18812C;
    private int COff;

    /* renamed from: M, reason: collision with root package name */
    private byte[] f18813M;

    /* renamed from: X, reason: collision with root package name */
    private byte[] f18814X;
    private int mOff;
    private final CryptoServicePurpose purpose;
    private int xOff;

    public MD2Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private void copyIn(MD2Digest mD2Digest) {
        byte[] bArr = mD2Digest.f18814X;
        System.arraycopy(bArr, 0, this.f18814X, 0, bArr.length);
        this.xOff = mD2Digest.xOff;
        byte[] bArr2 = mD2Digest.f18813M;
        System.arraycopy(bArr2, 0, this.f18813M, 0, bArr2.length);
        this.mOff = mD2Digest.mOff;
        byte[] bArr3 = mD2Digest.f18812C;
        System.arraycopy(bArr3, 0, this.f18812C, 0, bArr3.length);
        this.COff = mD2Digest.COff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new MD2Digest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i3) {
        int length = this.f18813M.length;
        int i10 = this.mOff;
        byte b2 = (byte) (length - i10);
        while (true) {
            byte[] bArr2 = this.f18813M;
            if (i10 >= bArr2.length) {
                processCheckSum(bArr2);
                processBlock(this.f18813M);
                processBlock(this.f18812C);
                System.arraycopy(this.f18814X, this.xOff, bArr, i3, 16);
                reset();
                return 16;
            }
            bArr2[i10] = b2;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return StubApp.getString2(28179);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 16;
    }

    public void processBlock(byte[] bArr) {
        for (int i3 = 0; i3 < 16; i3++) {
            byte[] bArr2 = this.f18814X;
            bArr2[i3 + 16] = bArr[i3];
            bArr2[i3 + 32] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < 18; i11++) {
            for (int i12 = 0; i12 < 48; i12++) {
                byte[] bArr3 = this.f18814X;
                byte b2 = (byte) (f18811S[i10] ^ bArr3[i12]);
                bArr3[i12] = b2;
                i10 = b2 & UByte.MAX_VALUE;
            }
            i10 = (i10 + i11) % 256;
        }
    }

    public void processCheckSum(byte[] bArr) {
        byte b2 = this.f18812C[15];
        for (int i3 = 0; i3 < 16; i3++) {
            byte[] bArr2 = this.f18812C;
            b2 = (byte) (f18811S[(b2 ^ bArr[i3]) & 255] ^ bArr2[i3]);
            bArr2[i3] = b2;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.xOff = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f18814X;
            if (i3 == bArr.length) {
                break;
            }
            bArr[i3] = 0;
            i3++;
        }
        this.mOff = 0;
        int i10 = 0;
        while (true) {
            byte[] bArr2 = this.f18813M;
            if (i10 == bArr2.length) {
                break;
            }
            bArr2[i10] = 0;
            i10++;
        }
        this.COff = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr3 = this.f18812C;
            if (i11 == bArr3.length) {
                return;
            }
            bArr3[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b2) {
        byte[] bArr = this.f18813M;
        int i3 = this.mOff;
        int i10 = i3 + 1;
        this.mOff = i10;
        bArr[i3] = b2;
        if (i10 == 16) {
            processCheckSum(bArr);
            processBlock(this.f18813M);
            this.mOff = 0;
        }
    }

    public MD2Digest(CryptoServicePurpose cryptoServicePurpose) {
        this.f18814X = new byte[48];
        this.f18813M = new byte[16];
        this.f18812C = new byte[16];
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, cryptoServicePurpose));
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        copyIn((MD2Digest) memoable);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i3, int i10) {
        while (this.mOff != 0 && i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
        while (i10 >= 16) {
            System.arraycopy(bArr, i3, this.f18813M, 0, 16);
            processCheckSum(this.f18813M);
            processBlock(this.f18813M);
            i10 -= 16;
            i3 += 16;
        }
        while (i10 > 0) {
            update(bArr[i3]);
            i3++;
            i10--;
        }
    }

    public MD2Digest(MD2Digest mD2Digest) {
        this.f18814X = new byte[48];
        this.f18813M = new byte[16];
        this.f18812C = new byte[16];
        CryptoServicePurpose cryptoServicePurpose = mD2Digest.purpose;
        this.purpose = cryptoServicePurpose;
        CryptoServicesRegistrar.checkConstraints(Utils.getDefaultProperties(this, 64, cryptoServicePurpose));
        copyIn(mD2Digest);
    }
}
