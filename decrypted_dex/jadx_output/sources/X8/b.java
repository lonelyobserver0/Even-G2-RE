package X8;

import com.mapbox.navigator.DRSensorFusionState;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8505a;

    static {
        int[] iArr = new int[DRSensorFusionState.values().length];
        try {
            iArr[DRSensorFusionState.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DRSensorFusionState.COLD_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DRSensorFusionState.INITIALIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DRSensorFusionState.NORMAL_OPERATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DRSensorFusionState.FAILURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f8505a = iArr;
    }
}
