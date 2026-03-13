package l4;

import android.os.Bundle;
import com.stub.StubApp;
import java.util.Objects;

/* renamed from: l4.p0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1205p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16577a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16582f;

    public RunnableC1205p0(BinderC1212t0 binderC1212t0, String str, String str2, String str3, long j) {
        this.f16578b = str;
        this.f16579c = str2;
        this.f16581e = str3;
        this.f16580d = j;
        Objects.requireNonNull(binderC1212t0);
        this.f16582f = binderC1212t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16577a) {
            case 0:
                String str = (String) this.f16579c;
                BinderC1212t0 binderC1212t0 = (BinderC1212t0) this.f16582f;
                String str2 = (String) this.f16578b;
                if (str2 != null) {
                    X0 x02 = new X0(this.f16580d, (String) this.f16581e, str2);
                    F1 f12 = binderC1212t0.f16629e;
                    f12.b().k();
                    String str3 = f12.f16055K;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    f12.f16055K = str;
                    f12.f16054I = x02;
                    break;
                } else {
                    F1 f13 = binderC1212t0.f16629e;
                    f13.b().k();
                    String str4 = f13.f16055K;
                    if (str4 == null || str4.equals(str)) {
                        f13.f16055K = str;
                        f13.f16054I = null;
                        break;
                    }
                }
                break;
            case 1:
                Object obj = this.f16581e;
                ((P0) this.f16582f).v(this.f16580d, obj, (String) this.f16578b, (String) this.f16579c);
                break;
            default:
                C1162a1 c1162a1 = (C1162a1) this.f16582f;
                c1162a1.getClass();
                Bundle bundle = (Bundle) this.f16578b;
                bundle.remove(StubApp.getString2(20074));
                bundle.remove(StubApp.getString2(20076));
                K1 k12 = ((C1200n0) c1162a1.f4728a).j;
                C1200n0.j(k12);
                c1162a1.u((X0) this.f16579c, (X0) this.f16581e, this.f16580d, true, k12.s(StubApp.getString2(19402), bundle, null, false));
                break;
        }
    }

    public RunnableC1205p0(P0 p02, String str, String str2, Object obj, long j) {
        this.f16578b = str;
        this.f16579c = str2;
        this.f16581e = obj;
        this.f16580d = j;
        Objects.requireNonNull(p02);
        this.f16582f = p02;
    }

    public RunnableC1205p0(C1162a1 c1162a1, Bundle bundle, X0 x02, X0 x03, long j) {
        this.f16578b = bundle;
        this.f16579c = x02;
        this.f16581e = x03;
        this.f16580d = j;
        Objects.requireNonNull(c1162a1);
        this.f16582f = c1162a1;
    }
}
