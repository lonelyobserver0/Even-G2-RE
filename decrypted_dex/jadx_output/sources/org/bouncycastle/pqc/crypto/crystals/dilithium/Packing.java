package org.bouncycastle.pqc.crypto.crystals.dilithium;

import kotlin.UByte;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Packing {
    public static byte[] packPublicKey(PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr = new byte[dilithiumEngine.getCryptoPublicKeyBytes() - 32];
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumK(); i3++) {
            System.arraycopy(polyVecK.getVectorIndex(i3).polyt1Pack(), 0, bArr, i3 * DilithiumEngine.DilithiumPolyT1PackedBytes, DilithiumEngine.DilithiumPolyT1PackedBytes);
        }
        return bArr;
    }

    public static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, DilithiumEngine dilithiumEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumL(); i3++) {
            polyVecL.getVectorIndex(i3).polyEtaPack(bArr4[3], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i3);
        }
        bArr4[4] = new byte[dilithiumEngine.getDilithiumK() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumK(); i10++) {
            polyVecK2.getVectorIndex(i10).polyEtaPack(bArr4[4], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i10);
        }
        bArr4[5] = new byte[dilithiumEngine.getDilithiumK() * DilithiumEngine.DilithiumPolyT0PackedBytes];
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumK(); i11++) {
            polyVecK.getVectorIndex(i11).polyt0Pack(bArr4[5], i11 * DilithiumEngine.DilithiumPolyT0PackedBytes);
        }
        return bArr4;
    }

    public static byte[] packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr2 = new byte[dilithiumEngine.getCryptoBytes()];
        System.arraycopy(bArr, 0, bArr2, 0, 32);
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumL(); i3++) {
            System.arraycopy(polyVecL.getVectorIndex(i3).zPack(), 0, bArr2, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i3) + 32, dilithiumEngine.getDilithiumPolyZPackedBytes());
        }
        int dilithiumL = (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes()) + 32;
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumOmega() + dilithiumEngine.getDilithiumK(); i10++) {
            bArr2[dilithiumL + i10] = 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumK(); i12++) {
            for (int i13 = 0; i13 < 256; i13++) {
                if (polyVecK.getVectorIndex(i12).getCoeffIndex(i13) != 0) {
                    bArr2[i11 + dilithiumL] = (byte) i13;
                    i11++;
                }
            }
            bArr2[dilithiumEngine.getDilithiumOmega() + dilithiumL + i12] = (byte) i11;
        }
        return bArr2;
    }

    public static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int i3 = 0;
        while (i3 < dilithiumEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i3);
            int i10 = i3 * DilithiumEngine.DilithiumPolyT1PackedBytes;
            i3++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i10, (i3 * DilithiumEngine.DilithiumPolyT1PackedBytes) + 32));
        }
        return polyVecK;
    }

    public static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, DilithiumEngine dilithiumEngine) {
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumL(); i3++) {
            polyVecL.getVectorIndex(i3).polyEtaUnpack(bArr2, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i3);
        }
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumK(); i10++) {
            polyVecK2.getVectorIndex(i10).polyEtaUnpack(bArr3, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i10);
        }
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumK(); i11++) {
            polyVecK.getVectorIndex(i11).polyt0Unpack(bArr, i11 * DilithiumEngine.DilithiumPolyT0PackedBytes);
        }
    }

    public static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int i3 = 0;
        while (i3 < dilithiumEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i3);
            int dilithiumPolyZPackedBytes = (dilithiumEngine.getDilithiumPolyZPackedBytes() * i3) + 32;
            i3++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i3) + 32));
        }
        int dilithiumL = (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes()) + 32;
        int i10 = 0;
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumK(); i11++) {
            for (int i12 = 0; i12 < 256; i12++) {
                polyVecK.getVectorIndex(i11).setCoeffIndex(i12, 0);
            }
            if ((bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i11] & 255) < i10 || (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i11] & 255) > dilithiumEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i13 = i10; i13 < (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i11] & 255); i13++) {
                if (i13 > i10) {
                    int i14 = dilithiumL + i13;
                    if ((bArr[i14] & UByte.MAX_VALUE) <= (bArr[i14 - 1] & UByte.MAX_VALUE)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i11).setCoeffIndex(bArr[dilithiumL + i13] & UByte.MAX_VALUE, 1);
            }
            i10 = bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i11];
        }
        while (i10 < dilithiumEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i10] & UByte.MAX_VALUE) != 0) {
                return false;
            }
            i10++;
        }
        return true;
    }
}
