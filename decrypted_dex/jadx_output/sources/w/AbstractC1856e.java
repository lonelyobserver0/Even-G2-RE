package w;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class AbstractC1856e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21969a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37};

    public static /* synthetic */ boolean a(int i3, int i10) {
        if (i3 != 0) {
            return i3 == i10;
        }
        throw null;
    }

    public static StringBuilder b(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static /* synthetic */ int c(int i3) {
        if (i3 != 0) {
            return i3 - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] d(int i3) {
        int[] iArr = new int[i3];
        System.arraycopy(f21969a, 0, iArr, 0, i3);
        return iArr;
    }
}
