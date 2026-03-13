package org.bouncycastle.pqc.crypto.sphincsplus;

import java.lang.reflect.Array;
import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.ec.Tnaf;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HarakaSBase {
    protected long[][] haraka512_rc = {new long[]{2652350495371256459L, -4767360454786055294L, -2778808723033108313L, -6138960262205972599L, 4944264682582508575L, 5312892415214084856L, 390034814247088728L, 2584105839607850161L}, new long[]{-2829930801980875922L, 9137660425067592590L, 7974068014816832049L, -4665944065725157058L, 2602240152241800734L, -1525694355931290902L, 8634660511727056099L, 1757945485816280992L}, new long[]{1181946526362588450L, -2765192619992380293L, 3395396416743122529L, -5116273100549372423L, -1285454309797503998L, -3363297609815171261L, -8360835858392998991L, -2371352336613968487L}, new long[]{-2500853454776756032L, 8465221333286591414L, 8817016078209461823L, 9067727467981428858L, 4244107674518258433L, -4347326460570889538L, 1711371409274742987L, 6486926172609168623L}, new long[]{1689001080716996467L, -491496126278250673L, 1273395568185090836L, 5805238412293617850L, -3441289770925384855L, 4592753210857527691L, 7062886034259989751L, -7974393977033172556L}, new long[]{-797818098819718290L, -41460260651793472L, 476036171179798187L, 7391697506481003962L, -855662275170689475L, -3489340839585811635L, -4891525734487956488L, 9110006695579921767L}, new long[]{-886938081943560790L, 4212830408327159617L, -3546674487567282635L, -1955379422127038289L, 3174578079917510314L, 5156046680874954380L, -318545805834821831L, -6176414008149462342L}, new long[]{2529785914229181047L, 2966313764524854080L, 6363694428402697361L, 8292109690175819701L, -8497546332135459587L, -3211108476154815616L, -5526938793786642321L, -4975969843627057770L}, new long[]{3357847021085574721L, -4764837212565187058L, -626391829400648692L, 2124133995575340009L, 7425858999829294301L, -3432032868905637771L, 1119301198758921294L, 1907812968586478892L}, new long[]{-8986524826712832802L, 3356175496741300052L, -5764600317639896362L, 4002747967109689317L, -8718925159733497197L, -1938063772587374661L, -8003749789895945835L, 7302960353763723932L}};
    protected int[][] haraka256_rc = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 10, 8);
    protected final byte[] buffer = new byte[64];
    protected int off = 0;

    private void Swapn(long[] jArr, int i3, int i10, int i11) {
        long j;
        long j3;
        if (i3 == 1) {
            j = 6148914691236517205L;
            j3 = -6148914691236517206L;
        } else if (i3 == 2) {
            j = 3689348814741910323L;
            j3 = -3689348814741910324L;
        } else {
            if (i3 != 4) {
                return;
            }
            j = 1085102592571150095L;
            j3 = -1085102592571150096L;
        }
        long j10 = jArr[i10];
        long j11 = jArr[i11];
        jArr[i10] = ((j & j11) << i3) | (j10 & j);
        jArr[i11] = ((j10 & j3) >>> i3) | (j11 & j3);
    }

    private void Swapn32(int[] iArr, int i3, int i10, int i11) {
        int i12;
        int i13;
        if (i3 == 1) {
            i12 = 1431655765;
            i13 = -1431655766;
        } else if (i3 == 2) {
            i12 = 858993459;
            i13 = -858993460;
        } else if (i3 != 4) {
            i12 = 0;
            i13 = 0;
        } else {
            i12 = 252645135;
            i13 = -252645136;
        }
        int i14 = iArr[i10];
        int i15 = iArr[i11];
        iArr[i10] = ((i12 & i15) << i3) | (i14 & i12);
        iArr[i11] = ((i14 & i13) >>> i3) | (i15 & i13);
    }

    private void addRoundKey(long[] jArr, long[] jArr2) {
        jArr[0] = jArr[0] ^ jArr2[0];
        jArr[1] = jArr[1] ^ jArr2[1];
        jArr[2] = jArr[2] ^ jArr2[2];
        jArr[3] = jArr[3] ^ jArr2[3];
        jArr[4] = jArr[4] ^ jArr2[4];
        jArr[5] = jArr[5] ^ jArr2[5];
        jArr[6] = jArr[6] ^ jArr2[6];
        jArr[7] = jArr[7] ^ jArr2[7];
    }

    private void addRoundKey32(int[] iArr, int[] iArr2) {
        iArr[0] = iArr[0] ^ iArr2[0];
        iArr[1] = iArr[1] ^ iArr2[1];
        iArr[2] = iArr[2] ^ iArr2[2];
        iArr[3] = iArr[3] ^ iArr2[3];
        iArr[4] = iArr[4] ^ iArr2[4];
        iArr[5] = iArr[5] ^ iArr2[5];
        iArr[6] = iArr[6] ^ iArr2[6];
        iArr[7] = iArr2[7] ^ iArr[7];
    }

    private void brAesCt64BitsliceSbox(long[] jArr) {
        long j = jArr[7];
        long j3 = jArr[6];
        long j10 = jArr[5];
        long j11 = jArr[4];
        long j12 = jArr[3];
        long j13 = jArr[2];
        long j14 = jArr[1];
        long j15 = jArr[0];
        long j16 = j11 ^ j13;
        long j17 = j ^ j14;
        long j18 = j ^ j11;
        long j19 = j ^ j13;
        long j20 = j10 ^ j3;
        long j21 = j20 ^ j15;
        long j22 = j21 ^ j11;
        long j23 = j17 ^ j16;
        long j24 = j21 ^ j;
        long j25 = j21 ^ j14;
        long j26 = j25 ^ j19;
        long j27 = j12 ^ j23;
        long j28 = j27 ^ j13;
        long j29 = j3 ^ j27;
        long j30 = j28 ^ j15;
        long j31 = j28 ^ j20;
        long j32 = j29 ^ j18;
        long j33 = j15 ^ j32;
        long j34 = j31 ^ j32;
        long j35 = j20 ^ j32;
        long j36 = j23 & j28;
        long j37 = (j26 & j30) ^ j36;
        long j38 = j17 & j35;
        long j39 = (j25 & j21) ^ j38;
        long j40 = j18 & j32;
        long j41 = (j16 & j34) ^ j40;
        long j42 = (j19 & j31) ^ j40;
        long j43 = (j37 ^ j41) ^ j29;
        long j44 = (((j22 & j15) ^ j36) ^ j42) ^ (j31 ^ j19);
        long j45 = (j39 ^ j41) ^ (j17 ^ j35);
        long j46 = (((j24 & j33) ^ j38) ^ j42) ^ (j ^ j35);
        long j47 = j43 ^ j44;
        long j48 = j43 & j45;
        long j49 = j46 ^ j48;
        long j50 = (j47 & j49) ^ j44;
        long j51 = ((j44 ^ j48) & (j45 ^ j46)) ^ j46;
        long j52 = j46 & (j49 ^ j51);
        long j53 = j52 ^ (j45 ^ j51);
        long j54 = j47 ^ (j50 & (j49 ^ j52));
        long j55 = j54 ^ j53;
        long j56 = j50 ^ j51;
        long j57 = j50 ^ j54;
        long j58 = j51 ^ j53;
        long j59 = j56 ^ j55;
        long j60 = j51 & j15;
        long j61 = j57 & j35;
        long j62 = j54 & j21;
        long j63 = j50 & j33;
        long j64 = j59 & j34;
        long j65 = j53 & j26;
        long j66 = j51 & j22;
        long j67 = j57 & j17;
        long j68 = j54 & j25;
        long j69 = j56 & j18;
        long j70 = j59 & j16;
        long j71 = j55 & j19;
        long j72 = j69 ^ j70;
        long j73 = j63 ^ j68;
        long j74 = (j58 & j23) ^ j65;
        long j75 = (j58 & j28) ^ j61;
        long j76 = j70 ^ j71;
        long j77 = (j60 ^ j67) ^ j75;
        long j78 = j62 ^ j72;
        long j79 = j61 ^ ((j56 & j32) ^ j64);
        long j80 = j72 ^ j77;
        long j81 = (j50 & j24) ^ j77;
        long j82 = (j64 ^ (j55 & j31)) ^ j78;
        long j83 = j74 ^ j78;
        long j84 = j62 ^ j79;
        long j85 = j81 ^ j82;
        long j86 = (j53 & j30) ^ j83;
        long j87 = (~j82) ^ (j67 ^ j73);
        long j88 = j73 ^ (~j80);
        long j89 = j75 ^ j86;
        long j90 = j84 ^ (~j89);
        long j91 = j76 ^ (~(j84 ^ j85));
        jArr[7] = j79 ^ j83;
        jArr[6] = j90;
        jArr[5] = j91;
        jArr[4] = j89;
        jArr[3] = (j60 ^ j63) ^ j86;
        jArr[2] = (j65 ^ j66) ^ j85;
        jArr[1] = j87;
        jArr[0] = j88;
    }

    private void brAesCt64InterleaveIn(long[] jArr, int i3, int[] iArr, int i10) {
        long j = iArr[i10] & BodyPartID.bodyIdMax;
        long j3 = iArr[i10 + 1] & BodyPartID.bodyIdMax;
        long j10 = iArr[i10 + 2] & BodyPartID.bodyIdMax;
        long j11 = iArr[i10 + 3] & BodyPartID.bodyIdMax;
        long j12 = (j | (j << 16)) & 281470681808895L;
        long j13 = (j3 | (j3 << 16)) & 281470681808895L;
        long j14 = (j10 | (j10 << 16)) & 281470681808895L;
        long j15 = (j11 | (j11 << 16)) & 281470681808895L;
        jArr[i3] = ((j12 | (j12 << 8)) & 71777214294589695L) | (((j14 | (j14 << 8)) & 71777214294589695L) << 8);
        jArr[i3 + 4] = (((j15 | (j15 << 8)) & 71777214294589695L) << 8) | ((j13 | (j13 << 8)) & 71777214294589695L);
    }

    private void brAesCt64InterleaveOut(int[] iArr, long[] jArr, int i3) {
        long j = jArr[i3];
        long j3 = j & 71777214294589695L;
        long j10 = jArr[i3 + 4];
        long j11 = j10 & 71777214294589695L;
        long j12 = (j >>> 8) & 71777214294589695L;
        long j13 = 71777214294589695L & (j10 >>> 8);
        long j14 = (j3 | (j3 >>> 8)) & 281470681808895L;
        long j15 = ((j11 >>> 8) | j11) & 281470681808895L;
        long j16 = (j12 | (j12 >>> 8)) & 281470681808895L;
        long j17 = (j13 | (j13 >>> 8)) & 281470681808895L;
        int i10 = i3 << 2;
        iArr[i10] = (int) (j14 | (j14 >>> 16));
        iArr[i10 + 1] = (int) (j15 | (j15 >>> 16));
        iArr[i10 + 2] = (int) (j16 | (j16 >>> 16));
        iArr[i10 + 3] = (int) ((j17 >>> 16) | j17);
    }

    private void brAesCt64Ortho(long[] jArr) {
        Swapn(jArr, 1, 0, 1);
        Swapn(jArr, 1, 2, 3);
        Swapn(jArr, 1, 4, 5);
        Swapn(jArr, 1, 6, 7);
        Swapn(jArr, 2, 0, 2);
        Swapn(jArr, 2, 1, 3);
        Swapn(jArr, 2, 4, 6);
        Swapn(jArr, 2, 5, 7);
        Swapn(jArr, 4, 0, 4);
        Swapn(jArr, 4, 1, 5);
        Swapn(jArr, 4, 2, 6);
        Swapn(jArr, 4, 3, 7);
    }

    private static void brAesCtBitsliceSbox(int[] iArr) {
        int i3 = iArr[7];
        int i10 = iArr[6];
        int i11 = iArr[5];
        int i12 = iArr[4];
        int i13 = iArr[3];
        int i14 = iArr[2];
        int i15 = iArr[1];
        int i16 = iArr[0];
        int i17 = i12 ^ i14;
        int i18 = i3 ^ i15;
        int i19 = i3 ^ i12;
        int i20 = i3 ^ i14;
        int i21 = i11 ^ i10;
        int i22 = i21 ^ i16;
        int i23 = i22 ^ i12;
        int i24 = i18 ^ i17;
        int i25 = i22 ^ i3;
        int i26 = i22 ^ i15;
        int i27 = i26 ^ i20;
        int i28 = i13 ^ i24;
        int i29 = i14 ^ i28;
        int i30 = i10 ^ i28;
        int i31 = i29 ^ i16;
        int i32 = i29 ^ i21;
        int i33 = i30 ^ i19;
        int i34 = i16 ^ i33;
        int i35 = i32 ^ i33;
        int i36 = i21 ^ i33;
        int i37 = i24 & i29;
        int i38 = (i27 & i31) ^ i37;
        int i39 = i18 & i36;
        int i40 = (i26 & i22) ^ i39;
        int i41 = i19 & i33;
        int i42 = (i17 & i35) ^ i41;
        int i43 = (i20 & i32) ^ i41;
        int i44 = (i38 ^ i42) ^ i30;
        int i45 = (((i23 & i16) ^ i37) ^ i43) ^ (i32 ^ i20);
        int i46 = (i40 ^ i42) ^ (i18 ^ i36);
        int i47 = (((i25 & i34) ^ i39) ^ i43) ^ (i3 ^ i36);
        int i48 = i44 ^ i45;
        int i49 = i44 & i46;
        int i50 = i47 ^ i49;
        int i51 = (i48 & i50) ^ i45;
        int i52 = ((i45 ^ i49) & (i46 ^ i47)) ^ i47;
        int i53 = i47 & (i50 ^ i52);
        int i54 = i53 ^ (i46 ^ i52);
        int i55 = i48 ^ (i51 & (i50 ^ i53));
        int i56 = i55 ^ i54;
        int i57 = i51 ^ i52;
        int i58 = i51 ^ i55;
        int i59 = i52 ^ i54;
        int i60 = i57 ^ i56;
        int i61 = i16 & i52;
        int i62 = i58 & i36;
        int i63 = i55 & i22;
        int i64 = i51 & i34;
        int i65 = i60 & i35;
        int i66 = i54 & i27;
        int i67 = i52 & i23;
        int i68 = i58 & i18;
        int i69 = i55 & i26;
        int i70 = i57 & i19;
        int i71 = i60 & i17;
        int i72 = i56 & i20;
        int i73 = i70 ^ i71;
        int i74 = i64 ^ i69;
        int i75 = (i59 & i24) ^ i66;
        int i76 = (i59 & i29) ^ i62;
        int i77 = i71 ^ i72;
        int i78 = (i61 ^ i68) ^ i76;
        int i79 = i63 ^ i73;
        int i80 = i62 ^ ((i57 & i33) ^ i65);
        int i81 = i73 ^ i78;
        int i82 = (i51 & i25) ^ i78;
        int i83 = (i65 ^ (i56 & i32)) ^ i79;
        int i84 = i75 ^ i79;
        int i85 = i63 ^ i80;
        int i86 = i82 ^ i83;
        int i87 = (i54 & i31) ^ i84;
        int i88 = (~i83) ^ (i68 ^ i74);
        int i89 = (~i81) ^ i74;
        int i90 = i76 ^ i87;
        int i91 = i85 ^ (~i90);
        int i92 = i77 ^ (~(i85 ^ i86));
        iArr[7] = i80 ^ i84;
        iArr[6] = i91;
        iArr[5] = i92;
        iArr[4] = i90;
        iArr[3] = i87 ^ (i61 ^ i64);
        iArr[2] = (i66 ^ i67) ^ i86;
        iArr[1] = i88;
        iArr[0] = i89;
    }

    private void brAesCtOrtho(int[] iArr) {
        Swapn32(iArr, 1, 0, 1);
        Swapn32(iArr, 1, 2, 3);
        Swapn32(iArr, 1, 4, 5);
        Swapn32(iArr, 1, 6, 7);
        Swapn32(iArr, 2, 0, 2);
        Swapn32(iArr, 2, 1, 3);
        Swapn32(iArr, 2, 4, 6);
        Swapn32(iArr, 2, 5, 7);
        Swapn32(iArr, 4, 0, 4);
        Swapn32(iArr, 4, 1, 5);
        Swapn32(iArr, 4, 2, 6);
        Swapn32(iArr, 4, 3, 7);
    }

    private int brDec32Le(byte[] bArr, int i3) {
        return (bArr[i3 + 3] << 24) | (bArr[i3] & UByte.MAX_VALUE) | ((bArr[i3 + 1] << 8) & 65280) | ((bArr[i3 + 2] << Tnaf.POW_2_WIDTH) & 16711680);
    }

    private void brEnc32Le(byte[] bArr, int i3, int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i10 + i11] = (byte) (i3 >> (i11 << 3));
        }
    }

    private void brRangeDec32Le(byte[] bArr, int[] iArr, int i3) {
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = (i10 << 2) + i3;
            iArr[i10] = (bArr[i11 + 3] << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] << 8) & 65280) | ((bArr[i11 + 2] << 16) & 16711680);
        }
    }

    private void mixColumns(long[] jArr) {
        long j = jArr[0];
        long j3 = jArr[1];
        long j10 = jArr[2];
        long j11 = jArr[3];
        long j12 = jArr[4];
        long j13 = jArr[5];
        long j14 = jArr[6];
        long j15 = jArr[7];
        long j16 = (j >>> 16) | (j << 48);
        long j17 = (j3 >>> 16) | (j3 << 48);
        long j18 = (j10 >>> 16) | (j10 << 48);
        long j19 = (j11 >>> 16) | (j11 << 48);
        long j20 = (j12 >>> 16) | (j12 << 48);
        long j21 = (j13 >>> 16) | (j13 << 48);
        long j22 = (j14 >>> 16) | (j14 << 48);
        long j23 = (j15 >>> 16) | (j15 << 48);
        long j24 = j15 ^ j23;
        long j25 = j ^ j16;
        jArr[0] = (j24 ^ j16) ^ rotr32(j25);
        long j26 = j3 ^ j17;
        jArr[1] = (((j25 ^ j15) ^ j23) ^ j17) ^ rotr32(j26);
        long j27 = j10 ^ j18;
        jArr[2] = (j26 ^ j18) ^ rotr32(j27);
        long j28 = ((j27 ^ j15) ^ j23) ^ j19;
        long j29 = j11 ^ j19;
        jArr[3] = j28 ^ rotr32(j29);
        long j30 = ((j29 ^ j15) ^ j23) ^ j20;
        long j31 = j12 ^ j20;
        jArr[4] = j30 ^ rotr32(j31);
        long j32 = j31 ^ j21;
        long j33 = j13 ^ j21;
        jArr[5] = j32 ^ rotr32(j33);
        long j34 = j33 ^ j22;
        long j35 = j14 ^ j22;
        jArr[6] = j34 ^ rotr32(j35);
        jArr[7] = rotr32(j24) ^ (j35 ^ j23);
    }

    private void mixColumns32(int[] iArr) {
        int i3 = iArr[0];
        int i10 = iArr[1];
        int i11 = iArr[2];
        int i12 = iArr[3];
        int i13 = iArr[4];
        int i14 = iArr[5];
        int i15 = iArr[6];
        int i16 = iArr[7];
        int i17 = (i3 >>> 8) | (i3 << 24);
        int i18 = (i10 >>> 8) | (i10 << 24);
        int i19 = (i11 >>> 8) | (i11 << 24);
        int i20 = (i12 >>> 8) | (i12 << 24);
        int i21 = (i13 >>> 8) | (i13 << 24);
        int i22 = (i14 >>> 8) | (i14 << 24);
        int i23 = (i15 >>> 8) | (i15 << 24);
        int i24 = (i16 >>> 8) | (i16 << 24);
        int i25 = i16 ^ i24;
        int i26 = i3 ^ i17;
        iArr[0] = (i25 ^ i17) ^ rotr16(i26);
        int i27 = i10 ^ i18;
        iArr[1] = (((i26 ^ i16) ^ i24) ^ i18) ^ rotr16(i27);
        int i28 = i11 ^ i19;
        iArr[2] = (i27 ^ i19) ^ rotr16(i28);
        int i29 = ((i28 ^ i16) ^ i24) ^ i20;
        int i30 = i12 ^ i20;
        iArr[3] = i29 ^ rotr16(i30);
        int i31 = ((i30 ^ i16) ^ i24) ^ i21;
        int i32 = i13 ^ i21;
        iArr[4] = i31 ^ rotr16(i32);
        int i33 = i32 ^ i22;
        int i34 = i14 ^ i22;
        iArr[5] = i33 ^ rotr16(i34);
        int i35 = i34 ^ i23;
        int i36 = i15 ^ i23;
        iArr[6] = i35 ^ rotr16(i36);
        iArr[7] = rotr16(i25) ^ (i36 ^ i24);
    }

    private int rotr16(int i3) {
        return (i3 >>> 16) | (i3 << 16);
    }

    private long rotr32(long j) {
        return (j >>> 32) | (j << 32);
    }

    private void shiftRows(long[] jArr) {
        for (int i3 = 0; i3 < jArr.length; i3++) {
            long j = jArr[i3];
            jArr[i3] = ((j & 1152640029630136320L) << 4) | (65535 & j) | ((4293918720L & j) >>> 4) | ((983040 & j) << 12) | ((280375465082880L & j) >>> 8) | ((1095216660480L & j) << 8) | (((-1152921504606846976L) & j) >>> 12);
        }
    }

    private void shiftRows32(int[] iArr) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i10 = iArr[i3];
            iArr[i3] = ((i10 & 1056964608) << 2) | (i10 & 255) | ((64512 & i10) >>> 2) | ((i10 & 768) << 6) | ((15728640 & i10) >>> 4) | ((983040 & i10) << 4) | (((-1073741824) & i10) >>> 6);
        }
    }

    public void haraka256Perm(byte[] bArr) {
        int[] iArr = new int[8];
        interleaveConstant32(iArr, this.buffer, 0);
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i10 = 0; i10 < 2; i10++) {
                brAesCtBitsliceSbox(iArr);
                shiftRows32(iArr);
                mixColumns32(iArr);
                addRoundKey32(iArr, this.haraka256_rc[(i3 << 1) + i10]);
            }
            for (int i11 = 0; i11 < 8; i11++) {
                int i12 = iArr[i11];
                iArr[i11] = ((i12 & 1077952576) >>> 1) | ((-2122219135) & i12) | ((33686018 & i12) << 1) | ((67372036 & i12) << 2) | ((134744072 & i12) << 3) | ((269488144 & i12) >>> 3) | ((538976288 & i12) >>> 2);
            }
        }
        brAesCtOrtho(iArr);
        for (int i13 = 0; i13 < 4; i13++) {
            int i14 = i13 << 1;
            int i15 = i13 << 2;
            brEnc32Le(bArr, iArr[i14], i15);
            brEnc32Le(bArr, iArr[i14 + 1], i15 + 16);
        }
        for (int i16 = 0; i16 < 32; i16++) {
            bArr[i16] = (byte) (bArr[i16] ^ this.buffer[i16]);
        }
    }

    public void haraka512Perm(byte[] bArr) {
        int[] iArr = new int[16];
        long[] jArr = new long[8];
        brRangeDec32Le(this.buffer, iArr, 0);
        for (int i3 = 0; i3 < 4; i3++) {
            brAesCt64InterleaveIn(jArr, i3, iArr, i3 << 2);
        }
        brAesCt64Ortho(jArr);
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 2; i11++) {
                brAesCt64BitsliceSbox(jArr);
                shiftRows(jArr);
                mixColumns(jArr);
                addRoundKey(jArr, this.haraka512_rc[(i10 << 1) + i11]);
            }
            for (int i12 = 0; i12 < 8; i12++) {
                long j = jArr[i12];
                jArr[i12] = ((j & (-8934996522953571328L)) >>> 3) | ((281479271743489L & j) << 5) | ((562958543486978L & j) << 12) | ((1125917086973956L & j) >>> 1) | ((2251834173947912L & j) << 6) | ((9007336695791648L & j) << 9) | ((18014673391583296L & j) >>> 4) | ((36029346783166592L & j) << 3) | ((2377936887688995072L & j) >>> 5) | ((148621055480562192L & j) << 2) | ((576469548530665472L & j) << 4) | ((1152939097061330944L & j) >>> 12) | ((4611756388245323776L & j) >>> 10);
            }
        }
        brAesCt64Ortho(jArr);
        for (int i13 = 0; i13 < 4; i13++) {
            brAesCt64InterleaveOut(iArr, jArr, i13);
        }
        for (int i14 = 0; i14 < 16; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                bArr[(i14 << 2) + i15] = (byte) ((iArr[i14] >>> (i15 << 3)) & 255);
            }
        }
    }

    public void interleaveConstant(long[] jArr, byte[] bArr, int i3) {
        int[] iArr = new int[16];
        brRangeDec32Le(bArr, iArr, i3);
        for (int i10 = 0; i10 < 4; i10++) {
            brAesCt64InterleaveIn(jArr, i10, iArr, i10 << 2);
        }
        brAesCt64Ortho(jArr);
    }

    public void interleaveConstant32(int[] iArr, byte[] bArr, int i3) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 << 1;
            int i12 = (i10 << 2) + i3;
            iArr[i11] = brDec32Le(bArr, i12);
            iArr[i11 + 1] = brDec32Le(bArr, i12 + 16);
        }
        brAesCtOrtho(iArr);
    }

    public void reset() {
        this.off = 0;
        Arrays.clear(this.buffer);
    }
}
