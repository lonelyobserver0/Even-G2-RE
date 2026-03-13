package p2;

import android.content.Intent;
import android.content.IntentFilter;
import com.stub.StubApp;
import i2.o;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class g extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f19669i = o.g(StubApp.getString2(22102));

    @Override // p2.d
    public final Object a() {
        Intent registerReceiver = this.f19661b.registerReceiver(null, f());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals(StubApp.getString2(22103))) {
            return Boolean.FALSE;
        }
        if (action.equals(StubApp.getString2(22104))) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // p2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(22104));
        intentFilter.addAction(StubApp.getString2(22103));
        return intentFilter;
    }

    @Override // p2.c
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        o e10 = o.e();
        String action = intent.getAction();
        e10.b(f19669i, E1.a.j(StubApp.getString2(22084), action), new Throwable[0]);
        String action2 = intent.getAction();
        action2.getClass();
        if (action2.equals(StubApp.getString2(22103))) {
            c(Boolean.FALSE);
        } else if (action2.equals(StubApp.getString2(22104))) {
            c(Boolean.TRUE);
        }
    }
}
