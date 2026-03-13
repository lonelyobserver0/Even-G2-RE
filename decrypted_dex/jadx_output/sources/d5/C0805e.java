package d5;

import a4.f;
import d.y;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0805e {

    /* renamed from: d, reason: collision with root package name */
    public static final C0804d f13421d = new C0804d();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC0802b f13422a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorC0802b f13423b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorC0802b f13424c;

    public C0805e(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.f13422a = new ExecutorC0802b(backgroundExecutorService);
        this.f13423b = new ExecutorC0802b(backgroundExecutorService);
        f.m(null);
        this.f13424c = new ExecutorC0802b(blockingExecutorService);
    }

    public static final void a() {
        C0804d.a(new y(2), C0803c.f13417b);
    }
}
