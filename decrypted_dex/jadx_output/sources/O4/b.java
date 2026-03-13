package O4;

import java.math.RoundingMode;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5205a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f5205a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5205a[RoundingMode.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5205a[RoundingMode.CEILING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5205a[RoundingMode.DOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5205a[RoundingMode.UP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5205a[RoundingMode.HALF_EVEN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5205a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5205a[RoundingMode.HALF_DOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
