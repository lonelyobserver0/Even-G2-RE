package q0;

import android.os.Bundle;
import android.text.Spanned;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19862a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f19863b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f19864c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f19865d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f19866e;

    static {
        int i3 = AbstractC1560u.f20190a;
        f19862a = Integer.toString(0, 36);
        f19863b = Integer.toString(1, 36);
        f19864c = Integer.toString(2, 36);
        f19865d = Integer.toString(3, 36);
        f19866e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i3, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f19862a, spanned.getSpanStart(obj));
        bundle2.putInt(f19863b, spanned.getSpanEnd(obj));
        bundle2.putInt(f19864c, spanned.getSpanFlags(obj));
        bundle2.putInt(f19865d, i3);
        if (bundle != null) {
            bundle2.putBundle(f19866e, bundle);
        }
        return bundle2;
    }
}
