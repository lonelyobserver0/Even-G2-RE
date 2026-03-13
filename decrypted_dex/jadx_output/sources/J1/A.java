package J1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class A implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3300a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3301b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f3302c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f3303d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f3304e;

    public A(Executor executor) {
        this.f3300a = 0;
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f3304e = executor;
        this.f3302c = new ArrayDeque();
        this.f3301b = new Object();
    }

    public final void a() {
        switch (this.f3300a) {
            case 0:
                synchronized (this.f3301b) {
                    try {
                        Object poll = this.f3302c.poll();
                        Runnable runnable = (Runnable) poll;
                        this.f3303d = runnable;
                        if (poll != null) {
                            this.f3304e.execute(runnable);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f3301b) {
                    try {
                        Runnable runnable2 = (Runnable) this.f3302c.poll();
                        this.f3303d = runnable2;
                        if (runnable2 != null) {
                            ((T4.d) this.f3304e).execute(runnable2);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f3300a) {
            case 0:
                Intrinsics.checkNotNullParameter(command, "command");
                synchronized (this.f3301b) {
                    try {
                        this.f3302c.offer(new Ab.b(9, command, this));
                        if (this.f3303d == null) {
                            a();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                synchronized (this.f3301b) {
                    try {
                        this.f3302c.add(new com.even.translate.a(11, this, command));
                        if (this.f3303d == null) {
                            a();
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    public A(T4.d dVar) {
        this.f3300a = 1;
        this.f3301b = new Object();
        this.f3302c = new ArrayDeque();
        this.f3304e = dVar;
    }
}
