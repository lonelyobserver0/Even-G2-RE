package Ec;

import com.stub.StubApp;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class i implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2150a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2151b;

    /* renamed from: c, reason: collision with root package name */
    public String f2152c;

    public i(ArrayList protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        this.f2150a = protocols;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object proxy, Method method, Object[] objArr) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(method, "method");
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
            this.f2151b = true;
            return null;
        }
        boolean areEqual = Intrinsics.areEqual(name, "protocols");
        ArrayList arrayList = this.f2150a;
        if (areEqual && objArr.length == 0) {
            return arrayList;
        }
        boolean areEqual2 = Intrinsics.areEqual(name, "selectProtocol");
        String string2 = StubApp.getString2(7094);
        if ((areEqual2 || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof List) {
                if (obj == null) {
                    throw new NullPointerException(StubApp.getString2(25239));
                }
                List list = (List) obj;
                int size = list.size();
                if (size >= 0) {
                    int i3 = 0;
                    while (true) {
                        int i10 = i3 + 1;
                        Object obj2 = list.get(i3);
                        if (obj2 == null) {
                            throw new NullPointerException(string2);
                        }
                        String str = (String) obj2;
                        if (arrayList.contains(str)) {
                            this.f2152c = str;
                            return str;
                        }
                        if (i3 == size) {
                            break;
                        }
                        i3 = i10;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f2152c = str2;
                return str2;
            }
        }
        if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj3 = objArr[0];
        if (obj3 == null) {
            throw new NullPointerException(string2);
        }
        this.f2152c = (String) obj3;
        return null;
    }
}
