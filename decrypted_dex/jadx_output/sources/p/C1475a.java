package p;

import java.util.HashMap;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1475a extends f {

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f19587e = new HashMap();

    @Override // p.f
    public final c a(Object obj) {
        return (c) this.f19587e.get(obj);
    }

    @Override // p.f
    public final Object b(Object obj) {
        Object b2 = super.b(obj);
        this.f19587e.remove(obj);
        return b2;
    }
}
