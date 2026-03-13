package Z3;

import S3.D;
import android.os.IBinder;
import android.os.IInterface;
import com.stub.StubApp;
import i2.u;
import java.lang.reflect.Field;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends c4.b implements a {

    /* renamed from: f, reason: collision with root package name */
    public final Object f8973f;

    public b(Object obj) {
        super(StubApp.getString2(7610), 1);
        this.f8973f = obj;
    }

    public static a N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        String string2 = StubApp.getString2(7610);
        IInterface queryLocalInterface = iBinder.queryLocalInterface(string2);
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder, string2, 2);
    }

    public static Object O(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f8973f;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 != 1) {
            throw new IllegalArgumentException(u.p(declaredFields.length, StubApp.getString2(7614)));
        }
        D.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException(StubApp.getString2(7613));
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException(StubApp.getString2(7611), e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException(StubApp.getString2(7612), e11);
        }
    }
}
