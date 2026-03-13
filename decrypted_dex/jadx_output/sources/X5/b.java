package X5;

import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f8410a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f8411b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f8412c;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f8413d;

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f8414e;

    static {
        char[] cArr = {'!', Typography.quote, '#', Typography.dollar, '%', Typography.amp, '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', Typography.less, '=', Typography.greater, '?', '@', '[', '\\', ']', '^', '_'};
        f8411b = cArr;
        f8412c = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        f8413d = cArr;
        f8414e = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    }

    public static void a(int i3, int i10, int[] iArr) {
        int i11 = ((i3 << 8) + i10) - 1;
        int i12 = i11 / 1600;
        iArr[0] = i12;
        int i13 = i11 - (i12 * 1600);
        int i14 = i13 / 40;
        iArr[1] = i14;
        iArr[2] = i13 - (i14 * 40);
    }

    public static int b(int i3, int i10) {
        int i11 = i3 - (((i10 * 149) % 255) + 1);
        return i11 >= 0 ? i11 : i11 + 256;
    }
}
