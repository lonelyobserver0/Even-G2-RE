package org.bouncycastle.cert.crmf.bc;

import com.stub.StubApp;
import java.security.SecureRandom;
import org.bouncycastle.cert.crmf.EncryptedValuePadder;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.params.MGFParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcFixedLengthMGF1Padder implements EncryptedValuePadder {
    private Digest dig;
    private int length;
    private SecureRandom random;

    public BcFixedLengthMGF1Padder(int i3) {
        this(i3, null);
    }

    @Override // org.bouncycastle.cert.crmf.EncryptedValuePadder
    public byte[] getPaddedData(byte[] bArr) {
        int i3 = this.length;
        byte[] bArr2 = new byte[i3];
        int digestSize = this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr4 = new byte[digestSize2];
        if (this.random == null) {
            this.random = new SecureRandom();
        }
        this.random.nextBytes(bArr3);
        MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(this.dig);
        mGF1BytesGenerator.init(new MGFParameters(bArr3));
        mGF1BytesGenerator.generateBytes(bArr4, 0, digestSize2);
        System.arraycopy(bArr3, 0, bArr2, 0, digestSize);
        System.arraycopy(bArr, 0, bArr2, digestSize, bArr.length);
        int length = bArr.length + digestSize;
        while (true) {
            length++;
            if (length == i3) {
                break;
            }
            bArr2[length] = (byte) (this.random.nextInt(255) + 1);
        }
        for (int i10 = 0; i10 != digestSize2; i10++) {
            int i11 = i10 + digestSize;
            bArr2[i11] = (byte) (bArr2[i11] ^ bArr4[i10]);
        }
        return bArr2;
    }

    @Override // org.bouncycastle.cert.crmf.EncryptedValuePadder
    public byte[] getUnpaddedData(byte[] bArr) {
        int digestSize = this.dig.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        int digestSize2 = this.length - this.dig.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        System.arraycopy(bArr, 0, bArr2, 0, digestSize);
        MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(this.dig);
        mGF1BytesGenerator.init(new MGFParameters(bArr2));
        mGF1BytesGenerator.generateBytes(bArr3, 0, digestSize2);
        for (int i3 = 0; i3 != digestSize2; i3++) {
            int i10 = i3 + digestSize;
            bArr[i10] = (byte) (bArr[i10] ^ bArr3[i3]);
        }
        int length = bArr.length - 1;
        while (true) {
            if (length == digestSize) {
                length = 0;
                break;
            }
            if (bArr[length] == 0) {
                break;
            }
            length--;
        }
        if (length == 0) {
            throw new IllegalStateException(StubApp.getString2(28049));
        }
        int i11 = length - digestSize;
        byte[] bArr4 = new byte[i11];
        System.arraycopy(bArr, digestSize, bArr4, 0, i11);
        return bArr4;
    }

    public BcFixedLengthMGF1Padder(int i3, SecureRandom secureRandom) {
        this.dig = new SHA1Digest();
        this.length = i3;
        this.random = secureRandom;
    }
}
