package p2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.stub.StubApp;
import i2.o;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f19657h = o.g(StubApp.getString2(22090));

    /* renamed from: g, reason: collision with root package name */
    public final R5.f f19658g;

    public c(Context context, C1608a c1608a) {
        super(context, c1608a);
        this.f19658g = new R5.f(this, 5);
    }

    @Override // p2.d
    public final void d() {
        o.e().b(f19657h, getClass().getSimpleName().concat(StubApp.getString2(22091)), new Throwable[0]);
        this.f19661b.registerReceiver(this.f19658g, f());
    }

    @Override // p2.d
    public final void e() {
        o.e().b(f19657h, getClass().getSimpleName().concat(StubApp.getString2(22092)), new Throwable[0]);
        this.f19661b.unregisterReceiver(this.f19658g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
