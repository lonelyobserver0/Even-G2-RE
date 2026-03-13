package Y;

import java.util.concurrent.ThreadFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8651b;

    public /* synthetic */ a(String str, int i3) {
        this.f8650a = i3;
        this.f8651b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f8650a) {
            case 0:
                Thread thread = new Thread(runnable, this.f8651b);
                thread.setPriority(10);
                return thread;
            default:
                return new Thread(runnable, this.f8651b);
        }
    }
}
