package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.pqc.math.ntru.parameters.NTRUParameterSet;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NTRUKEMExtractor implements EncapsulatedSecretExtractor {
    private final NTRUPrivateKeyParameters ntruPrivateKey;
    private final NTRUParameters params;

    public NTRUKEMExtractor(NTRUPrivateKeyParameters nTRUPrivateKeyParameters) {
        this.params = nTRUPrivateKeyParameters.getParameters();
        this.ntruPrivateKey = nTRUPrivateKeyParameters;
    }

    private void cmov(byte[] bArr, byte[] bArr2, byte b2) {
        byte b10 = (byte) ((~b2) + 1);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b11 = bArr[i3];
            bArr[i3] = (byte) (b11 ^ ((bArr2[i3] ^ b11) & b10));
        }
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public byte[] extractSecret(byte[] bArr) {
        NTRUParameterSet nTRUParameterSet = this.params.parameterSet;
        byte[] bArr2 = this.ntruPrivateKey.privateKey;
        int ntruCiphertextBytes = nTRUParameterSet.ntruCiphertextBytes() + nTRUParameterSet.prfKeyBytes();
        byte[] bArr3 = new byte[ntruCiphertextBytes];
        OWCPADecryptResult decrypt = new NTRUOWCPA(nTRUParameterSet).decrypt(bArr, this.ntruPrivateKey.privateKey);
        byte[] bArr4 = decrypt.rm;
        int i3 = decrypt.fail;
        SHA3Digest sHA3Digest = new SHA3Digest(256);
        byte[] bArr5 = new byte[sHA3Digest.getDigestSize()];
        sHA3Digest.update(bArr4, 0, bArr4.length);
        sHA3Digest.doFinal(bArr5, 0);
        for (int i10 = 0; i10 < nTRUParameterSet.prfKeyBytes(); i10++) {
            bArr3[i10] = bArr2[nTRUParameterSet.owcpaSecretKeyBytes() + i10];
        }
        for (int i11 = 0; i11 < nTRUParameterSet.ntruCiphertextBytes(); i11++) {
            bArr3[nTRUParameterSet.prfKeyBytes() + i11] = bArr[i11];
        }
        sHA3Digest.reset();
        sHA3Digest.update(bArr3, 0, ntruCiphertextBytes);
        sHA3Digest.doFinal(bArr4, 0);
        cmov(bArr5, bArr4, (byte) i3);
        byte[] copyOfRange = Arrays.copyOfRange(bArr5, 0, nTRUParameterSet.sharedKeyBytes());
        Arrays.clear(bArr5);
        return copyOfRange;
    }

    @Override // org.bouncycastle.crypto.EncapsulatedSecretExtractor
    public int getEncapsulationLength() {
        return this.params.parameterSet.ntruCiphertextBytes();
    }
}
