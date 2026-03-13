package n;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.stub.StubApp;
import java.lang.reflect.Method;

/* renamed from: n.m0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1350m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f17563a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f17564b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f17565c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f17566d;

    static {
        try {
            String string2 = StubApp.getString2("21252");
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod(string2, cls, View.class, cls2, cls3, cls3);
            f17563a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod(StubApp.getString2("21253"), cls);
            f17564b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod(StubApp.getString2("21254"), cls);
            f17565c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f17566d = true;
        } catch (NoSuchMethodException e10) {
            e10.printStackTrace();
        }
    }
}
