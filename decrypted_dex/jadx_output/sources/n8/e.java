package n8;

import com.mapbox.common.SessionSKUIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17884a;

    static {
        int[] iArr = new int[SessionSKUIdentifier.values().length];
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_CORE_AGTRIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_CORE_FDTRIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_UX_AGTRIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV3_SES_UX_FDTRIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV2_SES_TRIP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SessionSKUIdentifier.NAV2_SES_FDTRIP.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f17884a = iArr;
    }
}
