package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.AbstractC0997a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f9387a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9388b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0997a.f14412t);
        this.f9388b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f9387a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
