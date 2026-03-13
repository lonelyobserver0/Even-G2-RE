package H0;

import M4.Z;
import com.stub.StubApp;
import java.io.Closeable;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Charset f2463g = StandardCharsets.UTF_8;

    /* renamed from: a, reason: collision with root package name */
    public final Z9.C f2464a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.o f2465b = new P0.o(StubApp.getString2(2333));

    /* renamed from: c, reason: collision with root package name */
    public final Map f2466c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d, reason: collision with root package name */
    public z f2467d;

    /* renamed from: e, reason: collision with root package name */
    public Socket f2468e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f2469f;

    public A(Z9.C c10) {
        this.f2464a = c10;
    }

    public final void a(Socket socket) {
        this.f2468e = socket;
        this.f2467d = new z(this, socket.getOutputStream());
        this.f2465b.f(new y(this, socket.getInputStream()), new s2.d(this, 7), 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2469f) {
            return;
        }
        try {
            z zVar = this.f2467d;
            if (zVar != null) {
                zVar.close();
            }
            this.f2465b.e(null);
            Socket socket = this.f2468e;
            if (socket != null) {
                socket.close();
            }
            this.f2469f = true;
        } catch (Throwable th) {
            this.f2469f = true;
            throw th;
        }
    }

    public final void d(Z z2) {
        AbstractC1550k.h(this.f2467d);
        z zVar = this.f2467d;
        zVar.getClass();
        zVar.f2664c.post(new Ab.b(zVar, new A0.c(B.f2477h).j(z2).getBytes(f2463g), z2, 7));
    }
}
