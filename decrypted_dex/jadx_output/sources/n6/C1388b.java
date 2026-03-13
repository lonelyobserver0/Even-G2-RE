package n6;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import com.stub.StubApp;
import java.util.ArrayList;

/* renamed from: n6.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1388b {

    /* renamed from: g, reason: collision with root package name */
    public static final ArrayList f17806g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17807a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17808b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17809c;

    /* renamed from: d, reason: collision with root package name */
    public final Camera f17810d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f17811e;

    /* renamed from: f, reason: collision with root package name */
    public final C1387a f17812f;

    static {
        ArrayList arrayList = new ArrayList(2);
        f17806g = arrayList;
        arrayList.add(StubApp.getString2(3305));
        arrayList.add(StubApp.getString2(21390));
    }

    public C1388b(Camera camera, i iVar) {
        J4.e eVar = new J4.e(this, 3);
        this.f17812f = new C1387a(this);
        this.f17811e = new Handler(eVar);
        this.f17810d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        iVar.getClass();
        boolean contains = f17806g.contains(focusMode);
        this.f17809c = contains;
        Log.i(StubApp.getString2(2377), StubApp.getString2(21391) + focusMode + StubApp.getString2(21392) + contains);
        this.f17807a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f17807a && !this.f17811e.hasMessages(1)) {
            Handler handler = this.f17811e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.f17809c || this.f17807a || this.f17808b) {
            return;
        }
        try {
            this.f17810d.autoFocus(this.f17812f);
            this.f17808b = true;
        } catch (RuntimeException e10) {
            Log.w(StubApp.getString2(2377), StubApp.getString2(21393), e10);
            a();
        }
    }

    public final void c() {
        this.f17807a = true;
        this.f17808b = false;
        this.f17811e.removeMessages(1);
        if (this.f17809c) {
            try {
                this.f17810d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(StubApp.getString2(2377), StubApp.getString2(21394), e10);
            }
        }
    }
}
