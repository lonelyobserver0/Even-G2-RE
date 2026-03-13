package l2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.stub.StubApp;
import i2.o;
import j2.InterfaceC1083a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.C1382c;
import n2.InterfaceC1381b;
import p0.AbstractC1482f;
import s2.i;
import s2.n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e implements InterfaceC1381b, InterfaceC1083a, n {

    /* renamed from: k, reason: collision with root package name */
    public static final String f15856k = o.g(StubApp.getString2(19343));

    /* renamed from: a, reason: collision with root package name */
    public final Context f15857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15858b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15859c;

    /* renamed from: d, reason: collision with root package name */
    public final h f15860d;

    /* renamed from: e, reason: collision with root package name */
    public final C1382c f15861e;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f15864h;
    public boolean j = false;

    /* renamed from: g, reason: collision with root package name */
    public int f15863g = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f15862f = new Object();

    public e(Context context, int i3, String str, h hVar) {
        this.f15857a = context;
        this.f15858b = i3;
        this.f15860d = hVar;
        this.f15859c = str;
        this.f15861e = new C1382c(context, hVar.f15873b, this);
    }

    public final void a() {
        String string2 = StubApp.getString2(19344);
        synchronized (this.f15862f) {
            try {
                this.f15861e.c();
                this.f15860d.f15874c.b(this.f15859c);
                PowerManager.WakeLock wakeLock = this.f15864h;
                if (wakeLock != null && wakeLock.isHeld()) {
                    o.e().b(f15856k, string2 + this.f15864h + StubApp.getString2("19345") + this.f15859c, new Throwable[0]);
                    this.f15864h.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f15859c;
        sb2.append(str);
        sb2.append(StubApp.getString2(1561));
        this.f15864h = i.a(this.f15857a, AbstractC1482f.f(this.f15858b, StubApp.getString2(74), sb2));
        o e10 = o.e();
        PowerManager.WakeLock wakeLock = this.f15864h;
        String str2 = f15856k;
        e10.b(str2, StubApp.getString2(19346) + wakeLock + StubApp.getString2(19345) + str, new Throwable[0]);
        this.f15864h.acquire();
        r2.f k3 = this.f15860d.f15876e.f15298e.u().k(str);
        if (k3 == null) {
            d();
            return;
        }
        boolean b2 = k3.b();
        this.j = b2;
        if (b2) {
            this.f15861e.b(Collections.singletonList(k3));
        } else {
            o.e().b(str2, E1.a.j(StubApp.getString2(19347), str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // j2.InterfaceC1083a
    public final void c(String str, boolean z2) {
        o.e().b(f15856k, StubApp.getString2(19348) + str + StubApp.getString2(81) + z2, new Throwable[0]);
        a();
        int i3 = this.f15858b;
        h hVar = this.f15860d;
        Context context = this.f15857a;
        if (z2) {
            hVar.e(new g(i3, 0, hVar, b.b(context, this.f15859c)));
        }
        if (this.j) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction(StubApp.getString2(19318));
            hVar.e(new g(i3, 0, hVar, intent));
        }
    }

    public final void d() {
        String string2 = StubApp.getString2(19349);
        String string22 = StubApp.getString2(19350);
        String string23 = StubApp.getString2(18955);
        String string24 = StubApp.getString2(19351);
        synchronized (this.f15862f) {
            try {
                if (this.f15863g < 2) {
                    this.f15863g = 2;
                    o e10 = o.e();
                    String str = f15856k;
                    e10.b(str, string24 + this.f15859c, new Throwable[0]);
                    Context context = this.f15857a;
                    String str2 = this.f15859c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction(StubApp.getString2("19331"));
                    intent.putExtra(StubApp.getString2("19316"), str2);
                    h hVar = this.f15860d;
                    hVar.e(new g(this.f15858b, 0, hVar, intent));
                    if (this.f15860d.f15875d.d(this.f15859c)) {
                        o.e().b(str, string23 + this.f15859c + StubApp.getString2("19352"), new Throwable[0]);
                        Intent b2 = b.b(this.f15857a, this.f15859c);
                        h hVar2 = this.f15860d;
                        hVar2.e(new g(this.f15858b, 0, hVar2, b2));
                    } else {
                        o.e().b(str, string22 + this.f15859c + StubApp.getString2("19353"), new Throwable[0]);
                    }
                } else {
                    o.e().b(f15856k, string2 + this.f15859c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n2.InterfaceC1381b
    public final void e(ArrayList arrayList) {
        d();
    }

    @Override // n2.InterfaceC1381b
    public final void f(List list) {
        String string2 = StubApp.getString2(19354);
        String string22 = StubApp.getString2(19355);
        if (list.contains(this.f15859c)) {
            synchronized (this.f15862f) {
                try {
                    if (this.f15863g == 0) {
                        this.f15863g = 1;
                        o.e().b(f15856k, string22 + this.f15859c, new Throwable[0]);
                        if (this.f15860d.f15875d.g(this.f15859c, null)) {
                            this.f15860d.f15874c.a(this.f15859c, this);
                        } else {
                            a();
                        }
                    } else {
                        o.e().b(f15856k, string2 + this.f15859c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
