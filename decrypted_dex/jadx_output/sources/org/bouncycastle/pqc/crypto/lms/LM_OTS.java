package org.bouncycastle.pqc.crypto.lms;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class LM_OTS {
    static final short D_MESG = -32383;
    private static final short D_PBLC = -32640;
    private static final int ITER_J = 22;
    private static final int ITER_K = 20;
    private static final int ITER_PREV = 23;
    static final int MAX_HASH = 32;
    static final int SEED_LEN = 32;
    static final int SEED_RANDOMISER_INDEX = -3;

    public static int cksm(byte[] bArr, int i3, LMOtsParameters lMOtsParameters) {
        int w10 = (1 << lMOtsParameters.getW()) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < (i3 * 8) / lMOtsParameters.getW(); i11++) {
            i10 = (i10 + w10) - coef(bArr, i11, lMOtsParameters.getW());
        }
        return i10 << lMOtsParameters.getLs();
    }

    public static int coef(byte[] bArr, int i3, int i10) {
        int i11 = (i3 * i10) / 8;
        return (bArr[i11] >>> (((~i3) & ((8 / i10) - 1)) * i10)) & ((1 << i10) - 1);
    }

    public static LMOtsSignature lm_ots_generate_signature(LMOtsPrivateKey lMOtsPrivateKey, byte[] bArr, byte[] bArr2) {
        LMOtsParameters parameter = lMOtsPrivateKey.getParameter();
        int n10 = parameter.getN();
        int p8 = parameter.getP();
        int w10 = parameter.getW();
        byte[] bArr3 = new byte[p8 * n10];
        Digest digest = DigestUtil.getDigest(parameter.getDigestOID());
        SeedDerive derivationFunction = lMOtsPrivateKey.getDerivationFunction();
        int cksm = cksm(bArr, n10, parameter);
        bArr[n10] = (byte) ((cksm >>> 8) & 255);
        bArr[n10 + 1] = (byte) cksm;
        int i3 = n10 + 23;
        byte[] build = Composer.compose().bytes(lMOtsPrivateKey.getI()).u32str(lMOtsPrivateKey.getQ()).padUntil(0, i3).build();
        derivationFunction.setJ(0);
        int i10 = 0;
        while (i10 < p8) {
            Pack.shortToBigEndian((short) i10, build, 20);
            derivationFunction.deriveSeed(build, i10 < p8 + (-1), 23);
            int coef = coef(bArr, i10, w10);
            for (int i11 = 0; i11 < coef; i11++) {
                build[22] = (byte) i11;
                digest.update(build, 0, i3);
                digest.doFinal(build, 23);
            }
            System.arraycopy(build, 23, bArr3, n10 * i10, n10);
            i10++;
        }
        return new LMOtsSignature(parameter, bArr2, bArr3);
    }

    public static boolean lm_ots_validate_signature(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr, boolean z2) throws LMSException {
        if (lMOtsSignature.getType().equals(lMOtsPublicKey.getParameter())) {
            return Arrays.areEqual(lm_ots_validate_signature_calculate(lMOtsPublicKey, lMOtsSignature, bArr), lMOtsPublicKey.getK());
        }
        throw new LMSException(StubApp.getString2(34045));
    }

    public static byte[] lm_ots_validate_signature_calculate(LMOtsPublicKey lMOtsPublicKey, LMOtsSignature lMOtsSignature, byte[] bArr) {
        LMSContext createOtsContext = lMOtsPublicKey.createOtsContext(lMOtsSignature);
        LmsUtils.byteArray(bArr, createOtsContext);
        return lm_ots_validate_signature_calculate(createOtsContext);
    }

    public static LMOtsPublicKey lms_ots_generatePublicKey(LMOtsPrivateKey lMOtsPrivateKey) {
        return new LMOtsPublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lms_ots_generatePublicKey(lMOtsPrivateKey.getParameter(), lMOtsPrivateKey.getI(), lMOtsPrivateKey.getQ(), lMOtsPrivateKey.getMasterSecret()));
    }

    public static LMOtsSignature lm_ots_generate_signature(LMSigParameters lMSigParameters, LMOtsPrivateKey lMOtsPrivateKey, byte[][] bArr, byte[] bArr2, boolean z2) {
        byte[] bArr3;
        byte[] bArr4 = new byte[34];
        if (z2) {
            bArr3 = new byte[32];
            System.arraycopy(bArr2, 0, bArr4, 0, lMOtsPrivateKey.getParameter().getN());
        } else {
            LMSContext signatureContext = lMOtsPrivateKey.getSignatureContext(lMSigParameters, bArr);
            LmsUtils.byteArray(bArr2, 0, bArr2.length, signatureContext);
            bArr3 = signatureContext.getC();
            bArr4 = signatureContext.getQ();
        }
        return lm_ots_generate_signature(lMOtsPrivateKey, bArr4, bArr3);
    }

    public static byte[] lm_ots_validate_signature_calculate(LMSContext lMSContext) {
        LMOtsPublicKey publicKey = lMSContext.getPublicKey();
        LMOtsParameters parameter = publicKey.getParameter();
        Object signature = lMSContext.getSignature();
        LMOtsSignature otsSignature = signature instanceof LMSSignature ? ((LMSSignature) signature).getOtsSignature() : (LMOtsSignature) signature;
        int n10 = parameter.getN();
        int w10 = parameter.getW();
        int p8 = parameter.getP();
        byte[] q10 = lMSContext.getQ();
        int cksm = cksm(q10, n10, parameter);
        q10[n10] = (byte) ((cksm >>> 8) & 255);
        q10[n10 + 1] = (byte) cksm;
        byte[] i3 = publicKey.getI();
        int q11 = publicKey.getQ();
        Digest digest = DigestUtil.getDigest(parameter.getDigestOID());
        LmsUtils.byteArray(i3, digest);
        LmsUtils.u32str(q11, digest);
        LmsUtils.u16str(D_PBLC, digest);
        Composer u32str = Composer.compose().bytes(i3).u32str(q11);
        int i10 = n10 + 23;
        byte[] build = u32str.padUntil(0, i10).build();
        int i11 = (1 << w10) - 1;
        byte[] y10 = otsSignature.getY();
        Digest digest2 = DigestUtil.getDigest(parameter.getDigestOID());
        for (int i12 = 0; i12 < p8; i12++) {
            Pack.shortToBigEndian((short) i12, build, 20);
            System.arraycopy(y10, i12 * n10, build, 23, n10);
            for (int coef = coef(q10, i12, w10); coef < i11; coef++) {
                build[22] = (byte) coef;
                digest2.update(build, 0, i10);
                digest2.doFinal(build, 23);
            }
            digest.update(build, 23, n10);
        }
        byte[] bArr = new byte[n10];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static byte[] lms_ots_generatePublicKey(LMOtsParameters lMOtsParameters, byte[] bArr, int i3, byte[] bArr2) {
        Digest digest = DigestUtil.getDigest(lMOtsParameters.getDigestOID());
        byte[] build = Composer.compose().bytes(bArr).u32str(i3).u16str(-32640).padUntil(0, 22).build();
        digest.update(build, 0, build.length);
        Digest digest2 = DigestUtil.getDigest(lMOtsParameters.getDigestOID());
        byte[] build2 = Composer.compose().bytes(bArr).u32str(i3).padUntil(0, digest2.getDigestSize() + 23).build();
        SeedDerive seedDerive = new SeedDerive(bArr, bArr2, DigestUtil.getDigest(lMOtsParameters.getDigestOID()));
        seedDerive.setQ(i3);
        seedDerive.setJ(0);
        int p8 = lMOtsParameters.getP();
        int n10 = lMOtsParameters.getN();
        int w10 = (1 << lMOtsParameters.getW()) - 1;
        int i10 = 0;
        while (i10 < p8) {
            seedDerive.deriveSeed(build2, i10 < p8 + (-1), 23);
            Pack.shortToBigEndian((short) i10, build2, 20);
            for (int i11 = 0; i11 < w10; i11++) {
                build2[22] = (byte) i11;
                digest2.update(build2, 0, build2.length);
                digest2.doFinal(build2, 23);
            }
            digest.update(build2, 23, n10);
            i10++;
        }
        byte[] bArr3 = new byte[digest.getDigestSize()];
        digest.doFinal(bArr3, 0);
        return bArr3;
    }
}
