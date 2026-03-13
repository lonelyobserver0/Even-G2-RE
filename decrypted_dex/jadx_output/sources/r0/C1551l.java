package r0;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: r0.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1551l extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final C1552m f20166a;

    public C1551l(C1552m c1552m) {
        this.f20166a = c1552m;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z2 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        C1552m.a(z2 ? 10 : 5, this.f20166a);
    }
}
