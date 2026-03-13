package Z1;

import com.stub.StubApp;
import e2.C0838b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f8949a;

    /* renamed from: b, reason: collision with root package name */
    public final C0838b f8950b;

    public c(KClass clazz, C0838b consumer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f8949a = clazz;
        this.f8950b = consumer;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(method, "method");
        boolean areEqual = Intrinsics.areEqual(method.getName(), "accept");
        C0838b c0838b = this.f8950b;
        if (areEqual && objArr != null && objArr.length == 1) {
            Object parameter = KClasses.cast(this.f8949a, objArr[0]);
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            c0838b.invoke(parameter);
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (Intrinsics.areEqual(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(c0838b.hashCode());
        }
        if (Intrinsics.areEqual(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return c0838b.toString();
        }
        throw new UnsupportedOperationException(StubApp.getString2(7604) + obj + StubApp.getString2(7605) + method + StubApp.getString2(7606) + objArr);
    }
}
