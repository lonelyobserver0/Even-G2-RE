package Y1;

import com.stub.StubApp;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s2.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f8729b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i3) {
        super(0);
        this.f8728a = i3;
        this.f8729b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8728a) {
            case 0:
                Class<?> loadClass = ((ClassLoader) this.f8729b.f20712b).loadClass(StubApp.getString2(7497));
                Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                d dVar = this.f8729b;
                Class<?> loadClass2 = ((ClassLoader) dVar.f20712b).loadClass(StubApp.getString2(7497));
                Intrinsics.checkNotNullExpressionValue(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                boolean z2 = false;
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod(StubApp.getString2(7498), new Class[0]);
                Class<?> clazz = ((ClassLoader) dVar.f20712b).loadClass(StubApp.getString2(7499));
                Intrinsics.checkNotNullExpressionValue(clazz, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                if (getWindowExtensionsMethod.getReturnType().equals(clazz)) {
                    Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                    if (Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }
}
