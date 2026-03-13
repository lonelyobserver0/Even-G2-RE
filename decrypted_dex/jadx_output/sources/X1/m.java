package X1;

import Z9.q;
import com.google.android.gms.internal.measurement.D1;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final n f8252a;

    static {
        n eVar;
        try {
            eVar = new q((WebViewProviderFactoryBoundaryInterface) Oc.a.i(WebViewProviderFactoryBoundaryInterface.class, D1.g()), 25);
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f8252a = eVar;
    }
}
