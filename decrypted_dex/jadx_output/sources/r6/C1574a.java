package r6;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import s6.InterfaceC1602b;

/* renamed from: r6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C1574a implements InterfaceC1602b, FunctionAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f20359a;

    public C1574a(MethodChannel.Result result) {
        this.f20359a = result;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC1602b) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.f20359a, MethodChannel.Result.class, StubApp.getString2(11284), StubApp.getString2(22683), 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
