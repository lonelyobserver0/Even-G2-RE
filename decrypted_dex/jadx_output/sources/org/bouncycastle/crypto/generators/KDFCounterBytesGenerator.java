package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.math.BigInteger;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFCounterParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KDFCounterBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private byte[] fixedInputDataCtrPrefix;
    private byte[] fixedInputData_afterCtr;
    private int generatedBytes;

    /* renamed from: h, reason: collision with root package name */
    private final int f18979h;
    private byte[] ios;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f18980k;
    private int maxSizeExcl;
    private final Mac prf;

    public KDFCounterBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f18979h = macSize;
        this.f18980k = new byte[macSize];
    }

    private void generateNext() {
        int i3 = (this.generatedBytes / this.f18979h) + 1;
        byte[] bArr = this.ios;
        int length = bArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    if (length != 4) {
                        throw new IllegalStateException(StubApp.getString2(28920));
                    }
                    bArr[0] = (byte) (i3 >>> 24);
                }
                bArr[bArr.length - 3] = (byte) (i3 >>> 16);
            }
            bArr[bArr.length - 2] = (byte) (i3 >>> 8);
        }
        bArr[bArr.length - 1] = (byte) i3;
        Mac mac = this.prf;
        byte[] bArr2 = this.fixedInputDataCtrPrefix;
        mac.update(bArr2, 0, bArr2.length);
        Mac mac2 = this.prf;
        byte[] bArr3 = this.ios;
        mac2.update(bArr3, 0, bArr3.length);
        Mac mac3 = this.prf;
        byte[] bArr4 = this.fixedInputData_afterCtr;
        mac3.update(bArr4, 0, bArr4.length);
        this.prf.doFinal(this.f18980k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        int i11 = this.generatedBytes;
        int i12 = i11 + i10;
        if (i12 < 0 || i12 >= this.maxSizeExcl) {
            throw new DataLengthException(AbstractC1482f.f(this.maxSizeExcl, StubApp.getString2(693), new StringBuilder(StubApp.getString2(28921))));
        }
        if (i11 % this.f18979h == 0) {
            generateNext();
        }
        int i13 = this.generatedBytes;
        int i14 = this.f18979h;
        int i15 = i13 % i14;
        int min = Math.min(i14 - (i13 % i14), i10);
        System.arraycopy(this.f18980k, i15, bArr, i3, min);
        this.generatedBytes += min;
        int i16 = i10 - min;
        while (true) {
            i3 += min;
            if (i16 <= 0) {
                return i10;
            }
            generateNext();
            min = Math.min(this.f18979h, i16);
            System.arraycopy(this.f18980k, 0, bArr, i3, min);
            this.generatedBytes += min;
            i16 -= min;
        }
    }

    @Override // org.bouncycastle.crypto.MacDerivationFunction
    public Mac getMac() {
        return this.prf;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        if (!(derivationParameters instanceof KDFCounterParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28922));
        }
        KDFCounterParameters kDFCounterParameters = (KDFCounterParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFCounterParameters.getKI()));
        this.fixedInputDataCtrPrefix = kDFCounterParameters.getFixedInputDataCounterPrefix();
        this.fixedInputData_afterCtr = kDFCounterParameters.getFixedInputDataCounterSuffix();
        int r8 = kDFCounterParameters.getR();
        this.ios = new byte[r8 / 8];
        BigInteger multiply = TWO.pow(r8).multiply(BigInteger.valueOf(this.f18979h));
        this.maxSizeExcl = multiply.compareTo(INTEGER_MAX) == 1 ? IntCompanionObject.MAX_VALUE : multiply.intValue();
        this.generatedBytes = 0;
    }
}
