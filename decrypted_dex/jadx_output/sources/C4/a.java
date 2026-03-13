package C4;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.internal.measurement.F1;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1117b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1118c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1119d;

    public a(Context context) {
        TypedValue v2 = F1.v(context, 2130903332);
        this.f1116a = (v2 == null || v2.type != 18 || v2.data == 0) ? false : true;
        TypedValue v8 = F1.v(context, 2130903331);
        this.f1117b = v8 != null ? v8.data : 0;
        TypedValue v10 = F1.v(context, 2130903249);
        this.f1118c = v10 != null ? v10.data : 0;
        this.f1119d = context.getResources().getDisplayMetrics().density;
    }
}
