package J7;

import com.mapbox.navigator.RouterOrigin;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3452a;

    static {
        int[] iArr = new int[RouterOrigin.values().length];
        try {
            iArr[RouterOrigin.ONLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouterOrigin.ONBOARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouterOrigin.CUSTOM_EXTERNAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouterOrigin.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f3452a = iArr;
    }
}
