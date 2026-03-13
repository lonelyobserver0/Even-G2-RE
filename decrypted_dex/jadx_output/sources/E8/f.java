package E8;

import com.mapbox.navigator.RouterErrorType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1943a;

    static {
        int[] iArr = new int[RouterErrorType.values().length];
        try {
            iArr[RouterErrorType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouterErrorType.THROTTLING_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouterErrorType.INPUT_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouterErrorType.NETWORK_ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RouterErrorType.AUTHENTICATION_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RouterErrorType.ROUTE_CREATION_ERROR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[RouterErrorType.REQUEST_CANCELLED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[RouterErrorType.MAP_MATCHING_CREATION_ERROR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f1943a = iArr;
    }
}
