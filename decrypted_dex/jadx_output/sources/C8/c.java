package C8;

import D9.l;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.EnumC0439n;
import androidx.lifecycle.InterfaceC0444t;
import com.stub.StubApp;
import java.util.HashSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InterfaceC0444t {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f1137a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1138b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f1139c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f1140d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public int f1141e;

    /* renamed from: f, reason: collision with root package name */
    public int f1142f;

    /* renamed from: g, reason: collision with root package name */
    public final C0446v f1143g;

    /* renamed from: h, reason: collision with root package name */
    public final b f1144h;

    public c() {
        C0446v c0446v = new C0446v(this);
        c0446v.g(EnumC0439n.f9914b);
        this.f1143g = c0446v;
        this.f1144h = new b(this);
        new a(this, 0);
    }

    public static final void b(c cVar, EnumC0439n enumC0439n) {
        C0446v c0446v = cVar.f1143g;
        if (c0446v.f9925c != enumC0439n) {
            c0446v.g(enumC0439n);
            l.f(StubApp.getString2(1210) + c0446v.f9925c, StubApp.getString2(1196));
        }
    }

    @Override // androidx.lifecycle.InterfaceC0444t
    public final C0446v i() {
        return this.f1143g;
    }
}
