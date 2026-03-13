package Wc;

import com.stub.StubApp;
import java.util.HashMap;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f8217a;

    public abstract a a();

    public abstract int b();

    public final void c(String str, boolean z2, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(25839), Integer.valueOf(this.f8217a));
        hashMap.put(StubApp.getString2(291), Integer.valueOf(b()));
        hashMap.put(StubApp.getString2(25897), Boolean.valueOf(z10));
        hashMap.put(StubApp.getString2(11284), Boolean.valueOf(z2));
        a().f8211a.invokeMethod(str, hashMap);
    }

    public final void d(int i3, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(25839), Integer.valueOf(this.f8217a));
        hashMap.put(StubApp.getString2(291), Integer.valueOf(b()));
        hashMap.put(StubApp.getString2(25897), Integer.valueOf(i3));
        hashMap.put(StubApp.getString2(11284), Boolean.TRUE);
        a().f8211a.invokeMethod(str, hashMap);
    }

    public final void e(String str, HashMap hashMap) {
        hashMap.put(StubApp.getString2(25839), Integer.valueOf(this.f8217a));
        hashMap.put(StubApp.getString2(291), Integer.valueOf(b()));
        hashMap.put(StubApp.getString2(11284), Boolean.TRUE);
        a().f8211a.invokeMethod(str, hashMap);
    }

    public final void f(int i3, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(StubApp.getString2(25839), Integer.valueOf(this.f8217a));
        hashMap.put(StubApp.getString2(291), Integer.valueOf(b()));
        hashMap.put(StubApp.getString2(9577), Integer.valueOf(new int[]{999, 2000, 3000, 4000, 5000, 5999, 9999}[AbstractC1856e.c(i3)]));
        hashMap.put(StubApp.getString2(3719), StubApp.getString2(25902) + str);
        hashMap.put(StubApp.getString2(11284), Boolean.TRUE);
        a().f8211a.invokeMethod(StubApp.getString2(11764), hashMap);
    }

    public abstract void g();
}
