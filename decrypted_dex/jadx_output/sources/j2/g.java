package j2;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends K1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15281c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, int i10, int i11) {
        super(i3, i10);
        this.f15281c = i11;
    }

    @Override // K1.a
    public final void a(P1.c cVar) {
        switch (this.f15281c) {
            case 0:
                cVar.k(StubApp.getString2(4798));
                cVar.k(StubApp.getString2(18981));
                cVar.k(StubApp.getString2(18982));
                cVar.k(StubApp.getString2(18983));
                break;
            case 1:
                cVar.k(StubApp.getString2(18980));
                break;
            case 2:
                cVar.k(StubApp.getString2(18978));
                cVar.k(StubApp.getString2(18979));
                break;
            case 3:
                cVar.k(StubApp.getString2(4801));
                break;
            case 4:
                cVar.k(StubApp.getString2(18977));
                break;
            case 5:
                cVar.k(StubApp.getString2(18976));
                break;
            default:
                cVar.k(StubApp.getString2(18975));
                break;
        }
    }
}
