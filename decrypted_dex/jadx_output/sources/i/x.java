package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class x implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f14698a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14699b;

    /* renamed from: c, reason: collision with root package name */
    public Method f14700c;

    /* renamed from: d, reason: collision with root package name */
    public Context f14701d;

    public x(View view, String str) {
        this.f14698a = view;
        this.f14699b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f14700c == null) {
            View view2 = this.f14698a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f14699b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = StubApp.getString2(18423) + view2.getContext().getResources().getResourceEntryName(id) + StubApp.getString2(620);
                    }
                    StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(18424), str2, StubApp.getString2(18425));
                    l9.append(view2.getClass());
                    l9.append(str);
                    throw new IllegalStateException(l9.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f14700c = method;
                        this.f14701d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f14700c.invoke(this.f14701d, view);
        } catch (IllegalAccessException e10) {
            throw new IllegalStateException(StubApp.getString2(18427), e10);
        } catch (InvocationTargetException e11) {
            throw new IllegalStateException(StubApp.getString2(18426), e11);
        }
    }
}
