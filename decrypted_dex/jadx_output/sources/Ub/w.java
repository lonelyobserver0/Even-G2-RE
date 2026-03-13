package Ub;

import Tb.InterfaceC0328i;
import com.stub.StubApp;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class w extends FunctionReferenceImpl implements Function3, SuspendFunction {

    /* renamed from: a, reason: collision with root package name */
    public static final w f7621a = new w(3, InterfaceC0328i.class, StubApp.getString2(25699), StubApp.getString2(25698), 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((InterfaceC0328i) obj).a(obj2, (Continuation) obj3);
    }
}
