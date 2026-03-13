package no.nordicsemi.android.ble;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.stub.StubApp;
import java.util.UUID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class c {

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f17926c = UUID.fromString(StubApp.getString2(11299));

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f17927d = UUID.fromString(StubApp.getString2(26247));

    /* renamed from: e, reason: collision with root package name */
    public static final UUID f17928e = UUID.fromString(StubApp.getString2(26248));

    /* renamed from: f, reason: collision with root package name */
    public static final UUID f17929f = UUID.fromString(StubApp.getString2(26249));

    /* renamed from: g, reason: collision with root package name */
    public static final UUID f17930g = UUID.fromString(StubApp.getString2(26250));

    /* renamed from: a, reason: collision with root package name */
    public final Context f17931a;

    /* renamed from: b, reason: collision with root package name */
    public final b f17932b;

    public c(Context context, Handler handler) {
        R5.f fVar = new R5.f(this, 3);
        this.f17931a = context;
        b bVar = new b();
        this.f17932b = bVar;
        bVar.f17911h = this;
        bVar.j = handler;
        context.registerReceiver(fVar, new IntentFilter(StubApp.getString2(26251)));
    }

    public abstract int a();

    public abstract void b(int i3, String str);

    public abstract void c();
}
