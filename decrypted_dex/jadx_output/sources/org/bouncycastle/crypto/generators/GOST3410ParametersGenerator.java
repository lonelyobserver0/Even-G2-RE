package org.bouncycastle.crypto.generators;

import com.stub.StubApp;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.crypto.params.GOST3410ValidationParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST3410ParametersGenerator {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private SecureRandom init_random;
    private int size;
    private int typeproc;

    private int procedure_A(int i3, int i10, BigInteger[] bigIntegerArr, int i11) {
        int i12;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i13;
        BigInteger bigInteger2;
        BigInteger bigInteger3;
        int i14 = i3;
        while (true) {
            if (i14 >= 0 && i14 <= 65536) {
                break;
            }
            i14 = this.init_random.nextInt() / 32768;
        }
        int i15 = i10;
        while (true) {
            i12 = 1;
            if (i15 >= 0 && i15 <= 65536 && i15 / 2 != 0) {
                break;
            }
            i15 = (this.init_random.nextInt() / 32768) + 1;
        }
        BigInteger bigInteger4 = new BigInteger(Integer.toString(i15));
        BigInteger bigInteger5 = new BigInteger(StubApp.getString2(28913));
        BigInteger bigInteger6 = new BigInteger(Integer.toString(i14));
        int i16 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger6};
        int[] iArr = {i11};
        int i17 = 0;
        int i18 = 0;
        while (iArr[i17] >= 17) {
            int length = iArr.length + 1;
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            iArr = new int[length];
            System.arraycopy(iArr2, 0, iArr, 0, length);
            i18 = i17 + 1;
            iArr[i18] = iArr[i17] / 2;
            i17 = i18;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i18 + 1];
        int i19 = 16;
        bigIntegerArr4[i18] = new BigInteger(StubApp.getString2(17364), 16);
        int i20 = i18 - 1;
        int i21 = 0;
        while (true) {
            if (i21 >= i18) {
                bigInteger = bigIntegerArr3[i16];
                break;
            }
            int i22 = iArr[i20] / i19;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i16, bigIntegerArr5, i16, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i22 + 1];
                System.arraycopy(bigIntegerArr5, i16, bigIntegerArr2, i16, length2);
                int i23 = i16;
                while (i23 < i22) {
                    int i24 = i23 + 1;
                    bigIntegerArr2[i24] = bigIntegerArr2[i23].multiply(bigInteger5).add(bigInteger4).mod(TWO.pow(i19));
                    i23 = i24;
                }
                BigInteger bigInteger7 = new BigInteger(StubApp.getString2(824));
                int i25 = i16;
                while (i25 < i22) {
                    bigInteger7 = bigInteger7.add(bigIntegerArr2[i25].multiply(TWO.pow(i25 * 16)));
                    i25++;
                    i16 = i16;
                }
                i13 = i16;
                bigIntegerArr2[i13] = bigIntegerArr2[i22];
                BigInteger bigInteger8 = TWO;
                int i26 = i20 + 1;
                BigInteger add = bigInteger8.pow(iArr[i20] - i12).divide(bigIntegerArr4[i26]).add(bigInteger8.pow(iArr[i20] - i12).multiply(bigInteger7).divide(bigIntegerArr4[i26].multiply(bigInteger8.pow(i22 * 16))));
                BigInteger mod = add.mod(bigInteger8);
                BigInteger bigInteger9 = ONE;
                if (mod.compareTo(bigInteger9) == 0) {
                    add = add.add(bigInteger9);
                }
                BigInteger bigInteger10 = add;
                int i27 = i13;
                while (true) {
                    bigInteger2 = bigInteger4;
                    bigInteger3 = bigInteger5;
                    long j = i27;
                    BigInteger multiply = bigIntegerArr4[i26].multiply(bigInteger10.add(BigInteger.valueOf(j)));
                    BigInteger bigInteger11 = ONE;
                    BigInteger add2 = multiply.add(bigInteger11);
                    bigIntegerArr4[i20] = add2;
                    BigInteger bigInteger12 = TWO;
                    int i28 = i27;
                    if (add2.compareTo(bigInteger12.pow(iArr[i20])) != 1) {
                        if (bigInteger12.modPow(bigIntegerArr4[i26].multiply(bigInteger10.add(BigInteger.valueOf(j))), bigIntegerArr4[i20]).compareTo(bigInteger11) == 0 && bigInteger12.modPow(bigInteger10.add(BigInteger.valueOf(j)), bigIntegerArr4[i20]).compareTo(bigInteger11) != 0) {
                            break;
                        }
                        i27 = i28 + 2;
                        bigInteger4 = bigInteger2;
                        bigInteger5 = bigInteger3;
                    } else {
                        break;
                    }
                }
                i16 = i13;
                i12 = 1;
                bigInteger4 = bigInteger2;
                bigInteger5 = bigInteger3;
                bigIntegerArr3 = bigIntegerArr2;
                i19 = 16;
            }
            i20--;
            if (i20 < 0) {
                bigIntegerArr[i13] = bigIntegerArr4[i13];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i13];
                break;
            }
            i21++;
            i16 = i13;
            bigInteger4 = bigInteger2;
            bigInteger5 = bigInteger3;
            bigIntegerArr3 = bigIntegerArr2;
            i12 = 1;
            i19 = 16;
        }
        return bigInteger.intValue();
    }

    private long procedure_Aa(long j, long j3, BigInteger[] bigIntegerArr, int i3) {
        int i10;
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr2;
        int i11;
        int[] iArr;
        BigInteger bigInteger2;
        long j10 = j;
        while (true) {
            if (j10 >= 0 && j10 <= 4294967296L) {
                break;
            }
            j10 = this.init_random.nextInt() * 2;
        }
        long j11 = j3;
        while (true) {
            i10 = 1;
            if (j11 >= 0 && j11 <= 4294967296L && j11 / 2 != 0) {
                break;
            }
            j11 = (this.init_random.nextInt() * 2) + 1;
        }
        BigInteger bigInteger3 = new BigInteger(Long.toString(j11));
        BigInteger bigInteger4 = new BigInteger(StubApp.getString2(28914));
        BigInteger bigInteger5 = new BigInteger(Long.toString(j10));
        int i12 = 0;
        BigInteger[] bigIntegerArr3 = {bigInteger5};
        int[] iArr2 = {i3};
        int i13 = 0;
        int i14 = 0;
        while (iArr2[i13] >= 33) {
            int length = iArr2.length + 1;
            int[] iArr3 = new int[length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            iArr2 = new int[length];
            System.arraycopy(iArr3, 0, iArr2, 0, length);
            i14 = i13 + 1;
            iArr2[i14] = iArr2[i13] / 2;
            i13 = i14;
        }
        BigInteger[] bigIntegerArr4 = new BigInteger[i14 + 1];
        bigIntegerArr4[i14] = new BigInteger(StubApp.getString2(28915), 16);
        int i15 = i14 - 1;
        int i16 = 0;
        while (true) {
            if (i16 >= i14) {
                bigInteger = bigIntegerArr3[i12];
                break;
            }
            int i17 = 32;
            int i18 = iArr2[i15] / 32;
            while (true) {
                int length2 = bigIntegerArr3.length;
                BigInteger[] bigIntegerArr5 = new BigInteger[length2];
                System.arraycopy(bigIntegerArr3, i12, bigIntegerArr5, i12, bigIntegerArr3.length);
                bigIntegerArr2 = new BigInteger[i18 + 1];
                System.arraycopy(bigIntegerArr5, i12, bigIntegerArr2, i12, length2);
                int i19 = i12;
                while (i19 < i18) {
                    int i20 = i19 + 1;
                    bigIntegerArr2[i20] = bigIntegerArr2[i19].multiply(bigInteger4).add(bigInteger3).mod(TWO.pow(i17));
                    i19 = i20;
                }
                BigInteger bigInteger6 = new BigInteger(StubApp.getString2(824));
                int i21 = i12;
                while (i21 < i18) {
                    bigInteger6 = bigInteger6.add(bigIntegerArr2[i21].multiply(TWO.pow(i21 * 32)));
                    i21++;
                    i12 = i12;
                }
                i11 = i12;
                bigIntegerArr2[i11] = bigIntegerArr2[i18];
                BigInteger bigInteger7 = TWO;
                int i22 = i15 + 1;
                BigInteger add = bigInteger7.pow(iArr2[i15] - i10).divide(bigIntegerArr4[i22]).add(bigInteger7.pow(iArr2[i15] - i10).multiply(bigInteger6).divide(bigIntegerArr4[i22].multiply(bigInteger7.pow(i18 * 32))));
                BigInteger mod = add.mod(bigInteger7);
                BigInteger bigInteger8 = ONE;
                if (mod.compareTo(bigInteger8) == 0) {
                    add = add.add(bigInteger8);
                }
                BigInteger bigInteger9 = add;
                int i23 = i11;
                while (true) {
                    iArr = iArr2;
                    bigInteger2 = bigInteger3;
                    long j12 = i23;
                    BigInteger multiply = bigIntegerArr4[i22].multiply(bigInteger9.add(BigInteger.valueOf(j12)));
                    BigInteger bigInteger10 = ONE;
                    BigInteger add2 = multiply.add(bigInteger10);
                    bigIntegerArr4[i15] = add2;
                    BigInteger bigInteger11 = TWO;
                    if (add2.compareTo(bigInteger11.pow(iArr[i15])) != 1) {
                        if (bigInteger11.modPow(bigIntegerArr4[i22].multiply(bigInteger9.add(BigInteger.valueOf(j12))), bigIntegerArr4[i15]).compareTo(bigInteger10) == 0 && bigInteger11.modPow(bigInteger9.add(BigInteger.valueOf(j12)), bigIntegerArr4[i15]).compareTo(bigInteger10) != 0) {
                            break;
                        }
                        i23 += 2;
                        bigInteger3 = bigInteger2;
                        iArr2 = iArr;
                    } else {
                        break;
                    }
                }
                i12 = i11;
                iArr2 = iArr;
                i10 = 1;
                bigIntegerArr3 = bigIntegerArr2;
                i17 = 32;
                bigInteger3 = bigInteger2;
            }
            i15--;
            if (i15 < 0) {
                bigIntegerArr[i11] = bigIntegerArr4[i11];
                bigIntegerArr[1] = bigIntegerArr4[1];
                bigInteger = bigIntegerArr2[i11];
                break;
            }
            i16++;
            i12 = i11;
            bigInteger3 = bigInteger2;
            iArr2 = iArr;
            bigIntegerArr3 = bigIntegerArr2;
            i10 = 1;
        }
        return bigInteger.longValue();
    }

    private void procedure_B(int i3, int i10, BigInteger[] bigIntegerArr) {
        int i11;
        int i12;
        int i13 = i3;
        while (true) {
            if (i13 >= 0 && i13 <= 65536) {
                break;
            } else {
                i13 = this.init_random.nextInt() / 32768;
            }
        }
        int i14 = i10;
        while (true) {
            i11 = 1;
            if (i14 >= 0 && i14 <= 65536 && i14 / 2 != 0) {
                break;
            } else {
                i14 = (this.init_random.nextInt() / 32768) + 1;
            }
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Integer.toString(i14));
        BigInteger bigInteger2 = new BigInteger(StubApp.getString2(28913));
        int procedure_A = procedure_A(i13, i14, bigIntegerArr2, 256);
        int i15 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        int procedure_A2 = procedure_A(procedure_A, i14, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[65];
        bigIntegerArr3[0] = new BigInteger(Integer.toString(procedure_A2));
        while (true) {
            int i16 = i15;
            while (i16 < 64) {
                int i17 = i16 + 1;
                bigIntegerArr3[i17] = bigIntegerArr3[i16].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(16));
                i16 = i17;
            }
            BigInteger bigInteger5 = new BigInteger(StubApp.getString2(824));
            for (int i18 = i15; i18 < 64; i18++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i18].multiply(TWO.pow(i18 * 16)));
            }
            bigIntegerArr3[i15] = bigIntegerArr3[64];
            BigInteger bigInteger6 = TWO;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            BigInteger bigInteger8 = add;
            int i19 = i15;
            while (true) {
                long j = i19;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j)));
                BigInteger bigInteger9 = ONE;
                BigInteger add2 = multiply.add(bigInteger9);
                BigInteger bigInteger10 = TWO;
                i12 = i15;
                if (add2.compareTo(bigInteger10.pow(1024)) == i11) {
                    break;
                }
                int i20 = i11;
                if (bigInteger10.modPow(bigInteger3.multiply(bigInteger4).multiply(bigInteger8.add(BigInteger.valueOf(j))), add2).compareTo(bigInteger9) == 0 && bigInteger10.modPow(bigInteger3.multiply(bigInteger8.add(BigInteger.valueOf(j))), add2).compareTo(bigInteger9) != 0) {
                    bigIntegerArr[i12] = add2;
                    bigIntegerArr[i20] = bigInteger3;
                    return;
                } else {
                    i19 += 2;
                    i15 = i12;
                    i11 = i20;
                }
            }
            i15 = i12;
        }
    }

    private void procedure_Bb(long j, long j3, BigInteger[] bigIntegerArr) {
        int i3;
        int i10;
        long j10 = j;
        while (true) {
            if (j10 >= 0 && j10 <= 4294967296L) {
                break;
            } else {
                j10 = this.init_random.nextInt() * 2;
            }
        }
        long j11 = j3;
        while (true) {
            i3 = 1;
            if (j11 >= 0 && j11 <= 4294967296L && j11 / 2 != 0) {
                break;
            }
            long j12 = j10;
            j11 = (this.init_random.nextInt() * 2) + 1;
            j10 = j12;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[2];
        BigInteger bigInteger = new BigInteger(Long.toString(j11));
        BigInteger bigInteger2 = new BigInteger(StubApp.getString2(28914));
        long procedure_Aa = procedure_Aa(j10, j11, bigIntegerArr2, 256);
        int i11 = 0;
        BigInteger bigInteger3 = bigIntegerArr2[0];
        long procedure_Aa2 = procedure_Aa(procedure_Aa, j11, bigIntegerArr2, 512);
        BigInteger bigInteger4 = bigIntegerArr2[0];
        BigInteger[] bigIntegerArr3 = new BigInteger[33];
        bigIntegerArr3[0] = new BigInteger(Long.toString(procedure_Aa2));
        while (true) {
            int i12 = i11;
            while (i12 < 32) {
                int i13 = i12 + 1;
                bigIntegerArr3[i13] = bigIntegerArr3[i12].multiply(bigInteger2).add(bigInteger).mod(TWO.pow(32));
                i12 = i13;
            }
            BigInteger bigInteger5 = new BigInteger(StubApp.getString2(824));
            for (int i14 = i11; i14 < 32; i14++) {
                bigInteger5 = bigInteger5.add(bigIntegerArr3[i14].multiply(TWO.pow(i14 * 32)));
            }
            bigIntegerArr3[i11] = bigIntegerArr3[32];
            BigInteger bigInteger6 = TWO;
            BigInteger add = bigInteger6.pow(1023).divide(bigInteger3.multiply(bigInteger4)).add(bigInteger6.pow(1023).multiply(bigInteger5).divide(bigInteger3.multiply(bigInteger4).multiply(bigInteger6.pow(1024))));
            BigInteger mod = add.mod(bigInteger6);
            BigInteger bigInteger7 = ONE;
            if (mod.compareTo(bigInteger7) == 0) {
                add = add.add(bigInteger7);
            }
            int i15 = i11;
            while (true) {
                long j13 = i15;
                BigInteger multiply = bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j13)));
                BigInteger bigInteger8 = ONE;
                BigInteger add2 = multiply.add(bigInteger8);
                BigInteger bigInteger9 = TWO;
                i10 = i11;
                if (add2.compareTo(bigInteger9.pow(1024)) == i3) {
                    break;
                }
                int i16 = i3;
                if (bigInteger9.modPow(bigInteger3.multiply(bigInteger4).multiply(add.add(BigInteger.valueOf(j13))), add2).compareTo(bigInteger8) == 0 && bigInteger9.modPow(bigInteger3.multiply(add.add(BigInteger.valueOf(j13))), add2).compareTo(bigInteger8) != 0) {
                    bigIntegerArr[i10] = add2;
                    bigIntegerArr[i16] = bigInteger3;
                    return;
                } else {
                    i15 += 2;
                    i11 = i10;
                    i3 = i16;
                }
            }
            i11 = i10;
        }
    }

    private BigInteger procedure_C(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger subtract = bigInteger.subtract(ONE);
        BigInteger divide = subtract.divide(bigInteger2);
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.init_random);
            BigInteger bigInteger3 = ONE;
            if (createRandomBigInteger.compareTo(bigInteger3) > 0 && createRandomBigInteger.compareTo(subtract) < 0) {
                BigInteger modPow = createRandomBigInteger.modPow(divide, bigInteger);
                if (modPow.compareTo(bigInteger3) != 0) {
                    return modPow;
                }
            }
        }
    }

    public GOST3410Parameters generateParameters() {
        long j;
        long j3;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        int i3 = this.typeproc;
        String string2 = StubApp.getString2(28916);
        if (i3 == 1) {
            int nextInt = this.init_random.nextInt();
            int nextInt2 = this.init_random.nextInt();
            int i10 = this.size;
            if (i10 == 512) {
                procedure_A(nextInt, nextInt2, bigIntegerArr, 512);
            } else {
                if (i10 != 1024) {
                    throw new IllegalArgumentException(string2);
                }
                procedure_B(nextInt, nextInt2, bigIntegerArr);
            }
            BigInteger bigInteger = bigIntegerArr[0];
            BigInteger bigInteger2 = bigIntegerArr[1];
            return new GOST3410Parameters(bigInteger, bigInteger2, procedure_C(bigInteger, bigInteger2), new GOST3410ValidationParameters(nextInt, nextInt2));
        }
        long nextLong = this.init_random.nextLong();
        long nextLong2 = this.init_random.nextLong();
        int i11 = this.size;
        if (i11 == 512) {
            j = nextLong;
            j3 = nextLong2;
            procedure_Aa(j, j3, bigIntegerArr, 512);
        } else {
            if (i11 != 1024) {
                throw new IllegalStateException(string2);
            }
            j = nextLong;
            j3 = nextLong2;
            procedure_Bb(j, j3, bigIntegerArr);
        }
        BigInteger bigInteger3 = bigIntegerArr[0];
        BigInteger bigInteger4 = bigIntegerArr[1];
        return new GOST3410Parameters(bigInteger3, bigInteger4, procedure_C(bigInteger3, bigInteger4), new GOST3410ValidationParameters(j, j3));
    }

    public void init(int i3, int i10, SecureRandom secureRandom) {
        this.size = i3;
        this.typeproc = i10;
        this.init_random = secureRandom;
    }
}
