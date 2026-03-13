package C3;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f1113a;

    /* renamed from: b, reason: collision with root package name */
    public final d f1114b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1115c;

    public e(Context context, d dVar) {
        E0 e02 = new E0(context, 3);
        this.f1115c = new HashMap();
        this.f1113a = e02;
        this.f1114b = dVar;
    }

    public final synchronized f a(String str) {
        if (this.f1115c.containsKey(str)) {
            return (f) this.f1115c.get(str);
        }
        CctBackendFactory y10 = this.f1113a.y(str);
        if (y10 == null) {
            return null;
        }
        d dVar = this.f1114b;
        f create = y10.create(new b(dVar.f1110a, dVar.f1111b, dVar.f1112c, str));
        this.f1115c.put(str, create);
        return create;
    }
}
