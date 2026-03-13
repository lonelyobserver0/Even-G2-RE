package J8;

import com.mapbox.navigator.RouteState;
import com.mapbox.navigator.SpeedLimitSign;
import com.mapbox.navigator.SpeedLimitUnit;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3453a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f3454b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f3455c;

    static {
        int[] iArr = new int[RouteState.values().length];
        try {
            iArr[RouteState.INVALID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteState.INITIALIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteState.TRACKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouteState.COMPLETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RouteState.OFF_ROUTE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[RouteState.UNCERTAIN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f3453a = iArr;
        int[] iArr2 = new int[SpeedLimitUnit.values().length];
        try {
            iArr2[SpeedLimitUnit.KILOMETRES_PER_HOUR.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SpeedLimitUnit.MILES_PER_HOUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f3454b = iArr2;
        int[] iArr3 = new int[SpeedLimitSign.values().length];
        try {
            iArr3[SpeedLimitSign.MUTCD.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[SpeedLimitSign.VIENNA.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f3455c = iArr3;
    }
}
