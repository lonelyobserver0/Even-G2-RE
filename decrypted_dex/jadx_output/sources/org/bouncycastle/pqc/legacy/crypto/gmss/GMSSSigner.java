package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSSigner implements MessageSigner {
    private byte[][][] currentAuthPaths;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private GMSSUtil gmssUtil = new GMSSUtil();
    private int[] index;
    GMSSKeyParameters key;
    private int mdLength;
    private Digest messDigestOTS;
    private Digest messDigestTrees;
    private int numLayer;
    private WinternitzOTSignature ots;
    private byte[] pubKeyBytes;
    private SecureRandom random;
    private byte[][] subtreeRootSig;

    public GMSSSigner(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.messDigestOTS = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
    }

    private void initSign() {
        int i3;
        this.messDigestTrees.reset();
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = (GMSSPrivateKeyParameters) this.key;
        if (gMSSPrivateKeyParameters.isUsed()) {
            throw new IllegalStateException(StubApp.getString2(34767));
        }
        if (gMSSPrivateKeyParameters.getIndex(0) >= gMSSPrivateKeyParameters.getNumLeafs(0)) {
            throw new IllegalStateException(StubApp.getString2(34766));
        }
        GMSSParameters parameters = gMSSPrivateKeyParameters.getParameters();
        this.gmssPS = parameters;
        this.numLayer = parameters.getNumOfLayers();
        byte[] bArr = gMSSPrivateKeyParameters.getCurrentSeeds()[this.numLayer - 1];
        int i10 = this.mdLength;
        byte[] bArr2 = new byte[i10];
        byte[] bArr3 = new byte[i10];
        System.arraycopy(bArr, 0, bArr3, 0, i10);
        this.ots = new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr3), this.digestProvider.get(), this.gmssPS.getWinternitzParameter()[this.numLayer - 1]);
        byte[][][] currentAuthPaths = gMSSPrivateKeyParameters.getCurrentAuthPaths();
        this.currentAuthPaths = new byte[this.numLayer][][];
        int i11 = 0;
        while (true) {
            i3 = this.numLayer;
            if (i11 >= i3) {
                break;
            }
            this.currentAuthPaths[i11] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, currentAuthPaths[i11].length, this.mdLength);
            int i12 = 0;
            while (true) {
                byte[][] bArr4 = currentAuthPaths[i11];
                if (i12 < bArr4.length) {
                    System.arraycopy(bArr4[i12], 0, this.currentAuthPaths[i11][i12], 0, this.mdLength);
                    i12++;
                }
            }
            i11++;
        }
        this.index = new int[i3];
        System.arraycopy(gMSSPrivateKeyParameters.getIndex(), 0, this.index, 0, this.numLayer);
        this.subtreeRootSig = new byte[this.numLayer - 1][];
        for (int i13 = 0; i13 < this.numLayer - 1; i13++) {
            byte[] subtreeRootSig = gMSSPrivateKeyParameters.getSubtreeRootSig(i13);
            byte[][] bArr5 = this.subtreeRootSig;
            byte[] bArr6 = new byte[subtreeRootSig.length];
            bArr5[i13] = bArr6;
            System.arraycopy(subtreeRootSig, 0, bArr6, 0, subtreeRootSig.length);
        }
        gMSSPrivateKeyParameters.markUsed();
    }

    private void initVerify() {
        this.messDigestTrees.reset();
        GMSSPublicKeyParameters gMSSPublicKeyParameters = (GMSSPublicKeyParameters) this.key;
        this.pubKeyBytes = gMSSPublicKeyParameters.getPublicKey();
        GMSSParameters parameters = gMSSPublicKeyParameters.getParameters();
        this.gmssPS = parameters;
        this.numLayer = parameters.getNumOfLayers();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.mdLength];
        byte[] signature = this.ots.getSignature(bArr);
        byte[] concatenateArray = this.gmssUtil.concatenateArray(this.currentAuthPaths[this.numLayer - 1]);
        byte[] intToBytesLittleEndian = this.gmssUtil.intToBytesLittleEndian(this.index[this.numLayer - 1]);
        int length = intToBytesLittleEndian.length + signature.length + concatenateArray.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(intToBytesLittleEndian, 0, bArr3, 0, intToBytesLittleEndian.length);
        System.arraycopy(signature, 0, bArr3, intToBytesLittleEndian.length, signature.length);
        System.arraycopy(concatenateArray, 0, bArr3, intToBytesLittleEndian.length + signature.length, concatenateArray.length);
        byte[] bArr4 = new byte[0];
        for (int i3 = this.numLayer - 2; i3 >= 0; i3--) {
            byte[] concatenateArray2 = this.gmssUtil.concatenateArray(this.currentAuthPaths[i3]);
            byte[] intToBytesLittleEndian2 = this.gmssUtil.intToBytesLittleEndian(this.index[i3]);
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[length2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            bArr4 = new byte[intToBytesLittleEndian2.length + length2 + this.subtreeRootSig[i3].length + concatenateArray2.length];
            System.arraycopy(bArr5, 0, bArr4, 0, length2);
            System.arraycopy(intToBytesLittleEndian2, 0, bArr4, length2, intToBytesLittleEndian2.length);
            byte[] bArr6 = this.subtreeRootSig[i3];
            System.arraycopy(bArr6, 0, bArr4, intToBytesLittleEndian2.length + length2, bArr6.length);
            System.arraycopy(concatenateArray2, 0, bArr4, length2 + intToBytesLittleEndian2.length + this.subtreeRootSig[i3].length, concatenateArray2.length);
        }
        byte[] bArr7 = new byte[bArr4.length + length];
        System.arraycopy(bArr3, 0, bArr7, 0, length);
        System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        return bArr7;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!z2) {
            this.key = (GMSSPublicKeyParameters) cipherParameters;
            initVerify();
        } else if (!(cipherParameters instanceof ParametersWithRandom)) {
            this.random = CryptoServicesRegistrar.getSecureRandom();
            this.key = (GMSSPrivateKeyParameters) cipherParameters;
            initSign();
        } else {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.random = parametersWithRandom.getRandom();
            this.key = (GMSSPrivateKeyParameters) parametersWithRandom.getParameters();
            initSign();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        this.messDigestOTS.reset();
        int i3 = 0;
        for (int i10 = this.numLayer - 1; i10 >= 0; i10--) {
            WinternitzOTSVerify winternitzOTSVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.gmssPS.getWinternitzParameter()[i10]);
            int signatureLength = winternitzOTSVerify.getSignatureLength();
            int bytesToIntLittleEndian = this.gmssUtil.bytesToIntLittleEndian(bArr2, i3);
            int i11 = i3 + 4;
            byte[] bArr3 = new byte[signatureLength];
            System.arraycopy(bArr2, i11, bArr3, 0, signatureLength);
            i3 = i11 + signatureLength;
            bArr = winternitzOTSVerify.Verify(bArr, bArr3);
            if (bArr == null) {
                System.err.println(StubApp.getString2(34768));
                return false;
            }
            byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.gmssPS.getHeightOfTrees()[i10], this.mdLength);
            for (byte[] bArr5 : bArr4) {
                System.arraycopy(bArr2, i3, bArr5, 0, this.mdLength);
                i3 += this.mdLength;
            }
            byte[] bArr6 = new byte[this.mdLength];
            int length = (1 << bArr4.length) + bytesToIntLittleEndian;
            for (int i12 = 0; i12 < bArr4.length; i12++) {
                int i13 = this.mdLength;
                int i14 = i13 << 1;
                byte[] bArr7 = new byte[i14];
                if (length % 2 == 0) {
                    System.arraycopy(bArr, 0, bArr7, 0, i13);
                    byte[] bArr8 = bArr4[i12];
                    int i15 = this.mdLength;
                    System.arraycopy(bArr8, 0, bArr7, i15, i15);
                    length /= 2;
                } else {
                    System.arraycopy(bArr4[i12], 0, bArr7, 0, i13);
                    System.arraycopy(bArr, 0, bArr7, this.mdLength, bArr.length);
                    length = (length - 1) / 2;
                }
                this.messDigestTrees.update(bArr7, 0, i14);
                bArr = new byte[this.messDigestTrees.getDigestSize()];
                this.messDigestTrees.doFinal(bArr, 0);
            }
        }
        return Arrays.areEqual(this.pubKeyBytes, bArr);
    }
}
