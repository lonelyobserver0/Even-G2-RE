package n;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.stub.StubApp;
import i.C1021b;
import i.DialogInterfaceC1025f;

/* renamed from: n.J, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class DialogInterfaceOnClickListenerC1309J implements InterfaceC1315P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC1025f f17410a;

    /* renamed from: b, reason: collision with root package name */
    public C1310K f17411b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f17412c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1316Q f17413d;

    public DialogInterfaceOnClickListenerC1309J(C1316Q c1316q) {
        this.f17413d = c1316q;
    }

    @Override // n.InterfaceC1315P
    public final boolean a() {
        DialogInterfaceC1025f dialogInterfaceC1025f = this.f17410a;
        if (dialogInterfaceC1025f != null) {
            return dialogInterfaceC1025f.isShowing();
        }
        return false;
    }

    @Override // n.InterfaceC1315P
    public final int b() {
        return 0;
    }

    @Override // n.InterfaceC1315P
    public final void c(int i3) {
        Log.e(StubApp.getString2(21230), StubApp.getString2(21231));
    }

    @Override // n.InterfaceC1315P
    public final CharSequence d() {
        return this.f17412c;
    }

    @Override // n.InterfaceC1315P
    public final void dismiss() {
        DialogInterfaceC1025f dialogInterfaceC1025f = this.f17410a;
        if (dialogInterfaceC1025f != null) {
            dialogInterfaceC1025f.dismiss();
            this.f17410a = null;
        }
    }

    @Override // n.InterfaceC1315P
    public final Drawable f() {
        return null;
    }

    @Override // n.InterfaceC1315P
    public final void h(CharSequence charSequence) {
        this.f17412c = charSequence;
    }

    @Override // n.InterfaceC1315P
    public final void i(Drawable drawable) {
        Log.e(StubApp.getString2(21230), StubApp.getString2(21232));
    }

    @Override // n.InterfaceC1315P
    public final void j(int i3) {
        Log.e(StubApp.getString2(21230), StubApp.getString2(21233));
    }

    @Override // n.InterfaceC1315P
    public final void k(int i3) {
        Log.e(StubApp.getString2(21230), StubApp.getString2(21234));
    }

    @Override // n.InterfaceC1315P
    public final void l(int i3, int i10) {
        if (this.f17411b == null) {
            return;
        }
        C1316Q c1316q = this.f17413d;
        E0.x xVar = new E0.x(c1316q.getPopupContext());
        CharSequence charSequence = this.f17412c;
        C1021b c1021b = (C1021b) xVar.f1862b;
        if (charSequence != null) {
            c1021b.f14555d = charSequence;
        }
        C1310K c1310k = this.f17411b;
        int selectedItemPosition = c1316q.getSelectedItemPosition();
        c1021b.f14564n = c1310k;
        c1021b.f14565o = this;
        c1021b.f14567q = selectedItemPosition;
        c1021b.f14566p = true;
        DialogInterfaceC1025f e10 = xVar.e();
        this.f17410a = e10;
        AlertController$RecycleListView alertController$RecycleListView = e10.f14601f.f14579f;
        alertController$RecycleListView.setTextDirection(i3);
        alertController$RecycleListView.setTextAlignment(i10);
        this.f17410a.show();
    }

    @Override // n.InterfaceC1315P
    public final int m() {
        return 0;
    }

    @Override // n.InterfaceC1315P
    public final void n(ListAdapter listAdapter) {
        this.f17411b = (C1310K) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        C1316Q c1316q = this.f17413d;
        c1316q.setSelection(i3);
        if (c1316q.getOnItemClickListener() != null) {
            c1316q.performItemClick(null, i3, this.f17411b.getItemId(i3));
        }
        dismiss();
    }
}
