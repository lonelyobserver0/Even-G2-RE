package C2;

import androidx.lifecycle.EnumC0439n;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1048a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1049b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1050c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1051d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1052e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1053f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1054g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1055h;

    public c(M1.e owner, J2.d onAttach) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onAttach, "onAttach");
        this.f1051d = owner;
        this.f1052e = onAttach;
        this.f1053f = new u5.d(14);
        this.f1054g = new LinkedHashMap();
        this.f1050c = true;
    }

    public void a() {
        M1.e eVar = (M1.e) this.f1051d;
        if (eVar.i().f9925c != EnumC0439n.f9914b) {
            throw new IllegalStateException(StubApp.getString2(958));
        }
        if (this.f1048a) {
            throw new IllegalStateException(StubApp.getString2(957));
        }
        ((J2.d) this.f1052e).invoke();
        eVar.i().a(new N1.a(this, 0));
        this.f1048a = true;
    }

    public c(String str, String str2, String str3, a aVar, boolean z2, boolean z10, boolean z11, Integer num) {
        this.f1051d = str;
        this.f1052e = str2;
        this.f1053f = str3;
        this.f1054g = aVar;
        this.f1048a = z2;
        this.f1049b = z10;
        this.f1050c = z11;
        this.f1055h = num;
    }
}
