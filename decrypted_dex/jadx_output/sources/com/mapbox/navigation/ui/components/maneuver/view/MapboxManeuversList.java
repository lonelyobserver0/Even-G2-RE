package com.mapbox.navigation.ui.components.maneuver.view;

import B0.o;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/mapbox/navigation/ui/components/maneuver/view/MapboxManeuversList;", "Landroidx/recyclerview/widget/RecyclerView;", "ui-components_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class MapboxManeuversList extends RecyclerView {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12530b = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f12531a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MapboxManeuversList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (this.f12531a) {
            return;
        }
        this.f12531a = true;
        post(new o(this, 24));
    }
}
