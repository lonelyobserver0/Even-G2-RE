package p2;

import B3.q;
import android.content.Context;
import com.stub.StubApp;
import i2.o;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import l4.O0;
import o2.AbstractC1455b;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f19659f = o.g(StubApp.getString2(22093));

    /* renamed from: a, reason: collision with root package name */
    public final C1608a f19660a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19661b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19662c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f19663d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f19664e;

    public d(Context context, C1608a c1608a) {
        this.f19661b = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f19660a = c1608a;
    }

    public abstract Object a();

    public final void b(AbstractC1455b abstractC1455b) {
        synchronized (this.f19662c) {
            try {
                if (this.f19663d.remove(abstractC1455b) && this.f19663d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f19662c) {
            try {
                Object obj2 = this.f19664e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f19664e = obj;
                    ((q) this.f19660a.f20822c).execute(new O0(this, new ArrayList(this.f19663d), 7, false));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
