package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.math.BigInteger;
import kotlin.jvm.internal.IntCompanionObject;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: a, reason: collision with root package name */
    private byte[] f18981a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* renamed from: h, reason: collision with root package name */
    private final int f18982h;
    private byte[] ios;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f18983k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f18982h = macSize;
        this.f18981a = new byte[macSize];
        this.f18983k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f18981a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f18981a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f18981a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f18981a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i3 = (this.generatedBytes / this.f18982h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length != 4) {
                            throw new IllegalStateException(StubApp.getString2(28920));
                        }
                        bArr4[0] = (byte) (i3 >>> 24);
                    }
                    bArr4[bArr4.length - 3] = (byte) (i3 >>> 16);
                }
                bArr4[bArr4.length - 2] = (byte) (i3 >>> 8);
            }
            bArr4[bArr4.length - 1] = (byte) i3;
            this.prf.update(bArr4, 0, bArr4.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr5 = this.fixedInputData;
        mac4.update(bArr5, 0, bArr5.length);
        this.prf.doFinal(this.f18983k, 0);
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalArgumentException {
        int i11 = this.generatedBytes;
        int i12 = i11 + i10;
        if (i12 < 0 || i12 >= this.maxSizeExcl) {
            throw new DataLengthException(AbstractC1482f.f(this.maxSizeExcl, StubApp.getString2(693), new StringBuilder(StubApp.getString2(28921))));
        }
        if (i11 % this.f18982h == 0) {
            generateNext();
        }
        int i13 = this.generatedBytes;
        int i14 = this.f18982h;
        int i15 = i13 % i14;
        int min = Math.min(i14 - (i13 % i14), i10);
        System.arraycopy(this.f18983k, i15, bArr, i3, min);
        this.generatedBytes += min;
        int i16 = i10 - min;
        while (true) {
            i3 += min;
            if (i16 <= 0) {
                return i10;
            }
            generateNext();
            min = Math.min(this.f18982h, i16);
            System.arraycopy(this.f18983k, 0, bArr, i3, min);
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
        if (!(derivationParameters instanceof KDFDoublePipelineIterationParameters)) {
            throw new IllegalArgumentException(StubApp.getString2(28922));
        }
        KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
        this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
        this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
        int r8 = kDFDoublePipelineIterationParameters.getR();
        this.ios = new byte[r8 / 8];
        boolean useCounter = kDFDoublePipelineIterationParameters.useCounter();
        int i3 = IntCompanionObject.MAX_VALUE;
        if (useCounter) {
            BigInteger multiply = TWO.pow(r8).multiply(BigInteger.valueOf(this.f18982h));
            if (multiply.compareTo(INTEGER_MAX) != 1) {
                i3 = multiply.intValue();
            }
        }
        this.maxSizeExcl = i3;
        this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
        this.generatedBytes = 0;
    }
}
