package C;

import Xa.AbstractActivityC0364d;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import p0.AbstractC1482f;

/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0025b extends D.a {
    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Activity activity, String[] strArr, int i3) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (TextUtils.isEmpty(strArr[i10])) {
                throw new IllegalArgumentException(AbstractC1482f.k(new StringBuilder(StubApp.getString2(784)), Arrays.toString(strArr), StubApp.getString2(785)));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i10], StubApp.getString2(783))) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (activity instanceof InterfaceC0024a) {
            ((InterfaceC0024a) activity).getClass();
        }
        activity.requestPermissions(strArr, i3);
    }

    public static boolean e(AbstractActivityC0364d abstractActivityC0364d, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33 && TextUtils.equals(StubApp.getString2(783), str)) {
            return false;
        }
        if (i3 < 32 && i3 == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod(StubApp.getString2("786"), String.class).invoke(abstractActivityC0364d.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return abstractActivityC0364d.shouldShowRequestPermissionRationale(str);
            }
        }
        return abstractActivityC0364d.shouldShowRequestPermissionRationale(str);
    }
}
