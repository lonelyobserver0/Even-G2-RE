package u5;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;
import q4.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c implements e, f {

    /* renamed from: a, reason: collision with root package name */
    public final R4.d f21445a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21446b;

    /* renamed from: c, reason: collision with root package name */
    public final w5.b f21447c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f21448d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f21449e;

    public c(Context context, String str, Set set, w5.b bVar, Executor executor) {
        this.f21445a = new R4.d(context, str);
        this.f21448d = set;
        this.f21449e = executor;
        this.f21447c = bVar;
        this.f21446b = context;
    }

    public final s a() {
        if (!((UserManager) this.f21446b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return a4.f.m("");
        }
        return a4.f.e(this.f21449e, new b(this, 0));
    }

    public final void b() {
        if (this.f21448d.size() <= 0) {
            a4.f.m(null);
        } else if (!((UserManager) this.f21446b.getSystemService(UserManager.class)).isUserUnlocked()) {
            a4.f.m(null);
        } else {
            a4.f.e(this.f21449e, new b(this, 1));
        }
    }
}
