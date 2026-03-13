package J7;

import com.mapbox.navigator.WaypointType;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3433a;

    static {
        int[] iArr = new int[WaypointType.values().length];
        try {
            iArr[WaypointType.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WaypointType.SILENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WaypointType.EV_CHARGING_SERVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WaypointType.EV_CHARGING_USER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f3433a = iArr;
    }
}
