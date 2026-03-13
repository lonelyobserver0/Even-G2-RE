package D9;

import com.mapbox.common.NetworkStatus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1510a;

    static {
        int[] iArr = new int[NetworkStatus.values().length];
        try {
            iArr[NetworkStatus.NOT_REACHABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NetworkStatus.REACHABLE_VIA_WI_FI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NetworkStatus.REACHABLE_VIA_ETHERNET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NetworkStatus.REACHABLE_VIA_WWAN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f1510a = iArr;
    }
}
