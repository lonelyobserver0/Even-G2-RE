package c2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import q8.AbstractC1526a;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0552d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0553e f10791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0552d(C0553e c0553e, int i3) {
        super(0);
        this.f10790a = i3;
        this.f10791b = c0553e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class cls;
        boolean z2;
        boolean z10;
        switch (this.f10790a) {
            case 0:
                Class<?> loadClass = this.f10791b.f10792a.loadClass(StubApp.getString2(9390));
                Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                boolean z11 = false;
                Method getBoundsMethod = loadClass.getMethod(StubApp.getString2(9391), new Class[0]);
                Method getTypeMethod = loadClass.getMethod(StubApp.getString2(9392), new Class[0]);
                Method getStateMethod = loadClass.getMethod(StubApp.getString2(9393), new Class[0]);
                Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
                if (AbstractC1526a.q(getBoundsMethod, Reflection.getOrCreateKotlinClass(Rect.class))) {
                    Intrinsics.checkNotNullParameter(getBoundsMethod, "<this>");
                    if (Modifier.isPublic(getBoundsMethod.getModifiers())) {
                        Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                        Class cls2 = Integer.TYPE;
                        if (AbstractC1526a.q(getTypeMethod, Reflection.getOrCreateKotlinClass(cls2))) {
                            Intrinsics.checkNotNullParameter(getTypeMethod, "<this>");
                            if (Modifier.isPublic(getTypeMethod.getModifiers())) {
                                Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                                if (AbstractC1526a.q(getStateMethod, Reflection.getOrCreateKotlinClass(cls2))) {
                                    Intrinsics.checkNotNullParameter(getStateMethod, "<this>");
                                    if (Modifier.isPublic(getStateMethod.getModifiers())) {
                                        z11 = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z11);
            case 1:
                C0553e c0553e = this.f10791b;
                try {
                    cls = c0553e.f10793b.L();
                } catch (ClassNotFoundException unused) {
                    cls = null;
                }
                if (cls == null) {
                    return Boolean.FALSE;
                }
                Class<?> loadClass2 = c0553e.f10792a.loadClass(StubApp.getString2(9387));
                Intrinsics.checkNotNullExpressionValue(loadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod = loadClass2.getMethod(StubApp.getString2(9388), Activity.class, cls);
                Method removeListenerMethod = loadClass2.getMethod(StubApp.getString2(9389), cls);
                Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
                Intrinsics.checkNotNullParameter(addListenerMethod, "<this>");
                if (Modifier.isPublic(addListenerMethod.getModifiers())) {
                    Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                    Intrinsics.checkNotNullParameter(removeListenerMethod, "<this>");
                    if (Modifier.isPublic(removeListenerMethod.getModifiers())) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 2:
                Class<?> loadClass3 = this.f10791b.f10792a.loadClass(StubApp.getString2(9387));
                Intrinsics.checkNotNullExpressionValue(loadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method addListenerMethod2 = loadClass3.getMethod(StubApp.getString2(9388), Context.class, Consumer.class);
                Method removeListenerMethod2 = loadClass3.getMethod(StubApp.getString2(9389), Consumer.class);
                Intrinsics.checkNotNullExpressionValue(addListenerMethod2, "addListenerMethod");
                Intrinsics.checkNotNullParameter(addListenerMethod2, "<this>");
                if (Modifier.isPublic(addListenerMethod2.getModifiers())) {
                    Intrinsics.checkNotNullExpressionValue(removeListenerMethod2, "removeListenerMethod");
                    Intrinsics.checkNotNullParameter(removeListenerMethod2, "<this>");
                    if (Modifier.isPublic(removeListenerMethod2.getModifiers())) {
                        z10 = true;
                        return Boolean.valueOf(z10);
                    }
                }
                z10 = false;
                return Boolean.valueOf(z10);
            default:
                C0553e c0553e2 = this.f10791b;
                Class<?> loadClass4 = ((ClassLoader) c0553e2.f10794c.f20712b).loadClass(StubApp.getString2(7499));
                Intrinsics.checkNotNullExpressionValue(loadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                boolean z12 = false;
                Method getWindowLayoutComponentMethod = loadClass4.getMethod(StubApp.getString2(9386), new Class[0]);
                Class<?> clazz = c0553e2.f10792a.loadClass(StubApp.getString2(9387));
                Intrinsics.checkNotNullExpressionValue(clazz, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                Intrinsics.checkNotNullParameter(getWindowLayoutComponentMethod, "<this>");
                if (Modifier.isPublic(getWindowLayoutComponentMethod.getModifiers())) {
                    Intrinsics.checkNotNullParameter(getWindowLayoutComponentMethod, "<this>");
                    Intrinsics.checkNotNullParameter(clazz, "clazz");
                    if (getWindowLayoutComponentMethod.getReturnType().equals(clazz)) {
                        z12 = true;
                    }
                }
                return Boolean.valueOf(z12);
        }
    }
}
