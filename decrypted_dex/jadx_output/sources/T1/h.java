package T1;

import android.view.View;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7105a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7106b;

    public /* synthetic */ h() {
        this.f7105a = 2;
    }

    @Override // T1.o, T1.m
    public void c(n nVar) {
        switch (this.f7105a) {
            case 2:
                a aVar = (a) this.f7106b;
                if (!aVar.f7084B) {
                    aVar.E();
                    aVar.f7084B = true;
                    break;
                }
                break;
        }
    }

    @Override // T1.m
    public final void d(n nVar) {
        switch (this.f7105a) {
            case 0:
                u uVar = t.f7149a;
                uVar.y((View) this.f7106b, 1.0f);
                uVar.getClass();
                nVar.v(this);
                break;
            case 1:
                ((n) this.f7106b).x();
                nVar.v(this);
                break;
            default:
                a aVar = (a) this.f7106b;
                int i3 = aVar.f7083A - 1;
                aVar.f7083A = i3;
                if (i3 == 0) {
                    aVar.f7084B = false;
                    aVar.m();
                }
                nVar.v(this);
                break;
        }
    }

    public /* synthetic */ h(Object obj, int i3) {
        this.f7105a = i3;
        this.f7106b = obj;
    }
}
