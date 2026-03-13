package z5;

import C2.i;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import x5.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f24120d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f24121e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f24122a;

    /* renamed from: b, reason: collision with root package name */
    public long f24123b;

    /* renamed from: c, reason: collision with root package name */
    public int f24124c;

    public d() {
        if (i.f1076b == null) {
            Pattern pattern = j.f22889c;
            i.f1076b = new i();
        }
        i iVar = i.f1076b;
        if (j.f22890d == null) {
            j.f22890d = new j(iVar);
        }
        this.f24122a = j.f22890d;
    }

    public final synchronized boolean a() {
        boolean z2;
        if (this.f24124c != 0) {
            this.f24122a.f22891a.getClass();
            z2 = System.currentTimeMillis() > this.f24123b;
        }
        return z2;
    }

    public final synchronized void b(int i3) {
        long min;
        if ((i3 >= 200 && i3 < 300) || i3 == 401 || i3 == 404) {
            synchronized (this) {
                this.f24124c = 0;
            }
            return;
        }
        this.f24124c++;
        synchronized (this) {
            if (i3 == 429 || (i3 >= 500 && i3 < 600)) {
                double pow = Math.pow(2.0d, this.f24124c);
                this.f24122a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f24121e);
            } else {
                min = f24120d;
            }
            this.f24122a.f22891a.getClass();
            this.f24123b = System.currentTimeMillis() + min;
        }
        return;
    }
}
