package y0;

import android.os.Handler;
import android.os.Message;
import d1.C0797b;
import f4.C0879c;
import java.util.TreeMap;
import r0.AbstractC1560u;
import z0.C1987c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final P0.e f23434a;

    /* renamed from: b, reason: collision with root package name */
    public final C0879c f23435b;

    /* renamed from: f, reason: collision with root package name */
    public C1987c f23439f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23440g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23441h;
    public boolean j;

    /* renamed from: e, reason: collision with root package name */
    public final TreeMap f23438e = new TreeMap();

    /* renamed from: d, reason: collision with root package name */
    public final Handler f23437d = AbstractC1560u.m(this);

    /* renamed from: c, reason: collision with root package name */
    public final C0797b f23436c = new C0797b(1);

    public m(C1987c c1987c, C0879c c0879c, P0.e eVar) {
        this.f23439f = c1987c;
        this.f23435b = c0879c;
        this.f23434a = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.j) {
            if (message.what != 1) {
                return false;
            }
            k kVar = (k) message.obj;
            long j = kVar.f23427a;
            TreeMap treeMap = this.f23438e;
            long j3 = kVar.f23428b;
            Long l9 = (Long) treeMap.get(Long.valueOf(j3));
            if (l9 == null) {
                treeMap.put(Long.valueOf(j3), Long.valueOf(j));
                return true;
            }
            if (l9.longValue() > j) {
                treeMap.put(Long.valueOf(j3), Long.valueOf(j));
            }
        }
        return true;
    }
}
