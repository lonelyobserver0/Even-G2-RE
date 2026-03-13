package L0;

import v0.C1802E;

/* renamed from: L0.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0119o implements L4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4114b;

    public /* synthetic */ C0119o(Object obj, int i3) {
        this.f4113a = i3;
        this.f4114b = obj;
    }

    @Override // L4.k
    public final Object get() {
        switch (this.f4113a) {
            case 0:
                try {
                    return (A) ((Class) this.f4114b).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
            case 1:
                return (A) this.f4114b;
            default:
                return Boolean.valueOf(((C1802E) this.f4114b).f21540F);
        }
    }
}
