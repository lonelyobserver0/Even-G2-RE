package f4;

import android.os.Parcel;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class i extends c4.b implements E {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q4.k f13751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13752h;

    public i() {
        super(StubApp.getString2(17496), 2);
    }

    private final void N() {
    }

    @Override // c4.b
    public final boolean M(Parcel parcel, int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                return false;
            }
            a();
            return true;
        }
        C0875C c0875c = (C0875C) g.a(parcel, C0875C.CREATOR);
        g.c(parcel);
        v(c0875c);
        return true;
    }

    @Override // f4.E
    public final void a() {
        switch (this.f13750f) {
            case 0:
                ((n) this.f13752h).N();
                break;
        }
    }

    @Override // f4.E
    public final void v(C0875C c0875c) {
        switch (this.f13750f) {
            case 0:
                a4.f.v(c0875c.f13739a, null, this.f13751g);
                break;
            default:
                a4.f.v(c0875c.f13739a, (Boolean) this.f13752h, this.f13751g);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Boolean bool, q4.k kVar) {
        this();
        this.f13750f = 1;
        this.f13752h = bool;
        this.f13751g = kVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(q4.k kVar, n nVar) {
        this();
        this.f13750f = 0;
        this.f13751g = kVar;
        this.f13752h = nVar;
    }
}
