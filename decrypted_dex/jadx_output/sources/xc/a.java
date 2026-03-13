package xc;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23178b;

    public /* synthetic */ a(String str, boolean z2) {
        this.f23177a = str;
        this.f23178b = z2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String name = this.f23177a;
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(this.f23178b);
        return thread;
    }
}
