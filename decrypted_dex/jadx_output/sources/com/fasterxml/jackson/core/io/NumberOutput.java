package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal;
import com.fasterxml.jackson.core.io.schubfach.FloatToDecimal;
import com.stub.StubApp;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs;
    private static final String[] sSmallIntStrs2;

    static {
        int i3 = 0;
        for (int i10 = 0; i10 < 10; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                int i12 = 0;
                while (i12 < 10) {
                    TRIPLET_TO_CHARS[i3] = ((i10 + 48) << 16) | ((i11 + 48) << 8) | (i12 + 48);
                    i12++;
                    i3++;
                }
            }
        }
        sSmallIntStrs = new String[]{StubApp.getString2(824), StubApp.getString2(878), StubApp.getString2(4967), StubApp.getString2(4968), StubApp.getString2(4969), StubApp.getString2(4970), StubApp.getString2(4971), StubApp.getString2(4972), StubApp.getString2(4973), StubApp.getString2(4974), StubApp.getString2(1708)};
        sSmallIntStrs2 = new String[]{StubApp.getString2(10085), StubApp.getString2(10380), StubApp.getString2(10381), StubApp.getString2(10382), StubApp.getString2(10383), StubApp.getString2(10384), StubApp.getString2(10385), StubApp.getString2(10386), StubApp.getString2(10378), StubApp.getString2(10379)};
    }

    private static int _full3(int i3, char[] cArr, int i10) {
        int i11 = TRIPLET_TO_CHARS[i3];
        cArr[i10] = (char) (i11 >> 16);
        int i12 = i10 + 2;
        cArr[i10 + 1] = (char) ((i11 >> 8) & CertificateBody.profileType);
        int i13 = i10 + 3;
        cArr[i12] = (char) (i11 & CertificateBody.profileType);
        return i13;
    }

    private static int _leading3(int i3, char[] cArr, int i10) {
        int i11 = TRIPLET_TO_CHARS[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                cArr[i10] = (char) (i11 >> 16);
                i10++;
            }
            cArr[i10] = (char) ((i11 >> 8) & CertificateBody.profileType);
            i10++;
        }
        int i12 = i10 + 1;
        cArr[i10] = (char) (i11 & CertificateBody.profileType);
        return i12;
    }

    private static int _outputFullBillion(int i3, char[] cArr, int i10) {
        int i11 = i3 / 1000;
        int i12 = i3 - (i11 * 1000);
        int i13 = i11 / 1000;
        int[] iArr = TRIPLET_TO_CHARS;
        int i14 = iArr[i13];
        cArr[i10] = (char) (i14 >> 16);
        cArr[i10 + 1] = (char) ((i14 >> 8) & CertificateBody.profileType);
        cArr[i10 + 2] = (char) (i14 & CertificateBody.profileType);
        int i15 = iArr[i11 - (i13 * 1000)];
        cArr[i10 + 3] = (char) (i15 >> 16);
        cArr[i10 + 4] = (char) ((i15 >> 8) & CertificateBody.profileType);
        cArr[i10 + 5] = (char) (i15 & CertificateBody.profileType);
        int i16 = iArr[i12];
        cArr[i10 + 6] = (char) (i16 >> 16);
        int i17 = i10 + 8;
        cArr[i10 + 7] = (char) ((i16 >> 8) & CertificateBody.profileType);
        int i18 = i10 + 9;
        cArr[i17] = (char) (i16 & CertificateBody.profileType);
        return i18;
    }

    private static int _outputSmallestI(char[] cArr, int i3) {
        String str = SMALLEST_INT;
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        return length + i3;
    }

    private static int _outputSmallestL(char[] cArr, int i3) {
        String str = SMALLEST_LONG;
        int length = str.length();
        str.getChars(0, length, cArr, i3);
        return length + i3;
    }

    private static int _outputUptoBillion(int i3, char[] cArr, int i10) {
        if (i3 < MILLION) {
            if (i3 < 1000) {
                return _leading3(i3, cArr, i10);
            }
            int i11 = i3 / 1000;
            return _outputUptoMillion(cArr, i10, i11, i3 - (i11 * 1000));
        }
        int i12 = i3 / 1000;
        int i13 = i3 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int _leading3 = _leading3(i14, cArr, i10);
        int[] iArr = TRIPLET_TO_CHARS;
        int i16 = iArr[i15];
        cArr[_leading3] = (char) (i16 >> 16);
        cArr[_leading3 + 1] = (char) ((i16 >> 8) & CertificateBody.profileType);
        cArr[_leading3 + 2] = (char) (i16 & CertificateBody.profileType);
        int i17 = iArr[i13];
        cArr[_leading3 + 3] = (char) (i17 >> 16);
        int i18 = _leading3 + 5;
        cArr[_leading3 + 4] = (char) ((i17 >> 8) & CertificateBody.profileType);
        int i19 = _leading3 + 6;
        cArr[i18] = (char) (i17 & CertificateBody.profileType);
        return i19;
    }

    private static int _outputUptoMillion(char[] cArr, int i3, int i10, int i11) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i12 = iArr[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                cArr[i3] = (char) (i12 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i12 >> 8) & CertificateBody.profileType);
            i3++;
        }
        cArr[i3] = (char) (i12 & CertificateBody.profileType);
        int i13 = iArr[i11];
        cArr[i3 + 1] = (char) (i13 >> 16);
        int i14 = i3 + 3;
        cArr[i3 + 2] = (char) ((i13 >> 8) & CertificateBody.profileType);
        int i15 = i3 + 4;
        cArr[i14] = (char) (i13 & CertificateBody.profileType);
        return i15;
    }

    public static boolean notFinite(double d8) {
        return Double.isNaN(d8) || Double.isInfinite(d8);
    }

    public static int outputInt(int i3, char[] cArr, int i10) {
        int i11;
        if (i3 < 0) {
            if (i3 == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i10);
            }
            cArr[i10] = '-';
            i3 = -i3;
            i10++;
        }
        if (i3 < MILLION) {
            if (i3 >= 1000) {
                int i12 = i3 / 1000;
                return _full3(i3 - (i12 * 1000), cArr, _leading3(i12, cArr, i10));
            }
            if (i3 >= 10) {
                return _leading3(i3, cArr, i10);
            }
            cArr[i10] = (char) (i3 + 48);
            return i10 + 1;
        }
        int i13 = BILLION;
        if (i3 < i13) {
            int i14 = i3 / 1000;
            int i15 = i14 / 1000;
            return _full3(i3 - (i14 * 1000), cArr, _full3(i14 - (i15 * 1000), cArr, _leading3(i15, cArr, i10)));
        }
        int i16 = i3 - i13;
        if (i16 >= i13) {
            i16 -= i13;
            i11 = i10 + 1;
            cArr[i10] = '2';
        } else {
            i11 = i10 + 1;
            cArr[i10] = '1';
        }
        return _outputFullBillion(i16, cArr, i11);
    }

    public static int outputLong(long j, char[] cArr, int i3) {
        int _outputFullBillion;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, cArr, i3);
            }
            if (j == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i3);
            }
            cArr[i3] = '-';
            j = -j;
            i3++;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, cArr, i3);
        }
        long j3 = BILLION_L;
        long j10 = j / j3;
        long j11 = j - (j10 * j3);
        if (j10 < j3) {
            _outputFullBillion = _outputUptoBillion((int) j10, cArr, i3);
        } else {
            long j12 = j10 / j3;
            int _leading3 = _leading3((int) j12, cArr, i3);
            _outputFullBillion = _outputFullBillion((int) (j10 - (j3 * j12)), cArr, _leading3);
        }
        return _outputFullBillion((int) j11, cArr, _outputFullBillion);
    }

    public static String toString(double d8, boolean z2) {
        return z2 ? DoubleToDecimal.toString(d8) : Double.toString(d8);
    }

    public static boolean notFinite(float f10) {
        return Float.isNaN(f10) || Float.isInfinite(f10);
    }

    public static String toString(float f10, boolean z2) {
        return z2 ? FloatToDecimal.toString(f10) : Float.toString(f10);
    }

    private static int _outputSmallestI(byte[] bArr, int i3) {
        int length = SMALLEST_INT.length();
        int i10 = 0;
        while (i10 < length) {
            bArr[i3] = (byte) SMALLEST_INT.charAt(i10);
            i10++;
            i3++;
        }
        return i3;
    }

    private static int _outputSmallestL(byte[] bArr, int i3) {
        int length = SMALLEST_LONG.length();
        int i10 = 0;
        while (i10 < length) {
            bArr[i3] = (byte) SMALLEST_LONG.charAt(i10);
            i10++;
            i3++;
        }
        return i3;
    }

    private static int _full3(int i3, byte[] bArr, int i10) {
        int i11 = TRIPLET_TO_CHARS[i3];
        bArr[i10] = (byte) (i11 >> 16);
        int i12 = i10 + 2;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        int i13 = i10 + 3;
        bArr[i12] = (byte) i11;
        return i13;
    }

    private static int _leading3(int i3, byte[] bArr, int i10) {
        int i11 = TRIPLET_TO_CHARS[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                bArr[i10] = (byte) (i11 >> 16);
                i10++;
            }
            bArr[i10] = (byte) (i11 >> 8);
            i10++;
        }
        int i12 = i10 + 1;
        bArr[i10] = (byte) i11;
        return i12;
    }

    private static int _outputUptoMillion(byte[] bArr, int i3, int i10, int i11) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i12 = iArr[i10];
        if (i10 > 9) {
            if (i10 > 99) {
                bArr[i3] = (byte) (i12 >> 16);
                i3++;
            }
            bArr[i3] = (byte) (i12 >> 8);
            i3++;
        }
        bArr[i3] = (byte) i12;
        int i13 = iArr[i11];
        bArr[i3 + 1] = (byte) (i13 >> 16);
        int i14 = i3 + 3;
        bArr[i3 + 2] = (byte) (i13 >> 8);
        int i15 = i3 + 4;
        bArr[i14] = (byte) i13;
        return i15;
    }

    public static int outputLong(long j, byte[] bArr, int i3) {
        int _outputFullBillion;
        if (j < 0) {
            if (j > MIN_INT_AS_LONG) {
                return outputInt((int) j, bArr, i3);
            }
            if (j == Long.MIN_VALUE) {
                return _outputSmallestL(bArr, i3);
            }
            bArr[i3] = 45;
            j = -j;
            i3++;
        } else if (j <= MAX_INT_AS_LONG) {
            return outputInt((int) j, bArr, i3);
        }
        long j3 = BILLION_L;
        long j10 = j / j3;
        long j11 = j - (j10 * j3);
        if (j10 < j3) {
            _outputFullBillion = _outputUptoBillion((int) j10, bArr, i3);
        } else {
            long j12 = j10 / j3;
            int _leading3 = _leading3((int) j12, bArr, i3);
            _outputFullBillion = _outputFullBillion((int) (j10 - (j3 * j12)), bArr, _leading3);
        }
        return _outputFullBillion((int) j11, bArr, _outputFullBillion);
    }

    private static int _outputFullBillion(int i3, byte[] bArr, int i10) {
        int i11 = i3 / 1000;
        int i12 = i3 - (i11 * 1000);
        int i13 = i11 / 1000;
        int i14 = i11 - (i13 * 1000);
        int[] iArr = TRIPLET_TO_CHARS;
        int i15 = iArr[i13];
        bArr[i10] = (byte) (i15 >> 16);
        bArr[i10 + 1] = (byte) (i15 >> 8);
        bArr[i10 + 2] = (byte) i15;
        int i16 = iArr[i14];
        bArr[i10 + 3] = (byte) (i16 >> 16);
        bArr[i10 + 4] = (byte) (i16 >> 8);
        bArr[i10 + 5] = (byte) i16;
        int i17 = iArr[i12];
        bArr[i10 + 6] = (byte) (i17 >> 16);
        int i18 = i10 + 8;
        bArr[i10 + 7] = (byte) (i17 >> 8);
        int i19 = i10 + 9;
        bArr[i18] = (byte) i17;
        return i19;
    }

    private static int _outputUptoBillion(int i3, byte[] bArr, int i10) {
        if (i3 < MILLION) {
            if (i3 < 1000) {
                return _leading3(i3, bArr, i10);
            }
            int i11 = i3 / 1000;
            return _outputUptoMillion(bArr, i10, i11, i3 - (i11 * 1000));
        }
        int i12 = i3 / 1000;
        int i13 = i3 - (i12 * 1000);
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int _leading3 = _leading3(i14, bArr, i10);
        int[] iArr = TRIPLET_TO_CHARS;
        int i16 = iArr[i15];
        bArr[_leading3] = (byte) (i16 >> 16);
        bArr[_leading3 + 1] = (byte) (i16 >> 8);
        bArr[_leading3 + 2] = (byte) i16;
        int i17 = iArr[i13];
        bArr[_leading3 + 3] = (byte) (i17 >> 16);
        int i18 = _leading3 + 5;
        bArr[_leading3 + 4] = (byte) (i17 >> 8);
        int i19 = _leading3 + 6;
        bArr[i18] = (byte) i17;
        return i19;
    }

    public static int outputInt(int i3, byte[] bArr, int i10) {
        int i11;
        if (i3 < 0) {
            if (i3 == Integer.MIN_VALUE) {
                return _outputSmallestI(bArr, i10);
            }
            bArr[i10] = 45;
            i3 = -i3;
            i10++;
        }
        if (i3 < MILLION) {
            if (i3 >= 1000) {
                int i12 = i3 / 1000;
                return _full3(i3 - (i12 * 1000), bArr, _leading3(i12, bArr, i10));
            }
            if (i3 < 10) {
                int i13 = i10 + 1;
                bArr[i10] = (byte) (i3 + 48);
                return i13;
            }
            return _leading3(i3, bArr, i10);
        }
        int i14 = BILLION;
        if (i3 >= i14) {
            int i15 = i3 - i14;
            if (i15 >= i14) {
                i15 -= i14;
                i11 = i10 + 1;
                bArr[i10] = 50;
            } else {
                i11 = i10 + 1;
                bArr[i10] = 49;
            }
            return _outputFullBillion(i15, bArr, i11);
        }
        int i16 = i3 / 1000;
        int i17 = i16 / 1000;
        return _full3(i3 - (i16 * 1000), bArr, _full3(i16 - (i17 * 1000), bArr, _leading3(i17, bArr, i10)));
    }
}
