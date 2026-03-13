package W3;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.stub.StubApp;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f8109a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f8110b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f8111c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f8112d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f8113e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        String string2 = StubApp.getString2(6888);
        String string22 = StubApp.getString2(6889);
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod(string22, cls);
        } catch (Exception unused) {
            method = null;
        }
        f8109a = method;
        try {
            method2 = WorkSource.class.getMethod(string22, cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f8110b = method2;
        try {
            method3 = WorkSource.class.getMethod(StubApp.getString2("4473"), new Class[0]);
        } catch (Exception unused3) {
            method3 = null;
        }
        f8111c = method3;
        try {
            WorkSource.class.getMethod(StubApp.getString2("6443"), cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", new Class[0]);
        } catch (Exception e10) {
            Log.w(string2, StubApp.getString2(6890), e10);
        }
        try {
            Class.forName(StubApp.getString2("6891")).getMethod(StubApp.getString2("6892"), cls, String.class);
        } catch (Exception e11) {
            Log.w(string2, StubApp.getString2(6893), e11);
        }
        try {
            method4 = WorkSource.class.getMethod(StubApp.getString2("6894"), new Class[0]);
            try {
                method4.setAccessible(true);
            } catch (Exception unused6) {
            }
        } catch (Exception unused7) {
            method4 = null;
        }
        f8112d = method4;
        f8113e = null;
    }

    public static void a(WorkSource workSource, int i3, String str) {
        String string2 = StubApp.getString2(6895);
        String string22 = StubApp.getString2(6888);
        Method method = f8110b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i3), str);
                return;
            } catch (Exception e10) {
                Log.wtf(string22, string2, e10);
                return;
            }
        }
        Method method2 = f8109a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i3));
            } catch (Exception e11) {
                Log.wtf(string22, string2, e11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(android.os.WorkSource r4) {
        /*
            r0 = 6888(0x1ae8, float:9.652E-42)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 0
            java.lang.reflect.Method r2 = W3.d.f8112d
            if (r2 == 0) goto L27
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L1c
            S3.D.h(r2)     // Catch: java.lang.Exception -> L1c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L1c
            boolean r4 = r2.booleanValue()     // Catch: java.lang.Exception -> L1c
            return r4
        L1c:
            r2 = move-exception
            r3 = 6896(0x1af0, float:9.663E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            android.util.Log.e(r0, r3, r2)
        L27:
            java.lang.reflect.Method r2 = W3.d.f8111c
            if (r2 == 0) goto L46
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3b
            java.lang.Object r4 = r2.invoke(r4, r3)     // Catch: java.lang.Exception -> L3b
            S3.D.h(r4)     // Catch: java.lang.Exception -> L3b
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L3b
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L3b
            goto L47
        L3b:
            r4 = move-exception
            r2 = 6895(0x1aef, float:9.662E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            android.util.Log.wtf(r0, r2, r4)
        L46:
            r4 = r1
        L47:
            if (r4 != 0) goto L4b
            r4 = 1
            return r4
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.d.b(android.os.WorkSource):boolean");
    }
}
