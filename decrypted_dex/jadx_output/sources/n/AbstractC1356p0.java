package n;

import android.widget.AbsListView;
import com.stub.StubApp;
import java.lang.reflect.Field;

/* renamed from: n.p0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1356p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f17579a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField(StubApp.getString2("21255"));
            field.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
        f17579a = field;
    }
}
