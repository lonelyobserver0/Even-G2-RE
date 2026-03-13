package O4;

import java.math.RoundingMode;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5207a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f5207a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5207a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5207a[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5207a[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5207a[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5207a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5207a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5207a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
