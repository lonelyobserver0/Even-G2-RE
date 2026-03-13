package Ub;

import Tb.InterfaceC0328i;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;

/* renamed from: Ub.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0345a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient InterfaceC0328i f7571a;

    public C0345a(InterfaceC0328i interfaceC0328i) {
        super(StubApp.getString2(25688));
        this.f7571a = interfaceC0328i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
