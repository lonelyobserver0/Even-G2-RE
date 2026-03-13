package com.google.android.gms.location;

import Q3.b;
import Q3.d;
import Q3.g;
import android.app.Activity;
import android.content.Context;
import cb.C0585c;
import f4.C0878b;
import i4.InterfaceC1037a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ActivityRecognition {

    @Deprecated
    public static final d API = C0878b.f13741i;

    @Deprecated
    public static final InterfaceC1037a ActivityRecognitionApi = new C0585c(2);

    private ActivityRecognition() {
    }

    public static ActivityRecognitionClient getClient(Activity activity) {
        return new C0878b(activity, activity, C0878b.f13741i, b.f5714a, g.f5719b);
    }

    public static ActivityRecognitionClient getClient(Context context) {
        return new C0878b(context, null, C0878b.f13741i, b.f5714a, g.f5719b);
    }
}
