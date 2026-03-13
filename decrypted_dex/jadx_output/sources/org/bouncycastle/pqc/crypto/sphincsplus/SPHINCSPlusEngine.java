package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.generators.MGF1BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.MGFParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class SPHINCSPlusEngine {

    /* renamed from: A, reason: collision with root package name */
    final int f19470A;

    /* renamed from: D, reason: collision with root package name */
    final int f19471D;

    /* renamed from: H, reason: collision with root package name */
    final int f19472H;
    final int H_PRIME;

    /* renamed from: K, reason: collision with root package name */
    final int f19473K;

    /* renamed from: N, reason: collision with root package name */
    final int f19474N;

    /* renamed from: T, reason: collision with root package name */
    final int f19475T;
    final int WOTS_LEN;
    final int WOTS_LEN1;
    final int WOTS_LEN2;
    final int WOTS_LOGW;
    final int WOTS_W;
    final boolean robust;

    public static class HarakaSEngine extends SPHINCSPlusEngine {
        private HarakaS256Digest harakaS256Digest;
        private HarakaS512Digest harakaS512Digest;
        private HarakaSXof harakaSXof;

        public HarakaSEngine(boolean z2, int i3, int i10, int i11, int i12, int i13, int i14) {
            super(z2, i3, i10, i11, i12, i13, i14);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] bArr3 = new byte[64];
            HarakaS512Digest harakaS512Digest = this.harakaS512Digest;
            byte[] bArr4 = adrs.value;
            harakaS512Digest.update(bArr4, 0, bArr4.length);
            if (this.robust) {
                int length = bArr2.length;
                byte[] bArr5 = new byte[length];
                HarakaS256Digest harakaS256Digest = this.harakaS256Digest;
                byte[] bArr6 = adrs.value;
                harakaS256Digest.update(bArr6, 0, bArr6.length);
                this.harakaS256Digest.doFinal(bArr5, 0);
                for (int i3 = 0; i3 < bArr2.length; i3++) {
                    bArr5[i3] = (byte) (bArr5[i3] ^ bArr2[i3]);
                }
                this.harakaS512Digest.update(bArr5, 0, length);
            } else {
                this.harakaS512Digest.update(bArr2, 0, bArr2.length);
            }
            this.harakaS512Digest.doFinal(bArr3, 0);
            return Arrays.copyOf(bArr3, this.f19474N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i3 = this.f19474N;
            byte[] bArr4 = new byte[i3];
            byte[] bArr5 = new byte[bArr2.length + bArr3.length];
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            System.arraycopy(bArr3, 0, bArr5, bArr2.length, bArr3.length);
            byte[] bitmask = bitmask(adrs, bArr5);
            HarakaSXof harakaSXof = this.harakaSXof;
            byte[] bArr6 = adrs.value;
            harakaSXof.update(bArr6, 0, bArr6.length);
            this.harakaSXof.update(bitmask, 0, bitmask.length);
            this.harakaSXof.doFinal(bArr4, 0, i3);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i3 = ((this.f19470A * this.f19473K) + 7) >> 3;
            int i10 = this.f19472H;
            int i11 = i10 / this.f19471D;
            int i12 = i10 - i11;
            int i13 = (i11 + 7) >> 3;
            int i14 = (i12 + 7) >> 3;
            int i15 = i3 + i13 + i14;
            byte[] bArr5 = new byte[i15];
            this.harakaSXof.update(bArr, 0, bArr.length);
            this.harakaSXof.update(bArr3, 0, bArr3.length);
            this.harakaSXof.update(bArr4, 0, bArr4.length);
            this.harakaSXof.doFinal(bArr5, 0, i15);
            byte[] bArr6 = new byte[8];
            System.arraycopy(bArr5, i3, bArr6, 8 - i14, i14);
            long bigEndianToLong = Pack.bigEndianToLong(bArr6, 0) & ((-1) >>> (64 - i12));
            byte[] bArr7 = new byte[4];
            System.arraycopy(bArr5, i14 + i3, bArr7, 4 - i13, i13);
            return new IndexedDigest(bigEndianToLong, Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i11)), Arrays.copyOfRange(bArr5, 0, i3));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            byte[] bArr3 = new byte[64];
            HarakaS512Digest harakaS512Digest = this.harakaS512Digest;
            byte[] bArr4 = adrs.value;
            harakaS512Digest.update(bArr4, 0, bArr4.length);
            this.harakaS512Digest.update(bArr2, 0, bArr2.length);
            this.harakaS512Digest.doFinal(bArr3, 0);
            return Arrays.copyOf(bArr3, this.f19474N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int i3 = this.f19474N;
            byte[] bArr4 = new byte[i3];
            this.harakaSXof.update(bArr, 0, bArr.length);
            this.harakaSXof.update(bArr2, 0, bArr2.length);
            this.harakaSXof.update(bArr3, 0, bArr3.length);
            this.harakaSXof.doFinal(bArr4, 0, i3);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int i3 = this.f19474N;
            byte[] bArr3 = new byte[i3];
            byte[] bitmask = bitmask(adrs, bArr2);
            HarakaSXof harakaSXof = this.harakaSXof;
            byte[] bArr4 = adrs.value;
            harakaSXof.update(bArr4, 0, bArr4.length);
            this.harakaSXof.update(bitmask, 0, bitmask.length);
            this.harakaSXof.doFinal(bArr3, 0, i3);
            return bArr3;
        }

        public byte[] bitmask(ADRS adrs, byte[] bArr) {
            if (this.robust) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                HarakaSXof harakaSXof = this.harakaSXof;
                byte[] bArr3 = adrs.value;
                harakaSXof.update(bArr3, 0, bArr3.length);
                this.harakaSXof.doFinal(bArr2, 0, length);
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
                }
            }
            return bArr;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public void init(byte[] bArr) {
            HarakaSXof harakaSXof = new HarakaSXof(bArr);
            this.harakaSXof = harakaSXof;
            this.harakaS256Digest = new HarakaS256Digest(harakaSXof);
            this.harakaS512Digest = new HarakaS512Digest(this.harakaSXof);
        }
    }

    public static class Sha2Engine extends SPHINCSPlusEngine {
        private final int bl;
        private final byte[] hmacBuf;
        private final MGF1BytesGenerator mgf1;
        private final Digest msgDigest;
        private final byte[] msgDigestBuf;
        private Memoable msgMemo;
        private final Digest sha256;
        private final byte[] sha256Buf;
        private Memoable sha256Memo;
        private final HMac treeHMac;

        public Sha2Engine(boolean z2, int i3, int i10, int i11, int i12, int i13, int i14) {
            super(z2, i3, i10, i11, i12, i13, i14);
            int i15;
            SHA256Digest sHA256Digest = new SHA256Digest();
            this.sha256 = sHA256Digest;
            this.sha256Buf = new byte[sHA256Digest.getDigestSize()];
            if (i3 == 16) {
                this.msgDigest = new SHA256Digest();
                this.treeHMac = new HMac(new SHA256Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA256Digest());
                i15 = 64;
            } else {
                this.msgDigest = new SHA512Digest();
                this.treeHMac = new HMac(new SHA512Digest());
                this.mgf1 = new MGF1BytesGenerator(new SHA512Digest());
                i15 = 128;
            }
            this.bl = i15;
            this.hmacBuf = new byte[this.treeHMac.getMacSize()];
            this.msgDigestBuf = new byte[this.msgDigest.getDigestSize()];
        }

        private byte[] compressedADRS(ADRS adrs) {
            byte[] bArr = new byte[22];
            System.arraycopy(adrs.value, 3, bArr, 0, 1);
            System.arraycopy(adrs.value, 8, bArr, 1, 8);
            System.arraycopy(adrs.value, 19, bArr, 9, 1);
            System.arraycopy(adrs.value, 20, bArr, 10, 12);
            return bArr;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] compressedADRS = compressedADRS(adrs);
            if (this.robust) {
                bArr2 = bitmask256(Arrays.concatenate(bArr, compressedADRS), bArr2);
            }
            ((Memoable) this.sha256).reset(this.sha256Memo);
            this.sha256.update(compressedADRS, 0, compressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, this.f19474N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            byte[] compressedADRS = compressedADRS(adrs);
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(compressedADRS, 0, compressedADRS.length);
            if (this.robust) {
                byte[] bitmask = bitmask(Arrays.concatenate(bArr, compressedADRS), bArr2, bArr3);
                this.msgDigest.update(bitmask, 0, bitmask.length);
            } else {
                this.msgDigest.update(bArr2, 0, bArr2.length);
                this.msgDigest.update(bArr3, 0, bArr3.length);
            }
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.f19474N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i3 = ((this.f19470A * this.f19473K) + 7) / 8;
            int i10 = this.f19472H;
            int i11 = i10 / this.f19471D;
            int i12 = i10 - i11;
            int i13 = (i11 + 7) / 8;
            int i14 = (i12 + 7) / 8;
            byte[] bArr5 = new byte[this.msgDigest.getDigestSize()];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.update(bArr3, 0, bArr3.length);
            this.msgDigest.update(bArr4, 0, bArr4.length);
            this.msgDigest.doFinal(bArr5, 0);
            byte[] bitmask = bitmask(Arrays.concatenate(bArr, bArr2, bArr5), new byte[i3 + i13 + i14]);
            byte[] bArr6 = new byte[8];
            System.arraycopy(bitmask, i3, bArr6, 8 - i14, i14);
            long bigEndianToLong = Pack.bigEndianToLong(bArr6, 0) & ((-1) >>> (64 - i12));
            byte[] bArr7 = new byte[4];
            System.arraycopy(bitmask, i14 + i3, bArr7, 4 - i13, i13);
            return new IndexedDigest(bigEndianToLong, Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i11)), Arrays.copyOfRange(bitmask, 0, i3));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            int length = bArr2.length;
            ((Memoable) this.sha256).reset(this.sha256Memo);
            byte[] compressedADRS = compressedADRS(adrs);
            this.sha256.update(compressedADRS, 0, compressedADRS.length);
            this.sha256.update(bArr2, 0, bArr2.length);
            this.sha256.doFinal(this.sha256Buf, 0);
            return Arrays.copyOfRange(this.sha256Buf, 0, length);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.treeHMac.init(new KeyParameter(bArr));
            this.treeHMac.update(bArr2, 0, bArr2.length);
            this.treeHMac.update(bArr3, 0, bArr3.length);
            this.treeHMac.doFinal(this.hmacBuf, 0);
            return Arrays.copyOfRange(this.hmacBuf, 0, this.f19474N);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            byte[] compressedADRS = compressedADRS(adrs);
            if (this.robust) {
                bArr2 = bitmask(Arrays.concatenate(bArr, compressedADRS), bArr2);
            }
            ((Memoable) this.msgDigest).reset(this.msgMemo);
            this.msgDigest.update(compressedADRS, 0, compressedADRS.length);
            this.msgDigest.update(bArr2, 0, bArr2.length);
            this.msgDigest.doFinal(this.msgDigestBuf, 0);
            return Arrays.copyOfRange(this.msgDigestBuf, 0, this.f19474N);
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr3, 0, length);
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[i3]);
            }
            return bArr3;
        }

        public byte[] bitmask256(byte[] bArr, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            MGF1BytesGenerator mGF1BytesGenerator = new MGF1BytesGenerator(new SHA256Digest());
            mGF1BytesGenerator.init(new MGFParameters(bArr));
            mGF1BytesGenerator.generateBytes(bArr3, 0, length);
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[i3]);
            }
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public void init(byte[] bArr) {
            byte[] bArr2 = new byte[this.bl];
            this.msgDigest.update(bArr, 0, bArr.length);
            this.msgDigest.update(bArr2, 0, this.bl - this.f19474N);
            this.msgMemo = ((Memoable) this.msgDigest).copy();
            this.msgDigest.reset();
            this.sha256.update(bArr, 0, bArr.length);
            this.sha256.update(bArr2, 0, 64 - bArr.length);
            this.sha256Memo = ((Memoable) this.sha256).copy();
            this.sha256.reset();
        }

        public byte[] bitmask(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.mgf1.init(new MGFParameters(bArr));
            this.mgf1.generateBytes(bArr4, 0, length);
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr2[i3]);
            }
            for (int i10 = 0; i10 < bArr3.length; i10++) {
                int length2 = bArr2.length + i10;
                bArr4[length2] = (byte) (bArr4[length2] ^ bArr3[i10]);
            }
            return bArr4;
        }
    }

    public static class Shake256Engine extends SPHINCSPlusEngine {
        private final Xof maskDigest;
        private final Xof treeDigest;

        public Shake256Engine(boolean z2, int i3, int i10, int i11, int i12, int i13, int i14) {
            super(z2, i3, i10, i11, i12, i13, i14);
            this.treeDigest = new SHAKEDigest(256);
            this.maskDigest = new SHAKEDigest(256);
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2) {
            if (this.robust) {
                bArr2 = bitmask(bArr, adrs, bArr2);
            }
            int i3 = this.f19474N;
            byte[] bArr3 = new byte[i3];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i3);
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int i3 = this.f19474N;
            byte[] bArr4 = new byte[i3];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            if (this.robust) {
                byte[] bitmask = bitmask(bArr, adrs, bArr2, bArr3);
                this.treeDigest.update(bitmask, 0, bitmask.length);
            } else {
                this.treeDigest.update(bArr2, 0, bArr2.length);
                this.treeDigest.update(bArr3, 0, bArr3.length);
            }
            this.treeDigest.doFinal(bArr4, 0, i3);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            int i3 = ((this.f19470A * this.f19473K) + 7) / 8;
            int i10 = this.f19472H;
            int i11 = i10 / this.f19471D;
            int i12 = i10 - i11;
            int i13 = (i11 + 7) / 8;
            int i14 = (i12 + 7) / 8;
            int i15 = i3 + i13 + i14;
            byte[] bArr5 = new byte[i15];
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr4, 0, bArr4.length);
            this.treeDigest.doFinal(bArr5, 0, i15);
            byte[] bArr6 = new byte[8];
            System.arraycopy(bArr5, i3, bArr6, 8 - i14, i14);
            long bigEndianToLong = Pack.bigEndianToLong(bArr6, 0) & ((-1) >>> (64 - i12));
            byte[] bArr7 = new byte[4];
            System.arraycopy(bArr5, i14 + i3, bArr7, 4 - i13, i13);
            return new IndexedDigest(bigEndianToLong, Pack.bigEndianToInt(bArr7, 0) & ((-1) >>> (32 - i11)), Arrays.copyOfRange(bArr5, 0, i3));
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs) {
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr3 = adrs.value;
            xof.update(bArr3, 0, bArr3.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            int i3 = this.f19474N;
            byte[] bArr4 = new byte[i3];
            this.treeDigest.doFinal(bArr4, 0, i3);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.treeDigest.update(bArr, 0, bArr.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.update(bArr3, 0, bArr3.length);
            int i3 = this.f19474N;
            byte[] bArr4 = new byte[i3];
            this.treeDigest.doFinal(bArr4, 0, i3);
            return bArr4;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2) {
            if (this.robust) {
                bArr2 = bitmask(bArr, adrs, bArr2);
            }
            int i3 = this.f19474N;
            byte[] bArr3 = new byte[i3];
            this.treeDigest.update(bArr, 0, bArr.length);
            Xof xof = this.treeDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.treeDigest.update(bArr2, 0, bArr2.length);
            this.treeDigest.doFinal(bArr3, 0, i3);
            return bArr3;
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2) {
            int length = bArr2.length;
            byte[] bArr3 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr4 = adrs.value;
            xof.update(bArr4, 0, bArr4.length);
            this.maskDigest.doFinal(bArr3, 0, length);
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr2[i3]);
            }
            return bArr3;
        }

        @Override // org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusEngine
        public void init(byte[] bArr) {
        }

        public byte[] bitmask(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3) {
            int length = bArr2.length + bArr3.length;
            byte[] bArr4 = new byte[length];
            this.maskDigest.update(bArr, 0, bArr.length);
            Xof xof = this.maskDigest;
            byte[] bArr5 = adrs.value;
            xof.update(bArr5, 0, bArr5.length);
            this.maskDigest.doFinal(bArr4, 0, length);
            for (int i3 = 0; i3 < bArr2.length; i3++) {
                bArr4[i3] = (byte) (bArr4[i3] ^ bArr2[i3]);
            }
            for (int i10 = 0; i10 < bArr3.length; i10++) {
                int length2 = bArr2.length + i10;
                bArr4[length2] = (byte) (bArr4[length2] ^ bArr3[i10]);
            }
            return bArr4;
        }
    }

    public SPHINCSPlusEngine(boolean z2, int i3, int i10, int i11, int i12, int i13, int i14) {
        this.f19474N = i3;
        String string2 = StubApp.getString2(34190);
        if (i10 == 16) {
            this.WOTS_LOGW = 4;
            this.WOTS_LEN1 = (i3 * 8) / 4;
            if (i3 > 8) {
                if (i3 <= 136) {
                    this.WOTS_LEN2 = 3;
                } else {
                    if (i3 > 256) {
                        throw new IllegalArgumentException(string2);
                    }
                    this.WOTS_LEN2 = 4;
                }
                this.WOTS_W = i10;
                this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
                this.robust = z2;
                this.f19471D = i11;
                this.f19470A = i12;
                this.f19473K = i13;
                this.f19472H = i14;
                this.H_PRIME = i14 / i11;
                this.f19475T = 1 << i12;
            }
            this.WOTS_LEN2 = 2;
            this.WOTS_W = i10;
            this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
            this.robust = z2;
            this.f19471D = i11;
            this.f19470A = i12;
            this.f19473K = i13;
            this.f19472H = i14;
            this.H_PRIME = i14 / i11;
            this.f19475T = 1 << i12;
        }
        if (i10 != 256) {
            throw new IllegalArgumentException(StubApp.getString2(34191));
        }
        this.WOTS_LOGW = 8;
        this.WOTS_LEN1 = (i3 * 8) / 8;
        if (i3 <= 1) {
            this.WOTS_LEN2 = 1;
            this.WOTS_W = i10;
            this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
            this.robust = z2;
            this.f19471D = i11;
            this.f19470A = i12;
            this.f19473K = i13;
            this.f19472H = i14;
            this.H_PRIME = i14 / i11;
            this.f19475T = 1 << i12;
        }
        if (i3 > 256) {
            throw new IllegalArgumentException(string2);
        }
        this.WOTS_LEN2 = 2;
        this.WOTS_W = i10;
        this.WOTS_LEN = this.WOTS_LEN1 + this.WOTS_LEN2;
        this.robust = z2;
        this.f19471D = i11;
        this.f19470A = i12;
        this.f19473K = i13;
        this.f19472H = i14;
        this.H_PRIME = i14 / i11;
        this.f19475T = 1 << i12;
    }

    public abstract byte[] F(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract byte[] H(byte[] bArr, ADRS adrs, byte[] bArr2, byte[] bArr3);

    public abstract IndexedDigest H_msg(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public abstract byte[] PRF(byte[] bArr, byte[] bArr2, ADRS adrs);

    public abstract byte[] PRF_msg(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public abstract byte[] T_l(byte[] bArr, ADRS adrs, byte[] bArr2);

    public abstract void init(byte[] bArr);
}
