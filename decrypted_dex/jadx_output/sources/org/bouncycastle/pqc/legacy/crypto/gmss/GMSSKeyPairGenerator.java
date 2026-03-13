package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Vector;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public static final String OID = StubApp.getString2(34755);

    /* renamed from: K, reason: collision with root package name */
    private int[] f19505K;
    private byte[][] currentRootSigs;
    private byte[][] currentSeeds;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSKeyGenerationParameters gmssParams;
    private GMSSRandom gmssRandom;
    private int[] heightOfTrees;
    private boolean initialized = false;
    private int mdLength;
    private Digest messDigestTree;
    private byte[][] nextNextSeeds;
    private int numLayer;
    private int[] otsIndex;

    public GMSSKeyPairGenerator(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTree = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTree);
    }

    private AsymmetricCipherKeyPair genKeyPair() {
        int i3;
        Class cls;
        int i10;
        if (!this.initialized) {
            initializeDefault();
        }
        int i11 = this.numLayer;
        byte[][][] bArr = new byte[i11][][];
        byte[][][] bArr2 = new byte[i11 - 1][][];
        Treehash[][] treehashArr = new Treehash[i11][];
        Treehash[][] treehashArr2 = new Treehash[i11 - 1][];
        Vector[] vectorArr = new Vector[i11];
        Vector[] vectorArr2 = new Vector[i11 - 1];
        Vector[][] vectorArr3 = new Vector[i11][];
        boolean z2 = true;
        Vector[][] vectorArr4 = new Vector[i11 - 1][];
        int i12 = 0;
        while (true) {
            i3 = this.numLayer;
            cls = Byte.TYPE;
            if (i12 >= i3) {
                break;
            }
            int i13 = this.heightOfTrees[i12];
            boolean z10 = z2;
            int[] iArr = new int[2];
            iArr[z10 ? 1 : 0] = this.mdLength;
            iArr[0] = i13;
            bArr[i12] = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
            int i14 = this.heightOfTrees[i12];
            treehashArr[i12] = new Treehash[i14 - this.f19505K[i12]];
            if (i12 > 0) {
                int i15 = i12 - 1;
                int[] iArr2 = new int[2];
                iArr2[z10 ? 1 : 0] = this.mdLength;
                iArr2[0] = i14;
                bArr2[i15] = (byte[][]) Array.newInstance((Class<?>) cls, iArr2);
                treehashArr2[i15] = new Treehash[this.heightOfTrees[i12] - this.f19505K[i12]];
            }
            vectorArr[i12] = new Vector();
            if (i12 > 0) {
                vectorArr2[i12 - 1] = new Vector();
            }
            i12++;
            z2 = z10 ? 1 : 0;
        }
        boolean z11 = z2;
        int[] iArr3 = new int[2];
        iArr3[z11 ? 1 : 0] = this.mdLength;
        iArr3[0] = i3;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, iArr3);
        int i16 = this.numLayer - 1;
        int[] iArr4 = new int[2];
        iArr4[z11 ? 1 : 0] = this.mdLength;
        iArr4[0] = i16;
        byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) cls, iArr4);
        int i17 = this.numLayer;
        int[] iArr5 = new int[2];
        iArr5[z11 ? 1 : 0] = this.mdLength;
        iArr5[0] = i17;
        byte[][] bArr5 = (byte[][]) Array.newInstance((Class<?>) cls, iArr5);
        int i18 = 0;
        while (true) {
            i10 = this.numLayer;
            if (i18 >= i10) {
                break;
            }
            System.arraycopy(this.currentSeeds[i18], 0, bArr5[i18], 0, this.mdLength);
            i18++;
            bArr5 = bArr5;
            bArr3 = bArr3;
        }
        byte[][] bArr6 = bArr5;
        byte[][] bArr7 = bArr3;
        int[] iArr6 = new int[2];
        iArr6[z11 ? 1 : 0] = this.mdLength;
        iArr6[0] = i10 - 1;
        this.currentRootSigs = (byte[][]) Array.newInstance((Class<?>) cls, iArr6);
        int i19 = this.numLayer - 1;
        while (i19 >= 0) {
            GMSSRootCalc generateCurrentAuthpathAndRoot = i19 == this.numLayer + (-1) ? generateCurrentAuthpathAndRoot(null, vectorArr[i19], bArr6[i19], i19) : generateCurrentAuthpathAndRoot(bArr7[i19 + 1], vectorArr[i19], bArr6[i19], i19);
            int i20 = 0;
            while (i20 < this.heightOfTrees[i19]) {
                System.arraycopy(generateCurrentAuthpathAndRoot.getAuthPath()[i20], 0, bArr[i19][i20], 0, this.mdLength);
                i20++;
                i19 = i19;
            }
            int i21 = i19;
            vectorArr3[i21] = generateCurrentAuthpathAndRoot.getRetain();
            treehashArr[i21] = generateCurrentAuthpathAndRoot.getTreehash();
            System.arraycopy(generateCurrentAuthpathAndRoot.getRoot(), 0, bArr7[i21], 0, this.mdLength);
            i19 = i21 - 1;
        }
        int i22 = this.numLayer - 2;
        while (i22 >= 0) {
            int i23 = i22 + 1;
            GMSSRootCalc generateNextAuthpathAndRoot = generateNextAuthpathAndRoot(vectorArr2[i22], bArr6[i23], i23);
            int i24 = 0;
            while (i24 < this.heightOfTrees[i23]) {
                System.arraycopy(generateNextAuthpathAndRoot.getAuthPath()[i24], 0, bArr2[i22][i24], 0, this.mdLength);
                i24++;
                i22 = i22;
                generateNextAuthpathAndRoot = generateNextAuthpathAndRoot;
            }
            int i25 = i22;
            GMSSRootCalc gMSSRootCalc = generateNextAuthpathAndRoot;
            vectorArr4[i25] = gMSSRootCalc.getRetain();
            treehashArr2[i25] = gMSSRootCalc.getTreehash();
            System.arraycopy(gMSSRootCalc.getRoot(), 0, bArr4[i25], 0, this.mdLength);
            System.arraycopy(bArr6[i23], 0, this.nextNextSeeds[i25], 0, this.mdLength);
            i22 = i25 - 1;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new GMSSPublicKeyParameters(bArr7[0], this.gmssPS), (AsymmetricKeyParameter) new GMSSPrivateKeyParameters(this.currentSeeds, this.nextNextSeeds, bArr, bArr2, treehashArr, treehashArr2, vectorArr, vectorArr2, vectorArr3, vectorArr4, bArr4, this.currentRootSigs, this.gmssPS, this.digestProvider));
    }

    private GMSSRootCalc generateCurrentAuthpathAndRoot(byte[] bArr, Vector vector, byte[] bArr2, int i3) {
        byte[] Verify;
        int i10 = this.mdLength;
        byte[] bArr3 = new byte[i10];
        byte[] bArr4 = new byte[i10];
        byte[] nextSeed = this.gmssRandom.nextSeed(bArr2);
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i3], this.f19505K[i3], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        if (i3 == this.numLayer - 1) {
            Verify = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i3]).getPublicKey();
        } else {
            this.currentRootSigs[i3] = new WinternitzOTSignature(nextSeed, this.digestProvider.get(), this.otsIndex[i3]).getSignature(bArr);
            Verify = new WinternitzOTSVerify(this.digestProvider.get(), this.otsIndex[i3]).Verify(bArr, this.currentRootSigs[i3]);
        }
        gMSSRootCalc.update(Verify);
        int i11 = 3;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            int i14 = this.heightOfTrees[i3];
            if (i13 >= (1 << i14)) {
                break;
            }
            if (i13 == i11 && i12 < i14 - this.f19505K[i3]) {
                gMSSRootCalc.initializeTreehashSeed(bArr2, i12);
                i11 *= 2;
                i12++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr2), this.digestProvider.get(), this.otsIndex[i3]).getPublicKey());
            i13++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println(StubApp.getString2(34753));
        return null;
    }

    private GMSSRootCalc generateNextAuthpathAndRoot(Vector vector, byte[] bArr, int i3) {
        byte[] bArr2 = new byte[this.numLayer];
        GMSSRootCalc gMSSRootCalc = new GMSSRootCalc(this.heightOfTrees[i3], this.f19505K[i3], this.digestProvider);
        gMSSRootCalc.initialize(vector);
        int i10 = 3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.heightOfTrees[i3];
            if (i11 >= (1 << i13)) {
                break;
            }
            if (i11 == i10 && i12 < i13 - this.f19505K[i3]) {
                gMSSRootCalc.initializeTreehashSeed(bArr, i12);
                i10 *= 2;
                i12++;
            }
            gMSSRootCalc.update(new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr), this.digestProvider.get(), this.otsIndex[i3]).getPublicKey());
            i11++;
        }
        if (gMSSRootCalc.wasFinished()) {
            return gMSSRootCalc;
        }
        System.err.println(StubApp.getString2(34754));
        return null;
    }

    private void initializeDefault() {
        initialize(new GMSSKeyGenerationParameters(null, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{3, 3, 3, 3}, new int[]{2, 2, 2, 2})));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        return genKeyPair();
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        initialize(keyGenerationParameters);
    }

    public void initialize(int i3, SecureRandom secureRandom) {
        initialize(i3 <= 10 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(1, new int[]{10}, new int[]{3}, new int[]{2})) : i3 <= 20 ? new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2})) : new GMSSKeyGenerationParameters(secureRandom, new GMSSParameters(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2})));
    }

    public void initialize(KeyGenerationParameters keyGenerationParameters) {
        GMSSKeyGenerationParameters gMSSKeyGenerationParameters = (GMSSKeyGenerationParameters) keyGenerationParameters;
        this.gmssParams = gMSSKeyGenerationParameters;
        GMSSParameters gMSSParameters = new GMSSParameters(gMSSKeyGenerationParameters.getParameters().getNumOfLayers(), this.gmssParams.getParameters().getHeightOfTrees(), this.gmssParams.getParameters().getWinternitzParameter(), this.gmssParams.getParameters().getK());
        this.gmssPS = gMSSParameters;
        this.numLayer = gMSSParameters.getNumOfLayers();
        this.heightOfTrees = this.gmssPS.getHeightOfTrees();
        this.otsIndex = this.gmssPS.getWinternitzParameter();
        this.f19505K = this.gmssPS.getK();
        int[] iArr = {this.numLayer, this.mdLength};
        Class cls = Byte.TYPE;
        this.currentSeeds = (byte[][]) Array.newInstance((Class<?>) cls, iArr);
        this.nextNextSeeds = (byte[][]) Array.newInstance((Class<?>) cls, this.numLayer - 1, this.mdLength);
        SecureRandom random = keyGenerationParameters.getRandom();
        for (int i3 = 0; i3 < this.numLayer; i3++) {
            random.nextBytes(this.currentSeeds[i3]);
            this.gmssRandom.nextSeed(this.currentSeeds[i3]);
        }
        this.initialized = true;
    }
}
