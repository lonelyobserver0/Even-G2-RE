package E9;

import com.mapbox.common.ResourceLoadStatus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2066a;

    static {
        int[] iArr = new int[ResourceLoadStatus.values().length];
        try {
            iArr[ResourceLoadStatus.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ResourceLoadStatus.UNAUTHORIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ResourceLoadStatus.NOT_FOUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2066a = iArr;
    }
}
