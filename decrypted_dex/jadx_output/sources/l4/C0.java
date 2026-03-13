package l4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0 f15921b;

    public /* synthetic */ C0(P0 p02, int i3) {
        this.f15920a = i3;
        this.f15921b = p02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15920a) {
            case 0:
                this.f15921b.G();
                break;
            case 1:
                C1197m0 c1197m0 = this.f15921b.f16220t;
                C1200n0 c1200n0 = c1197m0.f16515a;
                C1191k0 c1191k0 = c1200n0.f16542g;
                C1200n0.l(c1191k0);
                c1191k0.k();
                if (c1197m0.d()) {
                    boolean c10 = c1197m0.c();
                    String string2 = StubApp.getString2(19517);
                    P0 p02 = c1200n0.f16547n;
                    C1164b0 c1164b0 = c1200n0.f16540e;
                    if (c10) {
                        C1200n0.j(c1164b0);
                        c1164b0.f16387z.l(null);
                        Bundle bundle = new Bundle();
                        String string22 = StubApp.getString2(376);
                        String string23 = StubApp.getString2(19597);
                        bundle.putString(string22, string23);
                        bundle.putString(StubApp.getString2(1189), string23);
                        bundle.putString(StubApp.getString2(3151), StubApp.getString2(19598));
                        bundle.putLong(string2, 1L);
                        C1200n0.k(p02);
                        p02.r(StubApp.getString2(3305), StubApp.getString2(3155), bundle);
                    } else {
                        C1200n0.j(c1164b0);
                        O0.l lVar = c1164b0.f16387z;
                        String k3 = lVar.k();
                        if (TextUtils.isEmpty(k3)) {
                            T t3 = c1200n0.f16541f;
                            C1200n0.l(t3);
                            t3.f16243g.b(StubApp.getString2(19599));
                        } else {
                            long g10 = c1164b0.f16366A.g() / 3600000;
                            Uri parse = Uri.parse(k3);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong(string2, (g10 - 1) * 3600000);
                            Object obj = pair.first;
                            String string24 = obj == null ? StubApp.getString2(4849) : (String) obj;
                            C1200n0.k(p02);
                            p02.r(string24, StubApp.getString2(1191), (Bundle) pair.second);
                        }
                        lVar.l(null);
                    }
                    C1200n0.j(c1164b0);
                    c1164b0.f16366A.h(0L);
                    break;
                }
                break;
            case 2:
                P0 p03 = this.f15921b;
                p03.k();
                C1200n0 c1200n02 = (C1200n0) p03.f4728a;
                C1164b0 c1164b02 = c1200n02.f16540e;
                C1200n0.j(c1164b02);
                boolean a3 = c1164b02.f16384w.a();
                T t10 = c1200n02.f16541f;
                if (a3) {
                    C1200n0.l(t10);
                    t10.f16248n.b(StubApp.getString2(19596));
                    break;
                } else {
                    C1164b0 c1164b03 = c1200n02.f16540e;
                    C1200n0.j(c1164b03);
                    C1161a0 c1161a0 = c1164b03.f16385x;
                    long g11 = c1161a0.g();
                    c1161a0.h(1 + g11);
                    if (g11 >= 5) {
                        C1200n0.l(t10);
                        t10.j.b(StubApp.getString2(19595));
                        c1164b03.f16384w.b(true);
                        break;
                    } else {
                        if (p03.f16222w == null) {
                            p03.f16222w = new D0(p03, c1200n02, 3);
                        }
                        p03.f16222w.b(0L);
                        break;
                    }
                }
            default:
                this.f15921b.G();
                break;
        }
    }

    public C0(P0 p02) {
        this.f15920a = 1;
        Objects.requireNonNull(p02);
        this.f15921b = p02;
    }
}
