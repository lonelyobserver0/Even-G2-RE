package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HSS {

    public static class PlaceholderLMSPrivateKey extends LMSPrivateKeyParameters {
        public PlaceholderLMSPrivateKey(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i3, byte[] bArr, int i10, byte[] bArr2) {
            super(lMSigParameters, lMOtsParameters, i3, bArr, i10, bArr2);
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMOtsPrivateKey getNextOtsPrivateKey() {
            throw new RuntimeException(StubApp.getString2(34026));
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMSPublicKeyParameters getPublicKey() {
            throw new RuntimeException(StubApp.getString2(34026));
        }
    }

    public static HSSPrivateKeyParameters generateHSSKeyPair(HSSKeyGenerationParameters hSSKeyGenerationParameters) {
        byte[] bArr;
        int depth = hSSKeyGenerationParameters.getDepth();
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = new LMSPrivateKeyParameters[depth];
        LMSSignature[] lMSSignatureArr = new LMSSignature[hSSKeyGenerationParameters.getDepth() - 1];
        byte[] bArr2 = new byte[32];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr3);
        int i3 = 0;
        byte[] bArr4 = new byte[0];
        long j = 1;
        while (i3 < depth) {
            if (i3 == 0) {
                lMSPrivateKeyParametersArr[i3] = new LMSPrivateKeyParameters(hSSKeyGenerationParameters.getLmsParameters()[i3].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i3].getLMOTSParam(), 0, bArr3, 1 << hSSKeyGenerationParameters.getLmsParameters()[i3].getLMSigParam().getH(), bArr2);
                bArr = bArr4;
            } else {
                bArr = bArr4;
                lMSPrivateKeyParametersArr[i3] = new PlaceholderLMSPrivateKey(hSSKeyGenerationParameters.getLmsParameters()[i3].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i3].getLMOTSParam(), -1, bArr, 1 << hSSKeyGenerationParameters.getLmsParameters()[i3].getLMSigParam().getH(), bArr);
            }
            j *= 1 << hSSKeyGenerationParameters.getLmsParameters()[i3].getLMSigParam().getH();
            i3++;
            bArr4 = bArr;
        }
        if (j == 0) {
            j = LongCompanionObject.MAX_VALUE;
        }
        return new HSSPrivateKeyParameters(hSSKeyGenerationParameters.getDepth(), Arrays.asList(lMSPrivateKeyParametersArr), Arrays.asList(lMSSignatureArr), 0L, j);
    }

    public static HSSSignature generateSignature(int i3, LMSContext lMSContext) {
        return new HSSSignature(i3 - 1, lMSContext.getSignedPubKeys(), LMS.generateSign(lMSContext));
    }

    public static void incrementIndex(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            rangeTestKeys(hSSPrivateKeyParameters);
            hSSPrivateKeyParameters.incIndex();
            hSSPrivateKeyParameters.getKeys().get(hSSPrivateKeyParameters.getL() - 1).incIndex();
        }
    }

    public static void rangeTestKeys(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        String string2 = StubApp.getString2(34027);
        synchronized (hSSPrivateKeyParameters) {
            try {
                if (hSSPrivateKeyParameters.getIndex() >= hSSPrivateKeyParameters.getIndexLimit()) {
                    StringBuilder sb2 = new StringBuilder(string2);
                    sb2.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                    sb2.append(StubApp.getString2("34028"));
                    throw new ExhaustedPrivateKeyException(sb2.toString());
                }
                int l9 = hSSPrivateKeyParameters.getL();
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                int i3 = l9;
                while (true) {
                    int i10 = i3 - 1;
                    if (keys.get(i10).getIndex() != (1 << keys.get(i10).getSigParameters().getH())) {
                        while (i3 < l9) {
                            hSSPrivateKeyParameters.replaceConsumedKey(i3);
                            i3++;
                        }
                    } else {
                        if (i10 == 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(StubApp.getString2("34027"));
                            sb3.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                            sb3.append(StubApp.getString2("34029"));
                            throw new ExhaustedPrivateKeyException(sb3.toString());
                        }
                        i3 = i10;
                    }
                }
            } finally {
            }
        }
    }

    public static boolean verifySignature(HSSPublicKeyParameters hSSPublicKeyParameters, HSSSignature hSSSignature, byte[] bArr) {
        int i3 = hSSSignature.getlMinus1();
        int i10 = i3 + 1;
        if (i10 != hSSPublicKeyParameters.getL()) {
            return false;
        }
        LMSSignature[] lMSSignatureArr = new LMSSignature[i10];
        LMSPublicKeyParameters[] lMSPublicKeyParametersArr = new LMSPublicKeyParameters[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            lMSSignatureArr[i11] = hSSSignature.getSignedPubKey()[i11].getSignature();
            lMSPublicKeyParametersArr[i11] = hSSSignature.getSignedPubKey()[i11].getPublicKey();
        }
        lMSSignatureArr[i3] = hSSSignature.getSignature();
        LMSPublicKeyParameters lMSPublicKey = hSSPublicKeyParameters.getLMSPublicKey();
        for (int i12 = 0; i12 < i3; i12++) {
            if (!LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i12], lMSPublicKeyParametersArr[i12].toByteArray())) {
                return false;
            }
            try {
                lMSPublicKey = lMSPublicKeyParametersArr[i12];
            } catch (Exception e10) {
                throw new IllegalStateException(e10.getMessage(), e10);
            }
        }
        return LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i3], bArr);
    }

    public static HSSSignature generateSignature(HSSPrivateKeyParameters hSSPrivateKeyParameters, byte[] bArr) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l9 = hSSPrivateKeyParameters.getL();
        synchronized (hSSPrivateKeyParameters) {
            try {
                rangeTestKeys(hSSPrivateKeyParameters);
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                List<LMSSignature> sig = hSSPrivateKeyParameters.getSig();
                int i3 = l9 - 1;
                lMSPrivateKeyParameters = hSSPrivateKeyParameters.getKeys().get(i3);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i3];
                int i10 = 0;
                while (i10 < i3) {
                    int i11 = i10 + 1;
                    lMSSignedPubKeyArr[i10] = new LMSSignedPubKey(sig.get(i10), keys.get(i11).getPublicKey());
                    i10 = i11;
                }
                hSSPrivateKeyParameters.incIndex();
            } catch (Throwable th) {
                throw th;
            }
        }
        LMSContext withSignedPublicKeys = lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
        withSignedPublicKeys.update(bArr, 0, bArr.length);
        return generateSignature(l9, withSignedPublicKeys);
    }
}
