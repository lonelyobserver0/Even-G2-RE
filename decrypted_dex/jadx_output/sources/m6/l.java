package m6;

import Z9.C0366a;
import a0.C0379a;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.stub.StubApp;
import java.util.Objects;
import o0.C1428c;
import p0.AbstractC1482f;
import r0.AbstractC1560u;
import sb.C1644e0;
import x0.s;
import x0.v;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Handler f17109a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17110b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17111c;

    /* renamed from: d, reason: collision with root package name */
    public Object f17112d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f17113e;

    /* renamed from: f, reason: collision with root package name */
    public Object f17114f;

    /* renamed from: g, reason: collision with root package name */
    public Object f17115g;

    /* renamed from: h, reason: collision with root package name */
    public Object f17116h;

    /* renamed from: i, reason: collision with root package name */
    public Object f17117i;
    public Object j;

    public l(n6.f fVar, i iVar, Handler handler) {
        this.f17110b = false;
        this.f17116h = new Object();
        this.f17117i = new J4.e(this, 2);
        this.j = new C0366a(this, 17);
        Y3.a.C();
        this.f17111c = fVar;
        this.f17114f = iVar;
        this.f17113e = handler;
    }

    public void a(x0.b bVar) {
        O0.q qVar;
        if (!this.f17110b || bVar.equals((x0.b) this.f17116h)) {
            return;
        }
        this.f17116h = bVar;
        s sVar = (s) ((C1644e0) this.f17112d).f20953b;
        sVar.getClass();
        Looper myLooper = Looper.myLooper();
        Looper looper = sVar.f22770f0;
        if (looper != myLooper) {
            throw new IllegalStateException(AbstractC1482f.j(StubApp.getString2(21086), myLooper == null ? StubApp.getString2(1116) : myLooper.getThread().getName(), StubApp.getString2(21087), looper == null ? StubApp.getString2(1116) : looper.getThread().getName(), StubApp.getString2(74)));
        }
        if (bVar.equals(sVar.f22788w)) {
            return;
        }
        sVar.f22788w = bVar;
        C0379a c0379a = sVar.f22783r;
        if (c0379a != null) {
            v vVar = (v) c0379a.f9233b;
            synchronized (vVar.f21716a) {
                qVar = vVar.f21731s;
            }
            if (qVar != null) {
                synchronized (qVar.f5173c) {
                    qVar.f5176f.getClass();
                }
            }
        }
    }

    public void b(AudioDeviceInfo audioDeviceInfo) {
        C0366a c0366a = (C0366a) this.f17117i;
        AudioDeviceInfo audioDeviceInfo2 = c0366a == null ? null : (AudioDeviceInfo) c0366a.f9105b;
        int i3 = AbstractC1560u.f20190a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        C0366a c0366a2 = audioDeviceInfo != null ? new C0366a(audioDeviceInfo, 26) : null;
        this.f17117i = c0366a2;
        a(x0.b.c((Context) this.f17111c, (C1428c) this.j, c0366a2));
    }

    public l(Context context, C1644e0 c1644e0, C1428c c1428c, C0366a c0366a) {
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f17111c = origApplicationContext;
        this.f17112d = c1644e0;
        this.j = c1428c;
        this.f17117i = c0366a;
        int i3 = AbstractC1560u.f20190a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f17109a = handler;
        this.f17113e = AbstractC1560u.f20190a >= 23 ? new Q9.c(this, 2) : null;
        this.f17114f = new R5.f(this, 7);
        x0.b bVar = x0.b.f22641c;
        String str = AbstractC1560u.f20192c;
        Uri uriFor = (StubApp.getString2(69).equals(str) || StubApp.getString2(21084).equals(str)) ? Settings.Global.getUriFor(StubApp.getString2(21085)) : null;
        this.f17115g = uriFor != null ? new x0.c(this, handler, origApplicationContext.getContentResolver(), uriFor) : null;
    }
}
