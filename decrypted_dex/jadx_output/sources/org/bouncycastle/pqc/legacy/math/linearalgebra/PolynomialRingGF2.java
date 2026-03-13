package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.stub.StubApp;
import java.io.PrintStream;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class PolynomialRingGF2 {
    private PolynomialRingGF2() {
    }

    public static int add(int i3, int i10) {
        return i3 ^ i10;
    }

    public static int degree(int i3) {
        int i10 = -1;
        while (i3 != 0) {
            i10++;
            i3 >>>= 1;
        }
        return i10;
    }

    public static int gcd(int i3, int i10) {
        while (true) {
            int i11 = i10;
            int i12 = i3;
            i3 = i11;
            if (i3 == 0) {
                return i12;
            }
            i10 = remainder(i12, i3);
        }
    }

    public static int getIrreduciblePolynomial(int i3) {
        PrintStream printStream;
        String string2;
        if (i3 < 0) {
            printStream = System.err;
            string2 = StubApp.getString2(34883);
        } else {
            if (i3 <= 31) {
                if (i3 == 0) {
                    return 1;
                }
                int i10 = 1 << (i3 + 1);
                for (int i11 = (1 << i3) + 1; i11 < i10; i11 += 2) {
                    if (isIrreducible(i11)) {
                        return i11;
                    }
                }
                return 0;
            }
            printStream = System.err;
            string2 = StubApp.getString2(34884);
        }
        printStream.println(string2);
        return 0;
    }

    public static boolean isIrreducible(int i3) {
        if (i3 == 0) {
            return false;
        }
        int degree = degree(i3) >>> 1;
        int i10 = 2;
        for (int i11 = 0; i11 < degree; i11++) {
            i10 = modMultiply(i10, i10, i3);
            if (gcd(i10 ^ 2, i3) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int modMultiply(int i3, int i10, int i11) {
        int remainder = remainder(i3, i11);
        int remainder2 = remainder(i10, i11);
        int i12 = 0;
        if (remainder2 != 0) {
            int degree = 1 << degree(i11);
            while (remainder != 0) {
                if (((byte) (remainder & 1)) == 1) {
                    i12 ^= remainder2;
                }
                remainder >>>= 1;
                remainder2 <<= 1;
                if (remainder2 >= degree) {
                    remainder2 ^= i11;
                }
            }
        }
        return i12;
    }

    public static long multiply(int i3, int i10) {
        long j = 0;
        if (i10 != 0) {
            long j3 = i10 & BodyPartID.bodyIdMax;
            while (i3 != 0) {
                if (((byte) (i3 & 1)) == 1) {
                    j ^= j3;
                }
                i3 >>>= 1;
                j3 <<= 1;
            }
        }
        return j;
    }

    public static int remainder(int i3, int i10) {
        if (i10 == 0) {
            System.err.println(StubApp.getString2(34885));
            return 0;
        }
        while (degree(i3) >= degree(i10)) {
            i3 ^= i10 << (degree(i3) - degree(i10));
        }
        return i3;
    }

    public static int rest(long j, int i3) {
        if (i3 == 0) {
            System.err.println(StubApp.getString2(34885));
            return 0;
        }
        long j3 = i3 & BodyPartID.bodyIdMax;
        while ((j >>> 32) != 0) {
            j ^= j3 << (degree(j) - degree(j3));
        }
        int i10 = (int) j;
        while (degree(i10) >= degree(i3)) {
            i10 ^= i3 << (degree(i10) - degree(i3));
        }
        return i10;
    }

    public static int degree(long j) {
        int i3 = 0;
        while (j != 0) {
            i3++;
            j >>>= 1;
        }
        return i3 - 1;
    }
}
