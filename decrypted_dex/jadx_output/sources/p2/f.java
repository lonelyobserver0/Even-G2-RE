package p2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.stub.StubApp;
import i2.o;
import n2.C1380a;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f extends d {

    /* renamed from: i, reason: collision with root package name */
    public static final String f19666i = o.g(StubApp.getString2(22096));

    /* renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f19667g;

    /* renamed from: h, reason: collision with root package name */
    public final e f19668h;

    public f(Context context, C1608a c1608a) {
        super(context, c1608a);
        this.f19667g = (ConnectivityManager) this.f19661b.getSystemService(StubApp.getString2(1008));
        this.f19668h = new e(this);
    }

    @Override // p2.d
    public final Object a() {
        return f();
    }

    @Override // p2.d
    public final void d() {
        String str = f19666i;
        try {
            o.e().b(str, StubApp.getString2("22097"), new Throwable[0]);
            this.f19667g.registerDefaultNetworkCallback(this.f19668h);
        } catch (IllegalArgumentException | SecurityException e10) {
            o.e().d(str, StubApp.getString2(22098), e10);
        }
    }

    @Override // p2.d
    public final void e() {
        String str = f19666i;
        try {
            o.e().b(str, StubApp.getString2("22099"), new Throwable[0]);
            this.f19667g.unregisterNetworkCallback(this.f19668h);
        } catch (IllegalArgumentException | SecurityException e10) {
            o.e().d(str, StubApp.getString2(22100), e10);
        }
    }

    public final C1380a f() {
        boolean z2;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = this.f19667g;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e10) {
            o.e().d(f19666i, StubApp.getString2(22101), e10);
        }
        if (networkCapabilities != null) {
            if (networkCapabilities.hasCapability(16)) {
                z2 = true;
                boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
                    z10 = true;
                }
                C1380a c1380a = new C1380a();
                c1380a.f17795a = z11;
                c1380a.f17796b = z2;
                c1380a.f17797c = isActiveNetworkMetered;
                c1380a.f17798d = z10;
                return c1380a;
            }
        }
        z2 = false;
        boolean isActiveNetworkMetered2 = connectivityManager.isActiveNetworkMetered();
        if (activeNetworkInfo != null) {
            z10 = true;
        }
        C1380a c1380a2 = new C1380a();
        c1380a2.f17795a = z11;
        c1380a2.f17796b = z2;
        c1380a2.f17797c = isActiveNetworkMetered2;
        c1380a2.f17798d = z10;
        return c1380a2;
    }
}
