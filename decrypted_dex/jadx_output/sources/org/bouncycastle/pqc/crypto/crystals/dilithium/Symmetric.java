package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class Symmetric {
    final int stream128BlockBytes;
    final int stream256BlockBytes;

    public static class AesSymmetric extends Symmetric {
        private final SICBlockCipher cipher;

        public AesSymmetric() {
            super(64, 64);
            this.cipher = new SICBlockCipher(new AESEngine());
        }

        private void aes128(byte[] bArr, int i3, int i10) {
            this.cipher.processBytes(new byte[i10], 0, i10, bArr, i3);
        }

        private void streamInit(byte[] bArr, short s10) {
            byte[] bArr2 = new byte[12];
            bArr2[0] = (byte) s10;
            bArr2[1] = (byte) (s10 >> 8);
            this.cipher.init(true, new ParametersWithIV(new KeyParameter(Arrays.copyOfRange(bArr, 0, 32)), bArr2));
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128init(byte[] bArr, short s10) {
            streamInit(bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128squeezeBlocks(byte[] bArr, int i3, int i10) {
            aes128(bArr, i3, i10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256init(byte[] bArr, short s10) {
            streamInit(bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256squeezeBlocks(byte[] bArr, int i3, int i10) {
            aes128(bArr, i3, i10);
        }
    }

    public static class ShakeSymmetric extends Symmetric {
        private final SHAKEDigest digest128;
        private final SHAKEDigest digest256;

        public ShakeSymmetric() {
            super(168, 136);
            this.digest128 = new SHAKEDigest(128);
            this.digest256 = new SHAKEDigest(256);
        }

        private void streamInit(SHAKEDigest sHAKEDigest, byte[] bArr, short s10) {
            sHAKEDigest.reset();
            sHAKEDigest.update(bArr, 0, bArr.length);
            sHAKEDigest.update(new byte[]{(byte) s10, (byte) (s10 >> 8)}, 0, 2);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128init(byte[] bArr, short s10) {
            streamInit(this.digest128, bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream128squeezeBlocks(byte[] bArr, int i3, int i10) {
            this.digest128.doOutput(bArr, i3, i10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256init(byte[] bArr, short s10) {
            streamInit(this.digest256, bArr, s10);
        }

        @Override // org.bouncycastle.pqc.crypto.crystals.dilithium.Symmetric
        public void stream256squeezeBlocks(byte[] bArr, int i3, int i10) {
            this.digest256.doOutput(bArr, i3, i10);
        }
    }

    public Symmetric(int i3, int i10) {
        this.stream128BlockBytes = i3;
        this.stream256BlockBytes = i10;
    }

    public abstract void stream128init(byte[] bArr, short s10);

    public abstract void stream128squeezeBlocks(byte[] bArr, int i3, int i10);

    public abstract void stream256init(byte[] bArr, short s10);

    public abstract void stream256squeezeBlocks(byte[] bArr, int i3, int i10);
}
