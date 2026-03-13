package D9;

import com.mapbox.common.LoggingLevel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1514a;

    static {
        int[] iArr = new int[LoggingLevel.values().length];
        try {
            iArr[LoggingLevel.DEBUG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LoggingLevel.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LoggingLevel.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LoggingLevel.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f1514a = iArr;
    }
}
