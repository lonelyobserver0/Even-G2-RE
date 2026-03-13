package l2;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.stub.StubApp;
import i2.o;
import s2.i;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15865a;

    /* renamed from: b, reason: collision with root package name */
    public final h f15866b;

    public /* synthetic */ f(h hVar, int i3) {
        this.f15865a = i3;
        this.f15866b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar;
        f fVar;
        boolean isEmpty;
        boolean isEmpty2;
        switch (this.f15865a) {
            case 0:
                String string2 = StubApp.getString2(19360);
                synchronized (this.f15866b.f15879h) {
                    h hVar2 = this.f15866b;
                    hVar2.j = (Intent) hVar2.f15879h.get(0);
                }
                Intent intent = this.f15866b.j;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.f15866b.j.getIntExtra(StubApp.getString2(19361), 0);
                    o e10 = o.e();
                    String str = h.f15871l;
                    e10.b(str, String.format(StubApp.getString2(19362), this.f15866b.j, Integer.valueOf(intExtra)), new Throwable[0]);
                    PowerManager.WakeLock a3 = i.a(this.f15866b.f15872a, action + StubApp.getString2(1561) + intExtra + StubApp.getString2(74));
                    try {
                        o.e().b(str, string2 + action + StubApp.getString2("3046") + a3, new Throwable[0]);
                        a3.acquire();
                        h hVar3 = this.f15866b;
                        hVar3.f15877f.d(hVar3.j, intExtra, hVar3);
                        o.e().b(str, StubApp.getString2(19363) + action + StubApp.getString2(3046) + a3, new Throwable[0]);
                        a3.release();
                        hVar = this.f15866b;
                        fVar = new f(hVar, 1);
                    } catch (Throwable th) {
                        try {
                            o e11 = o.e();
                            String str2 = h.f15871l;
                            e11.d(str2, StubApp.getString2("19364"), th);
                            o.e().b(str2, StubApp.getString2(19363) + action + StubApp.getString2(3046) + a3, new Throwable[0]);
                            a3.release();
                            hVar = this.f15866b;
                            fVar = new f(hVar, 1);
                        } catch (Throwable th2) {
                            o.e().b(h.f15871l, StubApp.getString2(19363) + action + StubApp.getString2(3046) + a3, new Throwable[0]);
                            a3.release();
                            h hVar4 = this.f15866b;
                            hVar4.e(new f(hVar4, 1));
                            throw th2;
                        }
                    }
                    hVar.e(fVar);
                    return;
                }
                return;
            default:
                h hVar5 = this.f15866b;
                hVar5.getClass();
                o e12 = o.e();
                String str3 = h.f15871l;
                e12.b(str3, StubApp.getString2(19356), new Throwable[0]);
                hVar5.b();
                synchronized (hVar5.f15879h) {
                    try {
                        if (hVar5.j != null) {
                            o.e().b(str3, String.format(StubApp.getString2("19357"), hVar5.j), new Throwable[0]);
                            if (!((Intent) hVar5.f15879h.remove(0)).equals(hVar5.j)) {
                                throw new IllegalStateException(StubApp.getString2("19358"));
                            }
                            hVar5.j = null;
                        }
                        s2.g gVar = (s2.g) hVar5.f15873b.f20820a;
                        b bVar = hVar5.f15877f;
                        synchronized (bVar.f15850c) {
                            isEmpty = bVar.f15849b.isEmpty();
                        }
                        if (isEmpty && hVar5.f15879h.isEmpty()) {
                            synchronized (gVar.f20717c) {
                                isEmpty2 = gVar.f20715a.isEmpty();
                            }
                            if (isEmpty2) {
                                o.e().b(str3, StubApp.getString2("19359"), new Throwable[0]);
                                SystemAlarmService systemAlarmService = hVar5.f15880k;
                                if (systemAlarmService != null) {
                                    systemAlarmService.b();
                                }
                            }
                        }
                        if (!hVar5.f15879h.isEmpty()) {
                            hVar5.f();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}
