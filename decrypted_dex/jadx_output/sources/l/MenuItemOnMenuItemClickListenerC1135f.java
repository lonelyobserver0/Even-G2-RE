package l;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class MenuItemOnMenuItemClickListenerC1135f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f15662c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f15663a;

    /* renamed from: b, reason: collision with root package name */
    public Method f15664b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f15664b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f15663a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
