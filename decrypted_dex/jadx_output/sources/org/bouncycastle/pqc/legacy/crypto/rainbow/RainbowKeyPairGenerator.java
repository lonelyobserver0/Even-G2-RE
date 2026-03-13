package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.ComputeInField;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {

    /* renamed from: A1, reason: collision with root package name */
    private short[][] f19550A1;
    private short[][] A1inv;

    /* renamed from: A2, reason: collision with root package name */
    private short[][] f19551A2;
    private short[][] A2inv;

    /* renamed from: b1, reason: collision with root package name */
    private short[] f19552b1;
    private short[] b2;
    private boolean initialized = false;
    private Layer[] layers;
    private int numOfLayers;
    private short[][] pub_quadratic;
    private short[] pub_scalar;
    private short[][] pub_singular;
    private RainbowKeyGenerationParameters rainbowParams;
    private SecureRandom sr;
    private int[] vi;

    private void compactPublicKey(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        this.pub_quadratic = (short[][]) Array.newInstance((Class<?>) Short.TYPE, length, ((length2 + 1) * length2) / 2);
        for (int i3 = 0; i3 < length; i3++) {
            int i10 = 0;
            for (int i11 = 0; i11 < length2; i11++) {
                for (int i12 = i11; i12 < length2; i12++) {
                    short[][] sArr2 = this.pub_quadratic;
                    if (i12 == i11) {
                        sArr2[i3][i10] = sArr[i3][i11][i12];
                    } else {
                        short[] sArr3 = sArr2[i3];
                        short[][] sArr4 = sArr[i3];
                        sArr3[i10] = GF2Field.addElem(sArr4[i11][i12], sArr4[i12][i11]);
                    }
                    i10++;
                }
            }
        }
    }

    private void computePublicKey() {
        int i3;
        ComputeInField computeInField = new ComputeInField();
        int[] iArr = this.vi;
        boolean z2 = true;
        int i10 = 0;
        int i11 = iArr[iArr.length - 1] - iArr[0];
        int i12 = iArr[iArr.length - 1];
        int i13 = 3;
        int i14 = 2;
        Class cls = Short.TYPE;
        short[][][] sArr = (short[][][]) Array.newInstance((Class<?>) cls, i11, i12, i12);
        this.pub_singular = (short[][]) Array.newInstance((Class<?>) cls, i11, i12);
        this.pub_scalar = new short[i11];
        short[] sArr2 = new short[i12];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            Layer[] layerArr = this.layers;
            if (i15 >= layerArr.length) {
                break;
            }
            short[][][] coeffAlpha = layerArr[i15].getCoeffAlpha();
            short[][][] coeffBeta = this.layers[i15].getCoeffBeta();
            short[][] coeffGamma = this.layers[i15].getCoeffGamma();
            short[] coeffEta = this.layers[i15].getCoeffEta();
            boolean z10 = z2;
            int length = coeffAlpha[i10].length;
            int i17 = i10;
            int length2 = coeffBeta[i17].length;
            int i18 = i14;
            int i19 = i17;
            while (i19 < length) {
                int i20 = i17;
                while (true) {
                    i3 = i12;
                    if (i20 >= length) {
                        break;
                    }
                    int i21 = i17;
                    while (i21 < length2) {
                        int i22 = i21;
                        int i23 = length;
                        int i24 = i20 + length2;
                        short[] multVect = computeInField.multVect(coeffAlpha[i19][i20][i22], this.f19551A2[i24]);
                        int i25 = i16 + i19;
                        int i26 = i20;
                        sArr[i25] = computeInField.addSquareMatrix(sArr[i25], computeInField.multVects(multVect, this.f19551A2[i22]));
                        short[] multVect2 = computeInField.multVect(this.b2[i22], multVect);
                        short[][] sArr3 = this.pub_singular;
                        sArr3[i25] = computeInField.addVect(multVect2, sArr3[i25]);
                        short[] multVect3 = computeInField.multVect(this.b2[i24], computeInField.multVect(coeffAlpha[i19][i26][i22], this.f19551A2[i22]));
                        short[][] sArr4 = this.pub_singular;
                        sArr4[i25] = computeInField.addVect(multVect3, sArr4[i25]);
                        short multElem = GF2Field.multElem(coeffAlpha[i19][i26][i22], this.b2[i24]);
                        short[] sArr5 = this.pub_scalar;
                        sArr5[i25] = GF2Field.addElem(sArr5[i25], GF2Field.multElem(multElem, this.b2[i22]));
                        i21 = i22 + 1;
                        length = i23;
                        i20 = i26;
                    }
                    i20++;
                    i12 = i3;
                }
                int i27 = length;
                int i28 = i17;
                while (i28 < length2) {
                    int i29 = i17;
                    while (i29 < length2) {
                        int i30 = i28;
                        short[] multVect4 = computeInField.multVect(coeffBeta[i19][i28][i29], this.f19551A2[i30]);
                        int i31 = i16 + i19;
                        int i32 = i29;
                        sArr[i31] = computeInField.addSquareMatrix(sArr[i31], computeInField.multVects(multVect4, this.f19551A2[i32]));
                        short[] multVect5 = computeInField.multVect(this.b2[i32], multVect4);
                        short[][] sArr6 = this.pub_singular;
                        sArr6[i31] = computeInField.addVect(multVect5, sArr6[i31]);
                        short[] multVect6 = computeInField.multVect(this.b2[i30], computeInField.multVect(coeffBeta[i19][i30][i32], this.f19551A2[i32]));
                        short[][] sArr7 = this.pub_singular;
                        sArr7[i31] = computeInField.addVect(multVect6, sArr7[i31]);
                        short multElem2 = GF2Field.multElem(coeffBeta[i19][i30][i32], this.b2[i30]);
                        short[] sArr8 = this.pub_scalar;
                        sArr8[i31] = GF2Field.addElem(sArr8[i31], GF2Field.multElem(multElem2, this.b2[i32]));
                        i29 = i32 + 1;
                        i28 = i30;
                        length2 = length2;
                    }
                    i28++;
                }
                int i33 = length2;
                int i34 = i17;
                while (i34 < i33 + i27) {
                    short[] multVect7 = computeInField.multVect(coeffGamma[i19][i34], this.f19551A2[i34]);
                    short[][] sArr9 = this.pub_singular;
                    int i35 = i16 + i19;
                    int i36 = i34;
                    sArr9[i35] = computeInField.addVect(multVect7, sArr9[i35]);
                    short[] sArr10 = this.pub_scalar;
                    sArr10[i35] = GF2Field.addElem(sArr10[i35], GF2Field.multElem(coeffGamma[i19][i36], this.b2[i36]));
                    i34 = i36 + 1;
                }
                short[] sArr11 = this.pub_scalar;
                int i37 = i16 + i19;
                sArr11[i37] = GF2Field.addElem(sArr11[i37], coeffEta[i19]);
                i19++;
                i12 = i3;
                length = i27;
                length2 = i33;
            }
            i16 += length;
            i15++;
            z2 = z10;
            i10 = i17;
            i14 = i18;
            i13 = 3;
        }
        int i38 = i12;
        boolean z11 = z2;
        int i39 = i10;
        int i40 = i14;
        int[] iArr2 = new int[i13];
        iArr2[i40] = i38;
        iArr2[z11 ? 1 : 0] = i38;
        iArr2[i39] = i11;
        short[][][] sArr12 = (short[][][]) Array.newInstance((Class<?>) cls, iArr2);
        int[] iArr3 = new int[i40];
        iArr3[z11 ? 1 : 0] = i38;
        iArr3[i39] = i11;
        short[][] sArr13 = (short[][]) Array.newInstance((Class<?>) cls, iArr3);
        short[] sArr14 = new short[i11];
        for (int i41 = i39; i41 < i11; i41++) {
            int i42 = i39;
            while (true) {
                short[][] sArr15 = this.f19550A1;
                if (i42 < sArr15.length) {
                    sArr12[i41] = computeInField.addSquareMatrix(sArr12[i41], computeInField.multMatrix(sArr15[i41][i42], sArr[i42]));
                    sArr13[i41] = computeInField.addVect(sArr13[i41], computeInField.multVect(this.f19550A1[i41][i42], this.pub_singular[i42]));
                    sArr14[i41] = GF2Field.addElem(sArr14[i41], GF2Field.multElem(this.f19550A1[i41][i42], this.pub_scalar[i42]));
                    i42++;
                }
            }
            sArr14[i41] = GF2Field.addElem(sArr14[i41], this.f19552b1[i41]);
        }
        this.pub_singular = sArr13;
        this.pub_scalar = sArr14;
        compactPublicKey(sArr12);
    }

    private void generateF() {
        this.layers = new Layer[this.numOfLayers];
        int i3 = 0;
        while (i3 < this.numOfLayers) {
            Layer[] layerArr = this.layers;
            int[] iArr = this.vi;
            int i10 = i3 + 1;
            layerArr[i3] = new Layer(iArr[i3], iArr[i10], this.sr);
            i3 = i10;
        }
    }

    private void generateL1() {
        int[] iArr = this.vi;
        int i3 = iArr[iArr.length - 1] - iArr[0];
        this.f19550A1 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i3);
        this.A1inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A1inv == null) {
            for (int i10 = 0; i10 < i3; i10++) {
                for (int i11 = 0; i11 < i3; i11++) {
                    this.f19550A1[i10][i11] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A1inv = computeInField.inverse(this.f19550A1);
        }
        this.f19552b1 = new short[i3];
        for (int i12 = 0; i12 < i3; i12++) {
            this.f19552b1[i12] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void generateL2() {
        int[] iArr = this.vi;
        int i3 = iArr[iArr.length - 1];
        this.f19551A2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i3, i3);
        this.A2inv = null;
        ComputeInField computeInField = new ComputeInField();
        while (this.A2inv == null) {
            for (int i10 = 0; i10 < i3; i10++) {
                for (int i11 = 0; i11 < i3; i11++) {
                    this.f19551A2[i10][i11] = (short) (this.sr.nextInt() & 255);
                }
            }
            this.A2inv = computeInField.inverse(this.f19551A2);
        }
        this.b2 = new short[i3];
        for (int i12 = 0; i12 < i3; i12++) {
            this.b2[i12] = (short) (this.sr.nextInt() & 255);
        }
    }

    private void initializeDefault() {
        initialize(new RainbowKeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), new RainbowParameters()));
    }

    private void keygen() {
        generateL1();
        generateL2();
        generateF();
        computePublicKey();
    }

    public AsymmetricCipherKeyPair genKeyPair() {
        if (!this.initialized) {
            initializeDefault();
        }
        keygen();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = new RainbowPrivateKeyParameters(this.A1inv, this.f19552b1, this.A2inv, this.b2, this.vi, this.layers);
        int[] iArr = this.vi;
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new RainbowPublicKeyParameters(iArr[iArr.length - 1] - iArr[0], this.pub_quadratic, this.pub_singular, this.pub_scalar), (AsymmetricKeyParameter) rainbowPrivateKeyParameters);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        RainbowKeyGenerationParameters rainbowKeyGenerationParameters = (RainbowKeyGenerationParameters) keyGenerationParameters;
        this.rainbowParams = rainbowKeyGenerationParameters;
        this.sr = rainbowKeyGenerationParameters.getRandom();
        this.vi = this.rainbowParams.getParameters().getVi();
        this.numOfLayers = this.rainbowParams.getParameters().getNumOfLayers();
        this.initialized = true;
    }
}
