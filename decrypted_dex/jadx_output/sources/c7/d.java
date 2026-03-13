package c7;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f11002a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, List list) {
        super(context, 2131427382, list);
        this.f11002a = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view2 = super.getView(i3, view, parent);
        Intrinsics.checkNotNullExpressionValue(view2, "super.getView(position, convertView, parent)");
        C0574a c0574a = (C0574a) this.f11002a.get(i3);
        TextView textView = (TextView) view2.findViewById(R.id.text1);
        textView.setTextColor(c0574a.f10996b.length() == 0 ? -7829368 : textView.getContext().getColor(2131034239));
        textView.setText(c0574a.f10995a);
        return view2;
    }
}
