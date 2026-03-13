package L0;

import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class D implements InterfaceC1542c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0.f f3887b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0123t f3888c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I0.g f3889d;

    public /* synthetic */ D(A0.f fVar, C0123t c0123t, I0.g gVar, int i3) {
        this.f3886a = i3;
        this.f3887b = fVar;
        this.f3888c = c0123t;
        this.f3889d = gVar;
    }

    @Override // r0.InterfaceC1542c
    public final void accept(Object obj) {
        G g10 = (G) obj;
        switch (this.f3886a) {
            case 0:
                A0.f fVar = this.f3887b;
                g10.C(fVar.f32a, fVar.f33b, this.f3888c, this.f3889d);
                break;
            case 1:
                A0.f fVar2 = this.f3887b;
                g10.B(fVar2.f32a, fVar2.f33b, this.f3888c, this.f3889d);
                break;
            default:
                A0.f fVar3 = this.f3887b;
                g10.m(fVar3.f32a, fVar3.f33b, this.f3888c, this.f3889d);
                break;
        }
    }
}
