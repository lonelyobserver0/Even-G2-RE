package R4;

import W4.s;
import android.content.Context;
import t5.InterfaceC1732c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements w5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6185b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6186c;

    public /* synthetic */ d(int i3, Object obj, Object obj2) {
        this.f6184a = i3;
        this.f6185b = obj;
        this.f6186c = obj2;
    }

    @Override // w5.b
    public final Object get() {
        switch (this.f6184a) {
            case 0:
                h hVar = (h) this.f6185b;
                return new B5.a((Context) this.f6186c, hVar.g(), (InterfaceC1732c) hVar.f6196d.get(InterfaceC1732c.class));
            case 1:
                W4.f fVar = (W4.f) this.f6185b;
                fVar.getClass();
                W4.b bVar = (W4.b) this.f6186c;
                return bVar.f8120f.h(new s(bVar, fVar));
            default:
                return new u5.g((Context) this.f6186c, (String) this.f6185b);
        }
    }

    public /* synthetic */ d(Context context, String str) {
        this.f6184a = 2;
        this.f6186c = context;
        this.f6185b = str;
    }
}
