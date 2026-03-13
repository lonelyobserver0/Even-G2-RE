package nb;

import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import java.io.File;
import java.util.ArrayList;

/* renamed from: nb.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1400e implements InterfaceC0825b, InterfaceC1397b {

    /* renamed from: a, reason: collision with root package name */
    public Context f17891a;

    public final ArrayList b(EnumC1399d enumC1399d) {
        String str;
        ArrayList arrayList = new ArrayList();
        Context context = this.f17891a;
        switch (enumC1399d) {
            case EF10:
                str = null;
                break;
            case EF23:
                str = StubApp.getString2(21486);
                break;
            case EF36:
                str = StubApp.getString2(21485);
                break;
            case EF49:
                str = StubApp.getString2(21484);
                break;
            case EF62:
                str = StubApp.getString2(21483);
                break;
            case EF75:
                str = StubApp.getString2(2114);
                break;
            case EF88:
                str = StubApp.getString2(21482);
                break;
            case EF101:
                str = StubApp.getString2(21481);
                break;
            case EF115:
                str = StubApp.getString2(5257);
                break;
            case EF129:
                str = StubApp.getString2(21480);
                break;
            case EF143:
                str = StubApp.getString2(21479);
                break;
            default:
                throw new RuntimeException(StubApp.getString2(21478) + enumC1399d);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        try {
            InterfaceC1397b.a(c0824a.f13554b, this);
        } catch (Exception e10) {
            Log.e(StubApp.getString2(21487), StubApp.getString2(21488), e10);
        }
        this.f17891a = c0824a.f13553a;
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        InterfaceC1397b.a(c0824a.f13554b, null);
    }
}
