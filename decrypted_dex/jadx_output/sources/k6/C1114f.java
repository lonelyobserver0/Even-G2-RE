package k6;

import E0.x;
import Z9.n;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: k6.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1114f {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f15468e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f, reason: collision with root package name */
    public static final C1114f[] f15469f = a();

    /* renamed from: a, reason: collision with root package name */
    public final int f15470a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f15471b;

    /* renamed from: c, reason: collision with root package name */
    public final x[] f15472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15473d;

    public C1114f(int i3, int[] iArr, x... xVarArr) {
        this.f15470a = i3;
        this.f15471b = iArr;
        this.f15472c = xVarArr;
        x xVar = xVarArr[0];
        int i10 = xVar.f1861a;
        int i11 = 0;
        for (n nVar : (n[]) xVar.f1862b) {
            i11 += (nVar.f9137c + i10) * nVar.f9136b;
        }
        this.f15473d = i11;
    }

    public static C1114f[] a() {
        return new C1114f[]{new C1114f(1, new int[0], new x(7, new n[]{new n(1, 19, 3)}), new x(10, new n[]{new n(1, 16, 3)}), new x(13, new n[]{new n(1, 13, 3)}), new x(17, new n[]{new n(1, 9, 3)})), new C1114f(2, new int[]{6, 18}, new x(10, new n[]{new n(1, 34, 3)}), new x(16, new n[]{new n(1, 28, 3)}), new x(22, new n[]{new n(1, 22, 3)}), new x(28, new n[]{new n(1, 16, 3)})), new C1114f(3, new int[]{6, 22}, new x(15, new n[]{new n(1, 55, 3)}), new x(26, new n[]{new n(1, 44, 3)}), new x(18, new n[]{new n(2, 17, 3)}), new x(22, new n[]{new n(2, 13, 3)})), new C1114f(4, new int[]{6, 26}, new x(20, new n[]{new n(1, 80, 3)}), new x(18, new n[]{new n(2, 32, 3)}), new x(26, new n[]{new n(2, 24, 3)}), new x(16, new n[]{new n(4, 9, 3)})), new C1114f(5, new int[]{6, 30}, new x(26, new n[]{new n(1, 108, 3)}), new x(24, new n[]{new n(2, 43, 3)}), new x(18, new n[]{new n(2, 15, 3), new n(2, 16, 3)}), new x(22, new n[]{new n(2, 11, 3), new n(2, 12, 3)})), new C1114f(6, new int[]{6, 34}, new x(18, new n[]{new n(2, 68, 3)}), new x(16, new n[]{new n(4, 27, 3)}), new x(24, new n[]{new n(4, 19, 3)}), new x(28, new n[]{new n(4, 15, 3)})), new C1114f(7, new int[]{6, 22, 38}, new x(20, new n[]{new n(2, 78, 3)}), new x(18, new n[]{new n(4, 31, 3)}), new x(18, new n[]{new n(2, 14, 3), new n(4, 15, 3)}), new x(26, new n[]{new n(4, 13, 3), new n(1, 14, 3)})), new C1114f(8, new int[]{6, 24, 42}, new x(24, new n[]{new n(2, 97, 3)}), new x(22, new n[]{new n(2, 38, 3), new n(2, 39, 3)}), new x(22, new n[]{new n(4, 18, 3), new n(2, 19, 3)}), new x(26, new n[]{new n(4, 14, 3), new n(2, 15, 3)})), new C1114f(9, new int[]{6, 26, 46}, new x(30, new n[]{new n(2, 116, 3)}), new x(22, new n[]{new n(3, 36, 3), new n(2, 37, 3)}), new x(20, new n[]{new n(4, 16, 3), new n(4, 17, 3)}), new x(24, new n[]{new n(4, 12, 3), new n(4, 13, 3)})), new C1114f(10, new int[]{6, 28, 50}, new x(18, new n[]{new n(2, 68, 3), new n(2, 69, 3)}), new x(26, new n[]{new n(4, 43, 3), new n(1, 44, 3)}), new x(24, new n[]{new n(6, 19, 3), new n(2, 20, 3)}), new x(28, new n[]{new n(6, 15, 3), new n(2, 16, 3)})), new C1114f(11, new int[]{6, 30, 54}, new x(20, new n[]{new n(4, 81, 3)}), new x(30, new n[]{new n(1, 50, 3), new n(4, 51, 3)}), new x(28, new n[]{new n(4, 22, 3), new n(4, 23, 3)}), new x(24, new n[]{new n(3, 12, 3), new n(8, 13, 3)})), new C1114f(12, new int[]{6, 32, 58}, new x(24, new n[]{new n(2, 92, 3), new n(2, 93, 3)}), new x(22, new n[]{new n(6, 36, 3), new n(2, 37, 3)}), new x(26, new n[]{new n(4, 20, 3), new n(6, 21, 3)}), new x(28, new n[]{new n(7, 14, 3), new n(4, 15, 3)})), new C1114f(13, new int[]{6, 34, 62}, new x(26, new n[]{new n(4, 107, 3)}), new x(22, new n[]{new n(8, 37, 3), new n(1, 38, 3)}), new x(24, new n[]{new n(8, 20, 3), new n(4, 21, 3)}), new x(22, new n[]{new n(12, 11, 3), new n(4, 12, 3)})), new C1114f(14, new int[]{6, 26, 46, 66}, new x(30, new n[]{new n(3, 115, 3), new n(1, 116, 3)}), new x(24, new n[]{new n(4, 40, 3), new n(5, 41, 3)}), new x(20, new n[]{new n(11, 16, 3), new n(5, 17, 3)}), new x(24, new n[]{new n(11, 12, 3), new n(5, 13, 3)})), new C1114f(15, new int[]{6, 26, 48, 70}, new x(22, new n[]{new n(5, 87, 3), new n(1, 88, 3)}), new x(24, new n[]{new n(5, 41, 3), new n(5, 42, 3)}), new x(30, new n[]{new n(5, 24, 3), new n(7, 25, 3)}), new x(24, new n[]{new n(11, 12, 3), new n(7, 13, 3)})), new C1114f(16, new int[]{6, 26, 50, 74}, new x(24, new n[]{new n(5, 98, 3), new n(1, 99, 3)}), new x(28, new n[]{new n(7, 45, 3), new n(3, 46, 3)}), new x(24, new n[]{new n(15, 19, 3), new n(2, 20, 3)}), new x(30, new n[]{new n(3, 15, 3), new n(13, 16, 3)})), new C1114f(17, new int[]{6, 30, 54, 78}, new x(28, new n[]{new n(1, 107, 3), new n(5, 108, 3)}), new x(28, new n[]{new n(10, 46, 3), new n(1, 47, 3)}), new x(28, new n[]{new n(1, 22, 3), new n(15, 23, 3)}), new x(28, new n[]{new n(2, 14, 3), new n(17, 15, 3)})), new C1114f(18, new int[]{6, 30, 56, 82}, new x(30, new n[]{new n(5, 120, 3), new n(1, 121, 3)}), new x(26, new n[]{new n(9, 43, 3), new n(4, 44, 3)}), new x(28, new n[]{new n(17, 22, 3), new n(1, 23, 3)}), new x(28, new n[]{new n(2, 14, 3), new n(19, 15, 3)})), new C1114f(19, new int[]{6, 30, 58, 86}, new x(28, new n[]{new n(3, 113, 3), new n(4, 114, 3)}), new x(26, new n[]{new n(3, 44, 3), new n(11, 45, 3)}), new x(26, new n[]{new n(17, 21, 3), new n(4, 22, 3)}), new x(26, new n[]{new n(9, 13, 3), new n(16, 14, 3)})), new C1114f(20, new int[]{6, 34, 62, 90}, new x(28, new n[]{new n(3, 107, 3), new n(5, 108, 3)}), new x(26, new n[]{new n(3, 41, 3), new n(13, 42, 3)}), new x(30, new n[]{new n(15, 24, 3), new n(5, 25, 3)}), new x(28, new n[]{new n(15, 15, 3), new n(10, 16, 3)})), new C1114f(21, new int[]{6, 28, 50, 72, 94}, new x(28, new n[]{new n(4, 116, 3), new n(4, 117, 3)}), new x(26, new n[]{new n(17, 42, 3)}), new x(28, new n[]{new n(17, 22, 3), new n(6, 23, 3)}), new x(30, new n[]{new n(19, 16, 3), new n(6, 17, 3)})), new C1114f(22, new int[]{6, 26, 50, 74, 98}, new x(28, new n[]{new n(2, 111, 3), new n(7, 112, 3)}), new x(28, new n[]{new n(17, 46, 3)}), new x(30, new n[]{new n(7, 24, 3), new n(16, 25, 3)}), new x(24, new n[]{new n(34, 13, 3)})), new C1114f(23, new int[]{6, 30, 54, 78, 102}, new x(30, new n[]{new n(4, 121, 3), new n(5, 122, 3)}), new x(28, new n[]{new n(4, 47, 3), new n(14, 48, 3)}), new x(30, new n[]{new n(11, 24, 3), new n(14, 25, 3)}), new x(30, new n[]{new n(16, 15, 3), new n(14, 16, 3)})), new C1114f(24, new int[]{6, 28, 54, 80, 106}, new x(30, new n[]{new n(6, 117, 3), new n(4, 118, 3)}), new x(28, new n[]{new n(6, 45, 3), new n(14, 46, 3)}), new x(30, new n[]{new n(11, 24, 3), new n(16, 25, 3)}), new x(30, new n[]{new n(30, 16, 3), new n(2, 17, 3)})), new C1114f(25, new int[]{6, 32, 58, 84, 110}, new x(26, new n[]{new n(8, 106, 3), new n(4, 107, 3)}), new x(28, new n[]{new n(8, 47, 3), new n(13, 48, 3)}), new x(30, new n[]{new n(7, 24, 3), new n(22, 25, 3)}), new x(30, new n[]{new n(22, 15, 3), new n(13, 16, 3)})), new C1114f(26, new int[]{6, 30, 58, 86, 114}, new x(28, new n[]{new n(10, 114, 3), new n(2, 115, 3)}), new x(28, new n[]{new n(19, 46, 3), new n(4, 47, 3)}), new x(28, new n[]{new n(28, 22, 3), new n(6, 23, 3)}), new x(30, new n[]{new n(33, 16, 3), new n(4, 17, 3)})), new C1114f(27, new int[]{6, 34, 62, 90, 118}, new x(30, new n[]{new n(8, 122, 3), new n(4, 123, 3)}), new x(28, new n[]{new n(22, 45, 3), new n(3, 46, 3)}), new x(30, new n[]{new n(8, 23, 3), new n(26, 24, 3)}), new x(30, new n[]{new n(12, 15, 3), new n(28, 16, 3)})), new C1114f(28, new int[]{6, 26, 50, 74, 98, 122}, new x(30, new n[]{new n(3, 117, 3), new n(10, 118, 3)}), new x(28, new n[]{new n(3, 45, 3), new n(23, 46, 3)}), new x(30, new n[]{new n(4, 24, 3), new n(31, 25, 3)}), new x(30, new n[]{new n(11, 15, 3), new n(31, 16, 3)})), new C1114f(29, new int[]{6, 30, 54, 78, 102, 126}, new x(30, new n[]{new n(7, 116, 3), new n(7, 117, 3)}), new x(28, new n[]{new n(21, 45, 3), new n(7, 46, 3)}), new x(30, new n[]{new n(1, 23, 3), new n(37, 24, 3)}), new x(30, new n[]{new n(19, 15, 3), new n(26, 16, 3)})), new C1114f(30, new int[]{6, 26, 52, 78, 104, 130}, new x(30, new n[]{new n(5, 115, 3), new n(10, 116, 3)}), new x(28, new n[]{new n(19, 47, 3), new n(10, 48, 3)}), new x(30, new n[]{new n(15, 24, 3), new n(25, 25, 3)}), new x(30, new n[]{new n(23, 15, 3), new n(25, 16, 3)})), new C1114f(31, new int[]{6, 30, 56, 82, 108, 134}, new x(30, new n[]{new n(13, 115, 3), new n(3, 116, 3)}), new x(28, new n[]{new n(2, 46, 3), new n(29, 47, 3)}), new x(30, new n[]{new n(42, 24, 3), new n(1, 25, 3)}), new x(30, new n[]{new n(23, 15, 3), new n(28, 16, 3)})), new C1114f(32, new int[]{6, 34, 60, 86, 112, 138}, new x(30, new n[]{new n(17, 115, 3)}), new x(28, new n[]{new n(10, 46, 3), new n(23, 47, 3)}), new x(30, new n[]{new n(10, 24, 3), new n(35, 25, 3)}), new x(30, new n[]{new n(19, 15, 3), new n(35, 16, 3)})), new C1114f(33, new int[]{6, 30, 58, 86, 114, 142}, new x(30, new n[]{new n(17, 115, 3), new n(1, 116, 3)}), new x(28, new n[]{new n(14, 46, 3), new n(21, 47, 3)}), new x(30, new n[]{new n(29, 24, 3), new n(19, 25, 3)}), new x(30, new n[]{new n(11, 15, 3), new n(46, 16, 3)})), new C1114f(34, new int[]{6, 34, 62, 90, 118, 146}, new x(30, new n[]{new n(13, 115, 3), new n(6, 116, 3)}), new x(28, new n[]{new n(14, 46, 3), new n(23, 47, 3)}), new x(30, new n[]{new n(44, 24, 3), new n(7, 25, 3)}), new x(30, new n[]{new n(59, 16, 3), new n(1, 17, 3)})), new C1114f(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new x(30, new n[]{new n(12, 121, 3), new n(7, 122, 3)}), new x(28, new n[]{new n(12, 47, 3), new n(26, 48, 3)}), new x(30, new n[]{new n(39, 24, 3), new n(14, 25, 3)}), new x(30, new n[]{new n(22, 15, 3), new n(41, 16, 3)})), new C1114f(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new x(30, new n[]{new n(6, 121, 3), new n(14, 122, 3)}), new x(28, new n[]{new n(6, 47, 3), new n(34, 48, 3)}), new x(30, new n[]{new n(46, 24, 3), new n(10, 25, 3)}), new x(30, new n[]{new n(2, 15, 3), new n(64, 16, 3)})), new C1114f(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new x(30, new n[]{new n(17, 122, 3), new n(4, 123, 3)}), new x(28, new n[]{new n(29, 46, 3), new n(14, 47, 3)}), new x(30, new n[]{new n(49, 24, 3), new n(10, 25, 3)}), new x(30, new n[]{new n(24, 15, 3), new n(46, 16, 3)})), new C1114f(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new x(30, new n[]{new n(4, 122, 3), new n(18, 123, 3)}), new x(28, new n[]{new n(13, 46, 3), new n(32, 47, 3)}), new x(30, new n[]{new n(48, 24, 3), new n(14, 25, 3)}), new x(30, new n[]{new n(42, 15, 3), new n(32, 16, 3)})), new C1114f(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new x(30, new n[]{new n(20, 117, 3), new n(4, 118, 3)}), new x(28, new n[]{new n(40, 47, 3), new n(7, 48, 3)}), new x(30, new n[]{new n(43, 24, 3), new n(22, 25, 3)}), new x(30, new n[]{new n(10, 15, 3), new n(67, 16, 3)})), new C1114f(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new x(30, new n[]{new n(19, 118, 3), new n(6, 119, 3)}), new x(28, new n[]{new n(18, 47, 3), new n(31, 48, 3)}), new x(30, new n[]{new n(34, 24, 3), new n(34, 25, 3)}), new x(30, new n[]{new n(20, 15, 3), new n(61, 16, 3)}))};
    }

    public static C1114f b(int i3) {
        int i10 = IntCompanionObject.MAX_VALUE;
        int i11 = 0;
        for (int i12 = 0; i12 < 34; i12++) {
            int i13 = f15468e[i12];
            if (i13 == i3) {
                return c(i12 + 7);
            }
            int bitCount = Integer.bitCount(i13 ^ i3);
            if (bitCount < i10) {
                i11 = i12 + 7;
                i10 = bitCount;
            }
        }
        if (i10 <= 3) {
            return c(i11);
        }
        return null;
    }

    public static C1114f c(int i3) {
        if (i3 < 1 || i3 > 40) {
            throw new IllegalArgumentException();
        }
        return f15469f[i3 - 1];
    }

    public final String toString() {
        return String.valueOf(this.f15470a);
    }
}
