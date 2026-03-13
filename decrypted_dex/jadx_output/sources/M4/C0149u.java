package M4;

import f5.u0;
import java.util.Map;

/* renamed from: M4.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0149u extends AbstractC0142m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4653a;

    /* renamed from: b, reason: collision with root package name */
    public int f4654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0150v f4655c;

    public C0149u(C0150v c0150v, int i3) {
        this.f4655c = c0150v;
        Object obj = C0150v.f4656k;
        this.f4653a = c0150v.j()[i3];
        this.f4654b = i3;
    }

    public final void a() {
        int i3 = this.f4654b;
        Object obj = this.f4653a;
        C0150v c0150v = this.f4655c;
        if (i3 != -1 && i3 < c0150v.size()) {
            if (u0.j(obj, c0150v.j()[this.f4654b])) {
                return;
            }
        }
        Object obj2 = C0150v.f4656k;
        this.f4654b = c0150v.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4653a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0150v c0150v = this.f4655c;
        Map c10 = c0150v.c();
        if (c10 != null) {
            return c10.get(this.f4653a);
        }
        a();
        int i3 = this.f4654b;
        if (i3 == -1) {
            return null;
        }
        return c0150v.k()[i3];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0150v c0150v = this.f4655c;
        Map c10 = c0150v.c();
        Object obj2 = this.f4653a;
        if (c10 != null) {
            return c10.put(obj2, obj);
        }
        a();
        int i3 = this.f4654b;
        if (i3 == -1) {
            c0150v.put(obj2, obj);
            return null;
        }
        Object obj3 = c0150v.k()[i3];
        c0150v.k()[this.f4654b] = obj;
        return obj3;
    }
}
