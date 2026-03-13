package org.bouncycastle.pqc.crypto.sphincsplus;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCSPlusSigner implements MessageSigner {
    private SPHINCSPlusPrivateKeyParameters privKey;
    private SPHINCSPlusPublicKeyParameters pubKey;
    private SecureRandom random;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        SPHINCSPlusEngine engine = this.privKey.getParameters().getEngine();
        engine.init(this.privKey.pk.seed);
        int i3 = engine.f19474N;
        byte[] bArr2 = new byte[i3];
        SecureRandom secureRandom = this.random;
        int i10 = 0;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        } else {
            System.arraycopy(this.privKey.pk.seed, 0, bArr2, 0, i3);
        }
        Fors fors = new Fors(engine);
        byte[] PRF_msg = engine.PRF_msg(this.privKey.sk.prf, bArr2, bArr);
        PK pk = this.privKey.pk;
        IndexedDigest H_msg = engine.H_msg(PRF_msg, pk.seed, pk.root, bArr);
        byte[] bArr3 = H_msg.digest;
        long j = H_msg.idx_tree;
        int i11 = H_msg.idx_leaf;
        ADRS adrs = new ADRS();
        adrs.setType(3);
        adrs.setTreeAddress(j);
        adrs.setKeyPairAddress(i11);
        SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = this.privKey;
        SIG_FORS[] sign = fors.sign(bArr3, sPHINCSPlusPrivateKeyParameters.sk.seed, sPHINCSPlusPrivateKeyParameters.pk.seed, adrs);
        ADRS adrs2 = new ADRS();
        adrs2.setType(3);
        adrs2.setTreeAddress(j);
        adrs2.setKeyPairAddress(i11);
        byte[] pkFromSig = fors.pkFromSig(sign, bArr3, this.privKey.pk.seed, adrs2);
        new ADRS().setType(2);
        byte[] sign2 = new HT(engine, this.privKey.getSeed(), this.privKey.getPublicSeed()).sign(pkFromSig, j, i11);
        int length = sign.length;
        byte[][] bArr4 = new byte[length + 2][];
        bArr4[0] = PRF_msg;
        while (i10 != sign.length) {
            int i12 = i10 + 1;
            SIG_FORS sig_fors = sign[i10];
            bArr4[i12] = Arrays.concatenate(sig_fors.sk, Arrays.concatenate(sig_fors.authPath));
            i10 = i12;
        }
        bArr4[length + 1] = sign2;
        return Arrays.concatenate(bArr4);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!z2) {
            this.pubKey = (SPHINCSPlusPublicKeyParameters) cipherParameters;
        } else {
            if (!(cipherParameters instanceof ParametersWithRandom)) {
                this.privKey = (SPHINCSPlusPrivateKeyParameters) cipherParameters;
                return;
            }
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.privKey = (SPHINCSPlusPrivateKeyParameters) parametersWithRandom.getParameters();
            this.random = parametersWithRandom.getRandom();
        }
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        SPHINCSPlusEngine engine = this.pubKey.getParameters().getEngine();
        engine.init(this.pubKey.getSeed());
        ADRS adrs = new ADRS();
        SIG sig = new SIG(engine.f19474N, engine.f19473K, engine.f19470A, engine.f19471D, engine.H_PRIME, engine.WOTS_LEN, bArr2);
        byte[] r8 = sig.getR();
        SIG_FORS[] sig_fors = sig.getSIG_FORS();
        SIG_XMSS[] sig_ht = sig.getSIG_HT();
        IndexedDigest H_msg = engine.H_msg(r8, this.pubKey.getSeed(), this.pubKey.getRoot(), bArr);
        byte[] bArr3 = H_msg.digest;
        long j = H_msg.idx_tree;
        int i3 = H_msg.idx_leaf;
        adrs.setType(3);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        adrs.setKeyPairAddress(i3);
        byte[] pkFromSig = new Fors(engine).pkFromSig(sig_fors, bArr3, this.pubKey.getSeed(), adrs);
        adrs.setType(2);
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j);
        adrs.setKeyPairAddress(i3);
        return new HT(engine, null, this.pubKey.getSeed()).verify(pkFromSig, sig_ht, this.pubKey.getSeed(), j, i3, this.pubKey.getRoot());
    }
}
