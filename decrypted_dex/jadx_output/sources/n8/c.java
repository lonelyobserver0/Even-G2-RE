package n8;

import com.mapbox.common.BillingServiceErrorCode;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17881a;

    static {
        int[] iArr = new int[BillingServiceErrorCode.values().length];
        try {
            iArr[BillingServiceErrorCode.RESUME_FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BillingServiceErrorCode.TOKEN_VALIDATION_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f17881a = iArr;
    }
}
