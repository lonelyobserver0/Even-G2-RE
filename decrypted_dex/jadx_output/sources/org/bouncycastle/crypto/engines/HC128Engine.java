package org.bouncycastle.crypto.engines;

import com.stub.StubApp;
import io.flutter.plugin.platform.PlatformPlugin;
import kotlin.UByte;
import org.bouncycastle.asn1.a;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HC128Engine implements StreamCipher {
    private boolean initialised;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f18944p = new int[512];

    /* renamed from: q, reason: collision with root package name */
    private int[] f18945q = new int[512];
    private int cnt = 0;
    private byte[] buf = new byte[4];
    private int idx = 0;

    private static int dim(int i3, int i10) {
        return mod512(i3 - i10);
    }

    private static int f1(int i3) {
        return (i3 >>> 3) ^ (rotateRight(i3, 7) ^ rotateRight(i3, 18));
    }

    private static int f2(int i3) {
        return (i3 >>> 10) ^ (rotateRight(i3, 17) ^ rotateRight(i3, 19));
    }

    private int g1(int i3, int i10, int i11) {
        return (rotateRight(i3, 10) ^ rotateRight(i11, 23)) + rotateRight(i10, 8);
    }

    private int g2(int i3, int i10, int i11) {
        return (rotateLeft(i3, 10) ^ rotateLeft(i11, 23)) + rotateLeft(i10, 8);
    }

    private byte getByte() {
        if (this.idx == 0) {
            int step = step();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (step & 255);
            bArr[1] = (byte) ((step >> 8) & 255);
            bArr[2] = (byte) ((step >> 16) & 255);
            bArr[3] = (byte) ((step >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i3 = this.idx;
        byte b2 = bArr2[i3];
        this.idx = 3 & (i3 + 1);
        return b2;
    }

    private int h1(int i3) {
        int[] iArr = this.f18945q;
        return iArr[i3 & 255] + iArr[((i3 >> 16) & 255) + 256];
    }

    private int h2(int i3) {
        int[] iArr = this.f18944p;
        return iArr[i3 & 255] + iArr[((i3 >> 16) & 255) + 256];
    }

    private void init() {
        if (this.key.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(28660));
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[PlatformPlugin.DEFAULT_SYSTEM_UI];
        for (int i3 = 0; i3 < 16; i3++) {
            int i10 = i3 >> 2;
            iArr[i10] = ((this.key[i3] & UByte.MAX_VALUE) << ((i3 & 3) * 8)) | iArr[i10];
        }
        System.arraycopy(iArr, 0, iArr, 4, 4);
        int i11 = 0;
        while (true) {
            byte[] bArr = this.iv;
            if (i11 >= bArr.length || i11 >= 16) {
                break;
            }
            int i12 = (i11 >> 2) + 8;
            iArr[i12] = ((bArr[i11] & UByte.MAX_VALUE) << ((i11 & 3) * 8)) | iArr[i12];
            i11++;
        }
        System.arraycopy(iArr, 8, iArr, 12, 4);
        for (int i13 = 16; i13 < 1280; i13++) {
            iArr[i13] = f2(iArr[i13 - 2]) + iArr[i13 - 7] + f1(iArr[i13 - 15]) + iArr[i13 - 16] + i13;
        }
        System.arraycopy(iArr, 256, this.f18944p, 0, 512);
        System.arraycopy(iArr, 768, this.f18945q, 0, 512);
        for (int i14 = 0; i14 < 512; i14++) {
            this.f18944p[i14] = step();
        }
        for (int i15 = 0; i15 < 512; i15++) {
            this.f18945q[i15] = step();
        }
        this.cnt = 0;
    }

    private static int mod1024(int i3) {
        return i3 & 1023;
    }

    private static int mod512(int i3) {
        return i3 & 511;
    }

    private static int rotateLeft(int i3, int i10) {
        return (i3 >>> (-i10)) | (i3 << i10);
    }

    private static int rotateRight(int i3, int i10) {
        return (i3 << (-i10)) | (i3 >>> i10);
    }

    private int step() {
        int h2;
        int i3;
        int mod512 = mod512(this.cnt);
        if (this.cnt < 512) {
            int[] iArr = this.f18944p;
            iArr[mod512] = iArr[mod512] + g1(iArr[dim(mod512, 3)], this.f18944p[dim(mod512, 10)], this.f18944p[dim(mod512, 511)]);
            h2 = h1(this.f18944p[dim(mod512, 12)]);
            i3 = this.f18944p[mod512];
        } else {
            int[] iArr2 = this.f18945q;
            iArr2[mod512] = iArr2[mod512] + g2(iArr2[dim(mod512, 3)], this.f18945q[dim(mod512, 10)], this.f18945q[dim(mod512, 511)]);
            h2 = h2(this.f18945q[dim(mod512, 12)]);
            i3 = this.f18945q[mod512];
        }
        int i10 = i3 ^ h2;
        this.cnt = mod1024(this.cnt + 1);
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return StubApp.getString2(28661);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + StubApp.getString2(28567));
        }
        if (i3 + i10 > bArr.length) {
            throw new DataLengthException(StubApp.getString2(28553));
        }
        if (i11 + i10 > bArr2.length) {
            throw new OutputLengthException(StubApp.getString2(28306));
        }
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i11 + i12] = (byte) (bArr[i3 + i12] ^ getByte());
        }
        return i10;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b2) {
        return (byte) (b2 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z2, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters cipherParameters2;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.iv = parametersWithIV.getIV();
            cipherParameters2 = parametersWithIV.getParameters();
        } else {
            this.iv = new byte[0];
            cipherParameters2 = cipherParameters;
        }
        if (!(cipherParameters2 instanceof KeyParameter)) {
            throw new IllegalArgumentException(a.g(StubApp.getString2(28662), cipherParameters));
        }
        this.key = ((KeyParameter) cipherParameters2).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z2)));
        this.initialised = true;
    }
}
