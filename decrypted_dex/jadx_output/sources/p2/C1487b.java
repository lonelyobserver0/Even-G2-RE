package p2;

import android.content.Intent;
import android.content.IntentFilter;
import com.stub.StubApp;
import i2.o;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1487b extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f19656i = o.g(StubApp.getString2(22087));

    @Override // p2.d
    public final Object a() {
        Intent registerReceiver = this.f19661b.registerReceiver(null, new IntentFilter(StubApp.getString2(5738)));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra(StubApp.getString2(8430), -1) == 1 || ((float) registerReceiver.getIntExtra(StubApp.getString2(9577), -1)) / ((float) registerReceiver.getIntExtra(StubApp.getString2(9578), -1)) > 0.15f);
        }
        o.e().d(f19656i, StubApp.getString2(22081), new Throwable[0]);
        return null;
    }

    @Override // p2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(22088));
        intentFilter.addAction(StubApp.getString2(22089));
        return intentFilter;
    }

    @Override // p2.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o e10 = o.e();
        String action = intent.getAction();
        e10.b(f19656i, E1.a.j(StubApp.getString2(22084), action), new Throwable[0]);
        String action2 = intent.getAction();
        action2.getClass();
        if (action2.equals(StubApp.getString2(22088))) {
            c(Boolean.TRUE);
        } else if (action2.equals(StubApp.getString2(22089))) {
            c(Boolean.FALSE);
        }
    }
}
