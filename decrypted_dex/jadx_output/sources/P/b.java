package P;

import C2.d;
import F5.c;
import N.C0158d;
import N.I;
import N.InterfaceC0157c;
import Z9.q;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.stub.StubApp;
import n.C1369w;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5375a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, d dVar) {
        super(inputConnection, false);
        this.f5375a = dVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0157c interfaceC0157c;
        c cVar = inputContentInfo == null ? null : new c(new s2.d(inputContentInfo, 13), 16);
        d dVar = this.f5375a;
        if ((i3 & 1) != 0) {
            try {
                ((InputContentInfo) ((s2.d) cVar.f2238b).f20712b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((s2.d) cVar.f2238b).f20712b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable(StubApp.getString2(4528), inputContentInfo2);
            } catch (Exception e10) {
                Log.w(StubApp.getString2(4529), StubApp.getString2(4530), e10);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((s2.d) cVar.f2238b).f20712b).getDescription();
        s2.d dVar2 = (s2.d) cVar.f2238b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) dVar2.f20712b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0157c = new q(clipData, 2);
        } else {
            C0158d c0158d = new C0158d();
            c0158d.f4773b = clipData;
            c0158d.f4774c = 2;
            interfaceC0157c = c0158d;
        }
        interfaceC0157c.c(((InputContentInfo) dVar2.f20712b).getLinkUri());
        interfaceC0157c.b(bundle2);
        if (I.f((C1369w) dVar.f1057b, interfaceC0157c.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}
