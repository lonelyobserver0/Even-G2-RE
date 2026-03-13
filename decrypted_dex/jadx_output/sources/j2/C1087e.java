package j2;

import android.text.TextUtils;
import com.stub.StubApp;
import i2.o;
import i2.p;
import i2.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1087e extends Y3.a {

    /* renamed from: n, reason: collision with root package name */
    public static final String f15273n = o.g(StubApp.getString2(18971));

    /* renamed from: f, reason: collision with root package name */
    public final k f15274f;

    /* renamed from: g, reason: collision with root package name */
    public final String f15275g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15276h;

    /* renamed from: i, reason: collision with root package name */
    public final List f15277i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f15278k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public boolean f15279l;

    /* renamed from: m, reason: collision with root package name */
    public V6.b f15280m;

    public C1087e(k kVar, String str, int i3, List list) {
        this.f15274f = kVar;
        this.f15275g = str;
        this.f15276h = i3;
        this.f15277i = list;
        this.j = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((p) list.get(i10)).f14747a.toString();
            this.j.add(uuid);
            this.f15278k.add(uuid);
        }
    }

    public static HashSet H(C1087e c1087e) {
        HashSet hashSet = new HashSet();
        c1087e.getClass();
        return hashSet;
    }

    public final t G() {
        if (this.f15279l) {
            o e10 = o.e();
            String join = TextUtils.join(StubApp.getString2(81), this.j);
            e10.h(f15273n, E1.a.k(StubApp.getString2(18972), join, StubApp.getString2(74)), new Throwable[0]);
        } else {
            s2.b bVar = new s2.b(this);
            this.f15274f.f15299f.j(bVar);
            this.f15280m = bVar.f20704b;
        }
        return this.f15280m;
    }
}
