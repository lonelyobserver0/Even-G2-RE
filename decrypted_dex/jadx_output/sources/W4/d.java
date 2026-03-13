package W4;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements w5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8122a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8123b;

    public /* synthetic */ d(Object obj, int i3) {
        this.f8122a = i3;
        this.f8123b = obj;
    }

    @Override // w5.b
    public final Object get() {
        switch (this.f8122a) {
            case 0:
                String str = (String) this.f8123b;
                String string2 = StubApp.getString2(1);
                String string22 = StubApp.getString2(6900);
                String string23 = StubApp.getString2(6901);
                String string24 = StubApp.getString2(3483);
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    throw new l(string24 + str + string23);
                } catch (ClassNotFoundException unused) {
                    Log.w(StubApp.getString2(5664), string24 + str + StubApp.getString2(6902));
                    return null;
                } catch (IllegalAccessException e10) {
                    throw new l(E1.a.k(string22, str, string2), e10);
                } catch (InstantiationException e11) {
                    throw new l(E1.a.k(string22, str, string2), e11);
                } catch (NoSuchMethodException e12) {
                    throw new l(E1.a.j(string22, str), e12);
                } catch (InvocationTargetException e13) {
                    throw new l(E1.a.j(string22, str), e13);
                }
            case 1:
                return (ComponentRegistrar) this.f8123b;
            default:
                return new y5.b((R4.h) this.f8123b);
        }
    }
}
