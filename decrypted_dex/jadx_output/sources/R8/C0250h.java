package R8;

import M4.Z;
import M4.e0;
import Qb.L0;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.google.android.gms.internal.measurement.D1;
import com.mapbox.maps.MapboxMap;
import com.stub.StubApp;
import f5.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import n.C1365u;
import n.J0;
import n.O0;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1438m;
import r0.AbstractC1560u;
import v0.C1830z;
import v0.W;
import x5.InterfaceC1913d;

/* renamed from: R8.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0250h implements M6.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6296a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6297b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6298c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6299d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6300e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6301f;

    public C0250h(Y6.a cameraPlugin, MapboxMap mapboxMap, AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(cameraPlugin, "cameraPlugin");
        Intrinsics.checkNotNullParameter(mapboxMap, "mapboxMap");
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        this.f6296a = cameraPlugin;
        this.f6297b = mapboxMap;
        this.f6298c = animatorSet;
        this.f6299d = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(0.5f), Float.valueOf(0.75f), Float.valueOf(1.0f)});
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.checkNotNullExpressionValue(childAnimations, "animatorSet.childAnimations");
        ArrayList arrayList = new ArrayList(CollectionsKt.f(childAnimations));
        for (Animator animator : childAnimations) {
            Intrinsics.checkNotNull(animator, "null cannot be cast to non-null type android.animation.ValueAnimator");
            arrayList.add((ValueAnimator) animator);
        }
        Object[] array = arrayList.toArray(new ValueAnimator[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f6300e = (ValueAnimator[]) array;
        this.f6301f = new CopyOnWriteArrayList();
        ((AnimatorSet) this.f6298c).addListener(new Y6.f(this, 2));
    }

    public static boolean b(int i3, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList c(Context context, int i3) {
        int c10 = O0.c(context, 2130903233);
        int b2 = O0.b(context, 2130903231);
        int[] iArr = O0.f17442b;
        int[] iArr2 = O0.f17444d;
        int b10 = F.a.b(c10, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, O0.f17443c, O0.f17446f}, new int[]{b2, b10, F.a.b(c10, i3), i3});
    }

    public static L0.B e(C1830z c1830z, M4.I i3, L0.B b2, C1414K c1414k) {
        int b10;
        AbstractC1416M t3 = c1830z.t();
        c1830z.L();
        if (c1830z.f21861v0.f21658a.p()) {
            b10 = 0;
        } else {
            W w10 = c1830z.f21861v0;
            b10 = w10.f21658a.b(w10.f21659b.f3881a);
        }
        Object l9 = t3.p() ? null : t3.l(b10);
        int b11 = (c1830z.y() || t3.p()) ? -1 : t3.f(b10, c1414k, false).b(AbstractC1560u.J(c1830z.r()) - c1414k.f18046e);
        for (int i10 = 0; i10 < i3.size(); i10++) {
            L0.B b12 = (L0.B) i3.get(i10);
            if (h(b12, l9, c1830z.y(), c1830z.o(), c1830z.p(), b11)) {
                return b12;
            }
        }
        if (i3.isEmpty() && b2 != null && h(b2, l9, c1830z.y(), c1830z.o(), c1830z.p(), b11)) {
            return b2;
        }
        return null;
    }

    public static LayerDrawable f(J0 j02, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable c10 = j02.c(context, 2131165253);
        Drawable c11 = j02.c(context, 2131165254);
        if ((c10 instanceof BitmapDrawable) && c10.getIntrinsicWidth() == dimensionPixelSize && c10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c11 instanceof BitmapDrawable) && c11.getIntrinsicWidth() == dimensionPixelSize && c11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.secondaryProgress);
        layerDrawable.setId(2, R.id.progress);
        return layerDrawable;
    }

    public static boolean h(L0.B b2, Object obj, boolean z2, int i3, int i10, int i11) {
        if (!b2.f3881a.equals(obj)) {
            return false;
        }
        int i12 = b2.f3882b;
        if (z2 && i12 == i3 && b2.f3883c == i10) {
            return true;
        }
        return !z2 && i12 == -1 && b2.f3885e == i11;
    }

    public static void j(Drawable drawable, int i3, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C1365u.f17618b;
        }
        mutate.setColorFilter(C1365u.c(i3, mode));
    }

    public void a(Bc.i iVar, L0.B b2, AbstractC1416M abstractC1416M) {
        if (b2 == null) {
            return;
        }
        if (abstractC1416M.b(b2.f3881a) != -1) {
            iVar.o(b2, abstractC1416M);
            return;
        }
        AbstractC1416M abstractC1416M2 = (AbstractC1416M) ((e0) this.f6298c).get(b2);
        if (abstractC1416M2 != null) {
            iVar.o(b2, abstractC1416M2);
        }
    }

    public q4.j d(q4.j jVar) {
        return jVar.continueWith(new G1.c(0), new C2.d(this, 4));
    }

    public ColorStateList g(Context context, int i3) {
        if (i3 == 2131165210) {
            return D1.j(context, 2131034133);
        }
        if (i3 == 2131165256) {
            return D1.j(context, 2131034136);
        }
        if (i3 != 2131165255) {
            if (i3 == 2131165198) {
                return c(context, O0.c(context, 2130903231));
            }
            if (i3 == 2131165192) {
                return c(context, 0);
            }
            if (i3 == 2131165197) {
                return c(context, O0.c(context, 2130903229));
            }
            if (i3 == 2131165251 || i3 == 2131165252) {
                return D1.j(context, 2131034135);
            }
            if (b(i3, (int[]) this.f6297b)) {
                return O0.d(context, 2130903234);
            }
            if (b(i3, (int[]) this.f6300e)) {
                return D1.j(context, 2131034132);
            }
            if (b(i3, (int[]) this.f6301f)) {
                return D1.j(context, 2131034131);
            }
            if (i3 == 2131165248) {
                return D1.j(context, 2131034134);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d8 = O0.d(context, 2130903250);
        if (d8 == null || !d8.isStateful()) {
            iArr[0] = O0.f17442b;
            iArr2[0] = O0.b(context, 2130903250);
            iArr[1] = O0.f17445e;
            iArr2[1] = O0.c(context, 2130903232);
            iArr[2] = O0.f17446f;
            iArr2[2] = O0.c(context, 2130903250);
        } else {
            int[] iArr3 = O0.f17442b;
            iArr[0] = iArr3;
            iArr2[0] = d8.getColorForState(iArr3, 0);
            iArr[1] = O0.f17445e;
            iArr2[1] = O0.c(context, 2130903232);
            iArr[2] = O0.f17446f;
            iArr2[2] = d8.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.C0250h.i(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public q4.j k(String str, String str2, Bundle bundle) {
        int i3;
        try {
            i(str, str2, bundle);
            P3.b bVar = (P3.b) this.f6298c;
            Dc.B b2 = bVar.f5493c;
            int j = b2.j();
            P3.h hVar = P3.h.f5506c;
            if (j < 12000000) {
                return b2.k() != 0 ? bVar.a(bundle).continueWithTask(hVar, new Z9.C(19, bVar, bundle)) : a4.f.l(new IOException(StubApp.getString2(5789)));
            }
            P3.m d8 = P3.m.d(bVar.f5492b);
            synchronized (d8) {
                i3 = d8.f5528b;
                d8.f5528b = i3 + 1;
            }
            return d8.e(new P3.l(i3, 1, bundle, 1)).continueWith(hVar, P3.d.f5499b);
        } catch (InterruptedException | ExecutionException e10) {
            return a4.f.l(e10);
        }
    }

    public void l(AbstractC1416M abstractC1416M) {
        Bc.i iVar = new Bc.i(4, 5);
        if (((M4.I) this.f6297b).isEmpty()) {
            a(iVar, (L0.B) this.f6300e, abstractC1416M);
            if (!u0.j((L0.B) this.f6301f, (L0.B) this.f6300e)) {
                a(iVar, (L0.B) this.f6301f, abstractC1416M);
            }
            if (!u0.j((L0.B) this.f6299d, (L0.B) this.f6300e) && !u0.j((L0.B) this.f6299d, (L0.B) this.f6301f)) {
                a(iVar, (L0.B) this.f6299d, abstractC1416M);
            }
        } else {
            for (int i3 = 0; i3 < ((M4.I) this.f6297b).size(); i3++) {
                a(iVar, (L0.B) ((M4.I) this.f6297b).get(i3), abstractC1416M);
            }
            if (!((M4.I) this.f6297b).contains((L0.B) this.f6299d)) {
                a(iVar, (L0.B) this.f6299d, abstractC1416M);
            }
        }
        this.f6298c = iVar.h();
    }

    public C0250h(L0 routeRefreshParentJob, A3.s plannedRouteRefreshController, F5.c immediateRouteRefreshController, Z9.C stateHolder, E0 refreshObserversManager, D routeRefresherResultProcessor) {
        Intrinsics.checkNotNullParameter(routeRefreshParentJob, "routeRefreshParentJob");
        Intrinsics.checkNotNullParameter(plannedRouteRefreshController, "plannedRouteRefreshController");
        Intrinsics.checkNotNullParameter(immediateRouteRefreshController, "immediateRouteRefreshController");
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(refreshObserversManager, "refreshObserversManager");
        Intrinsics.checkNotNullParameter(routeRefresherResultProcessor, "routeRefresherResultProcessor");
        this.f6296a = routeRefreshParentJob;
        this.f6297b = plannedRouteRefreshController;
        this.f6298c = immediateRouteRefreshController;
        this.f6299d = stateHolder;
        this.f6300e = refreshObserversManager;
        this.f6301f = routeRefresherResultProcessor;
    }

    public C0250h(M6.b bVar) {
        this.f6296a = bVar.f4670a;
        this.f6297b = CollectionsKt.toList(bVar.f4672c);
        this.f6298c = CollectionsKt.toList(bVar.f4673d);
        this.f6299d = CollectionsKt.toList(bVar.f4674e);
        this.f6300e = CollectionsKt.toList(bVar.f4671b);
        this.f6301f = bVar.f4675f;
    }

    public C0250h() {
        this.f6296a = new int[]{2131165266, 2131165264, 2131165190};
        this.f6297b = new int[]{2131165214, 2131165249, 2131165221, 2131165216, 2131165217, 2131165220, 2131165219};
        this.f6298c = new int[]{2131165263, 2131165265, 2131165207, 2131165259, 2131165260, 2131165261, 2131165262};
        this.f6299d = new int[]{2131165239, 2131165205, 2131165238};
        this.f6300e = new int[]{2131165257, 2131165267};
        this.f6301f = new int[]{2131165193, 2131165199, 2131165194, 2131165200};
    }

    public C0250h(E0.p pVar, MediaFormat mediaFormat, C1438m c1438m, Surface surface, MediaCrypto mediaCrypto, Q2.g gVar) {
        this.f6296a = pVar;
        this.f6297b = mediaFormat;
        this.f6298c = c1438m;
        this.f6299d = surface;
        this.f6300e = mediaCrypto;
        this.f6301f = gVar;
    }

    public C0250h(R4.h hVar, D5.u uVar, w5.b bVar, w5.b bVar2, InterfaceC1913d interfaceC1913d) {
        hVar.a();
        P3.b bVar3 = new P3.b(hVar.f6193a);
        this.f6296a = hVar;
        this.f6297b = uVar;
        this.f6298c = bVar3;
        this.f6299d = bVar;
        this.f6300e = bVar2;
        this.f6301f = interfaceC1913d;
    }

    public C0250h(C1414K c1414k) {
        this.f6296a = c1414k;
        M4.G g10 = M4.I.f4549b;
        this.f6297b = Z.f4578e;
        this.f6298c = e0.f4606g;
    }
}
