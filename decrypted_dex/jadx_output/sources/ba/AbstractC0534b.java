package ba;

import R5.f;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import i.v;
import java.io.Serializable;
import java.util.HashMap;
import m.s;
import t.C1697j;

/* renamed from: ba.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0534b {

    /* renamed from: a, reason: collision with root package name */
    public Object f10727a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10728b;

    public AbstractC0534b(Serializable serializable) {
        this.f10727a = null;
        this.f10728b = serializable;
    }

    public void c(int i3, String str) {
        ((HashMap) this.f10727a).put(Integer.valueOf(i3), str);
        ((HashMap) this.f10728b).put(str, Integer.valueOf(i3));
    }

    public void d() {
        f fVar = (f) this.f10727a;
        if (fVar != null) {
            try {
                ((v) this.f10728b).f14669l.unregisterReceiver(fVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f10727a = null;
        }
    }

    public abstract IntentFilter e();

    public Object f() {
        Serializable serializable = (Serializable) this.f10727a;
        return serializable == null ? (Serializable) this.f10728b : serializable;
    }

    public abstract int g();

    public MenuItem h(MenuItem menuItem) {
        if (!(menuItem instanceof H.a)) {
            return menuItem;
        }
        H.a aVar = (H.a) menuItem;
        if (((C1697j) this.f10728b) == null) {
            this.f10728b = new C1697j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C1697j) this.f10728b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        s sVar = new s((Context) this.f10727a, aVar);
        ((C1697j) this.f10728b).put(aVar, sVar);
        return sVar;
    }

    public abstract void i();

    public abstract String j();

    public void k() {
        d();
        IntentFilter e10 = e();
        if (e10.countActions() == 0) {
            return;
        }
        if (((f) this.f10727a) == null) {
            this.f10727a = new f(this, 1);
        }
        ((v) this.f10728b).f14669l.registerReceiver((f) this.f10727a, e10);
    }

    public AbstractC0534b() {
        this.f10727a = new HashMap(250);
        this.f10728b = new HashMap(250);
    }

    public AbstractC0534b(Context context) {
        this.f10727a = context;
    }

    public AbstractC0534b(T5.a aVar) {
        this.f10727a = aVar;
        this.f10728b = new a5.c(aVar);
    }

    public AbstractC0534b(v vVar) {
        this.f10728b = vVar;
    }
}
