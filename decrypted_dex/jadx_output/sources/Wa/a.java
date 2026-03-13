package Wa;

import com.stub.StubApp;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8209a;

    /* renamed from: b, reason: collision with root package name */
    public int f8210b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8209a) {
            case 0:
                Thread thread = new Thread(runnable);
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(6943));
                int i3 = this.f8210b;
                this.f8210b = i3 + 1;
                sb2.append(i3);
                thread.setName(sb2.toString());
                return thread;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName(StubApp.getString2(6942) + this.f8210b);
                this.f8210b = this.f8210b + 1;
                return newThread;
        }
    }
}
